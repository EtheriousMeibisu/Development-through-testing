package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private static Map<String,String> phoneBook = new HashMap<>();

    public static int add(String name, String numberPhone){
        phoneBook.put(name, numberPhone);
        return phoneBook.size();

    }
    public static String findByNumber(String numberPhone){
          for (Map.Entry entry : phoneBook.entrySet()) {
              if(entry.getValue().equals(numberPhone)){
                  return entry.getKey().toString();
              }
          }
        return "Контакта с этим номером нету.";
    }
    
}
