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
}
