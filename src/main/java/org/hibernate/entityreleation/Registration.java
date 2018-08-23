package org.hibernate.entityreleation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Registration {

    @Id
    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;
    @Column(name = "OWNER_OF_THE_VEHICHLE")
    private String owner;
    @OneToOne(mappedBy = "registration")
    private Vehichle vehichle;

    public Registration() {
    }

    public Registration(String registrationNumber, String owner, Vehichle vehichle) {
        this.registrationNumber = registrationNumber;
        this.owner = owner;
        this.vehichle = vehichle;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Vehichle getVehichle() {
        return vehichle;
    }

    public void setVehichle(Vehichle vehichle) {
        this.vehichle = vehichle;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", owner='" + owner + '\'' +
                ", vehichle=" + vehichle +
                '}';
    }
}
