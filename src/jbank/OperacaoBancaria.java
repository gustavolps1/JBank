package jbank;

public interface OperacaoBancaria {

	boolean transferir(ContaBancaria destinatario, double valor);

	boolean depositar(double valor);

	boolean sacar(double valor);
}
