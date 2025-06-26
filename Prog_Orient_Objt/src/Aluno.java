public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    private String sexo;

    public Aluno(String nome, int matricula, int idade, String sexo){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
