/*VARIÁVEIS EM JAVA
*
* Java é tipada estaticamente, o que significa que todas as variáveis devem primeiro ser declaradas antes de serem usadas.
* Isso envolve informar o tipo e o nome da variável. Fortemente Tipada.
*
* Variavéis são locais de armazenamento de dados no console.
*
* DADOS PRIMITIVOS EM JAVA, 8 tipos oficiais:
*
* NUMÉRICOS = A diferença de cada um deles é quantidade de dados pode armazenar neles:
*
* BYTE - números muito curtos
* SHORT - maior que byte, mas ainda curto
* INT - números inteiros (o mais comum)
* LONG - maior capacidade de int
* FLOAT - numeros reais, decimais
* DOUBLE - numeros reais, decimais (mais usado)
 * BOOLEAN - true e false
* CHAR - único caractere.
*
* VARIAVÉIS DE CARACTERES:
*
* STRING = Usado para textos.
*
* CHAR = Usado para 1 unico simbolo caractere
*
* */

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {

        //STRING

        String nome = "Lenita"; //declaração de variável e atribuída

        String sobrenome; //Declarada e não inicializada
        sobrenome = "Maria"; //Atribuição
        sobrenome = "Maciel"; //Substituição da 1ª atribuição.

        System.out.println("Olá, " + nome); // + concatenação.

        System.out.println("Olá, " + nome + " " + sobrenome);

        //INT

        int a;
        a = 3;

        int b = 2;

        //OPERADORES ARITMETICOS:

        int soma = a + b; //soma

        int subtracao = a - b; //subtração

        int multiplicacao = a * b; //multiplicação

        float divisao = (float) a / b; //divisão / (variavel) chamado de CAST, alterações de variáveis.

        System.out.println(soma); // 5
        System.out.println(subtracao); // 1
        System.out.println(multiplicacao);// 6
        System.out.println((float) divisao); // 1 / Era para ser usado apenas para números inteiros / assim apra apresentar os decimais

        System.out.println("Digite seu sobrenome:");
        Scanner entrada = new Scanner(System.in); //procurar documentos dentro do console
        String nomeCompleto = entrada.nextLine();







    }
}
