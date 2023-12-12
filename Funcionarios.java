package classes;
 
public class Funcionarios {

 package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionarios {

		@Column(name = "nome_func")
	    String nome;
		@Id
		@Column(name = "Rg_func")
	    String rg;
	    @Column(name = "Telefone_func")
	    String contatos;
	    @Column(name = "Cargo_func")
	    String cargo;
	    
		public Funcionarios(String nome, String rg, String contatos, String cargo) {
			super();
			this.nome = nome;
			this.rg = rg;
			this.contatos = contatos;
			this.cargo = cargo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getContatos() {
			return contatos;
		}

		public void setContatos(String contatos) {
			this.contatos = contatos;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

}

}
