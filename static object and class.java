package oop;
public class static object and class{
    public static void main(string[]args){
        system.out.println("main starts here......");
        box blackbox;
        system.out.println("before creating box obj");
        blackbox=new box(5,4,3);
        system.out.println("after creating box obj");
        blackbox.setDim(6,4,3);
        system.out.println("vol of black box is"+ blackbox.volume());
        box woodbox=new box(30,24,25);
        system.out.println("vol of wood box is"+ woodbox.volume());
        woodbox.setDim(56,45,23);
        box b1=new box(6,5,3);
        system.out.println("black box==b"+ blackbox.is equal(b1));
        box b2=new box(b1);
    }
    }
