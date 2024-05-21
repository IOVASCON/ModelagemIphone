# Projeto iPhoneModelagem

Este projeto implementa um modelo do iPhone com funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. As funcionalidades foram modeladas utilizando interfaces e uma classe que implementa essas interfaces. Projeto Desafio do curso " Formação Java Developer " transmitido pela empresa educadora DIO.

## Estrutura do Projeto

- `src/`
- `ReprodutorMusical.java`: Interface que define os métodos para um reprodutor musical.
- `AparelhoTelefonico.java`: Interface que define os métodos para um aparelho telefônico.
- `NavegadorInternet.java`: Interface que define os métodos para um navegador de internet.
- `IPhone.java`: Classe que implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.

- `diagrams/`
- Contém o diagrama UML representando a estrutura do projeto.

## Funcionalidades

### Reprodutor Musical

- `tocar()`: Inicia a reprodução de música.
- `pausar()`: Pausa a reprodução de música.
- `selecionarMusica(String musica)`: Seleciona uma música específica para reproduzir.

### Aparelho Telefônico

- `ligar(String numero)`: Realiza uma ligação para o número especificado.
- `atender()`: Atende uma chamada.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet

- `exibirPagina(String url)`: Exibe a página web da URL especificada.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.

## Como Executar

1. **Compilar os Arquivos Java:**

javac -d bin src/*.java

2.**Executar a classe IPhone:**

java -cp bin IPhone

## Diagrama UML

O diagrama UML que representa a estrutura do projeto está disponível no diretório diagrams.
Autor

Desenvolvido por Izairton O de Vasconcelos
E-mail:iovascon@gmail.com
