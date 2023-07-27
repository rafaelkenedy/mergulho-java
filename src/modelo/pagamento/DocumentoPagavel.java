package modelo;

public interface DocumentoPagavel {

    double getValorTotal();

    boolean estaPago();

    void quitarPagamento();
}
