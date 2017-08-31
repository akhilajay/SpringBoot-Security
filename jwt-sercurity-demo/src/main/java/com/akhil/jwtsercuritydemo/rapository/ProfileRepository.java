/**
 * 
 */
package com.akhil.jwtsercuritydemo.rapository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.jwtsercuritydemo.entity.Profile;

/**
 * @author akhilajay
 *
 */
@Repository(value = "profileReposirtory")
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
