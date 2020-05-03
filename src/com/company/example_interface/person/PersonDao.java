package com.company.example_interface.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDao implements EntittyToDatabase {

    public List<Person> personal = new ArrayList<>();

    public PersonDao() {
        save(new Person(1, "nn", "cc"));
        save(new Person(2, "nn", "cc"));
        save(new Person(3, "nn", "cc"));
        save(new Person(4, "nn", "cc"));


    }
    @Override
    public Optional<Person> get(int id) {
        return Optional.ofNullable(personal.get(id));
    }

    @Override
    public Person save(Person s) {
        personal.add(s);
        return s;
    }

    @Override
    public Person Update(Person s, int id) {
        personal.set(id, s);
        return s;
    }

    @Override
    public Boolean Delete(Person id) {
        if (!personal.isEmpty())
            personal.remove(id);
        return true;
    }

    @Override
    public void getAll() {
        personal.forEach(
                (item) -> {
                    System.out.println(item.toString());
                }
        );
    }


}
