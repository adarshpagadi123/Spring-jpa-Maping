package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table
public class Address {
	@Id
	@Column(name="add_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private String city;
	private String addresstype;

	/*@OneToOne(mappedBy="address")
	private Login login;*/
}
