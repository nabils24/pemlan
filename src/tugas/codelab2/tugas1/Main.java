/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package tugas.codelab2.tugas1;


/**
 * Class Main - Deskripsi singkat mengenai kelas ini.
 */
public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Sarah Lee", 2001, 12000, "Cardiology");
        Patient patient = new Patient("Michael Brown", 555, doctor, "Heart Disease");

        Hospital hospital = new Hospital("City General Hospital", "123 Main Street", patient);
        hospital.printHospitalDetails();

        System.out.println();
        doctor.applyBonus();
        doctor.printDetails();
    }
}
