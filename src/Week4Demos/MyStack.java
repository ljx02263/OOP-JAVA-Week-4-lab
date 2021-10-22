package Week4Demos;

import java.util.ArrayList;

public class MyStack {

    //create an arraylist of 'objects'
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty(); //use Arraylist.isEmpty()
    }

    public int getSize() {
        return list.size(); //use Arraylist.size()
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    /**
     * Get the last element in the list and remove it
     *
     * @return last element in the list
     */
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    /**
     * Add an object into the list
     *
     * @param o Add object
     */
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

}