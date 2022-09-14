package com.side.toon.v1.domain.user;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "user")
@Setter
@NoArgsConstructor
@Entity
public class User {
}
