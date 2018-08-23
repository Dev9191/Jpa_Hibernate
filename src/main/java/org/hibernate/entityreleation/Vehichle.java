package org.hibernate.entityreleation;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
public class Vehichle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private int id;
    @Column(name = "MAKE")
    private String make;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "CLASS_OF_VEHICLE")

    private String classOfVehichle;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REGISTRATION_NUMBER")
    private Registration registration;

    public Vehichle() {
    }

    public Vehichle(int id, String make, String model, String classOfVehichle, Registration registration) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.classOfVehichle = classOfVehichle;
        this.registration = registration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClassOfVehichle() {
        return classOfVehichle;
    }

    public void setClassOfVehichle(String classOfVehichle) {
        this.classOfVehichle = classOfVehichle;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

//    @Override
//    public String toString() {
//        return "Vehichle{" +
//                "id=" + id +
//                ", make='" + make + '\'' +
//                ", model='" + model + '\'' +
//                ", classOfVehichle='" + classOfVehichle + '\'' +
//                ", registration=" + registration +
//                '}';
//    }
}
