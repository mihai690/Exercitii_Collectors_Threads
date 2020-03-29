public class Ex14 {
    public static void main(String[] args) {

        OddNumbersThread t = new OddNumbersThread(); //firul este in NEW
        t.start();
        System.out.println("THE END");

    }
}
