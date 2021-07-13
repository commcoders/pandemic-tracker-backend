package com.covid.panchayathapp.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="HOUSE_DETAILS")
@Getter @Setter @NoArgsConstructor
public class House implements Serializable {
	 private @Id Long id;
	 @Column(name="CLUSTER")
	 private String cluster;
	 @Column(name="WARDNO")
	 private String wardNo;
	 @Column(name="HOUSE_NO")
	 private String houseNo;
	 @Column(name="RATIONCARD_NO")
	 private String rationcardNo;
	 @Column(name="HOUSE_NAME")
	 private String houseName;
	 @Column(name="HOUSE_LAND_NAME")
	 private String landName;
	 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	 @JoinColumn(name = "id")
	 @Where(clause = "isHead = true")
	 private Set<MemberMaster> houseOwner;
	 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	 @JoinColumn(name = "id")
	 private Set<MemberMaster> members;
	 
	 
	 
	 
	 
	 
 

}
