Package bus Resv;
import java util.Scanner;
import java util.array list;
public class array list{
    public static void main(string[]args){
        array list<bus> buses=new array list<bus>();
        buses.add(new bus(1,true,45));
        buses.add(new bus(2,false,50));
        buses.add(new bus(3,true,48));
        int useropt=1;
        Scanner scanner=new Scanner(system.in);
        while(useropt==1){
            system.out.println("enter 1 to book and 2 to exit");
            useropt=Scanner.nextInt();
            if(useropt==1){
                system.out.println("booking........");
            }
        }
    }
}
    
