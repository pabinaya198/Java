//if statement

public class if statement{}
    public static void main(string[]args){
        int num;
        Scanner scanner=new Scanner(system.in);
        system.out.println("enter a number:");
        num=Scanner.nextline();
        if (num>0){
            system.out.println(num+"enter a number is positive");
        }
        else{
            system.out.println(num+"enter the number is negative");
        }
    }

//if else statement

public class if else operator{}
    public static void main(string[]args){
        int num;
        Scanner scanner=new Scanner(system.in);
        system.out.println("enter a number:");
        num=Scanner.nextline();
        if (num>0){
            system.out.println(num+"enter a number is positive");
        }
        if else(num==0){
            system.out.println(num+"enter the number is netural");
        }
        else{
            system.out.println(num+"enter the number is positive netural");
        }
        }
    }

//elif if statement

public class elif if operator{}
    public static void main(string[]args){
        int mark;
        Scanner scanner=new Scanner(system.in);
        system.out.println("enter the marks(0-100):");
        mark=Scanner.nextline();
        if(mark>=90)
           system.out.println("Grade A");
        else if(mark>=80)
           system.out.println("Grade B");
        else if(mark>=70)
           system.out.println("Grade c");
        else if(mark>=60)
           system.out.println("Grade D");
        else{
            system.out.println("Grade E");
        }  
    }

//maximum marks

public class elif if operator{}
    public static void main(string[]args){
        int a=45,b=60;
        int max;
        if(a>b){
            max=a;
        }
        else{
            max=b;
            system.out.println(max);
        }
    }

