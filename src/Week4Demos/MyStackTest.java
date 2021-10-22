package Week4Demos;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(new Object());
        ms.push(new Object());

        System.out.println(ms.peek());
        System.out.println(ms.toString());

        ms.pop();
        System.out.println(ms.toString());

    }
}
