import java.util.*;
class Fib {
    public int fib(int n) {
        if (n == 0) {
            return 0;}
        if (n == 1) {
                    return 1;}
                return fib(n - 1) + fib(n - 2);}}
public class Find_Fibonacci {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fib recur=new Fib();
        System.out.println(recur.fib(n));
    }}
