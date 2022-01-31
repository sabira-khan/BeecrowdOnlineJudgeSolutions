package com.gitproject;
import java.math.BigInteger;
import java.util.Scanner;

public class Beecrowd1307_uri {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String x, y;
        int t = s.nextInt();

        for(int i = 1;i <= t; i++){
            x = s.next();
            y = s.next();
            BigInteger a = new BigInteger(x,2);
            BigInteger b = new BigInteger(y,2);

            int cr = a.compareTo(b);

            if(cr > 0){
                System.out.println(a.gcd(b).intValue() !=1 ? "Pair #"+i+": All you need is love!" : "Pair #"+i+": Love is not all you need!");
            }
            else if( cr < 0 ){
                System.out.println(b.gcd(a).intValue() !=1 ? "Pair #"+i+": All you need is love!" : "Pair #"+i+": Love is not all you need!");
            }
        }
    }
}
