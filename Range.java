import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
    private int start, end, current;
    public Range(int start, int end) {
        this.start = start;
        this.end = end;
        this.current = start - 1;
    }
    public void reset() {
        this.current = start - 1;
    }
    public int length() {
        return end - start + 1;
    }
    public boolean hasNext() {
        return this.current < this.end;
    }
    public int next() throws NoSuchElementException {
        if (this.current + 1 > this.end) {
            throw new NoSuchElementException("element does not exist in range");
        }
        this.current++;
        return this.current;
    }
}