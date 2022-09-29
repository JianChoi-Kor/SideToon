package com.side.toon.lib.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class CreateDateAndUpdateDate {

  @CreatedDate
  @Column(name = "create_at")
  private LocalDateTime createAt;
  @LastModifiedDate
  @Column(name = "update_at")
  private LocalDateTime updateAt;
}
