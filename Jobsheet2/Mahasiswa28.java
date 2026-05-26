public class Mahasiswa28 {

    // Atribut
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Constructor default
    public Mahasiswa28() {

    }

    // Constructor berparameter
    public Mahasiswa28(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    // Method tampilkan informasi
    public void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
        System.out.println("-------------------------");
    }

    // Method ubah kelas
    public void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // Method update IPK
    public void updateIPK(double ipkBaru) {
        ipk = ipkBaru;
    }
}