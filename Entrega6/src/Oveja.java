public class Oveja {
    private String direccion;
    private String simbolo;
    private Oveja siguiente;

    public Oveja(String direccion) {
        this.direccion = direccion;
        if (direccion.equals("derecha")) {
            this.simbolo = ">";
        } else if (direccion.equals("izquierda")) {
            this.simbolo = "<";
        } else {
            this.simbolo = " ";
        }
        siguiente = null;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
        if (direccion.equals("derecha")) {
            this.simbolo = ">";
        } else if (direccion.equals("izquierda")) {
            this.simbolo = "<";
        } else {
            this.simbolo = " ";
        }
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
