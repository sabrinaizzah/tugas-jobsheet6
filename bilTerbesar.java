public class bilTerbesar {
    public static void main(String[] args) {
        int bil1 = 28, bil2 = 54, bil3 = 15;
        int terbesar;

        if (bil1 - bil2 > 0) {
            terbesar = bil1;
        } else {
            terbesar = bil2;
        }

        if (terbesar - bil3 > 0) {
        } else {
            terbesar = bil3;
        }

        System.out.println("Bilangan terbesar: " + terbesar);
    }
}
    

