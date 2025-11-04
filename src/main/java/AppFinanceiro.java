public class AppFinanceiro {
    static void calcularDivisao(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
            LogDeErros.registrar(e);
        } finally {
            System.out.println("Operação finalizada com sucesso.");
        }
    }
}
