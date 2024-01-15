package de.aittr.g_31_2_rest.services;

import de.aittr.g_31_2_rest.domain.Dog;
import de.aittr.g_31_2_rest.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private DogRepository repository;

    public DogService(DogRepository repository) {
        this.repository = repository;
    }

    public List<Dog> getAll () {
        return repository.getAll();
    }

    public Dog getById (int id) {
        return repository.getById(id);
    }
}
