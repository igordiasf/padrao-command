public class AberturaEmprestimo implements Emprestimo {

    private EmprestimoCliente emprestimoCliente;

    public AberturaEmprestimo(EmprestimoCliente emprestimoCliente){
        this.emprestimoCliente = emprestimoCliente;
    }

    public void confirmaEmprestimo(){
        this.emprestimoCliente.abrirEmprestimo();
    }

    public void cancelarEmprestimo(){
        this.emprestimoCliente.fecharEmprestimo();
    }

}
