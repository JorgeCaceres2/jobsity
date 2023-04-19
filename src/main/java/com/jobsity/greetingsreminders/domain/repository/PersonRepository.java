package com.jobsity.greetingsreminders.domain.repository;


import com.jobsity.greetingsreminders.domain.model.ClassifiedPersons;
import com.jobsity.greetingsreminders.domain.model.Person;
import java.util.List;

public interface PersonRepository {

  List<Person> getPersonsWithBirthday();

  ClassifiedPersons getClassifiedPersons();

}
