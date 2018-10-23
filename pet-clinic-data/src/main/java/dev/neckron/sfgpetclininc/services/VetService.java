package dev.neckron.sfgpetclininc.services;

import dev.neckron.sfgpetclininc.model.Owner;
import dev.neckron.sfgpetclininc.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Owner> findAll();
}
