import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void addTest(){
        final int numberContactsExpected = 1;

        final int actual = PhoneBook.add("Юлия" , "8996240");

        Assertions.assertEquals(numberContactsExpected, actual);
    }
    @Test
    public void findByNumberTest(){
        final String expected = "Юлия";
        PhoneBook.add("Юлия" , "8996240");

        final String actual = PhoneBook.findByNumber("8996240");

        Assertions.assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }
    @Test
    public void findByNameTest(){
        final String expected = "8996240";
         PhoneBook.add("Юлия" , "8996240");

        final String actual = PhoneBook.findByName("Юлия");

        Assertions.assertArrayEquals(expected.toCharArray(), actual.toCharArray());

    }
}
