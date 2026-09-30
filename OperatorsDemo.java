public class OperatorsDemo {
    void add(int a,int b) {
        int sum = a + b;
        System.out.println("Addition:" + sum);
    }

    int multiply(int a,int b) {
        return a * b;
    }

    public static void main(String[]args){
        byte a = 25, b = 15;
        int result = a + b;
        System.out.println("Arithmatic promotion Result:" + result);

        int x = 55, y = 5;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        OperatorsDemo obj = new OperatorsDemo();
        obj.add (5, 7);
        int product = obj.multiply(4, 6);
        System.out.println("Multiplication:" + product);

    }
}