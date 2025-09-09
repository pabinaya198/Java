Package OOP;
public class method overloading{
    static int max(int a,int b){
        return a>b?a:b;
    }
    static double max(double a,double b){
        return a>b?a:b;
    }
    public static void main(string[]args){
        system.out.println(max(5,7));
        system.out.println(max(5.5,6.7));
    }
}

//class overloading

Package OOP;
public class overloading{
    static void test(){
        system.out.println("test method with no argument");
    }
    static void test(int a){
        system.out.println("test method with 1 arg");
    }
    static void test(int a,int b){
        system.out.println("test method with 2 args");
    }
    pubic static void main(string[]args){
        test();
        test(3,4);
        test(10);
    }
}
