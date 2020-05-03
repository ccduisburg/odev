package com.company.example_interface.person;

import java.util.Optional;

public interface EntittyToDatabase {
     Person save(Person s);
     Person Update(Person s, int id);
     Boolean Delete(Person id);
     void getAll();
     Optional<Person>  get(int s);

}
