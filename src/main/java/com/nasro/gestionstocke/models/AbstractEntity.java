package com.nasro.gestionstocke.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(name = "creationDate", nullable = false)
    @CreatedDate
    @JsonIgnore
    private Date createdDate;
    @Column(name = "lastUpdatedDate", nullable = false)
    @LastModifiedDate
    @JsonIgnore
    private Date lastUpdatedDate;

}
