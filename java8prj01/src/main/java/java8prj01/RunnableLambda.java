package java8prj01;

public class RunnableLambda {

    public static void main(String... args) {
        Runnable r = () -> {
            System.out.println("Runnable created as lambda!");
            System.out.printf("%s - %s - %s\n", Thread.currentThread().getName(), Thread.currentThread().getId(), Thread.currentThread().getState());
            Thread.dumpStack();
        };

        new Thread(r).start();
    }

}
