import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Alunos: ");
        System.out.println("Você deseja cadastrar um aluno? ");
        String opcao = sc.nextLine();

        if(opcao.equalsIgnoreCase("sim")) {
            System.out.println("Quantos alunos você quer cadastrar? ");
            int quantidade = sc.nextInt();

            for(int i = 0; i<quantidade; i++) {
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(sc.next());
            System.out.println("Digite o sexo do aluno: ");
            aluno.setSexo(sc.next());
            System.out.println("Digite o idade do aluno: ");
            aluno.setIdade(sc.nextInt());
            System.out.println("Digite o matricula do aluno: ");
            aluno.setMatricula(sc.nextInt());


            System.out.println(aluno.getNome());
            System.out.println(aluno.getMatricula());
            System.out.println(aluno.getIdade());
            System.out.println(aluno.getSexo());
            }
            System.out.println("Você cadastrou " + quantidade + " aluno(s)!");

        }

        System.out.println("Fim do programa");



    }
}