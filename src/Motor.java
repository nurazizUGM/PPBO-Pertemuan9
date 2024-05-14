public class Motor extends Kendaraan {
    int kapasitasMesin;

    Motor(String merk, int tahunProduksi, int harga, int kapasitasMesin) {
        super(merk, tahunProduksi, harga);
        this.kapasitasMesin = kapasitasMesin;
    }

    void info_spesifik() {
        System.out.printf("Merk: %s, Kapasitas mesin: %dcc, Tahun produksi: %d, Harga: %.2f\n", this.getmerk(),
                this.kapasitasMesin,
                this.getTahunProduksi(), this.getHarga());
    }

    int getKapasitasMesin() {
        return this.kapasitasMesin;
    }
}
