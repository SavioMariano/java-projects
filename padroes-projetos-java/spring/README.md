# PadroesProjetoSpring

Este projeto exemplifica a aplicação de padrões de projeto em uma aplicação Spring Boot. O projeto foi criado com o objetivo de demonstrar e aplicar conceitos de design e práticas recomendadas no desenvolvimento com Spring Framework.

## Principais Características

- **Versão do Spring Boot**: O projeto está utilizando uma versão desatualizada do Spring Boot para garantir compatibilidade com outras partes do sistema e com as versões específicas de dependências utilizadas.

## Estrutura do Projeto

- **Camadas de Arquitetura**: O projeto segue uma arquitetura em camadas, incluindo camadas de controle, serviço e repositório.
- **Integração com APIs Externas**: Utiliza Feign Client para integração com a API ViaCEP, demonstrando a utilização de clientes HTTP declarativos.

## Configurações Importantes

- **Segurança**: Configurações básicas de segurança são implementadas, incluindo a configuração de segurança HTTP para desativar opções de quadro e gerenciar acessos.
- **Banco de Dados**: Utiliza o H2 Database para testes e desenvolvimento, com configuração para o console H2 acessível na aplicação.

## Dependências

- **Spring Boot 3.x** (versão desatualizada para compatibilidade).
- **Spring Cloud OpenFeign** para comunicação com serviços externos.
- **H2 Database** para armazenamento em memória e testes.
