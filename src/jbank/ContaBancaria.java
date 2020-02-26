package jbank;

public class ContaBancaria implements OperacaoBancaria {

	private String num_Conta;
	private double saldo;
	private Cliente titular;
	private Agencia agencia;
	private Banco banco;

	public ContaBancaria() {

	}

	public String getNum_Conta() {
		return num_Conta;
	}

	public void setNum_Conta(String num_Conta) {
		this.num_Conta = num_Conta;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public boolean transferir(ContaBancaria destinatario, double valor) {
		if ((this.saldo - valor) >= 0) {
			if (this.saldo == 0 && valor == 0) {
				return false;
			}
			this.saldo = this.saldo - valor;
			destinatario.saldo = destinatario.saldo + valor;
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		if (valor == 0) {
			return false;
		}
		saldo = saldo + valor;
		return true;
	}

	@Override
	public boolean sacar(double valor) {
		if ((saldo - valor) >= 0) {
			if (saldo == 0 && valor == 0) {
				return false;
			}
			saldo = saldo - valor;
			return true;

		} else {
			return false;
		}
	}
}
