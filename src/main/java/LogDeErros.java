import java.io.FileWriter;
import java.io.IOException;

public class LogDeErros {
    private static final String NOME_ARQUIVO = "log_erros.txt";

    public static void registrar(Exception e) {
        String tipoErro = e.getClass().getName(); // Pega o nome da classe da exceção
        String mensagem = e.getMessage();

        String entradaLog = String.format("(%s): %s%n", tipoErro, mensagem);

        try (FileWriter fw = new FileWriter(NOME_ARQUIVO, true)) {
            fw.write(entradaLog);
        } catch (IOException ioException) {
            System.err.println("!!! FALHA AO REGISTRAR LOG NO ARQUIVO: " + ioException.getMessage());
            System.err.println("ERRO ORIGINAL: " + entradaLog);
        }
    }
}