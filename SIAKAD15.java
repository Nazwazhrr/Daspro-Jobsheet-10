import java.util.Scanner;
public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int[][] nilai = new int[4][3];
        double[] rataRataMatkul = new double[3];

        for (int i = 0; i < nilai.length; i++) {
            int totalPerSiswa = 0;
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = input15.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            double rataRataPerSiswa = (double) totalPerSiswa / nilai[i].length;
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + rataRataPerSiswa);
            System.out.println("\n==================================");
        }

        System.out.println("Rata-rata Nilai Setiap Mata Kuliah:");
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            rataRataMatkul[j] = totalPerMatkul / nilai.length;
            System.out.printf("Mata Kuliah %d: %.2f\n", j + 1, rataRataMatkul[j]);
        }
    }
}

