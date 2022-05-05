public class Oveja {
    int inicial;
   private String direccion;

    public Oveja(int inicial) {
        this.inicial = inicial;
        if (inicial < 3) {
            direccion = ">";
        } else if (inicial > 3) {
            direccion = "<";
        }else if(inicial == 3){
            direccion ="";
        }
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}
