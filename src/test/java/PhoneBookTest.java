import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest(){
        final int numberContactsExpected = 1;

        final int actual = phoneBook.add("Юлия" , "8996240");

        Assertions.assertEquals(numberContactsExpected, actual);
    }
    @Test
    public void findByNumberTest(){
        final String expected = "Юлия";
        phoneBook.add("Юлия" , "8996240");

        final String actual = phoneBook.findByNumber("8996240");

        Assertions.assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }
    @Test
    public void findByNameTest(){
        final String expected = "8996240";
         phoneBook.add("Юлия" , "8996240");

        final String actual = phoneBook.findByName("Юлия");

        Assertions.assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }

}
