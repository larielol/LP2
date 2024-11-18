package prova;

import java.util.HashMap;
import java.util.Objects;

public class Desafio {
    private String titulo;
    private int execucoes;
    private HashMap<Integer, Acao> acoes;
    
    public Desafio(String titulo) {
        this.titulo = titulo;
        this.execucoes = 0;
        this.acoes = new HashMap<Integer, Acao>();
    }
    
    
    public boolean adicionaAcao(int id, Acao atividade) {
        acoes.put(id, atividade);
        return true;
    }
    
    public void adicionaExecucao() {
        execucoes++;
    }
    
    public int getExecucao() {
        return execucoes;
    }
    
    @Override
    public String toString() {
        return "Título: " + this.titulo + System.lineSeparator() + this.execucoes + "execuções";
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Desafio other = (Desafio) obj;
        return Objects.equals(titulo, other.titulo);
    }

    public String getTitulo() {
        return this.titulo;
    }
    
}