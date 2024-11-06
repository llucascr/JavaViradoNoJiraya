package Classes;

public class AulaClasses {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Lucas";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante2.nome = "Iris";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        System.out.println(estudante.nome); // Lucas
        System.out.println(estudante.idade); // 19
        System.out.println(estudante.sexo); // M
        System.out.println(estudante); // endereço de memoria

    }
}
