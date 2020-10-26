package com.*****.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserDetails {

	@Id
	@Column
	@GeneratedValue
	private long id;
    @Column
    private String username;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String address;
