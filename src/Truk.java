public class Truk extends Kendaraan {
    double kapasitas;

    Truk(String merk, int tahunProduksi, int harga, double kapasitasMax) {
        super(merk, tahunProduksi, harga);
        this.kapasitas = kapasitasMax;
    }

    void info_spesifik() {
        System.out.printf("Merk: %s, Kapasitas maksimal: %.2f ton, Tahun produksi: %d, Harga: %.2f\n", this.getmerk(),
                this.kapasitas,
                this.getTahunProduksi(), this.getHarga());
    }

    double getKapasitasMax() {
        return this.kapasitas;
    }
}
