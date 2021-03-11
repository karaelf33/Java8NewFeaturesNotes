package lambda;

public class LamdaTest02 {

    public static void main(String[] args) {

        Calculator lambda1=(x,y)->{
            System.out.println(x+y);
            return x+y;
        };
        lambda1.operation(5,7);

    }
}

@FunctionalInterface
interface Calculator{
    int operation(int number1,int number);


    // birden fazla abstract metodu olmaz eğer @functionalinterfa ise
    // static ya da dfault method olabilir
}