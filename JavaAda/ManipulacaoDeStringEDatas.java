import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class ManipulacaoDeStringEDatas {

    public static void main(String[] args) {

        //Olá, {nome}. Hoje é {dia da semana}, Bom dia!

        String nome = "Lenita";


        System.out.println(nome.toUpperCase()); //LENITA
        System.out.println(nome.toLowerCase()); //lenita
        System.out.println(nome.length());// 6 caracteres (cumprimento)

        String nome2 = "lenita";

        System.out.println(nome.equals(nome2)); // False - Compara duas variaveis são iguais
        System.out.println(nome.equalsIgnoreCase(nome2)); // True - Ignora as diferenças maisculo, minusculo

        //Dia da Semana

        //ISO 8601 padrão mundial (ANO - MES - DIA), java implementa atraves do LocalDate
        LocalDate hoje = LocalDate.now(); // Dia de hj

        Locale brasil = new Locale( "pt", "BR"); //cria um objeto com parametros especificando idioma e país

        System.out.println(hoje); //2023-06-15
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); // THURSDAY - Dia da semana / Quinta-feira
        //Traduz para o idioma que quiser
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil); //Quinta-feira

        //Saudação

        String saudacao;

        LocalDateTime agora = LocalDateTime.now(); //Hora atual

        if(agora.getHour() >= 0 && agora.getHour() < 12) { //pega a hora atual
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        }else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }else {
            saudacao = "Olá";
        }

        //Olá, {nome}. Hoje é {dia da semana}, Bom dia!
        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase() ); //definir os formatos e depois os valores, precisa fazer a quebra de linha (%n)
        //representação de das String %s

        //Olá, Lenita. Hoje é quinta-feira, BOM DIA!.
    }
}
