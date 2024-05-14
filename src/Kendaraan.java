import java.time.Year;

public class Kendaraan {
    private String merk;
    private int tahunProduksi;
    private double harga;

    Kendaraan(String merk, int tahunProduksi, int harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    void info_spesifik() {
        System.out.printf("Merk: %s, Tahun produksi: %d, Harga: %d\n", this.merk, this.tahunProduksi, this.harga);
    }

    void beliSecond() {
        int umur = Year.now().getValue() - this.tahunProduksi;
        double x = umur < 5 ? 0.8 : umur < 10 ? 0.7 : 0.5;
        System.out.printf("Terbeli dengan harga $%.0f\n", x * this.harga);
    }

    double getBiayaLayanan() {
        return this.harga * 0.02;
    }

    String getmerk() {
        return this.merk;
    }

    int getTahunProduksi() {
        return this.tahunProduksi;
    }

    double getHarga() {
        return this.harga;
    }
}
