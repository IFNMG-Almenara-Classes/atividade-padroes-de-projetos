package estruturais.facade.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        CinemaEmCasaFacade cinema = new CinemaEmCasaFacade();

        cinema.assistirFilme("Matrix");
        System.out.println("--- Fim do filme ---");
        cinema.encerrarSessao();
    }
}
