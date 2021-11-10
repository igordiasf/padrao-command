public class EmprestimoCliente {
    private String nomeCliente;
    private int dataEmprestimo;
    private String situacao;

    public EmprestimoCliente(String nomeCliente, int dataEmprestimo) {
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getSituacao(){
        return situacao;
    }
    public void abrirEmprestimo(){
        this.situacao = "Emprestimo aberto";
    }
    public void fecharEmprestimo(){
        this.situacao = "Emprestimo fechado";
    }



}
