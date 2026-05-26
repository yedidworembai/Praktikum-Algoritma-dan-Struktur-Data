public class MahasiswaMain28 {

    public static void main(String[] args) {
        
        System.out.println("=== DATA MAHASISWA 1 ===");
        // Menggunakan constructor default (kosong)
        // Nilai atribut diisi satu per satu secara manual
        Mahasiswa28 mhs1 = new Mahasiswa28();
        mhs1.nama = "Andi";
        mhs1.nim = "112233";
        mhs1.kelas = "TI-1C";
        mhs1.ipk = 3.65;
        mhs1.tampilkanInformasi();

        System.out.println("=== DATA MAHASISWA 2 ===");
        // Menggunakan constructor berparameter
        // Nilai langsung dimasukkan saat objek dibuat
        Mahasiswa28 mhs2 = new Mahasiswa28("Budi", "12345", 3.75, "TI-1A");
        mhs2.tampilkanInformasi();

        System.out.println("=== DATA MAHASISWA 3 ===");
        Mahasiswa28 mhs3 = new Mahasiswa28("Siti", "67890", 3.90, "TI-1B");
        mhs3.tampilkanInformasi();

        // Menguji method ubahKelas dan updateIPK pada data Budi
        System.out.println("=== UPDATE DATA MAHASISWA 2 ===");
        mhs2.ubahKelas("TI-2A");   // Kelas Budi diubah
        mhs2.updateIPK(3.85);      // IPK Budi naik
        mhs2.tampilkanInformasi(); // Tampilkan lagi untuk melihat perubahannya
    }
}