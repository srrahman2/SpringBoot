package com.example.part.entity;

import javax.persistence.*;


//Parts Entity
@Entity
@Table(name = "parts")

public class Parts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "part_name")
    private String partName;

    public Parts(){}

    public Parts( String partName){
        this.partName = partName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
    @Override
    public String toString(){
        return "Part{" +
                "id= " + id +
                "partName= " + partName + "\'" +
                "}";
    }
}



