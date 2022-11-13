package com.maksi.belajarloginapi.repository;

import com.maksi.belajarloginapi.model.UserDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepo extends CrudRepository<UserDetail, Long> {
    UserDetail findOneByUsernameIgnoreCaseAndPassword(String usernameId, String password);
}
