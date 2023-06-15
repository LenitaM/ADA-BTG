import java.lang.reflect.Array;

public class Vetores {

    public static void main(String[] args) {

        //Array começa a contar do 0, 0 até n - 1
        int[] numeros = new int[5]; //tamanho imutavél, n pode adc sexto elemento

        //Manipulação do Array

        //[0] [1] [2] [3] [4] [5] = referenciar através de indeces
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        //Para saber  os elementos do array vai usar um loop
        for(int i = 0; i < numeros.length; i++) { //menor que tamanho do array

            System.out.println(numeros[i]); // 1 2 3 4 5
        }

        System.out.println(numeros);
        /*[I@e9e54c2
        *[ = Array
        * I = Array de Inteiros
        * @e9e54c2 = Endereço que está armazenado o array
        * */


        String[] letras = new String[5];

        letras [0] = "A";
        letras [1] = "B";
        letras [2] = "C";
        letras [3] = "D";
        letras [4] = "E";

        for(int j = 0; j < letras.length; j++) {

            System.out.println(letras[j]); // A B C D E

            //DICA: Outra forma de sintaxe, como adc todos os valores no array

            String letras2 [] = {"a", "b", "c", "d", "e"}; // já vai saber o tipo e a quantidades de indexes

            for(int k = 0; k < letras2.length; k++) {

              //  System.out.println(Array.toString(letras2));// a b c d e

            }
        }
    }

}
