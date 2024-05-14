public class Main {
    public static void main(String[] args) throws Exception {
        Mobil silvia = new Mobil("Nissan", 1999, 20000, Mobil.TipeMobil.Sedan);
        Motor zx25r = new Motor("Kawasaki", 2020, 7000, 250);
        Truk dutro = new Truk("Hino", 2002, 25000, 8.25);

        silvia.info_spesifik();
        zx25r.info_spesifik();
        dutro.info_spesifik();

        System.out.println("Harga baru Nissan silvia: $" + silvia.getHarga());
        silvia.beliSecond();
        System.out.println("Biaya layanan: $" + silvia.getBiayaLayanan());

        System.out.println("Harga baru Kawasaki ZX 25r: $" + zx25r.getHarga());
        zx25r.beliSecond();
        System.out.println("Biaya layanan: $" + zx25r.getBiayaLayanan());
    }
}
