import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {
    Banco app;
    EmprestimoCliente emprestimo;

    @BeforeEach
    void setUp(){
        app = new Banco();
        emprestimo = new EmprestimoCliente("Julieta", 2021);

    }

    @Test
    void deveAbrirEmprestimo(){
        Emprestimo abertura = new AberturaEmprestimo(emprestimo);
        app.realizarEmprestimo(abertura);

        assertEquals("Emprestimo aberto", emprestimo.getSituacao());
    }

    @Test
    void deveFecharEmprestimo(){
        Emprestimo fechar = new FecharEmprestimo(emprestimo);
        app.realizarEmprestimo(fechar);

        assertEquals("Emprestimo fechado", emprestimo.getSituacao());
    }

    @Test
    void  deveCancelarFechamentoEmprestimo(){
        Emprestimo aberturaEmprestimo = new AberturaEmprestimo(emprestimo);
        Emprestimo fechadoEmprestimo = new FecharEmprestimo(emprestimo);

        app.realizarEmprestimo(aberturaEmprestimo);
        app.realizarEmprestimo(fechadoEmprestimo);

        app.confirmaUltimoEmprestimo();

        assertEquals("Emprestimo aberto", emprestimo.getSituacao());
    }


}