public class Comedor{
    private int horaApertura;
    private int horaCierre;
    private Jefe encargado;
    public Comedor(int horaDeApertura, int horaDeCierre, int anosExperiencia, String nombreJefe){
        horaApertura = horaDeApertura;
        horaCierre = horaDeCierre;
        encargado = new Jefe(nombreJefe, anosExperiencia);
    }

    public String getHoraApertura() {
        String horaDeApertura;
        if (horaApertura < 10) {
            horaDeApertura =  "0" + horaApertura + ":00";
        }
        else {
            horaDeApertura = horaApertura + ":00";
        }
        return horaDeApertura;
    }

    public String getHoraCierre() {
        String horaDeCierre;
        if (horaCierre < 10) {
            horaDeCierre =  "0" + horaCierre + ":00";
        }
        else {
            horaDeCierre = horaCierre + ":00";
        }
        return horaDeCierre;
    }

    public String getEncargado() {
        return "El nombre del encargado es: " + encargado.getNombre() + " | Tiene " + encargado.getAnosExp() + " anos de experiencia";
    }

    public void setHoraApertura(int newHoraDeApertura) {
        horaApertura = newHoraDeApertura;
    }

    public void setHoraCierre(int newHoraDeCierre) {
        horaCierre = newHoraDeCierre;
    }

    public void setEncargado(String newNombre, int newAnosExp){
        encargado.setNombre(newNombre);
        encargado.setAnosExp(newAnosExp);
    }
}