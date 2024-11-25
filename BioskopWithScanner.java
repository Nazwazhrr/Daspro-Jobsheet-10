import java.util.Scanner;

public class BioskopWithScanner {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        String [][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = input15.nextLine();
            System.out.print("Masukkan baris:");
            baris = input15.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = input15.nextInt();
            input15.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input15.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}