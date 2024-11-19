package prova;

public class LocalVisitacao {
	
	private static final int TAMANHO_COMITIVAS = 100;

	private String id;
	private String nome;
	private String ramal;
	private int[] comitivas;
	private int contadorComitivas;
	private int quantVisitas;
	
	public LocalVisitacao(String id, String nome, String ramal) {
		this.id = id;
		this.nome = nome;
		this.ramal = ramal;
		this.comitivas = new int[TAMANHO_COMITIVAS];
	}
	
	
	public String getId() {
		return this.id;
	}
	
	public void registraVisita(int idComitiva) {
		comitivas[contadorComitivas++] = idComitiva; 
	}
	
	public int[] listaVisitas() {
		return this.comitivas;
	}
	
	public void quantVisitas(int quantVisitas) {
		this.quantVisitas += quantVisitas;
	}
	
	public int getQuantVisitas() {
		return this.quantVisitas;
	}
	@Override
	public String toString() {
		return this.id + " - " + this.nome + " - " + this.ramal;
	}

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
		LocalVisitacao other = (LocalVisitacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}