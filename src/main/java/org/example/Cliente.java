package org.example;

class Cliente implements Runnable {
    // Atributos
    private String nombre;
    private String[] productos;
    private Caja caja;

    // Constructor
    public Cliente(String nombre, String[] productos, Caja caja) {
        this.nombre = nombre;
        this.productos = productos;
        this.caja = caja;
    }

    // Metodos
    @Override
    public void run() {
        try {
            for (String producto : productos) {
                caja.procesarProducto(nombre, producto);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


