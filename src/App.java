
public class App {
    public static void main(String[] args) {
        
     Bolillero miBolillero = new Bolillero();
      miBolillero.sacarBolilla(); 

      Cartones miCarton1 = new Cartones();
      miCarton1.generarCarton();

      Planilla miPlanilla = new Planilla();
      miPlanilla.setSalida(miBolillero.getBolillas());
      boolean re = miPlanilla.verificarCartonLleno(miCarton1.getCartones());

      System.out.println("Carton lleno?" + re);

    }
}
