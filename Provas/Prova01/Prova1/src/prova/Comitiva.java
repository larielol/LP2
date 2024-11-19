package prova;

public class Comitiva {

	private int id;
	private String descricao;
	private int quantPessoas;
	private String telefone;
	
	public Comitiva(int id, String descricao, int quantPessoas, String telefone) {
		this.id = id;
		this.descricao = descricao;
		this.quantPessoas = quantPessoas;
		this.telefone = telefone;
	}
	
	public int getQuantPessoas() {
		return this.quantPessoas;
	}
	
	@Override
	public String toString() {
		return "ID: " +this.id+ System.lineSeparator() + "Comitiva: " +this.descricao + System.lineSeparator() +
				"Integrantes: " +this.quantPessoas+ System.lineSeparator() +"Contato: " + this.telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Comitiva other = (Comitiva) obj;
		if (id != other.id)
			return false;
		return true;
	}
}