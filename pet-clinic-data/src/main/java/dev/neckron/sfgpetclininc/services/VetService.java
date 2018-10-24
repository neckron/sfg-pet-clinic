package dev.neckron.sfgpetclininc.services;

import dev.neckron.sfgpetclininc.model.Owner;
import dev.neckron.sfgpetclininc.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet,Long>{

    @Override
    Set<Vet> findAll();

    @Override
    Vet findById(Long aLong);

    @Override
    Vet save(Vet object);

    @Override
    void delete(Vet object);
}

