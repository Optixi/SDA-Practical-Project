package com.sda.practicalproject.repository;

import com.sda.practicalproject.model.Consult;
import com.sda.practicalproject.repository.base.Repositoryimpl;

public class ConsultRepositoryimpl extends Repositoryimpl<Consult> implements ConsultRepository {
    public ConsultRepositoryimpl() {
        super(Consult.class);
    }
}
