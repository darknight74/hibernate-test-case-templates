package org.hibernate.bugs.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Nephew {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne()
    @JoinColumn(name = "uncle_id")
    private Parent uncle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Parent getUncle() {
        return uncle;
    }

    public void setUncle(Parent uncle) {
        this.uncle = uncle;
    }
}
