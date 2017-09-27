/**
 * 
 */
package com.akhil.jwtsercuritydemo.rapository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.jwtsercuritydemo.entity.Content;

/**
 * @author akhilajay
 *
 */
@Repository(value = "contentRepository")
public interface ContentRepository extends JpaRepository<Content, Integer> {
	
	Content findByprofilekey(int id);
}
