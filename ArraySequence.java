import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
    int currentIndex;
    int[] data;

    public ArraySequence(int[] other) {
        data = other.clone();
        currentIndex = 0;
    }
    public boolean hasNext() {
        return currentIndex < data.length - 1;
    }
    public int next() {
        return 0;
    }
    public int length() {
        return 0;
    }
    public void reset() {

    }
}