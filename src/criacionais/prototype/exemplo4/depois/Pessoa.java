package criacionais.prototype.exemplo4.depois;

import java.util.IdentityHashMap;
import java.util.Map;

public class Pessoa {

    private final String nome;
    private Pessoa melhorAmigo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setMelhorAmigo(Pessoa melhorAmigo) {
        this.melhorAmigo = melhorAmigo;
    }

    public Pessoa getMelhorAmigo() {
        return melhorAmigo;
    }

    public Pessoa copiar() {
        return copiar(new IdentityHashMap<>());
    }

    private Pessoa copiar(Map<Pessoa, Pessoa> jaClonados) {
        // Se esta pessoa já começou a ser clonada nesta operação, devolve o
        // clone que já existe, em vez de clonar de novo (e entrar em loop).
        Pessoa copiaExistente = jaClonados.get(this);
        if (copiaExistente != null) {
            return copiaExistente;
        }

        Pessoa copia = new Pessoa(this.nome);
        jaClonados.put(this, copia); // registra ANTES de clonar o amigo

        if (this.melhorAmigo != null) {
            copia.melhorAmigo = this.melhorAmigo.copiar(jaClonados);
        }

        return copia;
    }

    @Override
    public String toString() {
        String amigo = (melhorAmigo != null) ? melhorAmigo.nome : "ninguém";
        return nome + " (melhor amigo: " + amigo + ")";
    }
}
