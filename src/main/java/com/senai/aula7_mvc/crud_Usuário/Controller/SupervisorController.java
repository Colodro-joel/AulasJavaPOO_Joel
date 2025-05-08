package com.senai.aula7_mvc.crud_Usuário.Controller;

import com.senai.aula7_mvc.crud_Usuário.Model.Supervisor;
import com.senai.aula7_mvc.crud_Usuário.Model.SupervisorDAO;

import java.util.List;

public class SupervisorController {
    private SupervisorDAO supervisorDAO = new SupervisorDAO();

    public List<Supervisor>listarSupervisores(){
        return supervisorDAO.listar();
    }

    public boolean cadastrarSupervisor(Supervisor supervisor){
        if (supervisor!=null){
            supervisorDAO.salvar(supervisor);
            return true;
        }
        return false;
    }
    public boolean atualizarSupervisor(Supervisor supervisor){
        if(supervisor!=null){
            supervisorDAO.atualizar(supervisor);
            return true;
        }
        return false;
    }
    public boolean deletarSupervisor(int id){
        if (id>=0){
            supervisorDAO.deletar(id);
            return true;
        }
        return false;
    }
}

