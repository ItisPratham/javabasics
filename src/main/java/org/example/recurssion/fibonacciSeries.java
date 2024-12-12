package org.example.recurssion;

public class fibonacciSeries {
    private int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){
        fibonacciSeries f = new fibonacciSeries();
        f.display(5);
    }

    public void display(int k){
        for(int i = 0; i < k; i++){
            System.out.println(fibonacci(i));
        }
    }
}