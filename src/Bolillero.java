import java.util.*;

class Bolillero {

    private int bolilla;
    private int b = 99;

    private Vector<Integer> bolillas;
    private Vector<Integer> salidas;
    private Random bolillaAlea;

    public Bolillero() {
        this.bolillas = new Vector<>();
        this.salidas = new Vector<>();
        this.bolillaAlea = new Random();
    }

    public Bolillero(Vector<Integer> bolillas) {
        this.bolillas = bolillas;
        this.salidas = new Vector<>();
        this.bolillaAlea = new Random();
    }

    public void setBolilla(int bolilla) {
        this.bolilla = bolilla;
        salidas.add(bolilla);
    }

    public int getBolilla() {
        return bolilla;
    }

    public Vector<Integer> getSalidas() {
        return salidas;
    }

    public Vector<Integer> getBolillas() {
        return bolillas;
    }

    public void sacarBolilla() {
        for (int i = 0; i <= 99; i++) {
            bolillas.add(bolillaAlea.nextInt(b));
        }
        System.out.println("--------Bolilllas-----");
        for (int i = 0; i < bolillas.size(); i++) {
            System.out.println(bolillas.get(i));
        }
        System.out.println("-----------");
    }
}
