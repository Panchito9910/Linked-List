package com.mycompany.lista;
public class lista_simple extends nodo{
    private nodo nuevo,primer,ultimo,aux;
    public lista_simple(){
        nuevo=null;
        primer=null;
        ultimo=null;
        aux=null;
    }
    public void insertar_ultimo(int dato){
        nuevo=new nodo();
        nuevo.setinfo(dato);
        if(primer==null){
            nuevo.setsig(null);
            primer=nuevo;
            nuevo=null;
        }else{
            for(aux=primer;aux.getsig()!=null;aux=aux.getsig());
            aux.setsig(nuevo);
            nuevo.setsig(null);
            ultimo=nuevo;
            aux=null;
            nuevo=null;
        }
    }
    public void insertar_adelante(int dato){
        nuevo=new nodo();
        nuevo.setinfo(dato);
        if(primer==null){
            primer=nuevo;
            nuevo.setsig(null);
            nuevo=null;
        }else{
            aux=primer;
            nuevo.setsig(aux);
            primer=nuevo;
            nuevo=null;
            aux=null;
        }
    }
    public void insertar_por_posición(int posicion,int dato){
        int contador=1;
        nuevo=new nodo();
        nuevo.setinfo(dato);
        if(primer==null&&posicion==1){
            primer=nuevo;
            nuevo.setsig(null);
            nuevo=null;
        }else{
            for(aux=primer;aux!=null;aux=aux.getsig()){
                if(posicion==1){
                    primer=nuevo;
                    nuevo.setsig(aux);
                    aux=null;
                    nuevo=null;
                    return;
                }else if(contador==(posicion-1)){
                    nuevo.setsig(aux.getsig());
                    aux.setsig(nuevo);
                    nuevo=null;
                    aux=null;
                    return;
                }else if(aux.getsig()==null){
                    System.out.println("No se puede insertar el dato "+dato+" por que la posición "+posicion+" no se encuentra en la lista");
                }
                contador++;
            }
        }
    }
    public void insertar_por_nodo(int buscar,int dato){
        nuevo=new nodo();
        nuevo.setinfo(dato);
        if(primer==null){
            System.out.println("Error-No se puede insertar, la lista está vacía");
        }else{
            for(aux=primer;aux!=null;aux=aux.getsig()){
                if(aux.getinfo()==buscar){
                    nuevo.setsig(aux.getsig());
                    aux.setsig(nuevo);
                    nuevo=null;
                    aux=null;
                    return;
                }
            }
        }
    }
    public void eliminar(){
        if(primer==null){
            System.out.println("No se puede borrar por que la lista esta vacia");
        }else{
            for(aux=primer;aux!=ultimo;aux=aux.getsig()){
                if(aux.getsig()==ultimo){
                    ultimo=aux;
                    aux.setsig(null);
                    aux=null;
                    return;
                }
            }
        }
    }
    public void print(){
        if(primer==null){
            System.out.println("lista vacia, no se puede imprimir");
        }else{
            System.out.print("[");
            for(aux=primer;aux!=null;aux=aux.getsig()){
                System.out.print(aux.getinfo());
                if(aux.getsig()!=null){
                    System.out.print(", ");
                }
            }
            System.out.print("]\n");
        }
    }
}