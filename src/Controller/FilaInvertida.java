package Controller;

import Biblioteca.ListaObject.Lista;

public class FilaInvertida {


    public FilaInvertida(){
        super();
    }


    public void FilaLInvertida(Lista listaL){
        int cont= 0;
        int aux;
        for (int i=0; i<11; i++){
            try {
                listaL.add(listaL.removeLast(), cont);
                cont++;
                System.out.println(listaL.get(i));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
