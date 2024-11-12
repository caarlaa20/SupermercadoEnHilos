package org.example;

public class Supermercado {
    public static void main(String[] args) {
        // Crearmos cajas
        Caja caja1 = new Caja(1);
        Caja caja2 = new Caja(2);

        // Crearmos los productos para los clientes
        String[] productosCliente1 = {"Leche", "Pan", "Arroz", "Jabón", "Manzanas"};
        String[] productosCliente2 = {"Papel Higiénico", "Leche", "Galletas", "Tomates"};
        String[] productosCliente3 = {"Pasta", "Aceite", "Arroz", "Queso"};
        String[] productosCliente4 = {"Verduras", "Leche", "Pan"};
        String[] productosCliente5 = {"Cereal", "Yogur", "Galletas", "Manteca", "Leche"};

        // Creamos los hilos para los clientes
        Thread cliente1 = new Thread(new Cliente("Carlos", productosCliente1, caja1));
        Thread cliente2 = new Thread(new Cliente("Ana", productosCliente2, caja1));
        Thread cliente3 = new Thread(new Cliente("Luis", productosCliente3, caja2));
        Thread cliente4 = new Thread(new Cliente("Marta", productosCliente4, caja2));
        Thread cliente5 = new Thread(new Cliente("Pedro", productosCliente5, caja1));

        // Iniciamos los hilos
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
    }
}
