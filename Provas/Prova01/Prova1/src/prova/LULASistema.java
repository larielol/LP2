package prova;


public class LULASistema {
	
	
	private static final int TAMANHO_LOCAIS = 100;
	
	
	private static final int TAMANHO_COMITIVAS = 100;
	
	
	private LocalVisitacao[] locaisVisitacao;
	
	
	private Comitiva[] comitivas;
	
	
	private int contadorLocais;
	
	private int contadorComitivas;
	
	private int contadorVisitas;

	
	public LULASistema() {
		this.locaisVisitacao = new LocalVisitacao[TAMANHO_LOCAIS];
		this.comitivas = new Comitiva[TAMANHO_COMITIVAS];
	}
	
	
	public boolean cadastraLocal(String idTextual, String nome, String ramal) {
		LocalVisitacao local = new LocalVisitacao(idTextual, nome, ramal); 
		for(LocalVisitacao l: locaisVisitacao) {
			if(local.equals(l)) {
				return false;
			}
		}
		locaisVisitacao[contadorLocais++] = local; 
		return true;
	}
	
	
	public boolean cadastraComitiva(int id, String descricao, int  quantPessoas, String telefone) {
		if(id > 100 || id < 0) {
			throw new IndexOutOfBoundsException();
		}
		Comitiva comitiva = new Comitiva(id, descricao, quantPessoas, telefone);
		for(Comitiva c: comitivas) {
			if(comitiva.equals(c)) {
				return false;
			}
		}
		comitivas[id] = comitiva;
		contadorComitivas++;
		return true;
	}
	
	
	public String exibeComitiva(int id) {
		if(comitivas[id] == null) {
			return "ID invalida";
		}
		return comitivas[id].toString();
	}
	
	
	public String exibeLocal(String id) {
		int index = 0;
		for(int i = 0; i <  locaisVisitacao.length; i++) {
			if(locaisVisitacao[i].getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(locaisVisitacao[index] == null) {
			return "ID invalida";
		}
		return locaisVisitacao[index].toString();
	}
	
	public String[] listaLocais() {
		String[] copiaLocais = new String[contadorLocais];
		for(int i = 0; i < locaisVisitacao.length; i++) {
			if(locaisVisitacao[i] != null) {
				copiaLocais[i] = locaisVisitacao[i].toString();
			}
		}
		return copiaLocais;
	}
	
	public String[] listaComitivas() {
		String[] copiaComitivas = new String[comitivas.length];
		for(int i = 0; i < comitivas.length; i++) {
			if(comitivas[i] != null) {
				copiaComitivas[i] = comitivas[i].toString();
			}
		}
		return copiaComitivas;
	}
	
	public void registraVisita(String idLocal, int idComitiva) {
		int index = 0;
		for(int i = 0; i <  locaisVisitacao.length; i++) {
			if(locaisVisitacao[i].getId().equals(idLocal)) {
				index = i;
				break;
			}
		}
		locaisVisitacao[index].registraVisita(idComitiva);
		locaisVisitacao[index].quantVisitas(comitivas[idComitiva].getQuantPessoas());
	}
	
	public String[] listaVisitas(String idLocal) {
		int index = 0;
		for(int i = 0; i <  locaisVisitacao.length; i++) {
			if(locaisVisitacao[i].getId().equals(idLocal)) {
				index = i;
				break;
			}
		}
		int[] visitas = locaisVisitacao[index].listaVisitas();
		String[] comitivasVisitas = new String[visitas.length];
		for (int i = 0; i < visitas.length; i++) {
			if(visitas[i] != 0) {
				int posicao = visitas[i];
				comitivasVisitas[i] = comitivas[posicao].toString();
			}
		}
		return comitivasVisitas;
	}
	
	public int quantVisitas(String idLocal) {
		int index = 0;
		for(int i = 0; i <  locaisVisitacao.length; i++) {
			if(locaisVisitacao[i].getId().equals(idLocal)) {
				index = i;
				break;
			}
		}
		return locaisVisitacao[index].getQuantVisitas();
	}
}