package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static Map<String,String> phoneBook = new HashMap<>();

    public static int add(String name, String  numberPhone){
        phoneBook.put(name, numberPhone);
        return phoneBook.size();

    }
}
