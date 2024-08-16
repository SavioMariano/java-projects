# Projeto: Padrão de Projeto Strategy

Este projeto implementa o padrão de projeto **Strategy** em Java, que é um dos padrões de design de comportamento do **Gang of Four**.

## Estrutura do Projeto

- **Comportamento.java**: Interface que define o método que todas as estratégias de comportamento devem implementar.
- **ComportamentoAgressivo.java**: Implementação concreta da interface `Comportamento` que define um comportamento agressivo.
- **ComportamentoDefensivo.java**: Implementação concreta da interface `Comportamento` que define um comportamento defensivo.
- **ComportamentoNormal.java**: Implementação concreta da interface `Comportamento` que define um comportamento neutro ou normal.
- **Robo.java**: Classe que representa um robô. O robô tem um atributo do tipo `Comportamento` e pode alterar seu comportamento em tempo de execução, delegando a execução de suas ações à implementação concreta do comportamento atual.