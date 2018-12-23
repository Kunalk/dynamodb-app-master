package io.kunalk.springdynamodb.repository;

import java.util.Collection;

import io.kunalk.springdynamodb.model.Person;

public interface PersonRepository {
	
	void save(Person person);
	Collection<Person> findAll();
	Person get(String name);

}
