package com.example.pruebas;

public class SampleClass {

    MyCustomListener listener;
    private int number;

    public SampleClass(int number) {
        this.number = number;
    }

    public void setMyCustomListener(MyCustomListener listener) {
        this.listener = listener;
    }

    public int getNumber() {
        return number;
    }


    public void doSomething(){
        checkYear();
    }

    public void checkYear(){
        if(getNumber()==2020){
            listener.onSuccess("You are ok");
        }else{
            listener.onFailure("You are wrong");
        }
    }

}

