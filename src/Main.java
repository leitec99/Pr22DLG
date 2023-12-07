import Info_Producto.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto ( "01", "producto1", 20);

        Producto producto2 = new Producto ( "01", "producto1", 20);
        System.out.println("El producto de código " + producto1.getCodigo() + " y nombre " + producto1.getNombre() +
                " tiene un precio de " + producto1.getPrecio() + " euros");
        System.out.println("El producto de código " + producto2.getCodigo() + " y nombre " + producto2.getNombre() +
                " tiene un precio de " + producto2.getPrecio() + " euros");

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Introduzca el código del producto número 3");
        String codigoProducto3 = keyboard.nextLine();

        System.out.println("Introduzca el nombre del producto número 3");
        String nombreProducto3 = keyboard.nextLine();

        System.out.println("Introduzca el precio del producto número 3");
        float precioProducto3 = keyboard.nextFloat();

        System.out.println("El producto de código " + codigoProducto3 + " y nombre " + nombreProducto3 +
                " tiene un precio de " + precioProducto3 + " euros");

        Producto producto3 = new Producto(codigoProducto3, nombreProducto3, precioProducto3);





    }

}

