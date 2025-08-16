package in.fspl.authservice.repositories;

import in.fspl.authservice.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // already used in login()
    
    boolean existsByUsername(String username); // needed in register()
}
