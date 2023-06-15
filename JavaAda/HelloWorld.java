//Esqueleto do JAVA:

public class HelloWorld {

    public static void main(String[] args) {
/* é um ponto de entrada para um programa Java.
 Ele é a função principal que é executada quando você inicia a execução de um programa Java.

public: é um modificador de acesso que indica que o método pode ser acessado de qualquer lugar.
static: é um modificador que indica que o método pertence à classe em si e não a uma instância específica da classe. Isso significa que você pode chamar esse método diretamente na classe sem precisar criar um objeto dela.
void: é o tipo de retorno do método main. Nesse caso, o método não retorna nenhum valor.
main: é o nome do método. Ele é padronizado e deve ser exatamente assim para que o Java reconheça como o ponto de entrada do programa.
String[] args: é o parâmetro do método main. Ele permite que você passe argumentos de linha de comando para o seu programa quando ele é executado.
O args é um array de strings onde você pode acessar os argumentos passados.

 */
        System.out.println("Hello World!");
        /*é uma instrução em Java que imprime uma linha de texto no console. Vamos entender o significado de cada parte dessa instrução:

System: é uma classe pré-definida em Java que fornece acesso a recursos do sistema, como entrada/saída, propriedades do sistema, entre outros.
out: é um objeto estático da classe System que representa a saída padrão do programa.
println: é um método do objeto out que significa "print line" (imprimir linha). Ele é usado para exibir texto no console e pular para a próxima linha após a impressão.
A instrução System.out.println é frequentemente usada para exibir mensagens ou resultados durante a execução de um programa Java. Ela aceita vários tipos de argumentos, como strings, números, variáveis ​​e expressões. Ao ser executada, a mensagem é exibida no console.*/
    }
}
