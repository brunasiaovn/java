### Crie uma classe Cat com cinco inicializadores: 
- Nome, 

- Nome, peso, idade

- Nome, idade (peso padrão) 

- Peso, cor (nome desconhecido, endereço e idade, ou seja, um gato de rua) 

- Peso, cor, endereço (animal de estimação de outra pessoa)

 #### O trabalho do inicializador é tornar o objeto válido.
 #### Por exemplo, se o peso for desconhecido, você precisará especificar algum peso médio. Um gato não pode pesar nada. O mesmo se aplica à idade e cor. Mas pode ou não haver um nome (ou seja, o nome pode ser nulo). O mesmo se aplica ao endereço (pode ser nulo).

### Requisitos:

• O programa não deve ler dados do teclado.

• A classe Cat deve ter uma variável String nome.

• A classe Cat deve ter uma variável int idade.

• A classe Cat deve ter uma variável int peso.

• A classe Cat deve ter uma variável String endereço.

• A classe Cat deve ter uma variável String cor.

• A classe deve ter um método de inicialização que recebe um nome como argumento, mas inicializa todas as variáveis exceto o endereço.

• A classe deve ter um método de inicialização que receba como argumentos um nome, peso e idade, mas inicialize todas as variáveis exceto o endereço.

• A classe deve ter um método de inicialização que receba um nome e idade como argumentos, e inicialize todas as variáveis exceto o endereço.

• A classe deve ter um método de inicialização que receba peso e cor como argumentos, e inicialize todas as variáveis exceto o nome e endereço.

• A classe deve ter um método de inicialização que receba peso, cor e endereço como argumentos, mas inicialize todas as variáveis exceto o nome.