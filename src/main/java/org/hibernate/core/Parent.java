package org.hibernate.core;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_address")
    private String Address;
    @Column(name = "emp_email")
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_name")
    private Child child;

    public Parent() {
    }

    public Parent(String name, String address, String email, Child child) {
        this.name = name;
        Address = address;
        this.email = email;
        this.child = child;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
