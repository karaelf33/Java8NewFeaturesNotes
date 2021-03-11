package lambda;

public class LambdaTest03{

    public static void main(String[] args) {


        Message message= System.out::println;
        message.printMessage("testtttt");
    }
}

@FunctionalInterface
interface Message{
     void printMessage(String msg);

}