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
        //arraysequence
        int[] temp = {1,5,6,2,5,4};
        ArraySequence n = new ArraySequence(temp);
        while (n.hasNext()) {
            System.out.println(n.next());
        }
        int[] nums = {1,3,5,0,-1,3,9};
        IntegerSequence as = new ArraySequence(nums);
        System.out.println("ArraySequence(array):");
        while (as.hasNext()) {
            System.out.print(as.next() + ", ");
        }
        ArraySequence ns = new ArraySequence(as);
        while (ns.hasNext()) {
            System.out.println(ns.next());
        }
    }
}