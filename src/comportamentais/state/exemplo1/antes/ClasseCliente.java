package comportamentais.state.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.avancar();
        pedido.avancar();
        pedido.avancar();

        // Cada regra de transição (o que pode avançar para o quê, o que
        // pode ser cancelado) mora dentro de if/else dentro de Pedido.
        // Acrescentar um novo status (ex.: "EM_SEPARACAO" entre PAGO e
        // ENVIADO) significa reescrever avancar() e cancelar() inteiros,
        // mexendo em regras que já funcionam.
    }
}
