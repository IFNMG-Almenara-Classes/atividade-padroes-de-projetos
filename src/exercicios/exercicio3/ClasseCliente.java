package exercicios.exercicio3;

public class ClasseCliente {

    public static void main(String[] args) {
        TransportadoraExternaApi api = new TransportadoraExternaApi();

        // O sistema interno trabalha com RastreadorEncomenda.consultarStatus(),
        // mas a API externa só oferece getStatusCode() retornando um número.
        // Toda vez que alguém precisa consultar o status, converte o código
        // manualmente aqui mesmo:
        int codigo1 = api.getStatusCode("COL123");
        String status1 = codigo1 == 1 ? "Coletado" : codigo1 == 2 ? "Em trânsito" : codigo1 == 3 ? "Entregue" : "Desconhecido";
        System.out.println(status1);

        int codigo2 = api.getStatusCode("ENT999");
        String status2 = codigo2 == 1 ? "Coletado" : codigo2 == 2 ? "Em trânsito" : codigo2 == 3 ? "Entregue" : "Desconhecido";
        System.out.println(status2);

        // Essa conversão de código para texto está duplicada em cada lugar
        // que precisa consultar o status — e o sistema interno não consegue
        // depender de RastreadorEncomenda (a interface que ele conhece),
        // porque TransportadoraExternaApi não a implementa.
    }
}
