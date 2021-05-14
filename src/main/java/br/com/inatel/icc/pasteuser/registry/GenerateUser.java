package br.com.inatel.icc.pasteuser.registry;

import br.com.inatel.icc.pasteuser.model.User;

public class GenerateUser {

	public User createUser(String userName, String userPass) {
		return new User(userName, userPass);
	}
	
	public User updateUser(User user, String userName, String userPass) {
		user.setUsername(userName);
		user.setPassword(userPass);
		return user;
	}
}
