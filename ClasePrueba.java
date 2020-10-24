package com.example.pruebas;

public class ClasePrueba {

    private int number;

    public ClasePrueba(int number) {
        this.number = number;
    }


    public void doSomething(){
        checkYear();
    }

    public int getNumber() {
        return number;
    }

    public void checkYear(){
        if(getNumber()==2020){
            ok();
        }else{
            error();
        }
    }
    public void error(){
        System.out.println("incorrect");
    }
    public void ok(){
        System.out.println("correcto");
    }
}
