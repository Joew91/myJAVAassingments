public class Stack {
    private double[] data;
    private int top;

    public Stack() {
        data = new double[100];
        top = 0;
    }

    public void push(double value) {
        if (top < data.length) {
            data[top++] = value;
        }
    }

    public double pop() {
        if (top > 0) {
            return data[--top];
        }
        return 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void clear() {
        top = 0;
    }
}
