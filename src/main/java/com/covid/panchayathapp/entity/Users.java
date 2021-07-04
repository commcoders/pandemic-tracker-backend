package com.covid.panchayathapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Login")

public class Users {
	  @Id private String username;

	  private String password;

	  boolean enabled;
	  //@LazyCollection(LazyCollectionOption.FALSE)
	  @ElementCollection(fetch = FetchType.EAGER)
	  @JoinTable(
	      name = "authorities",
	      joinColumns = {@JoinColumn(name = "username")})
	  @Column(name = "authority")
	  private Set<String> roles;

}
