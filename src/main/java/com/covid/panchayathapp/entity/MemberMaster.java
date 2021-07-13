package com.covid.panchayathapp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MEMBER_MASTER")
@Getter @Setter @NoArgsConstructor
public class MemberMaster implements Serializable {
	 private @Id Long id;
	 @Column(name="RECORD_STATUS")
	 private String recordStatus;
	 @Column(name="CREATED_DATE")
	 private Date createdDate;
	 @Column(name="VERIFIED_DATE")
	 private Date verifiedDate;
	 @Column(name="APPROVED_DATE")
	 private Date approvedDate;
	 @Column(name="CREATED_BY")
	 private String createdBy;
	 @Column(name="VERIFIED_BY")
	 private String verifiedBy;
	 @Column(name="APPROVED_BY")
	 private String approvedBy;
	 @Column(name="IS_HEAD")
	 private boolean isHead;
	 
	 
	 
	  	 
 

}
