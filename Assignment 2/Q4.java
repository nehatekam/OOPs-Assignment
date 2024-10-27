class Rectangle{
    int length;
    int width;
    public Rectangle(){
        this.length=0;
        this.width=0;
    }
    public Rectangle(int side){
        this.length=side;
        this.width=side;
    }
    public Rectangle(int length,int Width){
        this.length=length;
        this.width=Width;
    }
    public  void display(){
        System.out.println("Length :"+length+", Width: "+width);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.display();
        Rectangle rect2 = new Rectangle(5);
        rect2.display();
        Rectangle rect3 = new Rectangle(4, 8);
        rect3.display();
    }
}
