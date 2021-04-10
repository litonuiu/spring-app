package com.angularapp.angularexample.repository;

import com.angularapp.angularexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Md. Liton Miah
 * @Date 3/26/2021
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
