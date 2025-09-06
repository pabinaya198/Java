//jump statement

import java.util.Scanner;
public class jump statement{
    public static void main(string[]args){
        int n;
        Scanner scanner=new Scanner(system.in);
        n=Scanner.nextInt();
        while(n>=0){
            if(n%10==0){
                system.out.println(n);
            }
        }
    }
    n--;
}

//break statement

import java.util.Scanner;
public class break statement{
    public static void main(string[]args){
        double n,sum=0.0;
        Scanner scanner=new Scanner(system.in);
        system.out.println("enter the numbers.enter a negative number to stop:\n");
        while(true){
            n=Scanner.nextDouble();
            if(n<0.0){
                break;
            }
        }
        sum+=n;
    }
    system.out.println("sum is"+sum);
}

//continue statement

public class continue statement{
    public static void main(string[]args){
        for(int i=1;i<=10;i++){
            system.out.println(i);
        }
    }
}
