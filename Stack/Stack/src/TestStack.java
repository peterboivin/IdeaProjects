import java.util.Stack;

/**
 * Created by peterboivin on 6/6/14.
 */
public class TestStack {

    public static void main(String[] args) {
        StackWithMinMax minMax = new StackWithMinMax();
        minMax.push(7);
        minMax.push(4);
        minMax.push(5);
        minMax.push(6);
        minMax.push(7);
        minMax.push(8);
        minMax.push(1);
        minMax.push(1);
        minMax.push(7);
        minMax.push(2);
        minMax.push(4);
        minMax.push(2);
        minMax.pop();
        minMax.pop();
        minMax.pop();
        minMax.pop();
        minMax.pop();

        int i = minMax.search(7);

        Stack<Integer> min = minMax.minStack;
        Stack<Integer> max = minMax.maxStack;

        for (Integer integer :min) {
            System.out.println("minStack " + integer);
        }

        for (Integer integer :max) {
            System.out.println("maxStack " + integer);
        }

    }
}
