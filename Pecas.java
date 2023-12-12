package classes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Pecas {

	@Id
	@Column(name= "id_skate")
	private String Id;
	@Column (name= "rodas_skate")
	private String Rodas;
	@Column (name= "shapes_skate")
	private String Shapes;
	@Column (name= "truck_skate")
	private String Truks;
	@Column (name="preco_skate")
	private String Preco;
	@OneToMany
	@JoinColumn (name = "cpf_cli")
	private List<Clientes> clientes;
	
	
	public Pecas(String id, String rodas, String shapes, String truks, String preco) {
		super();
		this.Id = id;
		this.Rodas = rodas;
		this.Shapes = shapes;
		this.Truks = truks;
		this.Preco = preco;
		
	}


	public Pecas() {
		super();
	}
	
	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getRodas() {
		return Rodas;
	}


	public void setRodas(String rodas) {
		Rodas = rodas;
	}


	public String getShapes() {
		return Shapes;
	}


	public void setShapes(String shapes) {
		Shapes = shapes;
	}


	public String getTruks() {
		return Truks;
	}


	public void setTruks(String truks) {
		Truks = truks;
	}


	public String getPreco() {
		return Preco;
	}


	public void setPreco(String preco) {
		Preco = preco;
	}


	public List<Clientes> getClientes() {
		return clientes;
	}


	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}

	
}
