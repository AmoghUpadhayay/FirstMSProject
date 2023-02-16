package com.user.services;

import com.user.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServImpl implements UserService{
    List<User> list = Arrays.asList(
            new User(1311L, "Amogh", "82799"),
            new User(1312L, "Sarvagya", "82798"),
            new User(1313L, "Ansh", "96905")
    );

    @Override
    public User getUser(Long userId) {
        return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
