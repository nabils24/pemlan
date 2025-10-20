/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package metnum;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Class SimpleIterationMethod - Deskripsi singkat mengenai kelas ini.
 */
public class SimpleIterationMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan fungsi f(x) yang berbentuk x = g(x): ");
        String equation = scanner.nextLine();

        // Pilih jumlah iterasi
        System.out.print("Masukkan jumlah iterasi yang diinginkan: ");
        int maxIterations = scanner.nextInt();

        // Masukkan nilai awal
        System.out.print("Masukkan nilai awal (x0): ");
        double x0 = scanner.nextDouble();

        // Masukkan nilai error toleransi
        System.out.print("Masukkan nilai error toleransi: ");
        double errorTolerance = scanner.nextDouble();

        // Buat fungsi untuk persamaan yang diberikan (misalnya, x = g(x))
        Function<Double, Double> function = (x) -> evaluateEquation(equation, x);

        // Iterasi menggunakan metode iterasi sederhana
        double x = x0;
        int iteration = 0;
        double error = Double.MAX_VALUE;

        while (iteration < maxIterations && error > errorTolerance) {
            double x_new = function.apply(x);
            error = Math.abs(x_new - x);
            x = x_new;
            iteration++;
            System.out.println("Iterasi " + iteration + ": x = " + x + ", Error = " + error);
        }

        if (error <= errorTolerance) {
            System.out.println("Solusi ditemukan: x = " + x + " pada iterasi ke-" + iteration);
        } else {
            System.out.println("Solusi tidak ditemukan dalam " + maxIterations + " iterasi.");
        }
    }

    // Fungsi untuk mengevaluasi persamaan dalam format string yang dimasukkan
    public static double evaluateEquation(String equation, double x) {
        equation = equation.replace("x", Double.toString(x));
        try {
            // Evaluasi persamaan (dalam format matematika sederhana)
            return (Double) javax.script.ScriptEngineManager.class
                    .getDeclaredConstructor()
                    .newInstance()
                    .getEngineByName("JavaScript")
                    .eval(equation);
        } catch (Exception e) {
            System.out.println("Error dalam evaluasi persamaan: " + e.getMessage());
            return 0;
        }
    }
}
