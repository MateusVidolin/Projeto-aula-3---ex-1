public class AcampamentoTeste {
    public static void main(String[] args) {

        Acampamento membroClasseAcampamento = new Acampamento();
        membroClasseAcampamento.setNome("Mateus");
        membroClasseAcampamento.setEquipe('A');
        membroClasseAcampamento.setIdade(15);

        membroClasseAcampamento.imprimir();
        membroClasseAcampamento.separarGrupo();
        membroClasseAcampamento.imprimir();
    }
}