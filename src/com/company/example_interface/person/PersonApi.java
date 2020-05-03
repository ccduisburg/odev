package com.company.example_interface.person;

public class PersonApi {

    private static PersonDao personDao=new PersonDao();


    public static void init(){
        Person person=new Person(11,"nn","cc");
        personDao.save(person);


    }

    public static void main(String[] args) {
        init();
        System.out.println(personDao.get(1));
    //    personDao.getAll();
    }
}
