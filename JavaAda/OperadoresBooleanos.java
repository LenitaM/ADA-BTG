public class OperadoresBooleanos {

    //OPERADORES BOOLEANOS E TABELA VERDADE

    public static void main(String[] args) {

        boolean resultado = false;

        System.out.println(resultado); // cod rapido sout


        //OPERADORES LÓGICOS

        /*Operador && (AND) = todas as condições precisa ser verdadeira
         *
         * true && true = true
         * true && false = false
         * false && true = false
         * false && false = false
         * */

        boolean fimDeSemana = true;

        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol; //AND
        System.out.println(vamosAPraia); // true

        /* OPERADOR || (OU) = Apenas uma das sentenças precisa ser verdade para compilar
        *
        * true || true = true
        * true || false = true
        * false || true = true
        * false || false = false
        *
        * */

        //OPERADOR TERNÁRIO (?) = Usado para dois comportamentos possiveis, da uma condição

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        // 3 condições: 1º fimDeSemana = termo avaliado ? 2º "É fim de semana" = termo caso seja true : 3º "Não é fimd de semana= termo caso for sale
        System.out.println(mensagem); //É fim de semana

    }
}
