package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.avaliacao.enums.TipoEnum;
import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="SERVICO")
public class Cadastro extends BaseORM {
	
	@GeneratedValue
	@Id
	@Column(name="ID_SERVICO")
	private Long id;
	
	@Column(name="TX_DESCRICAO")
	private String descricao;
	
	@Column(name="TX_TIPO")
	@Enumerated(EnumType.STRING)
	private TipoEnum tipo;
	
	@Column(name="TX_UNIDADE")
	private String unidade;
	
	@Column(name="TX_PRECO")
	private double preco;

}
