package edu;

public class Test22_2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        char op = '+';

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
    }
}
