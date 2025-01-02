package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    //TODO add method for subtraction
    public int substract(int a, int b) { return a - b; }

    //TODO add method for multiplication
    public int multiply(int a, int b) { return a * b;}

    //TODO add method for division
    public int divide(int a, int b) { return a / b;}

    //TODO add method for square root (use Math class)
    public double square(double a) { return Math.sqrt(a);}

    //TODO add method for x^2
    public double pow(double a, double b) {return Math.pow(a, b);}

    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers
    public int averageValue(int a, int b, int c){
        return (a + b + c)/3;
    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd
    public boolean evenOrOdd(int a){
        boolean result = false;
        if(a%2 == 0){
            result = true;
        }else result = false;
        return result;
    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public int bigger(int a, int b){
        int result = 0;
        if(a == b){
            result = 0;
        }else if (a > b){
            result = a;
        }else if (a < b){
            result = b;
        }
        return result;
    }

    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter
    public int sumOfValues(int ... parameters){
        int sum = 0;
        for (int parameter : parameters){
            sum = sum + parameter;
        }
        return sum;
    }

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;
    public int divideByZero(int a, int b){
        int result;
        try {
            result = a/b;
        }catch (Exception e){
            result = -100;
        }
        return result;
    }


}