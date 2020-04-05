/**
 * Test the usage of Enum default constructor and setter method, which can be used for creating
 * singleton through Enum.
 *
 * <p/>
 * Sample code is from
 * http://www.java2s.com/Code/Java/Language-Basics/Useanenumconstructorinstancevariableandmethod.htm
 */

enum Apple {
    A(10), B(9), C(12), D(15), E(8);

    private int price; // price of each apple

    // Constructor
    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

enum Orange {
    A(), B(2);

    private int price;

    // Default constructor
    Orange() {
    }

    // Constructor
    Orange(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int s) {
        this.price = s;
    }

}


public class EnumTest {
    public static void main(String args[]) {
        // Display all apples and prices.
//        System.out.println("All apple prices:");
//        for (Apple a : Apple.values())
//            System.out.println(a + " costs " + a.getPrice() + " cents.");

        // Orange A is instantiated with default constructor and its price
        // is set through a setter method after being instantiated.
        Orange.A.setPrice(100);

        // Display all oranges and prices.
        System.out.println("All orange prices:");
        for (Orange o : Orange.values())
            System.out.println(o + " costs " + o.getPrice() + " cents.");
    }
}
