package com.japa.japa.domain.entities;

import com.japa.japa.domain.constant.RecordStatusConstant;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
@Data
@ToString
@MappedSuperclass
@EnableJpaAuditing
public abstract class AbstractBaseEntity<T> {
    @Id
    @GeneratedValue
    private T id;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime dateCreated;

    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime dateModified;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RecordStatusConstant recordStatus = RecordStatusConstant.ACTIVE;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractBaseEntity<?> that = (AbstractBaseEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @PrePersist
    @PreUpdate
    public void prePersist() {
        if (dateCreated == null) {
            dateCreated = LocalDateTime.now();
        }
        dateModified = LocalDateTime.now();
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    public String getDateCreatedString(){
        return dateCreated.format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
