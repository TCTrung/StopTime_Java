import src.StopWatch;

public class Main {
    public static void main(String[] args) {

        StopWatch clock = new StopWatch();
        clock.start();

        for (int i = 0; i < 100000; i++) {
            System.out.println("Running");
        }
        clock.end();
        System.out.println("-------" + clock.getElapsedtime());

    }


}
