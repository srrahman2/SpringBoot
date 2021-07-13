package com.example.part.service;

import com.example.part.entity.Parts;

import java.util.List;

public interface PartsService {
    public List<Parts> findAll();
    public Parts findById(int pId);
    public void  save(Parts theParts);
    public void deleteById(int pId);
}

