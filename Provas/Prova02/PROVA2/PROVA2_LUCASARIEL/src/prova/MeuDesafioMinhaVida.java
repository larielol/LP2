package prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MeuDesafioMinhaVida {
	
    private ArrayList<Desafio> desafios;
    private HashMap<Integer, Acao> acoesMapa;
    
    public MeuDesafioMinhaVida() {
    	this.desafios = new ArrayList<Desafio>();
    	this.acoesMapa = new HashMap<Integer, Acao>();
    }
    
    public int adicionaDesafio(String titulo) {
        Desafio desafio = new Desafio(titulo);
        if (desafios.contains(desafio)) {
            return -1;
        } else {
            desafios.add(desafio);
            
        }
        return desafios.size();
    }
    
    public String exibeDesafio(int posicaoDoDesafio) {
        int posicaoReal = posicaoDoDesafio - 1;
        return desafios.get(posicaoReal).toString();
    }
    
    public void adicionaAcao(int posicaoDoDesafio, String data, int id) {
        Desafio desafio = desafios.get(posicaoDoDesafio);
        Acao atividade = new Acao(desafio, data, id);
        acoesMapa.put(id, atividade);
        desafio.adicionaAcao(id, atividade);
    }
    
    public void progressoDaAcao(int id) {
        acoesMapa.get(id).atualizarOProgresso(10);
    }
    
    public void progressoDaAcao(int id, int valorDoProgresso) {
        acoesMapa.get(id).atualizarOProgresso(valorDoProgresso);    
    }
    
    public String listarPorOrdemDoProgresso() {
        ArrayList<Acao> mapaEmLista = new ArrayList<Acao>();
        for (Acao atividade : this.acoesMapa.values()) {
            mapaEmLista.add(atividade);
        }
        Collections.sort(mapaEmLista);
        String aux = "";
        for (int i = 0; i < mapaEmLista.size(); i++) {
            if (aux.equals("")) {
                aux += mapaEmLista.get(i).toString();
            } else {
                aux += "/n" + mapaEmLista.get(i).toString();
            }
        }
        return aux;
        
    }

}
