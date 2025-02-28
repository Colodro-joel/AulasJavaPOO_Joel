package com.senai.aula3_encapsulamento.exemplos;

class Car {
    private int velocity;


    public Car() {
        velocity = 0;
    }


    public int getVelocity(){
        return velocity;
    }

    public void setVelocity(int velocity) {
        if(velocity >= 0) {
            this.velocity = velocity;
        } else {
            System.out.println("Velocidade inválida");
        }
    }
}
