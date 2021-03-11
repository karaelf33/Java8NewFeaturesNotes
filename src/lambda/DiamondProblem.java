package lambda;


import java.util.function.Predicate;

interface Interface1 {
    default void defaultTestMethod() {
        System.out.println("Interface1#defaultTestMethod");
    }
}

interface Interface2 {
    default void defaultTestMethod() {
        System.out.println("Interface2#defaultTestMethod");
    }
}

public class DiamondProblem implements Interface1, Interface2 {
    public static void main(String[] args) {

        Interface1 object1 = new DiamondProblem();
        object1.defaultTestMethod();
        Interface2 object2 = new DiamondProblem();
        object2.defaultTestMethod();
     }


    @Override
    public void defaultTestMethod() {
        Interface1.super.defaultTestMethod();
        Interface2.super.defaultTestMethod();
    }
}
