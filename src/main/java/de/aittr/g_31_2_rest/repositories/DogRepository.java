package de.aittr.g_31_2_rest.repositories;

import de.aittr.g_31_2_rest.domain.Dog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DogRepository implements CrudRepository<Dog>{

    private Map<Integer, Dog> dogs = new HashMap<>();
    private int currentId;

    public DogRepository() {
        save(new Dog( "Ressi", "Irish setter", 2 ));
        save(new Dog( "Rex", "German shepherd", 3 ));
        save(new Dog( "Pearl", "Bishon frise", 1 ));
        save(new Dog( "Pippa", "Pekingese", 5 ));
        save(new Dog( "Sunny", "Golden retriever", 4 ));
    }

    @Override
    public Dog save(Dog dog) {
        dog.setId(++currentId);
        dogs.put(currentId, dog);
        return dog;
    }

    @Override
    public List<Dog> getAll() {
        return new ArrayList<>(dogs.values());
    }

    @Override
    public Dog getById(int id) {
        return dogs.get(id);
    }

    @Override
    public void update(Dog obj) {

    }

    @Override
    public void deleteById(int id) {

    }
}
