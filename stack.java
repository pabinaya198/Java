package oop;
public class stack{
    public static void main(string[]args){
        stack S1=new Stack();
        S1.push(5);
        S2.push(6);
        system.out.println(S1.pop());
    }
    stack S2=new Stack();
}

//push method

package oop;
public class push{
    int S[]=new int[10];
    int tos;
    stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==9){
            system.out.println("stack is full");
        }
        else{
            S[++tos]=item;
        }
    }
    int push(){
        return S[tos];
    }
}

//pop method


package oop;
public class pop{
    int S[]=new int[10];
    int tos;
    stack(){
        tos=-1;
    }
    void pop(int item){
        if(tos>=0){
            return S[tos-1];
        }
        else{
            system.out.println("stack is empty");
            return -1;
        }
    }
}
