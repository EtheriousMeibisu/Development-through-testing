import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void addTest(){
        final int numberContactsExpected = 1;

        final int actual = PhoneBook.add();

        Assertions.assertEquals(numberContactsExpected, actual);
    }

    @Test
    public void addTestRel(){

    }

}
