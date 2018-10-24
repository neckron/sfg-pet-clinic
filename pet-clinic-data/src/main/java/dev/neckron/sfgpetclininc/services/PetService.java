package dev.neckron.sfgpetclininc.services;


import dev.neckron.sfgpetclininc.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet , Long> {

    @Override
    Set<Pet> findAll();

    @Override
    Pet findById(Long aLong);

    @Override
    Pet save(Pet object);

    @Override
    void delete(Pet object);
}
