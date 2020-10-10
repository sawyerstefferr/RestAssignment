package edu.wctc.wholesale.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name="customer_id")
    private int customerId;
    @Column(name="name")
    private String name;
}
