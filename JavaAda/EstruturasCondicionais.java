public class EstruturasCondicionais {

    public static void main(String[] args) {

        int nota = 70;
        String graduacao;

        // nota >= 70 - aprovado

        //OPERADORES IF - ELSE

        // A 80 B 70 C 60 D 0
        if(nota >= 80) { //apenas uma linha as {} são opcionais
            System.out.println("Graduação A");
        } else if(nota < 80 && nota >= 70) {
            System.out.println("Graduação é B"); // console aparece esse
        } else if (nota < 80 && nota >= 60) {
            System.out.println("Graduação é C");
        } else if (nota < 80 && nota >= 0) {
            System.out.println("Graduação é D");
        } else {
            System.out.println("A nota é inválida.");
        }



        if(nota >= 80) { //apenas uma linha as {} são opcionais
            graduacao =  "A";
        } else if(nota < 80 && nota >= 70) {
            graduacao =  "B";
        } else if (nota < 80 && nota >= 60) {
            graduacao =  "C";
        } else if (nota < 80 && nota >= 0) {
            graduacao =  "D";
        } else {
            graduacao =  null; //inválido
        }
        switch (graduacao) { //outra forma de escrever a sentença acima
            case "A":
            case "B":
                System.out.println("Aluno Aprovado.");
                break; // precisa de uma situção de parada de compilação
            case "C":
            case "D":
                System.out.println("Aluno não aprovado.");
                break;
            default:
                System.out.println("A graduação é inválida.");
        }



    }
}
