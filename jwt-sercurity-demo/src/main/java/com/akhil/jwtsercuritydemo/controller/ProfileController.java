/**
 * 
 */
package com.akhil.jwtsercuritydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.jwtsercuritydemo.entity.Profile;
import com.akhil.jwtsercuritydemo.rapository.ProfileRepository;

/**
 * @author akhilajay
 *
 */
@RestController
public class ProfileController {

	@Autowired
	ProfileRepository profileRepository;

	@GetMapping("/profile/id/{id}")
	public Profile profile(@PathVariable Integer id) {

		return profileRepository.findOne(id);
	}
	
	@GetMapping("/profile")
	public List<Profile> profileAll() {

		return profileRepository.findAll();
	}
	
	@PostMapping("/profile")
	public Profile createProfile(@RequestBody Profile profile) {
		return profileRepository.save(profile);
	}

}
