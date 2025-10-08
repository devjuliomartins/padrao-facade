# Padrão Facade

O **padrão Facade** é um padrão de projeto **estrutural** que fornece uma **interface unificada e simples** para um conjunto de subsistemas complexos.  
Ele é útil quando queremos **reduzir a complexidade** e **facilitar o acesso** a múltiplas classes que realizam operações relacionadas.  

## Estrutura do projeto
- **Cliente** → Classe principal que solicita uma operação de forma simples.  
- **Facade** → Classe que centraliza as chamadas para os diversos subsistemas e expõe uma única interface para o cliente.  
- **Estoque**, **Entrega**, **Pagamento**, etc. → Subsistemas que possuem suas próprias regras e operações independentes.  

## Funcionamento
- O cliente interage apenas com a classe `Facade`, sem conhecer os detalhes de cada subsistema.  
- A `Facade` realiza internamente todas as chamadas necessárias aos subsistemas (`Estoque`, `Entrega`, `Pagamento`) e retorna um resultado consolidado.  
- Isso torna o código do cliente mais limpo e de fácil manutenção, escondendo a complexidade do sistema.  

## Quando usar Facade
- Quando há **muitos subsistemas complexos** e você deseja **simplificar o acesso** a eles.  
- Quando quer **reduzir o acoplamento** entre o cliente e as classes do sistema.  
- Quando deseja criar uma **interface única e intuitiva** para operações que envolvem vários módulos.  

## Como usar este projeto
Clone o repositório:
```bash
git clone https://github.com/devjuliomartins/padrao-facade.git
