/**
 * 
 */
package com.akhil.jwtsercuritydemo.rapository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.jwtsercuritydemo.entity.Login;

/**
 * @author akhilajay
 *
 */
@Repository(value = "loginRepository")
public interface LoginRepository extends JpaRepository<Login, Integer> {

	Login findByusername(String username);

}
