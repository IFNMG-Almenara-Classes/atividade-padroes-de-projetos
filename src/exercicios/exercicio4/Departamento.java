package exercicios.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private final String nome;
    private final List<Funcionario> funcionarios = new ArrayList<>();
    private final List<Departamento> subDepartamentos = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarSubDepartamento(Departamento departamento) {
        subDepartamentos.add(departamento);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Departamento> getSubDepartamentos() {
        return subDepartamentos;
    }
}
