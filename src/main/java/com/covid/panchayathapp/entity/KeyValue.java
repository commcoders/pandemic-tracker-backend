package com.covid.panchayathapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "keyvalue")

public class KeyValue implements Serializable{
	 private @Id Long id;
	 @Column(name="KEY_CATAGORY")
	 private String category;
	 @Column(name="KEY_CODE")
	 private String keycode;
	 @Column(name="KEY_DISCRIPTION")
	 private String keyDiscription;
	 @Column(name="LANUAGE_CODE")
	 private String language;

}
