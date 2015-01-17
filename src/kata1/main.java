package kata1;
import java.util.Date;
public class main {
    public static void main(String[] args) {
        System.out.println(new Person(new Date(100000), "Alberto").getAge());
        System.out.println(new Person(new Date(), "Roberto").getName());
        System.out.println(new Person(new Date(), "Alberto").getBirthday().toString());
    }
    
}
