public class Funcoes {

    //FUNÇÕES = METODOS

    public static void main(String[] args) { //Main sempre começa o cod
        String nomeOriginal = "Let's Code!";
        //Sempre invocar a Função dentro da main
        saudacao(nomeOriginal); //delcarar o parametro
        //Escopo de variavel, tem que ser o mesmo da linha 8

        int resultado = soma(2, 3);
        System.out.println(resultado); // 5
    }

    //Funções podem receber parametros, sem parametros e retorna valores
    public static void saudacao(String nomeParametro) { //Função de saudação
        //Definido um parametro fica dentro do ()
        System.out.println("Hello, " + nomeParametro);
        //Outro escopo outro parametro
    }

    //Retorno de valores
    public static int soma(int a, int b) {
        return a + b; // retorna para a main que fez a chamada
    }

}
