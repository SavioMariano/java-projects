# Projeto: Padrão de Projeto Singleton

Este projeto implementa o padrão de projeto **Singleton** em Java, que é um dos padrões de design de criação do *Gang of Four*. O padrão Singleton assegura que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.

## Estrutura do Projeto

- **SingletonEager.java**: Implementação do padrão Singleton utilizando a abordagem de instanciação "eager" (ansiosa), onde a instância é criada no momento em que a classe é carregada.
- **SingletonLazy.java**: Implementação do padrão Singleton utilizando a abordagem de instanciação "lazy" (preguiçosa), onde a instância é criada somente quando necessária, ou seja, na primeira chamada ao método de acesso.
- **SingletonLazyHolder.java**: Implementação do padrão Singleton utilizando a técnica de "Holder", que aproveita a carga tardia de classes internas para garantir a instanciação única e thread-safe.

## Como Funciona

O padrão Singleton é útil em situações onde é necessário garantir que uma classe tenha apenas uma única instância, como em casos de gerenciamento de recursos (ex.: conexões de banco de dados, configurações globais, etc.).

### Implementações:

1. **Eager Initialization**:
   - A instância é criada de forma antecipada, durante o carregamento da classe. Essa abordagem é simples, mas pode resultar em desperdício de recursos se a instância nunca for utilizada.

2. **Lazy Initialization**:
   - A instância é criada somente quando necessária, na primeira chamada ao método `getInstance()`. Esta abordagem economiza recursos, mas precisa ser cuidadosamente implementada para ser thread-safe.

3. **Lazy Initialization com Holder**:
   - Utiliza uma classe estática interna para criar a instância do Singleton. Esta abordagem é thread-safe e combina as vantagens das inicializações lazy e eager.

