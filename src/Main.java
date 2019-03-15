import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        for (int x=0;x< 10;x++){
            System.out.println("Hello World ! "+ x);
        }

        for (int x=0;x< 10;x++) System.out.println("Hello World ! "+ x);

        IntStream.range(0, 10).mapToObj(x -> "Hello World !").forEach(System.out::println);

        IntStream.range(0, 10).mapToObj(x -> "Hello World !").forEachOrdered(System.out::println);

        int x=0;
        while (x< 10) {
            System.out.println("Hello World !" + x);
            x++;
        }

        int x1;
        for (x1 = 0; x1< 10; x1++){
            System.out.println("Hello World !");
        }

    }
}
