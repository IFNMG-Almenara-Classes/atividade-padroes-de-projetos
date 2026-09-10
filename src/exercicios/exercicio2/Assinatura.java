package exercicios.exercicio2;

public class Assinatura {

    private final String plano;
    private final int usuarios;
    private final boolean suporte24h;
    private final String sla;
    private final int diasTesteGratis;
    private final double desconto;

    public Assinatura(String plano, int usuarios) {
        this(plano, usuarios, false, "Nenhum", 0, 0);
    }

    public Assinatura(String plano, int usuarios, boolean suporte24h) {
        this(plano, usuarios, suporte24h, "Nenhum", 0, 0);
    }

    public Assinatura(String plano, int usuarios, boolean suporte24h, String sla) {
        this(plano, usuarios, suporte24h, sla, 0, 0);
    }

    public Assinatura(String plano, int usuarios, boolean suporte24h, String sla, int diasTesteGratis) {
        this(plano, usuarios, suporte24h, sla, diasTesteGratis, 0);
    }

    public Assinatura(String plano, int usuarios, boolean suporte24h, String sla, int diasTesteGratis, double desconto) {
        this.plano = plano;
        this.usuarios = usuarios;
        this.suporte24h = suporte24h;
        this.sla = sla;
        this.diasTesteGratis = diasTesteGratis;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return String.format(
                "Assinatura %s | usuarios=%d | suporte24h=%b | sla=%s | testeGratis=%ddias | desconto=%.0f%%",
                plano, usuarios, suporte24h, sla, diasTesteGratis, desconto);
    }
}
