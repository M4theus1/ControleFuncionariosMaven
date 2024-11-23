package com.exemplo.controlefuncionarios;

import com.exemplo.controlefuncionarios.dao.DepartamentoDAO;
import com.exemplo.controlefuncionarios.entidades.Departamento;

public class App {
    public static void main(String[] args) {
        Departamento departamento = new Departamento();
        departamento.setNome("Recursos Humanos");

        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        departamentoDAO.save(departamento);

        System.out.println("Departamento salvo com sucesso!");
    }
}