package Exercicio3;

public class Nota {
	private int numAluno;
	private double nota;
	
	public Nota(int numAluno, double nota) {
		this.numAluno=numAluno;
		this.nota=nota;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getNumAluno() {
		return numAluno;
	}

	@Override
	public String toString() {
		return "Nota [numAluno=" + numAluno + ", nota=" + nota + "]";
	}
	
	
}
