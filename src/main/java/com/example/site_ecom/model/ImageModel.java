package com.example.site_ecom.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="image_model")
public class ImageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    @Column(length = 50000000)
    private byte[] picByte;

    public ImageModel(){

    }

    public ImageModel(String name, String type, byte[] picByte) {
        this.name = name;
        this.type = type;
        this.picByte = picByte;
    }

    public Long getId() {
        return id;
    }

    public ImageModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ImageModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public ImageModel setType(String type) {
        this.type = type;
        return this;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public ImageModel setPicByte(byte[] picByte) {
        this.picByte = picByte;
        return this;
    }
}
