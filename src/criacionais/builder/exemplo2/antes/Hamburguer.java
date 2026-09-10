package criacionais.builder.exemplo2.antes;

public class Hamburguer {

    private final String pao;
    private final String carne;
    private final boolean queijo;
    private final boolean bacon;
    private final boolean alface;
    private final boolean tomate;
    private final boolean cebola;
    private final boolean molhoEspecial;

    public Hamburguer(String pao, String carne, boolean queijo, boolean bacon,
                       boolean alface, boolean tomate, boolean cebola, boolean molhoEspecial) {
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
        this.bacon = bacon;
        this.alface = alface;
        this.tomate = tomate;
        this.cebola = cebola;
        this.molhoEspecial = molhoEspecial;
    }

    @Override
    public String toString() {
        StringBuilder descricao = new StringBuilder(pao + " com " + carne);
        if (queijo) descricao.append(", queijo");
        if (bacon) descricao.append(", bacon");
        if (alface) descricao.append(", alface");
        if (tomate) descricao.append(", tomate");
        if (cebola) descricao.append(", cebola");
        if (molhoEspecial) descricao.append(", molho especial");
        return descricao.toString();
    }
}
