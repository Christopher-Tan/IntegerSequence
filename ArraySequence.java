import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
    int currentIndex;
    int[] data;

    public ArraySequence(int[] other) {
        data = other.clone();
        currentIndex = -1;
    }
    public boolean hasNext() {
        return currentIndex < data.length - 1;
    }
    public int next() throws NoSuchElementException {
        if (currentIndex + 1 > data.length - 1) {
            throw new NoSuchElementException("no such element exists");
        }
        currentIndex++;
        return data[currentIndex];
    }
    public int length() {
        return data.length;
    }
    public void reset() {
        currentIndex = -1;
    }
    public ArraySequence(IntegerSequence otherseq) {
        currentIndex = -1;
        otherseq.reset();
        data = new int[otherseq.length()];
        for (int i = 0; i < otherseq.length(); i++) {
            data[i] = otherseq.next();
        }
        otherseq.reset();
    }
}