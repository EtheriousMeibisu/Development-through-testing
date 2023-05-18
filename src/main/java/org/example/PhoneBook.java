package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private static Map<String,String> phoneBook = new HashMap<>();

    public static int add(String name, String  numberPhone){
        phoneBook.put(name, numberPhone);
        return phoneBook.size();

    }
    public static String findByNumber(){
        return null;
    }
}
