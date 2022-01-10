package com.w3g.mscliente.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String rg;
	private String renda;
	
//	@OneToMany(mappedBy="cliente")
//	private List<Endereco> enderecos = new ArrayList<>();
	
//	@ElementCollection
//	@CollectionTable(name="TELEFONE")
//	private Set<String> telefones = new HashSet<>();
	
//	@JsonIgnore
//	@OneToMany(mappedBy="cliente")
//	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	public Cliente() {
	}

	




	public Cliente(Long id, String nome, String cpf, String rg, String renda) {
	super();
	this.id = id;
	this.nome = nome;
	this.cpf = cpf;
	this.rg = rg;
	this.renda = renda;
}


	public String getRenda() {
		return renda;
	}


	public void setRenda(String renda) {
		this.renda = renda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	


	/*
	 * public List<Endereco> getEnderecos() { return enderecos; }
	 * 
	 * public void setEnderecos(List<Endereco> enderecos) { this.enderecos =
	 * enderecos; }
	 * 
	 * public Set<String> getTelefones() { return telefones; }
	 * 
	 * public void setTelefones(Set<String> telefones) { this.telefones = telefones;
	 * }
	 */
	/*
	 * public List<Emprestimo> getEmprestimos() { return emprestimos; }
	 * 
	 * public void setPedidos(List<Emprestimo> emprestimos) { this.emprestimos =
	 * emprestimos; }
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
