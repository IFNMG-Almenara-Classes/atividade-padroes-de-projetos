package comportamentais.command.exemplo1.depois;

import java.util.ArrayDeque;
import java.util.Deque;

public class ControleRemoto {

    private final Deque<Comando> historico = new ArrayDeque<>();

    public void apertarBotao(Comando comando) {
        comando.executar();
        historico.push(comando);
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) {
            historico.pop().desfazer();
        }
    }
}
