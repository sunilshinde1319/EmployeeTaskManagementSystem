package in.fspl.authservice.service;

import java.util.Optional;

import in.fspl.authservice.model.User;

public interface UserService {

	User register(User user);

	Optional<User> findByUsername(String username);

}
