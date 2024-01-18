package de.aittr.g_31_2_rest.services;

import de.aittr.g_31_2_rest.domain.Cat;
import de.aittr.g_31_2_rest.domain.Parrot;
import de.aittr.g_31_2_rest.repositories.ParrotRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ParrotService {

    private ParrotRepository repository;

    public ParrotService(ParrotRepository repository) {
        this.repository = repository;
    }

    public List<Parrot> getAll () {
        return repository.getAll();
    }

    public Parrot getById (int id) {
        return repository.getById(id);
    }

    public Parrot save (Parrot parrot) {
        if (parrot.getId() > 0) {
            repository.update(parrot);
            return parrot;
        }
        return repository.save(parrot);
    }

    public void deleteById (int id) {
        repository.deleteById(id);
    }
}
