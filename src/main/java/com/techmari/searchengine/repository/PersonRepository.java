package com.techmari.searchengine.repository;

import com.techmari.searchengine.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
