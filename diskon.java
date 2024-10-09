import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus, novel, lainny): ");
        String jenisBuku = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        double diskonDasar = 0;
        double diskonTambahan = 0;

        if (jenisBuku.equals("kamus")) {
            diskonDasar = 10;
            if (jumlahBuku > 2) {
                diskonTambahan = 2;
            }
        } else if (jenisBuku.equals("novel")) {
            diskonDasar = 7;
            if (jumlahBuku > 3) {
                diskonTambahan = 2;
            } else if (jumlahBuku > 1) {
                diskonTambahan = 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskonTambahan = 5;
            }
        }

        double totalDiskon = diskonDasar + diskonTambahan;
        System.out.println("Total diskon: " + totalDiskon + "%");

        scanner.close();
    }
}


