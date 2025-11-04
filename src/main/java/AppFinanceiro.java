public class AppFinanceiro {
    static int calcularDivisao(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        } finally {
            System.out.println("Operação finalizada com sucesso.");
        }
    }
}
