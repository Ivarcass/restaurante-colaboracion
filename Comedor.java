public class Comedor{
    private int horaApertura;
    private int horaCierre;
    private Jefe encargado;
    public Comedor(int horaDeApertura, int horaDeCierre, int anosExperiencia, String nombreJefe){
        horaApertura = horaDeApertura;
        horaCierre = horaDeCierre;
        encargado = new Jefe(nombreJefe, anosExperiencia);
    }
}