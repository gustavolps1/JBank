package jbank;

public class Cliente {

	private int num_Cliente;
	private String cpf;
	private String nome;
	private String email;
	private String senha;

	public Cliente() {

	}

	public int getId_Cliente() {
		return num_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.num_Cliente = id_Cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
