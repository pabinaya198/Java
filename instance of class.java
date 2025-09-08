
//instance of class

class box{
    int length;
    int breadth;
    int height;
    int volume(){
        return length*breadth*height;
    }
    public class instance of class{
        public static void main(string[]args){
            box blackbox;
            blackbox=new box();

            blackbox.length=10;
            blackbox.breadth=8;
            blackbox.height=6;
            system.out.println("vol of blackbox is" + blackbox.volume());
            
            box woodbox=new box();
            woodbox.height=25;
        }
    }
}
