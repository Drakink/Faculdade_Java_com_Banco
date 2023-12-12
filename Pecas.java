package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pecas {

	@Id
	@Column(name= "id_skate")
	String Id;
	@Column (name= "rodas_skate")
	String Rodas;
	@Column (name= "shapes_skate")
	String Shapes;
	@Column (name= "truck_skate")
	String Truks;
	@Column (name= "modelo_skate")
	String Modelos;
	@Column (name="preco_skate")
	Double Preco;
	
	public Pecas(String id, String rodas, String shapes, String truks, String modelos, Double preco) {
		super();
		Id = id;
		Rodas = rodas;
		Shapes = shapes;
		Truks = truks;
		Modelos = modelos;
		Preco = preco;
		
	}

	public String getIdentificacao() {
		return Id;
	}

	public void setIdentificacao(String identificacao) {
		Id = identificacao;
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

	public String getModelos() {
		return Modelos;
	}

	public void setModelos(String modelos) {
		Modelos = modelos;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}
	
	
}
