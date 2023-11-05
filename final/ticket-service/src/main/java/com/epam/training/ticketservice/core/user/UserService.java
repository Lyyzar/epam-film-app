package com.epam.training.ticketservice.core.user;

import java.util.Optional;

public interface UserService {

    Optional<User> signInPrivileged(String username, String password);

    Optional<User> signIn(String username, String password);

    Optional<User> signout();

    Optional<User> describe();

    void signUp(String username, String password);
}
