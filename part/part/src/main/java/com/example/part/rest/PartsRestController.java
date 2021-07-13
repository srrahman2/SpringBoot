package com.example.part.rest;

import com.example.part.entity.Parts;
import com.example.part.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class PartsRestController {

    private PartsService partsService;

    @Autowired
    public PartsRestController(PartsService thePartsService) {partsService = thePartsService;}

    //GET request
    //localhost:8080/api/employees
    @GetMapping("/parts")
    public List<Parts> findAll(){ return  partsService.findAll();}

    @GetMapping("/parts/{pId}")
    public Parts getParts(@PathVariable int partId){
        Parts theParts = partsService.findById(partId);
        if(theParts == null){
            throw new RuntimeException("Part id not found : " + partId);
        }
        return theParts;
    }

    @PutMapping("/parts")
    public Parts updateParts(@RequestBody Parts theParts){
        partsService.save(theParts);
        return theParts;
    }
    @DeleteMapping("/parts/{pId}")
    public String deleteParts(@PathVariable int partId){
        Parts tempParts = partsService.findById(partId);
        if(tempParts == null) {
            throw new RuntimeException("Part id not found : " + partId);
        }
        partsService.deleteById(partId);
        return "Deleted part Id : " + partId;

    }
}
