package com.senai.aula6_Abstração.exemplos_interface.smartwatch;

public class Smartwatch implements SensorPassos,SensorCardiaco,SensorSono {
    @Override
    public void MedirFrequenciaCardiaca() {
        System.out.println("Medição Cardiaca: 80bps");
    }

    @Override
    public void contarpassos() {
        System.out.println("Passos Hoje: 1000 passos");
    }

    @Override
    public void medirQualidadedosono() {
        System.out.println("Qualidade do sono: regular");
    }
}
