### Use o teclado para inserir números e calcular a soma deles até que o usuário digite a palavra "sum".
### Exiba a soma resultante na tela.
### Dica: para ler do teclado até a string 'exit' ser inserida, faça assim:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

while (true)

{

	String s = buffer.readLine();

	if (s.equals("exit"))

		break;

}
##

### Requisitos:

• O programa deve ler dados do teclado.

• O programa deve parar de ler dados do teclado após o usuário digitar a palavra "sum" em letras minúsculas e pressionar Enter.

• O programa deve funcionar corretamente se o usuário digitar um número e a palavra "sum".

• O programa deve funcionar corretamente se o usuário digitar dois números e a palavra "sum".

• O programa deve funcionar corretamente se o usuário digitar mais de dois números e a palavra "sum".

• O programa deve exibir texto na tela.