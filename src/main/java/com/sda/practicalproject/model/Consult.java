package com.sda.practicalproject.model;

import javax.persistence.*;
import java.util.Date;
<<<<<<< Updated upstream
@Entity
@Table(name = "Consult")
=======

@Entity
@Table(name = "consult")
>>>>>>> Stashed changes
public class Consult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "appointment_date")
<<<<<<< Updated upstream
    private Date appointmentDate;
    @Column(name = "description")
=======

    private Date appointmentDate;
    @Column(name = "description")

>>>>>>> Stashed changes
    private String description;
    @ManyToOne
    @JoinColumn(name = "vet_id")
    private Vet vet;
<<<<<<< Updated upstream
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;


=======

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
>>>>>>> Stashed changes
    public Consult() {
    }

    public Consult(Date appointmentDate, String description) {
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Consult{" +
                "id=" + id +
                ", appointmentDate=" + appointmentDate +
                ", description='" + description + '\'' +
                '}';
    }
<<<<<<< Updated upstream

}
=======
}
>>>>>>> Stashed changes
