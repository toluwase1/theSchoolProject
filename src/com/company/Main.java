package com.company;


// Overloading the function to handle three arguments
public double product(double x, double y, double z) {
        return x * y * z;
        }

// Overloading the function to handle int
public int product(int x, int y){
        return x * y;
        }

        }

class Demo {

    public static void  main(String args[]) {
        Calculator cal = new Calculator();

        double x = 10;
        double y = 20;
        double z = 5;

        int a = 12;
        int b = 4;

        System.out.println(cal.product(x, y));
        System.out.println(cal.product(x, y, z));
        System.out.println(cal.product(a, b));
    }

}
