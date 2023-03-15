package com.sda.practicalproject.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vet")
public class Vet {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    private Long id;
@Column(name = "first_name")
    private String firstname;
@Column(name = "last_name")
    private String lastname;
@Column(name = "address")
    private String address;
@Column(name = "speciality")
    private String speciality;

//@OneToMany(mappedBy = "vet")
//private List<Consult> consults;

    public Vet() {
    }

    public Vet(String firstname, String lastname, String address, String speciality) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.speciality = speciality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Vet{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
