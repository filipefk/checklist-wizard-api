package com.filipefk.checklist.itens;

public class ItemTexto extends ItemCheckList {
	private static final long serialVersionUID = 1L;
	
	private String texto = "";
    private String textoPadrao = "";
    private boolean itemIdentificador = false;
    private boolean permitirSalvarValor = false;
    private String valorSalvo = "";
	
    public ItemTexto() {}
    
    public ItemTexto(String nome, String descricao, String ajuda, String observacao, Boolean observacaoObrigatoria,
			String texto, String textoPadrao, boolean itemIdentificador, boolean permitirSalvarValor,
			String valorSalvo) {
		super(nome, descricao, ajuda, observacao, observacaoObrigatoria);
		this.texto = texto;
		this.textoPadrao = textoPadrao;
		this.itemIdentificador = itemIdentificador;
		this.permitirSalvarValor = permitirSalvarValor;
		this.valorSalvo = valorSalvo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTextoPadrao() {
		return textoPadrao;
	}

	public void setTextoPadrao(String textoPadrao) {
		this.textoPadrao = textoPadrao;
	}

	public boolean isItemIdentificador() {
		return itemIdentificador;
	}

	public void setItemIdentificador(boolean itemIdentificador) {
		this.itemIdentificador = itemIdentificador;
	}

	public boolean isPermitirSalvarValor() {
		return permitirSalvarValor;
	}

	public void setPermitirSalvarValor(boolean permitirSalvarValorPadrao) {
		this.permitirSalvarValor = permitirSalvarValorPadrao;
	}

	public String getValorSalvo() {
		return valorSalvo;
	}

	public void setValorSalvo(String valorSalvo) {
		this.valorSalvo = valorSalvo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (itemIdentificador ? 1231 : 1237);
		result = prime * result + (permitirSalvarValor ? 1231 : 1237);
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((textoPadrao == null) ? 0 : textoPadrao.hashCode());
		result = prime * result + ((valorSalvo == null) ? 0 : valorSalvo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemTexto other = (ItemTexto) obj;
		if (itemIdentificador != other.itemIdentificador)
			return false;
		if (permitirSalvarValor != other.permitirSalvarValor)
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (textoPadrao == null) {
			if (other.textoPadrao != null)
				return false;
		} else if (!textoPadrao.equals(other.textoPadrao))
			return false;
		if (valorSalvo == null) {
			if (other.valorSalvo != null)
				return false;
		} else if (!valorSalvo.equals(other.valorSalvo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " ItemTexto [texto=" + texto + ", textoPadrao=" + textoPadrao + ", itemIdentificador=" + itemIdentificador
				+ ", permitirSalvarValorPadrao=" + permitirSalvarValor + ", valorPadrao=" + valorSalvo + "]";
	}
    
    
	
}
