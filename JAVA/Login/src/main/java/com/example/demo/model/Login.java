package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int id;
	private String name;
	private  String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_add_id",referencedColumnName="add_id")
	private Address address;
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_add_id",referencedColumnName="emp_id")//referencedColumnName="emp_id"
	private List<Address> address;*/
	
	
	

}
