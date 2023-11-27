package com.example.exp02.pojo;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Thing {
    private int id;
    private String name;
    private int quantity;
    private String unit;

}