package beans;

public class LoginBean {

	private String cpf;
	private String senha;

	public LoginBean(String cpf, String senha) {
		super();
		this.cpf = cpf;
		this.senha = senha;
	}

	public LoginBean() {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
