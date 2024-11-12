package org.example;

class Cliente implements Runnable {
    private String nombre;
    private String[] productos;
    private Caja caja;

    public Cliente(String nombre, String[] productos, Caja caja) {
        this.nombre = nombre;
        this.productos = productos;
        this.caja = caja;
    }

    @Override
    public void run() {
        try {
            for (String producto : productos) {
                caja.procesarProducto(nombre, producto);  // Pasar producto a la caja
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


