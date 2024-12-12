public class App {
    public static void main(String[] args) throws Exception {
        Trabalhador trabalhador1 = new Trabalhador();
        Trabalhador trabalhador2 = new Trabalhador();
        trabalhador1.setNome("AA");
        trabalhador2.setNome("BB");

        trabalhador1.setPriority(10);
        trabalhador2.setPriority(10);

        trabalhador1.start();
        trabalhador2.start();

        // while(true) {
        // System.out.println("Principal");
        // }

        Thread thread = new Thread() {
            public void run() {
                while (true) {
                    System.out.println("anonima");

                }
            }
        };
        thread.start();

        Corredor corredor = new Corredor();
        Thread t = new Thread(corredor);
        t.start();

        Runnable correSim = new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("run anonima");
                }
            }
        };
        Thread tt = new Thread(correSim);
        tt.start();

        Runnable correLambda = () -> {
            while (true) {
                    System.out.println("Lambda");
            }
        };
        Thread ttt = new Thread(correLambda);
        ttt.start();

    }
}
