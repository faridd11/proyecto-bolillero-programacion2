import java.util.*;

class Cartones {
    int numMax = 15;

    Vector <Integer> cartones = new Vector();

    Random numeAlea = new Random();

    public void generarCarton(){
        for(int i = 0; i < numMax; i++ ){
            cartones.add(numeAlea.nextInt(100));
        }
        System.out.println("Carton");
        for(int i = 0; i<cartones.size(); i++){
            System.out.println(cartones.get(i));
        }
        System.out.println("-----------------");
    }
    public Vector<Integer> getCartones(){
        return cartones;
    }

    

}
