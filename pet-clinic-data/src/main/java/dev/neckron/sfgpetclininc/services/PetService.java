package dev.neckron.sfgpetclininc.services;


import dev.neckron.sfgpetclininc.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
