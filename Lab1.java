class Shape {
    float area(float r) {
        return 3.14f * r * r; // Use 3.14f for the correct calculation of area
    }

    float area(float l, float b) {
        return (l * b);
    }

    int area(int a) {
        return a * a;
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Shape A = new Shape();
        
        float circle = A.area(7.2f);
        System.out.println("Area of circle is: " + circle); 

        float rectangle = A.area(2.0f, 8.4f);
        System.out.println("Area of Rectangle is: " + rectangle); 

        int square = A.area(2); 
        System.out.println("Area of Square is: " + square);
    }
}
