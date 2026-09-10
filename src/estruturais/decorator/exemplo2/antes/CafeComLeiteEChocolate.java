package estruturais.decorator.exemplo2.antes;

// E se o cliente quiser só chocolate (sem leite)? Mais uma classe.
// E leite, chocolate E canela? Mais outra. A quantidade de classes cresce
// exponencialmente com o número de adicionais.
public class CafeComLeiteEChocolate extends Bebida {

    @Override
    public String getDescricao() {
        return "Café + leite + chocolate";
    }

    @Override
    public double getPreco() {
        return 5.0 + 1.5 + 2.0;
    }
}
