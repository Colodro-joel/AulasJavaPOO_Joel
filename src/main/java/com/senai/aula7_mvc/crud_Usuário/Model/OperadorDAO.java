package com.senai.aula7_mvc.crud_Usuário.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OperadorDAO{
private final String FILE_PATH = "operador.json";
private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

private List<Operador> carregar(){
    try(FileReader reader = new FileReader(FILE_PATH)){
        Type listType = new TypeToken<ArrayList<Operador>>() {}.getType();
        return gson.fromJson(reader, listType);
    } catch (Exception e) {
        return new ArrayList<>();
    }
}
    public OperadorDAO (){
        peradores = carregar();
    }
}
