import java.util.Scanner;

import static java.lang.System.out;

public class Main7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        out.println("enter the number: ");
        double num = in.nextDouble();
        double num1=num;
        int count=0;
        int count1=0;
        if (num>1&&num<10){
            out.println("num in norm vid:"+num);
        }
        else {
            if (num > 1) {
                boolean n = true;
                do {
                    num /= 10;
                    count++;
                    if (num < 10)
                        n = false;
                } while (n);
                out.println("num in norm vid: " + num + "E+" + count);
            }
            if (num < 0.1) {
                boolean n = true;
                do {
                    num *= 10;
                    count++;
                    if (num < 10 && num > 1) {
                        n = false;
                    }
                } while (n);
                out.println("num in norm vid: " + num + "E-" + count);
            }
        }
        if(num1>0.1&&num1<1){
            out.println("num in denorm vid"+num1);
        }
        else{
            if (num1>1){
                boolean n= true;
                do{
                    num1/=10;
                    count1++;
                    if (num1<1)
                        n=false;
                }while(n);
                out.println("num in denorm vid: "+ num1+"E+"+(count1));
            }
            if (num1<0.1) {
                boolean n = true;
                do {
                    num1 *= 10;
                    count1++;
                    if (num1 < 1 && num1 > 0.1) {
                        n = false;
                    }
                } while (n);
                out.println("num in denormvid: " + num1 + "E-" + (count1));

            }
        }
    }
}
