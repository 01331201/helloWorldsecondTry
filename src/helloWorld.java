import java.util.Objects;

public class helloWorld {

    public static void getName(String firstLeter) {
        if (Objects.equals(firstLeter, "A")) {
            System.out.println("America");
        } else {
            System.out.println("bla bla bla");

        }
    }

    //main
    public static void main(String[] args) {
        getName("E");
        getName("E");
        getName("E");
        getName("a");
        getName("A");
        getName("t");
    }

}
