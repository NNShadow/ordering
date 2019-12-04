package com.npy.repository;

import com.npy.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
