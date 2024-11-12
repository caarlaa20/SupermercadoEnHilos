package org.example;

class Caja {
    private int id;

    public Caja(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Método para procesar productos
    public synchronized void procesarProducto(String cliente, String producto) throws InterruptedException {
        Thread.sleep(1000); // Simula el tiempo de procesamiento de un producto
        System.out.println("Caja " + id + " procesando producto: " + producto + " del cliente: " + cliente);
    }
}
