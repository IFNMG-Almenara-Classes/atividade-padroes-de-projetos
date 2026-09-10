package criacionais.builder.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        Hamburguer xBacon = new HamburguerBuilder("Brioche", "Carne Bovina")
                .comQueijo()
                .comBacon()
                .comMolhoEspecial()
                .build();
        System.out.println(xBacon);

        Hamburguer xSalada = new HamburguerBuilder("Integral", "Carne Bovina")
                .comQueijo()
                .comCebola()
                .adicionarIngredienteExtra("picles")
                .adicionarIngredienteExtra("ovo")
                .build();
        System.out.println(xSalada);
    }
}
