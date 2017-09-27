/**
 * 
 */
package com.akhil.jwtsercuritydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.jwtsercuritydemo.entity.Content;
import com.akhil.jwtsercuritydemo.rapository.ContentRepository;

/**
 * @author akhilajay
 *
 */
@RestController
public class ContentController {

	@Autowired
	@Qualifier("contentRepository")
	ContentRepository contentRepository;

	@GetMapping("/content/{id}")
	public Content content(@PathVariable int id) {
		return contentRepository.findByprofilekey(id);
	}

}
