package View;

import Biblioteca.ListaObject.Lista;
import Controller.FilaInvertida;

public class Main {
    public static void main(String[] args) {
        Lista listaL= new Lista();

        listaL.addFirst(3);
        listaL.addFirst(5);
        listaL.addFirst(18);
        listaL.addFirst(12);
        listaL.addFirst(9);
        listaL.addFirst(7);
        listaL.addFirst(6);
        listaL.addFirst(2);
        listaL.addFirst(13);
        listaL.addFirst(4);
        listaL.addFirst(16);

        FilaInvertida Inverter= new FilaInvertida();

        Inverter.FilaLInvertida(listaL);

    }
}
