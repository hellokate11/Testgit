/**
 * Created by jj on 27.03.2016.
 */
public class Stack {
    int s[];
    int size;

    Stack(int capacity) {
        s = new int[capacity];
    }

    void push(int value) {
        s[size++] = value;
    }

    int pop() {
        if (size == 0)
            return -1;
        return s[--size];
    }
}
