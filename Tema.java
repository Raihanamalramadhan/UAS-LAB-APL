/*
class ini adalah subjek dari design OBSERVER
*/

import java.util.ArrayList;

public class Tema implements Observable {//class implemen dari class Observable
    private ArrayList<Observer> tema = new ArrayList<>();
    //create objek tema

    @Override //overide semua method yang ada pada class observable
    public void addObserver(Observer observer) {
        tema.add(observer);
    }

    @Override
    public void notifikasi(String s) {
        for (Observer tema : tema) {
            tema.update(s);
        }
    }
}