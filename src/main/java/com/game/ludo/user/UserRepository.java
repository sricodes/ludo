package com.game.ludo.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    // basic CRUD operations Common across Entities

}
