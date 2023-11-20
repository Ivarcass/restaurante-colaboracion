public class Jefe{
    
    private String nombre;
    private int anosExp;
    
    public Jefe(String newNombre, int newAnosExp){
        anosExp = newAnosExp;
        nombre = newNombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getAnosExp() {
        return anosExp;
    }
    
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    public void setAnosExp(int nuevoAnosExp) {
        anosExp = nuevoAnosExp;
    }
    
    public void imprimirDetalles(){
        System.out.println("El nombre del jefe es: " + nombre + ", y sus años de experiencia son: " + anosExp);
    }
}