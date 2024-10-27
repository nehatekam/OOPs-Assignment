
public class Q19 {
    static  void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not Valid");
        }
        else{
            System.out.println("Welcome to Vote");
        }
    }
    public static void main(String[] args) {
        try {
            int a = 50/0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
        finally{
            System.out.println("Finally Keyword");
        }
        validate(13);
        System.out.println("Rest the Code");

    }
}
