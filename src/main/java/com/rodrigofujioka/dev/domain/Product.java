package com.rodrigofujioka.dev.domain;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product{
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;	
	private OffsetDateTime createDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OffsetDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(OffsetDateTime createDate) {
		this.createDate = createDate;
	}		

}
