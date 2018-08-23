package org.hibernate.core;

import javax.persistence.*;

@Entity
@Table(name = "user_defined")
public class DemoApp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Column(name ="name")
    private String name;

    public DemoApp() {
    }

    public DemoApp(String name) {
        this.name = name;
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
}
