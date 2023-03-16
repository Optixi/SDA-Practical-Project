package com.sda.practicalproject.repository;

import com.sda.practicalproject.model.Vet;
import com.sda.practicalproject.repository.base.Repositoryimpl;

public class VetRepositoryimpl extends Repositoryimpl<Vet> implements VetRepository {
    public VetRepositoryimpl() {
        super(Vet.class);
    }
}
