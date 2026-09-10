package exercicios.exercicio4;

public class ClasseCliente {

    // Para somar a folha de pagamento, é preciso descer manualmente por
    // funcionários E por sub-departamentos, com um método separado para
    // cada nível — o código cliente precisa conhecer a estrutura inteira
    // da árvore para conseguir percorrê-la.
    private static double somarFolha(Departamento departamento) {
        double total = 0;

        for (Funcionario funcionario : departamento.getFuncionarios()) {
            total += funcionario.getSalario();
        }

        for (Departamento subDepartamento : departamento.getSubDepartamentos()) {
            total += somarFolha(subDepartamento);
        }

        return total;
    }

    public static void main(String[] args) {
        Departamento engenharia = new Departamento("Engenharia");
        engenharia.adicionarFuncionario(new Funcionario("Ana", 9000));
        engenharia.adicionarFuncionario(new Funcionario("Bruno", 8500));

        Departamento backend = new Departamento("Backend");
        backend.adicionarFuncionario(new Funcionario("Carla", 9500));
        engenharia.adicionarSubDepartamento(backend);

        Departamento diretoria = new Departamento("Diretoria");
        diretoria.adicionarFuncionario(new Funcionario("Diretor", 20000));
        diretoria.adicionarSubDepartamento(engenharia);

        System.out.println("Folha total: R$" + somarFolha(diretoria));

        // Se amanhã existir uma regra diferente (ex.: imprimir o
        // organograma com indentação por nível), é preciso escrever de novo
        // essa mesma navegação separando funcionário de departamento.
    }
}
