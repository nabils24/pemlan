/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package tugas.codelab2.tugas1;


/**
 * Class Hospital - Deskripsi singkat mengenai kelas ini.
 */
class Hospital {
    public String hospitalName;
    public String address;
    public Patient patient;

    public Hospital(String hospitalName, String address, Patient patient) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.patient = patient;
    }

    public void printHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Address: " + address);
        patient.printPatientDetails();
    }
}
