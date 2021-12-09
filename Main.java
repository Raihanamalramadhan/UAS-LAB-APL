//Raihan Amal Ramadhan(1908107010014)
/**
RESEPSI:
Pada kasus ini, Konsumen akan mendapatkan notifikasi berupa persetujuan dari pihak yang buat resepsi. 
yang mana persetujuan tersebut berupa penerimaan untuk melakukan resepsi, oleh karena itu untuk notifikasi tersebut adalah "observer pattern".

lalu baru akan tertampilkan beberapa tema dokorasi untuk si konsumen, yang mana itu sebut sebagai "Decorator Pattern", 
jenis decornya ada tema adat, alam dan Ructic. dan nanti akan melakukan proses pemilihan tema
 */

import java.util.Scanner;//mengimport scanner ke program 
class Main {
    public static void main (String[] args) {// merupakan class utama

        //observer pattern
        System.out.println("--| RESEPSI PERNIKAHAN |--");

        //membuat objek dan observer yang menerima notifikasi
        Observable Waktu = new Tema();
        Observer konsumen = new Resepsi("Raihan Amal Ramadhan");

        //menambahkan objek observer ke dalam array list 
        Waktu.addObserver(konsumen);
 
        Waktu.notifikasi("Pilih tema dokorasi untuk resepsi anda:");//memanggil notifikasi 

        System.out.println("1. Tema Rumah Adat");
        System.out.println("2. Tema Pantai");
        System.out.println("3. Tema Rustic");

        //decorator pattern
        System.out.println("---------------------");
        System.out.println("|  LAKUKAN PILIHAN  |");//akukan  Pilihan
        System.out.println("---------------------");

        //membuat objek untuk setiap tema yang di-decorate
        Dekorasi rDekorasi = new TemaRumahAdat();
        Dekorasi iDekorasi = new TemaPantai();
        Dekorasi tDekorasi = new TemaRustic();

        Scanner input = new Scanner(System.in);//berfungsi untuk mencetak hasil dari data-data

        System.out.println("\nMasukkan Pilihan: ");
        int pilih = input.nextInt();
         switch (pilih) {//
                case 1: {
                        System.out.println("1. Tema Rumah Adat :");
                        rDekorasi.Pilihan();//menampilkan pesan keterangan dan memanggilmethod pilihan
                    break;//kata kuci lompat/berhenti
                }
                case 2: {
                        System.out.println("\n2. Tema Pantai :");
                        iDekorasi.Pilihan();//menampilkan pesan keterangan dan memanggilmethod pilihan
                    break;
                }
                case 3: {
                        System.out.println("\n3. Tema Rustic :");
                        tDekorasi.Pilihan();//menampilkan pesan keterangan dan memanggilmethod pilihan
                    break;
                }
            }
         System.out.println("\n\n**Terimakasih telah memilih, semoga hasilnya menyenangkan** ");
    }
}

