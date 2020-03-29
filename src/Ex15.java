public class Ex15 {
    public static void main(String[] args) {
        EvenNumbersRunnable r = new EvenNumbersRunnable();

        Thread t = new Thread(r);
        t.start();
        
    }
}
