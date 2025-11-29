package lambda;

public class CapturingLambda {
        public static int b = 20;
        private static final int a=100;
        public static void main(String[] args) {
            String name = "Dilip IT";
            Runnable r = () -> {
                System.out.println("Captured value: " + name);
                System.out.println(" B Value :"+b);
                System.out.println(" A Value :"+CapturingLambda.a);

            };
            r.run();
        }


}
