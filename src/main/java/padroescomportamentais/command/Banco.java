import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public void realizarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
        emprestimo.confirmaEmprestimo();
    }

    public void confirmaUltimoEmprestimo(){
        if (emprestimos.size() != 0){
            Emprestimo emprestimo = this.emprestimos.get(this.emprestimos.size() -1);
            emprestimo.cancelarEmprestimo();
            this.emprestimos.remove(this.emprestimos.size() -1);
        }
    }
}
