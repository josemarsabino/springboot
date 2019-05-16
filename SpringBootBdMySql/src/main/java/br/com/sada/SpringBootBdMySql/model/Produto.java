package br.com.sada.SpringBootBdMySql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // <- gera os getter
@Setter // <- gera os setter
@AllArgsConstructor // <- gera o construtor com todos os atributos
@NoArgsConstructor // <- gera o construtor padrão
@ToString // <- gera o toString


@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PR_CODIGO")
	private Long idProduto;

	@Column(name = "PR_DESCRICAO")
	private String nomeProduto;

	@Column(name = "PR_UNMEDIDA")
	private String unidadeMedida;

	@Column(name = "PR_VALORUNITARIO")
	private Double precoCusto;

	@Column(name = "PR_VALORVENDA")
	private Double precoVenda;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProduto == null) ? 0 : idProduto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (idProduto == null) {
			if (other.idProduto != null)
				return false;
		} else if (!idProduto.equals(other.idProduto))
			return false;
		return true;
	}

	
	

}
