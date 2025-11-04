public class CadastroCliente {
    public void cadastrar(String nome, int idade) throws DadosInvalidosException {

        try {
            if (nome == null || nome.trim().isEmpty()) {
                throw new DadosInvalidosException("Nome não pode ser vazio e idade deve ser maior que 18.");
            }
            System.out.println("Cliente " + nome + " cadastrado com sucesso.");

        }
        catch (DadosInvalidosException e) {
            LogDeErros.registrar(e);
            throw e;
        }
    }
}