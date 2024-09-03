# Calculadora com Swing
## Descrição
* Este é um projeto desenvolvido durante um curso na plataforma Udemy. O objetivo principal é o aprendizado de conceitos de Programação Orientada a Objetos (POO) e padrões de projeto em Java, utilizando a biblioteca Swing para a criação da interface gráfica.

## Funcionalidades
A calculadora suporta as seguintes operações:
* Adição
* Subtração
* Multiplicação
* Divisão
* Negação de número

## Requisitos
* Java 17 ou superior
* Swing

## Estrutura do Projeto
O projeto está estruturado da seguinte forma:
```scss
br/com/natzuj/calc/
│
├── modelo/
│   ├── Memoria.java
│   └── MemoriaObserver.java
│
└── visao/
    ├── Botao.java
    ├── Calculadora.java (Classe principal)
    ├── Display.java
    └── Teclado.java
```
* Botao.java: Define os estilos dos botões.
* Teclado.java: Define a disposição dos botões na tela.
* Display.java: Gerencia o visor da calculadora.
* Memoria.java: Contém a lógica de funcionamento da calculadora.
* MemoriaObserver.java: Interface para observar as mudanças na memória da calculadora.

## Como Rodar o Projeto
1.  **Clone o repositório:**
```bash
git clone https://github.com/Natzujj/calculadora-swing.git
```
2. **Compile o projeto:** Navegue até o diretório do projeto e compile os arquivos Java. Supondo que você está na raiz do repositório:
```bash
javac br/com/natzuj/calc/**/*.java
```
3. **Execute o projeto:**
```bash
java br.com.natzuj.calc.visao.Calculadora
```

## Screenshot
!["Screenshot Calculadora com swing"](/resources/Screenshot_1.png)

## Licença
Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE para obter mais informações.