package com.mycompany.lista;
public class nodo {
    private int info;
    private nodo sig;
    public nodo(){
        this.sig=null;
        info=0;
    }
    public void setinfo(int dato){
        info=dato;
    }
    public int getinfo(){
        return info;
    }
    public void setsig(nodo sigu){
        sig=sigu;
    }
    public nodo getsig(){
        return sig;
    }
}
