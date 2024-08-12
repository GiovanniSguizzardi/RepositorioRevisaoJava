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
| B_ID (NUMBER)              | id (Long)              |
| B_NOME (VARCHAR2)          | nome (String)          |
| B_TIPO (VARCHAR2)          | tipo (String)          |
| B_CLASSIFICACAO (VARCHAR2) | classificacao (String) |
| B_TAMANHO (VARCHAR2)       | tamanho (String)       |
| B_PRECO (NUMBER)           | preco (Double)         |

Aqui está a print da configuração final do SpringInitializr e respectivas 
dependências:

![image](https://github.com/GiovanniSguizzardi/CPJava02Postman/assets/125572342/09ad579b-a0e3-4116-a5a2-c8dafe7daac8)
