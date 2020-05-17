package com.game.ludo.school;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SchoolRepository extends CrudRepository<School, Integer> {

    // basic CRUD operations Common across Entitieso
        Optional<School> findByName(String name);



}
