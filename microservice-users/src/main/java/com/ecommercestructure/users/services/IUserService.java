package com.ecommercestructure.users.services;

import com.ecommercestructure.users.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<User> findAllUsers();

    User findBiId(Long id);

    void createUser(User user);

    void deleteUser(Long id);


}
