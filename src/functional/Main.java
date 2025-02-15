package functional;

public class Main {
    public static void main(String[] args) {

        /*
        * First way (Traditional with a class)
        *
        * @Override
        * public void emit(String name) {
        *   System.out.println("Hello " + name + " from lambda!")
        * }
        * */

        /* Second way (using lambda expressions or anonymous functions)*/
        Messenger lambdaExpression = (String name) -> System.out.println("Hello " + name + " from lambda!");
        lambdaExpression.emit("Bryan");

        /* Third way (using Anonymous classes) */
        Messenger messengerWithAnonymousClass = new Messenger() {
            @Override
            public void emit(String name) {
                System.out.println("Hello " + name + " from lambda!");
            }
        };
        messengerWithAnonymousClass.emit("Alex");
    }
}
