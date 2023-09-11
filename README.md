## Desafio iPhone - Projeto de Simulação de um iPhone

Este projeto foi desenvolvido como parte do desafio da Dio de POO e modelagem UML. O objetivo do projeto é representar os papéis do iPhone de: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Resumo

O projeto é composto por três classes e três interfaces. As classes implementam as interfaces, representando os papéis do iPhone.

### Objetivos

O projeto tem como objetivo demonstrar o uso de classes, interfaces e modelagem UML.

### Diagrama UML

A seguir, temos o diagrama UML do projeto, mostrando as interfaces e a classe que implementa essas interfaces.

![Diagrama UML](Desafio_iPhone/src/screenshots/Diagrama_iPhone.drawio.png)

### Captura de Tela da Interface Gráfica

Aqui está uma captura de tela da interface gráfica do projeto:

![Página Inicial](Desafio_iPhone/src/screenshots/iPhone.png)

### Estrutura do Projeto

O projeto é dividido em vários arquivos Java, organizados em pacotes separados para uma melhor estruturação do código. Aqui está uma breve descrição de cada arquivo:

#### Pacote "iPhone"

Neste pacote, definimos as interfaces que representam as funcionalidades do iPhone.

- `AparelhoTelefonico`: Interface para funcionalidades de telefone, como ligar, atender chamadas e iniciar correio de voz.
- `NavegadorInternet`: Interface para funcionalidades de navegação na internet, como exibir páginas, adicionar abas e atualizar páginas.
- `ReprodutorMusical`: Interface para funcionalidades de reprodução de música, como tocar, pausar e selecionar músicas.

- `iPhone`: Classe que implementa as três interfaces e fornece implementações concretas para seus métodos.

#### Pacote "simulador"

Neste pacote, criamos uma interface gráfica simples para simular o uso do iPhone.

- `SimuladoriPhone`: Classe que cria uma janela de simulação com botões para executar as funcionalidades do iPhone.

#### Pacote "main"

Neste pacote, temos a classe `Main` que contém o método `main` para iniciar o aplicativo de simulação.

## Conclusão

Este projeto demonstra como usar conceitos de POO para modelar e implementar um simulador de iPhone com funcionalidades de reprodução de música, telefone e navegação na internet. Ele também inclui uma interface gráfica simples para interagir com o iPhone simulado.
