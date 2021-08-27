package com.jessicafeitosa.personapi.repository;

import com.jessicafeitosa.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
