package com.w3g.mscliente.entities.enums;


public enum StatusEmprestimo {
	
	PENDENTE(1, "Pendente"),
	APROVADO(2, "Aprovado"),
	NEGADO(3, "Negado");
	
	private int cod;
	private String descricao;
	
	private StatusEmprestimo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public static StatusEmprestimo toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (StatusEmprestimo x : StatusEmprestimo.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
