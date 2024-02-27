package com.example.nurte;

import lombok.AllArgsConstructor;
import lombok.Data;
//TODO Переименуй класс должен быть camelCase
public class models_product {
    //TODO Вложенный класс, можешь переменные из него перенести в основной класс и Product удалить
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

