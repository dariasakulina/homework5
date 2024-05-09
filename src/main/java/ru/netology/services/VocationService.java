package ru.netology.services;

public class VocationService {

 public int calculate(int income, int expenses, int threshold) {
       int count = 0; // счётчик месяцев отдыха
       int money = 0; // количество денег на счету
     for (int month = 1; month < 13; month++) {
          if (money >= threshold) { // можем ли отдыхать?
            count++; // увеличиваем счётчик месяцев отдыха
               money = (money - expenses) / 3;
          } else {
               money = money + income - expenses;
           }
       }
        return count;
    }

}