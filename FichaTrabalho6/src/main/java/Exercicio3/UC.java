package Exercicio3;

import java.util.ArrayList;

public class UC {
	
	private String nomeUC;
	public ArrayList<Nota>notas=new ArrayList<>();
	private int totalAlunos;
	
	public UC(String nomeUC, int totalAlunos) {
		this.nomeUC=nomeUC;
		
		totalAlunos=10;
		
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(Nota nota) {
		notas.add(nota);
	}

	public String getNomeUC() {
		return nomeUC;
	}

	public int getTotalAlunos() {
		return totalAlunos;
	}

	@Override
	public String toString() {
		return "UC [nomeUC=" + nomeUC + ", totalAlunos=" + totalAlunos + "]";
	}
	
	public double pesquisaAluno(int numAluno) {
		for(Nota n:notas) 
			if(n.getNumAluno()==numAluno) {
				return n.getNota();
			}
		return -1;		
	}
	
	
	public boolean aprovado(int numAluno) {
        for(Nota n : notas) {
            if(n.getNumAluno()==numAluno && n.getNota()>=9.5) {
                return true;
            }
        }
        return false;
    }
	
	
    public void insereNotaUC(int numAluno, double nota) {
        Nota n = new Nota(numAluno,nota);
        notas.add(n);
    }
    
    public double media() {
    	double somaNotas=0;
    	int contaAlunos=0;
    	for(Nota n:notas) {
    		somaNotas+=n.getNota();
    		contaAlunos++;
    	}
    	return somaNotas/contaAlunos;
    }
}
