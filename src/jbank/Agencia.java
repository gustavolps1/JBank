package jbank;

public class Agencia {

	private int num_Agencia;
	private String nome;
	private Banco banco;

	public int getNum_Agencia() {
		return num_Agencia;
	}

	public void setNum_Agencia(int num_Agencia) {
		this.num_Agencia = num_Agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Agencia() {

	}

}
