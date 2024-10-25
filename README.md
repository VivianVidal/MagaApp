# Lista de Produtos

Este é um projeto de gerenciamento de produtos desenvolvido através do curso de Desenvolvimento FullStack da instituição Kaspper Academy,com as seguintes tecnologias: 
**JAVA** com **Spring Boot**, utilizando **Thymeleaf** e **MySQL** como banco de dados. 
O sistema permite a criação, edição e exclusão de produtos, exibindo uma lista atualizada dos produtos disponíveis.

## Funcionalidades

- **Listar Produtos**: Exibe todos os produtos cadastrados no sistema.
- **Adicionar Produto**: Formulário para adicionar novos produtos ao sistema.
- **Editar Produto**: Permite a atualização dos dados de um produto existente.
- **Excluir Produto**: Remove um produto da lista.
- **Buscar Produto (a implementar)**: Busca dinâmica de produtos (em desenvolvimento).

## Tecnologias Utilizadas

- **Java** e **Spring Boot** - para o backend.
- **Maven** - para gerenciamento de dependências.
- **MySQL** - como banco de dados.
- **Thymeleaf** - como motor de templates para o frontend.
- **HTML**, **CSS** - para estrutura e estilos básicos do frontend.

## Estrutura do Projeto

O projeto possui a seguinte estrutura de pastas:

```plaintext
src
├── main
│   ├── java
│   │   └── com.magalu.magaapp
│   │       ├── controller
│   │       ├── model
│   │       └── repository
│   ├── resources
│   │   ├── static
│   │   │   ├── css
│   │   │   ├── js
│   │   │   └── images
│   │   └── templates
│   │       └── produto
│   │       │   ├── listagem.html
│   │       │   └── formProd.html
│   │       ├── index.html
│   │       └── template.html
│   └── application.properties
└── pom.xml
```

## Futuras Implementações

   - Busca Dinâmica: Implementar um campo de busca em JavaScript para filtrar produtos em tempo real.
   - Validações: Adicionar validações para evitar inserções de dados inválidos.
   - Melhorias no Design: Ajustes no CSS para melhorar a experiência do usuário.







