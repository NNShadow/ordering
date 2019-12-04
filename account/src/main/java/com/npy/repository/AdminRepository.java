package com.npy.repository;

import com.npy.entity.Admin;

public interface AdminRepository {
    public Admin login(String username, String password);
}
