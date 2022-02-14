package com.example.mypackage;

public class Proceso extends Thread{

    private String nombre;
    private int tiempoSegundos;

    public Proceso(){

    }

    public Proceso(String nombre, int tiempoSegundos) {
        this.nombre = nombre;
        this.tiempoSegundos = tiempoSegundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoSegundos() {
        return tiempoSegundos;
    }

    public void setTiempoSegundos(int tiempoSegundos) {
        this.tiempoSegundos = tiempoSegundos;
    }

    public void run(){
            System.out.println("El proceso " + getNombre() + " ha iniciado");
            try{
                Thread.sleep(1000 * getTiempoSegundos());
            }catch(InterruptedException e){
                System.out.println("Error en espera, " + e);
            }
            System.out.println("El proceso " + getNombre() + " ha finalizado");
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", tiempoSegundos=" + tiempoSegundos +
                '}';
    }
}
