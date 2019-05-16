package br.com.sada.SpringBootBdMySql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "BARRAS")
public class Barras implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BR_BARRAS")
	private String barras;
	
	@ManyToOne
	@JoinColumn(name = "BR_PRCODIGO", referencedColumnName = "PR_CODIGO", foreignKey = @ForeignKey(name = "BARR_PROD_FK"))
	private Produto produto;


}
