package com.sda.practicalproject.model;

<<<<<<< Updated upstream
import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;
=======
import javax.persistence.*;
>>>>>>> Stashed changes

@Entity
@Table(name = "vet")
public class Vet {
<<<<<<< Updated upstream
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
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "speciality")
    private String speciality;

//    @OneToMany(mappedBy = "vet")
//    private List<Consult> consults;
>>>>>>> Stashed changes

    public Vet() {
    }

<<<<<<< Updated upstream
    public Vet(String firstname, String lastname, String address, String speciality) {
        this.firstname = firstname;
        this.lastname = lastname;
=======
    public Vet(String firstName, String lastName, String address, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
>>>>>>> Stashed changes
        this.address = address;
        this.speciality = speciality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< Updated upstream
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
=======
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    @Override
    public String toString() {
        return "Vet{" +
                "id=" + id +
<<<<<<< Updated upstream
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
=======
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
>>>>>>> Stashed changes
                ", address='" + address + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
