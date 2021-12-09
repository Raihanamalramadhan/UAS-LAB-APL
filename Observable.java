//class ini merupakan interface dari class Tema
interface Observable {
    public void addObserver(Observer observer);
    public void notifikasi(String s);
}