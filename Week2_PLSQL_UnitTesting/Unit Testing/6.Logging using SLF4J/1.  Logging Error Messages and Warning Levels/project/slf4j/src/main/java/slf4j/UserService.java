package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final Set<String> users = new HashSet<>();

    public void registerUser(String username) {
        if (username == null || username.trim().isEmpty()) {
            logger.error("Cannot register null or empty username");
            return;
        }

        if (users.contains(username)) {
            logger.warn("Attempt to register already existing user: {}", username);
        } else {
            users.add(username);
            logger.info("User registered successfully: {}", username);
        }
    }
}

