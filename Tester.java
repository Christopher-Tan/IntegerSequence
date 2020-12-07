import java.util.NoSuchElementException;

public class Tester {
    public static void main(String[] args) {
        Range test = new Range(-5,0);
        //length
        System.out.println("length: " + test.length());
        //loop
        while (test.hasNext()) {
            int d = test.next();
            System.out.println(d);
        }
        System.out.println(test.hasNext());
        try {
            test.next();
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
        test.reset();
        System.out.println(test.next());
    }
}