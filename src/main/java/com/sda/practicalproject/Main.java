package com.sda.practicalproject;


import com.sda.practicalproject.model.Vet;
import com.sda.practicalproject.repository.VetRepository;
import com.sda.practicalproject.repository.VetRepositoryimpl;
import com.sda.practicalproject.repository.exception.EntityUpdateFailedException;
import com.sda.practicalproject.utils.SessionManager;

public class Main {
    public static void main(String[] args) throws EntityUpdateFailedException {

        SessionManager.getSessionFactory();
        VetRepository vetRepository = new VetRepositoryimpl();
        Vet veterinarulTiti = new Vet(
                "TIti",
                "Aur",
                "Matei Vasilescu 18",
                "Pisici"
        );

        vetRepository.save(veterinarulTiti);


        System.out.println(vetRepository.findById(1L));
        veterinarulTiti.setFirstName("Guta");
        vetRepository.update(veterinarulTiti);
        System.out.println(vetRepository.findById(1L));
        vetRepository.delete(veterinarulTiti);
        System.out.println(vetRepository.findById(1L));



        SessionManager.shutdown();
    }
}