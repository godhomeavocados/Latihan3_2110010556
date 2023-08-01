package geometri;
    public class main{
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(7.7);

        // Menggunakan method luas() dan keliling()
        double luasLingkaran = lingkaran.luas();
        double kelilingLingkaran = lingkaran.keliling();

        // Menampilkan luas dan keliling lingkaran
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        // Membuat objek PersegiPanjang
        PersegiPanjang PersegiPanjang = new PersegiPanjang(5.0, 4.0);

        // Menggunakan method luas() dan keliling()
        double luasPersegiPanjang = PersegiPanjang.luas();
        double kelilingPersegiPanjang = PersegiPanjang.keliling();

        // Menampilkan luas dan keliling persegi panjang
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }
}