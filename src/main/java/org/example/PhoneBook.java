package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class PhoneBook {

    private static Map<String,String> phoneBook = new TreeMap<>();

    public int add(String name, String numberPhone){
        phoneBook.put(name, numberPhone);
        return phoneBook.size();

    }
    public String findByNumber(String numberPhone){
          for (Map.Entry entry : phoneBook.entrySet()) {
              if(entry.getValue().equals(numberPhone)){
                  return entry.getKey().toString();
              }
          }
        throw new RuntimeException("Контакта с этим номером нету.");
    }
    public String findByName(String name){
        return phoneBook.get(name);
    }
    public void printAllNames(){
        System.out.println("Список контактов: ");
        if (phoneBook.size() == 0){
            System.out.println("Пуст");
        }else {
            for (var pair : phoneBook.entrySet()) {
                String key = pair.getKey();
                String value = pair.getValue();
                System.out.println(key + " : " + value);
            }
        }
    }
}
