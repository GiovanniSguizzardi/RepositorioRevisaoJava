# RepositorioRevisaoJava
Repositório criado para armazenar todos os arquivos sobre o Exercicio de revisão de java.

## Documentação
Foram criados dentro da aplicação 5 diferentes métodos de consulta, criação e delete de dados, e são eles:
- listarBrinquedos(); 
- criarBrinquedo();
- atualizarBrinquedo();
- excluirBrinquedo();
- buscarBrinquedoPorId();
- generateNextId() método que gera um ID na classe **"criarBrinquedo()"**.

| Atributo ORACLE            | Atributo JAVA          |
| -------------------------- | ---------------------- |
| ID (NUMBER)                | id (Long)              |
| NOME (VARCHAR2)            | nome (String)          |
| TIPO (VARCHAR2)            | tipo (String)          |
| CLASSIFICACAO (VARCHAR2)   | classificacao (String) |
| TAMANHO (VARCHAR2)         | tamanho (String)       |
| PRECO (NUMBER)             | preco (Double)         |

Aqui está a print da configuração final do SpringInitializr e respectivas 
dependências:

![image](https://github.com/user-attachments/assets/a4fecf85-8095-4aa9-b13d-0e40b055cc14)

## Prints dos END-POINTS
- Print do método GET
![image](https://github.com/user-attachments/assets/a3f093d5-6bb1-4fc5-92e2-3fefb053d599)

- Print do método CREATE (POST)
![image](https://github.com/user-attachments/assets/403c13c4-4ba4-4fbf-b106-ad99d5c01ca0)


- Print do método UPDATE (PUT)

- Print do método DELETE
