package documin;

import java.util.HashMap;
import java.util.Objects;

public class Elemento {
	
	private int prioridade;
	private String valor;
	private HashMap<String, String> prioridades;
	
	public Elemento(String valor, int prioridade) {
		this.valor = valor;
		this.prioridade = prioridade;
	}
	
	public String geraRepresentacaoCompleta() {
		return "";
	}
	
	public String geraRepresentacaoResumida() {
		return "";
	}
	
	public int getPrioridade() {
		return -1;
	}
	
	public void setPrioridade(int novaPrioridade) {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(prioridade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elemento other = (Elemento) obj;
		return prioridade == other.prioridade;
	}
	

}
