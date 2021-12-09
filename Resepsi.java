 /*
 class ini merupakan class initi dari observer, karena ouput yang dihasilkan dari sini yaitu berupa notifikasi.
 */
public class Resepsi implements Observer { //Class implemet class observer
    private String resepsi;

    public Resepsi (String resepsi){
        this.resepsi = resepsi;
    }
    @Override //overide method update supaya notifikasi dapat diterima
    public void update(String s) {

        System.out.println("Hello " + this.resepsi + ", Untuk pelaksanaan pernikahan anda telah kami setujui.\n"+s);
    }
}