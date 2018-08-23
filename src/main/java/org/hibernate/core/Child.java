package org.hibernate.core;

import javax.persistence.*;

@Entity
@Table(name = "COMPANY")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="company_name")
    private String company;
    @Column(name = "company_id")
    private int id;
    @OneToOne(mappedBy = "child")
    private Parent parent;


    public Child() {
    }

    public Child(String company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
