package com.nullifidianz.java_auth.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class DateAudit {
    @CreatedDate
    @Column(name = "createdAt", updatable = false)
    LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updatedAt")
    LocalDateTime updatedAt;

}
