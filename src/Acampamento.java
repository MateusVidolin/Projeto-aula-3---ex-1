public class Acampamento {

    private String nome;
    private  char equipe;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }
    public void separarGrupo(){
        if((idade>=6) && (idade<=10))
            equipe = 'a';
        else if (idade<=20)
        {
            equipe = 'b';
        }
        else equipe = 'c';
    }
}
