package criacionais.builder.exemplo2.depois;

import java.util.ArrayList;
import java.util.List;

public class HamburguerBuilder {

    final String pao;
    final String carne;
    boolean queijo;
    boolean bacon;
    boolean alface;
    boolean tomate;
    boolean cebola;
    boolean molhoEspecial;
    final List<String> ingredientesExtras = new ArrayList<>();

    public HamburguerBuilder(String pao, String carne) {
        this.pao = pao;
        this.carne = carne;
    }

    public HamburguerBuilder comQueijo() {
        this.queijo = true;
        return this;
    }

    public HamburguerBuilder comBacon() {
        this.bacon = true;
        return this;
    }

    public HamburguerBuilder comAlface() {
        this.alface = true;
        return this;
    }

    public HamburguerBuilder comTomate() {
        this.tomate = true;
        return this;
    }

    public HamburguerBuilder comCebola() {
        this.cebola = true;
        return this;
    }

    public HamburguerBuilder comMolhoEspecial() {
        this.molhoEspecial = true;
        return this;
    }

    public HamburguerBuilder adicionarIngredienteExtra(String nome) {
        ingredientesExtras.add(nome);
        return this;
    }

    public Hamburguer build() {
        return new Hamburguer(this);
    }
}
