# RepositorioRevisaoJava
Repositório criado para armazenar todos os arquivos sobre o Exercicio de revisão de java.

## Documentação
Foram criados dentro da aplicação 5 diferentes métodos de consulta, criação e delete de dados, e são eles:
- /brinquedos; 
- /brinquedos/add;
- /brinquedos/atualizar/{id};
- /brinquedos/delete/{id};
- /brinquedos/buscarid/{id};
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
![image](https://github.com/user-attachments/assets/804a9f35-9b5f-4eeb-ac5e-f3c9a7b4f4d7)

- Print do método DELETE
![image](https://github.com/user-attachments/assets/28e44a91-4175-435b-9301-a35d6a614160)

## JSON PARA TESTES!!!
```bash
[
    {
        "id": 1,
        "nome": "Bola de futebol",
        "tipo": "Brinquedo esportivo",
        "classificacao": "Livre",
        "tamanho": "Médio",
        "preco": 25.9
    },
    {
        "id": 2,
        "nome": "Lego The Hobbit",
        "tipo": "Peças de Montar",
        "classificacao": "+12",
        "tamanho": "Grande",
        "preco": 2499.99
    },
    {
        "id": 3,
        "nome": "Nintendo Switch",
        "tipo": "Videogame",
        "classificacao": "+16",
        "tamanho": "Médio",
        "preco": 1295.0
    }
]
```
