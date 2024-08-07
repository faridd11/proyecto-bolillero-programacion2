import java.util.*;
class Planilla {
    private Vector <Integer> salidas = new Vector();

    public void setSalida(Vector<Integer> bolillas){
        this.salidas = bolillas;
    }

    public boolean verificarTerna (Vector <Integer> cartones){
        //HashSet sirve para buscar mas rapido el numero
        Set <Integer> salidasSet = new HashSet<>(salidas);
        int contador = 0;
        for (int bolilla : cartones){
            if(salidasSet.contains(bolilla)) {
                contador++;
                if(contador == 3){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificarQuintina(Vector <Integer> cartones) {
        Set <Integer> salidaSet = new HashSet<>(salidas);
        int contador = 0;
        for (int bolilla : cartones){
            if(salidaSet.contains(bolilla)) {
                contador++;
                if(contador ==5){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificarCartonLleno(Vector<Integer> cartones) {
        Set <Integer> saliSet = new HashSet <>(salidas);
        int contador = 0;
        for (int bolilla : cartones) {
            if (saliSet.contains (bolilla)) {
                contador++;
                if (contador == 15){
                    return true;
                }
            }
        }
        return false;
    }

    
}

