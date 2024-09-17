/*package niha;
public class Example {
    static int count = 0; 

    public Example() {
        count++; 
    }

    public static void main(String[] args) {
        new Example();
        new Example();
        new Example();

        System.out.println(Example.count); 
    }
}
package niha;
public class Example {
    public void display() {
        int number = 5; // Local variable
        System.out.println(number);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.display(); 
    }
}*/
package niha;
public class Example {
    int count = 0; // Instance variable

    public void increment() {
        count ++ ;
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.increment();
        obj1.increment();
        obj1.increment();
        obj2.increment();

        System.out.println(obj1.count); // Output: 2
        System.out.println(obj2.count); // Output: 1
    }
}