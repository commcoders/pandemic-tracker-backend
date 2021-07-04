package com.covid.panchayathapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="azhi_tb_family_member")
@Getter @Setter @NoArgsConstructor
public class Member implements Serializable {
	 private @Id Long id;
	 @Column(name="CLUSTER")
	 private String cluster;
	 @Column(name="WARDNO")
	 private String wardNo;
	 @Column(name="HOUSE_NO")
	 private String houseNo;
	 @Column(name="RATIONCARD_NO")
	 private String rationcardNo;
	 @Column(name="NAME")
	 private String name;
	 @Column(name="HOUSE_NAME")
	 private String houseName;
	 @Column(name="RELATIONSHIP")
	 private String relationship;
	 @Column(name="PHONE_NUMBER")
	 private String phoneNumber;
	 @Column(name="DATEOFBIRTH")
	 private String dateofbirth;
	 @Column(name="AGE")
	 private String age;
	 @Column(name="EDUCATION_QUALIFICATION")
	 private String educationQualification;
	 @Column(name="ANY_OTHER_ILLNESS")
	 private String any_other_illness;
	 @Column(name="OCCUPATION_CATAGORY")
	 private String occupationCatagory;
	 @Column(name="OCCUPATION")
	 private String occupation;
	 @Column(name="WORK_COUNTRY")
	 private String workCountry;
	 @Column(name="WORK_STATE")
	 private String work_state;
	 @Column(name="DISABLED")
	 private String disabled;
	 @Column(name="COVID_VACCINE_STATUS")
	 private String covidVaccineStatus;
	 @Column(name="COVID_VACCINE_NUMBER")
	 private String covidVaccineNumber;
	 @Column(name="COVID_VACCINE_BRAND")
	 private String covidVaccineBrand;
	 @Column(name="BLOOD_GROUP")
	 private String bloodGroup;
	 @Column(name="COVID_STATUS")
	 private String covidStatus;
	 @Column(name="COVID_DATE")
	 private String covidDdate;
	 @Column(name="COVID_RECOVERED_DATE")
	 private String covidRecoveredDate;
	 @Column(name="COVID_HOSPITALIZIED_STATUS")
	 private String covidHospitaliziedStatus;
	 @Column(name="PENSION_STATUS")
	 private String pensionStatus;
	 @Column(name="PENSION_SCHEME")
	 private String pensionScheme;
	 @Column(name="MEMBER_TYPE")
	 private String memberType;
	 @Column(name="RECORD_STATUS")
	 private String recordStatus;
	 @Column(name="CREATED_DATE")
	 private String createdDate;
	 @Column(name="UPDATED_DATE")
	 private String updatedDate;
	 @Column(name="CREATEDBY")
	 private String createdBy;
	 @Column(name="UPDATEDBY")
	 private String updatedBy;
	 
	 
	 
	 
 

}
