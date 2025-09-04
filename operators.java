public class operators{
    public static void main(string[]args){
        int a=10,b=2,c;
        c=a+b;
        system.out.println(c);
    }
}

//compound assignment operator

public class compound assignment operator{
    public static void main(string[]args){
        int a=10;b=5;c;
        a=a+3;
        a+=3;
    }
}

//increment and decrement operator

public class increment and decrement operator{
    public static void main(string[]args){
        a=a+1;
        a++;
        ++a;
        a--;
        --a;
        system.out.println("c is"+c);
        system.out.println("a is"+a);
    }
}

//relational operator

public class relational operator{}
    public static void main(string[]args){
        int a=9,b=12;
        int c=a&b;
        system.out.println("a&b is"+c);
        c=a/b;
        system.out.println("a/b is"+c);
        c=a^b;
        system.out.println("a^b is"+c);
    }

//bitwise operator

public class bitwise operator{}
    public static void main(string[]args){
        int a=4;
        system.out.println(a<<2);
        system.out.println("right shift"+(a>>1));
    }

//boolean operators

public class boolean operator{}
    public static void main(string[]args){
        int a=10,b=25;
        double c=(a*b-10)/a;
        system.out.println(c); 
    }

//character operators

public class character operator{}
    public static void main(string[]args){
        char operator;
        system.out.println("enter the operator +,-,*,/,%:");
        operator=Scanner.next().charAt(0);
        switch(operator){
            case'+':
              system.out.println(a+"+"+b+"="+(a+b));
            case'-':
              system.out.println(a+"-"+b+"="+(a-b));
            case'*':
              system.out.println(a+"*"+b+"="+(a*b));
            case'/':
              system.out.println(a+"/"+b+"="+(a/b));
            case'%':
              system.out.println(a+"%"+b+"="+(a%b));
        }
    }
