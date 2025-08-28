package model;

public class Aluno {

	private String Nome ;
    int Idade;
    private String Datadenacimento;
    private String Cpf;
    private String Nomedospais;
    private String DataMatricula;
    int Matricula;
    private double Nota1;
    private double Nota2;
   ;private double Nota3;
    private double Nota4;
    
    public double getNota1() {
		return Nota1;
	}

	public void setNota1(double nota1) {
		this.Nota1 = nota1;
	}

	public double getNota2() {
		return Nota2;
	}

	public void setNota2(double nota2) {
		this.Nota2 = nota2;
	}

	public double getNota3() {
		return Nota3;
	}

	public void setNota3(double nota3) {
		this.Nota3 = nota3;
	}

	public double getNota4() {
		return Nota4;
	}

	public void setNota4(double nota4) {
		this.Nota4 = nota4;
	}

	public Aluno() {
    	
    }
    
    public Aluno(String nome) {
    	this.Nome = nome;
    }
    public Aluno(String nome, int idade) {
    	this.Nome = nome;
    	this.Idade = idade;
    }
    public void setNome(String nome) {
    	this.Nome = nome;
    }
    
    public String getNome() {
    	return Nome;
    }

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		this.Idade = idade;
	}

	public String getDatadenacimento() {
		return Datadenacimento;
	}

	public void setDatadenacimento(String datadenacimento) {
		this.Datadenacimento = datadenacimento;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}

	public String getNomedospais() {
		return Nomedospais;
	}

	public void setNomedospais(String nomedospais) {
		this.Nomedospais = nomedospais;
	}

	public String getDataMatricula() {
		return DataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.DataMatricula = dataMatricula;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		this.Matricula = matricula;
	}
    
	public double calcularMediaAluno() {
		return (nota1 + nota2 + nota3 + nota4) /4;
	}
	
	
    
}
