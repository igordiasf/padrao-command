public class FecharEmprestimo implements Emprestimo {

    private EmprestimoCliente emprestimoCliente;

    public FecharEmprestimo(EmprestimoCliente emprestimoCliente){
        this.emprestimoCliente = emprestimoCliente;
    }

    public void confirmaEmprestimo(){
        this.emprestimoCliente.fecharEmprestimo();
    }
    public void cancelarEmprestimo(){
        this.emprestimoCliente.abrirEmprestimo();
    }
}
