package com.example.demo.dto;

import com.example.demo.entity.enums.Brand;
import com.example.demo.entity.enums.Color;
import com.example.demo.entity.enums.OS;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String name;
    private String price;
    private Brand brand;
    private Color color;
    private String dateOfIssue;
    private OS os;
    private String ram;
    private String rom;
    private String sim;
    private String cpu;
    private String weight;
    private String guarantee;
    private String image;
    private String displayInch;
    private String appointment;
    private String capacityBattery;
    private Long categoryId;
}
