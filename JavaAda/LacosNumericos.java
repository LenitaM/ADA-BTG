public class LacosNumericos {

    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8 9 10

        //Para uma variável que inicia em 1 e vai até 10, mudando um por um, faça:
        for(int i = 1; i <= 10; i++) {
            System.out.print(i); //deixa tudo em uma linha
        }

//Calculadora
        for(int i = 1; i <= 10; i++) { //outros for alinhado, int i,j,k,l n pode usar muito
            for(int j = 1; j <= 10; j++) {
                //o laço j só pode recomeçar quando passar por todo o laço i

                System.out.println( j + " x " + i + " = " +  j * i); // 1 x 1 = 1
            }
        }
    }
}
