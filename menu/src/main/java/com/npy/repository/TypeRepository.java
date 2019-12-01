package com.npy.repository;

import com.npy.entity.Type;

import java.util.List;

public interface TypeRepository {
    public List<Type> findAll();
}
