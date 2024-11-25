import java.util.Scanner;

public class SurveiKepuasan {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int[][] hasilSurvey = new int[10][6];  // 

        // a. Masukkan hasil survei
        System.out.println("Masukkan hasil survei (nilai antara 1-5) untuk 10 responden:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {  
                System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                int nilai = input15.nextInt();
                
                if (nilai >= 1 && nilai <= 5) {
                    hasilSurvey[i][j] = nilai;
                } else {
                    System.out.println("Nilai harus antara 1-5. Program dihentikan.");
                    System.exit(0);
                }
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nRata-rata dan total nilai untuk setiap responden:");
        int totalKeseluruhan = 0;

        for (int i = 0; i < 10; i++) {
            int totalResponden = 0;
            for (int j = 0; j < 6; j++) {  
                totalResponden += hasilSurvey[i][j];
            }
            double rataRataResponden = totalResponden / 6.0;
            totalKeseluruhan += totalResponden;

            System.out.println("Responden " + (i + 1) + ": Rata-rata = " + rataRataResponden + ", Total = " + totalResponden);
        }

        // c. Menampilkan rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) { 
            int totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {  
                totalPertanyaan += hasilSurvey[i][j];
            }
            double rataRataPertanyaan = totalPertanyaan / 10.0;

            System.out.println("Pertanyaan " + (j + 1) + ": Rata-rata = " + rataRataPertanyaan);
        }

        // d. Menampilkan rata-rata keseluruhan untuk semua responden dan pertanyaan
        double rataRataKeseluruhan = totalKeseluruhan / 60.0; 
        System.out.println("\nRata-rata keseluruhan dari semua responden dan pertanyaan: " + rataRataKeseluruhan);
    }
}


