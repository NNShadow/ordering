package com.npy.repository;

import com.npy.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll(int index, int limit);

    public int count();

    public void save(User user);

    public void deleteById(long id);

    public User findById(long id);

    public void update(User user);
}
