package classes;

public class Fornecedores {
 package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fornecedores {

	@Column(name = "nome_forn")
	String nome;
	@Column(name = "endereco_forn")
	String endereco;
	@Id
	@Column(name= "cnpj_forn" ,unique = true, nullable = false)
	String cnpj;
	    

	    public Fornecedores(String nome, String endereco, String cnpj) {
	        this.nome = nome;
	        this.endereco = endereco;
	        this.cnpj= cnpj;
	    }


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEndereco() {
			return endereco;
		}


		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}


		public String getCnpj() {
			return cnpj;
		}


		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

}

 
