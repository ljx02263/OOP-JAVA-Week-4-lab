package Week4Demos;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        DisplayObject(new GraduateStudent()); //student - not overridden
        DisplayObject(new Student()); //student
        DisplayObject(new Person()); //person
        DisplayObject(new Object()); //Object@hashcode
    }

    public static void DisplayObject(Object x) {
        System.out.println(x.toString());
    }
}

/**
 * GraduateStudent extends student
 */
class GraduateStudent extends Student {
    /*@Override
    public String toString(){
        return "GraduateStudent";
    }*/
}

/**
 * Class student extends person
 */
class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

/**
 * Class person extends object
 */
class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}
