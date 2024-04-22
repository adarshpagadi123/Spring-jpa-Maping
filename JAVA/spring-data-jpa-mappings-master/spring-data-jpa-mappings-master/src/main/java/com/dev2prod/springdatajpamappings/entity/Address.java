package com.dev2prod.springdatajpamappings.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Transactional
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private Long addressId;
    private String city;
    private String addressType;

    // for bidirectional one to one mapping
    //@OneToOne(mappedBy = "address")
    //private Employee employee;

   // @ManyToOne
   // @JoinColumn(name = "fk_emp_id")
  //  private Employee employee;
}
