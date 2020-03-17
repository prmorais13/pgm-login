package br.gov.rn.natal.pgmlogin.controllers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.gov.rn.natal.pgmlogin.models.User;
import br.gov.rn.natal.pgmlogin.services.UserService;

@Component
public class UserControllerGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private UserService userService;

	public User createUser(User user) {
		return userService.createUser(user);
	}

	public User getUser(Integer id) {
		return userService.getUser(id);
	}

	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
}