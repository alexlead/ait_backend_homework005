package de.aittr.g_31_2_rest.services;

import de.aittr.g_31_2_rest.domain.Cat;
import de.aittr.g_31_2_rest.repositories.CatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    private CatRepository repository;

    public CatService(CatRepository repository) {
        this.repository = repository;
    }

    public List<Cat> getAll() {
        return repository.getAll();
    }

    public Cat getById(int id) {
        return repository.getById(id);
    }
}
