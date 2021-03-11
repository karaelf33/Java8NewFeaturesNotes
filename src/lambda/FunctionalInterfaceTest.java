package lambda;

@FunctionalInterface
interface Animal{
     void eat(String food);

     static void staticMethod() throws Exception{
        System.out.println("sdfdsfs");
    }
     default void defaultMrthod(){
        System.out.println("dslşlşsdflşds");
    }
}

interface Dog extends Animal{
     void catEating(String cat);
}

@FunctionalInterface
public interface FunctionalInterfaceTest {
    void testf(String testfe);
}
