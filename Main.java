//Nivel 1: Nombre de comida
class NombreComida {
  private String nombre;

  NombreComida(String nombre) {
    this.nombre = nombre;
  }
  String getNombre() {
    return nombre;
   }

  void setNombre(){this.nombre = "Salchipapa";}
  void mostrarNombre(){System.out.println("Nombre de la comida: "+nombre);}
}
//Nivel 2: Precio de la comida
class PrecioComida extends NombreComida {
 private String precio;
 PrecioComida(String nombre, String precio) {
   super(nombre);
   this.precio = precio;
 }

  String getPrecio() { return precio; }
  void setPrecio(){this.precio = "5.50";}
  void mostrarPrecio(){System.out.println("Precio de la comida: "+precio);}
}
//Nivel 3: Tipo de comida
  class TipoComida extends PrecioComida {
    private String tipo;
    TipoComida(String nombre, String precio, String tipo) {
      super(nombre, precio);
      this.tipo = tipo;
    }
    String getTipo() { return tipo; }
    void setTipo(){this.tipo = "Grasas";}
    void mostrarTipo(){System.out.println("Tipo de comida: "+tipo);}
  }

class Main {
  public static void main(String[] args) {
    try{
      TipoComida[] comidas = new TipoComida[3];
      comidas[0] = new TipoComida("Ensalada", "4.50", "Saludable");
      comidas[1] = new TipoComida("Hamburguesa", "7.50", "Carbohidratos");
      comidas[2] = new TipoComida("Pizza", "5.50", "Chatarra");
      for(TipoComida comida: comidas) {
        comida.mostrarNombre();
        comida.mostrarPrecio();
        comida.mostrarTipo();
        comida.setNombre();
        comida.setPrecio();
        comida.setTipo();
        comida.mostrarNombre();
        comida.mostrarPrecio();
        comida.mostrarTipo();
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}