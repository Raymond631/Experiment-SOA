package com.example.exp02.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Thing {
    private int id;
    private String name;
    private int quantity;
    private String unit;
}