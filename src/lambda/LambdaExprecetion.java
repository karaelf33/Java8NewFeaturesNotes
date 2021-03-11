package lambda;
public class LambdaExprecetion {
    public static void main(String[] args) {

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable@ run !");
            }
        };
        runnable.run();
        // with lambda
        // başta yer alan parantez -> fonksiyonel interfa deli metodun paramere listesi.
        Runnable runnableLambda =()-> System.out.println("Runnable lambda");
    runnableLambda.run();
    }
}
// @functionalInterFace
// lambda gramerini @functionalInterfa ler ile kullanabiliriz.
// @FunctionalInterface ler 1 tane abstract metodu ilan interfacelerdir.
// fonksiyonel interface bir tane abstract metodu olan blok oluyor.
