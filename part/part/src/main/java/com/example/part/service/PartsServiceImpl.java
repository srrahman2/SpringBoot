package com.example.part.service;


import com.example.part.dao.PartsDAO;
import com.example.part.entity.Parts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class PartsServiceImpl implements PartsService {

    private PartsDAO partsDAO;

    @Autowired
    public PartsServiceImpl (PartsDAO thePartsDAO){partsDAO = thePartsDAO;}

    @Override
    @Transactional
    public List<Parts> findAll(){return  partsDAO.findAll();}

    @Override
    @Transactional
    public Parts findById(int pId) {return  partsDAO.findById(pId);}

    @Override
    @Transactional
    public void save(Parts theParts) { partsDAO.save(theParts);}

    @Override
    @Transactional
    public void deleteById(int pId) {partsDAO.deleteById(pId);}





}
