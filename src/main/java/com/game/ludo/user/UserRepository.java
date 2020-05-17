package com.game.ludo.user;
;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.scheduling.annotation.Async;


import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer>, JpaSpecificationExecutor<User> {

    // basic CRUD operations Common across Entities

    List<User> findBySchoolId(int id);
    List<User> findBySchoolName(String name);


/*    @Modifying
    @Query( value = "Update User t SET t.title=:title WHERE t.id=:id",
            nativeQuery = true)
    void updateUser(@Param(value = "id") int id, @Param(value = "user") User user)*/;

}
