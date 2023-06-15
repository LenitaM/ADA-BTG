public class Arrays {

    public static void main(String[] args) {

        int [] numeros = { 1, 23, 35, 4, 66};

        int maior = numeros[0];
        int menor = numeros [0];
        int media = 0; //somatorio / quantidade de elementos

        for(int i = 0; i < numeros.length; i++) {

            if(numeros[i] > maior) {
                maior = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }

        System.out.println("Maior é " + maior); // 66
        System.out.println("Menor é " + menor); // 1
        System.out.println("Média é " + media / numeros.length); // 25

    }
}
