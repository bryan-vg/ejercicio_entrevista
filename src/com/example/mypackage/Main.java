package com.example.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Proceso p1 = new Proceso("primero", 3);
        p1.start();
        //p1.run();
        Proceso p2 = new Proceso("segundo", 19);
        p2.start();
        //p2.run();
        Proceso p3 = new Proceso("tercero", 7);
        p3.start();

        // correo erick@xipetechnology.com

        List<Proceso> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        //System.out.println("lista de procesos: " + lista);

    }

}
