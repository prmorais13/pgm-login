package br.gov.rn.natal.pgmlogin.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.rn.natal.pgmlogin.models.User;
import br.gov.rn.natal.pgmlogin.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User createUser(User user) {
		User newUser = new User();
		newUser.setDateCreate(new Date());
		return userRepository.save(newUser);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUser(Integer id) {
		return userRepository.findById(id).orElse(null);
	}

}