package com.filipefk.checklist.itens;

import java.io.Serializable;

public abstract class ItemCheckList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String titulo = null;
    private String descricao = null;
    private String ajuda = null;
    private String observacao = null;
    private boolean observacaoObrigatoria = false;
	
    public ItemCheckList() {}
    
    public ItemCheckList(String titulo, String descricao, String ajuda, String observacao,
    		boolean observacaoObrigatoria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.ajuda = ajuda;
		this.observacao = observacao;
		this.observacaoObrigatoria = observacaoObrigatoria;
	}
    
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String nome) {
		this.titulo = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAjuda() {
		return ajuda;
	}

	public void setAjuda(String ajuda) {
		this.ajuda = ajuda;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean isObservacaoObrigatoria() {
		return observacaoObrigatoria;
	}

	public void setObservacaoObrigatoria(boolean observacaoObrigatoria) {
		this.observacaoObrigatoria = observacaoObrigatoria;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ajuda == null) ? 0 : ajuda.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		ItemCheckList other = (ItemCheckList) obj;
		if (ajuda == null) {
			if (other.ajuda != null)
				return false;
		} else if (!ajuda.equals(other.ajuda))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "ItemCheckList [nome=" + titulo + ", descricao=" + descricao + ", ajuda=" + ajuda + ", observacao="
				+ observacao + ", observacaoObrigatoria=" + observacaoObrigatoria + "]";
	}

	public void limpar() {
		titulo = null;
		descricao = null;
		ajuda = null;
		observacao = null;
	}

}
