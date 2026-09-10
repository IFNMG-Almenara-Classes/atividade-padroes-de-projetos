package criacionais.builder.exemplo2.depois;

import java.util.List;

public class Hamburguer {

    private final String pao;
    private final String carne;
    private final boolean queijo;
    private final boolean bacon;
    private final boolean alface;
    private final boolean tomate;
    private final boolean cebola;
    private final boolean molhoEspecial;
    private final List<String> ingredientesExtras;

    Hamburguer(HamburguerBuilder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.bacon = builder.bacon;
        this.alface = builder.alface;
        this.tomate = builder.tomate;
        this.cebola = builder.cebola;
        this.molhoEspecial = builder.molhoEspecial;
        this.ingredientesExtras = builder.ingredientesExtras;
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
        for (String extra : ingredientesExtras) {
            descricao.append(", ").append(extra);
        }
        return descricao.toString();
    }
}
