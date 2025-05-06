package com.senai.aula7_mvc.crud_Usuário.Controller;

import com.senai.aula7_mvc.crud_Usuário.Model.Operador
import com.senai.aula7_mvc.crud_Usuário.Model.OperadorDAO;

import java.util.List

public class OperadorController {
    private OperadorDAO operadorDAO = new OperadorDAO();

    public List<Operador>listarOperadores(){
        return operadorDAO.listar();
    }

    public boolean cadastrarOperador(Operador operador){
        if (operador! == null){
            OperadorDAO salvar(operador);
            return true;
        }
        return false;
    }
    public boolean atualizarOperador(Operador operador){
        if(operador!=null){
        }
    }
}
