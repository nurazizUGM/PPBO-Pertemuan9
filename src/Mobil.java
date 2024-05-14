public class Mobil extends Kendaraan {
    static enum TipeMobil {
        SUV, Sedan, DoubleCabin, Crossover, Hatchback
    }

    private TipeMobil tipe;

    Mobil(String merk, int tahunProduksi, int harga, TipeMobil tipe) {
        super(merk, tahunProduksi, harga);
        this.tipe = tipe;
    }

    void info_spesifik() {
        System.out.printf("Merk: %s, Tipe: %s, Tahun produksi: %d, Harga: %.2f\n", this.tipe, this.getmerk(),
                this.getTahunProduksi(), this.getHarga());
    }

    double getBiayaLayanan() {
        return this.getHarga() * 0.03;
    }

    TipeMobil getTipe() {
        return this.tipe;
    }
}
