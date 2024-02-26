package com.example.nurte;

import lombok.AllArgsConstructor;
import lombok.Data;

public class models_product {
    @Data
    @AllArgsConstructor

    public static class Product {
        private Long id;
        private String title;
        private String description;
        private int price;
        private String city;
        private String author;


    }
}

