package com.sda.practicalproject.repository;

import com.sda.practicalproject.model.Pet;
import com.sda.practicalproject.repository.base.Repositoryimpl;

public class PetRepositoryImpl extends Repositoryimpl<Pet> implements PetRepository {
    public PetRepositoryImpl() {
        super(Pet.class);
    }
}
