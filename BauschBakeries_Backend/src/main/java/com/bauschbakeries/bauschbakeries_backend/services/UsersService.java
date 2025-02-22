package com.bauschbakeries.bauschbakeries_backend.services;

import com.bauschbakeries.bauschbakeries_backend.models.Users;
import com.bauschbakeries.bauschbakeries_backend.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService implements UserInterface {

    @Autowired
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Optional<Users> findByUsername(String Username) {
        return usersRepository.findByUsername(Username);
    }

    @Override
    public Optional<Users> findByEmail(String Email) {
        return usersRepository.findByEmail(Email);
    }


}
