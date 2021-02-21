package Class4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.Person;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class Class4_1Test {


    @Test
    public void getObjectPerson() {
        Person p1 = new Person("Dinar", "Subeev");
        assertEquals(Class4_1.getObjectPerson(p1), "Dinar Subeev");
        Person p2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> {
            assertNull(p2);
        });
    }
}

