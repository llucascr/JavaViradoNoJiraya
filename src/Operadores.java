public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        double resultado = num1 + num2;
        //double resultado = num1 / (double) num2;
        System.out.println(resultado);

        // CUIDADO
        // operador + depois de 'valor' vira concatenação
        System.out.println(num2+num1 + "Valor: " + num2+num1); // 30 Valor: 2010

        // % -> resto/modulo
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorVinte = 10 > 20;
        System.out.println("10 > 20: " + isDezMaiorVinte);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        
        if (idade > 30 && salario > 4612) {
            System.out.println("Dentro da lei Maior que 30");
        } else if (idade < 30 && salario > 3381) {
            System.out.println("Dentro da lei Menor que 30");
        }else {
            System.out.println("Fora da lei");
        }


    }
}
