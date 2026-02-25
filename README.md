Projeto JDBC - Controle de Estoque
Este projeto é uma aplicação Java que utiliza JDBC (Java Database Connectivity) para gerenciar um inventário de produtos de forma persistente.

🛠️ Tecnologias e Estrutura
O sistema foi desenvolvido para integrar o código Java com um banco de dados relacional, apresentando as seguintes características:


Linguagem: Java (configurado como módulo IntelliJ).


Banco de Dados: SQLite (meu_banco_de_dados.db).
+1


Bibliotecas: Inclui suporte para slf4j-api para logging e drivers JDBC.


Persistência: Gerenciamento automático de IDs através de AUTOINCREMENT.
+1

📊 Estrutura do Banco de Dados
A tabela principal, denominada produtos, possui a seguinte estrutura:
+1

Coluna	Tipo	Descrição
id_produto	INTEGER	
Chave primária autoincrementada.
+1

nome_produto	TEXT	
Nome do item (ex: Notebook, Mouse).
+1

quantidade	INTEGER	
Quantidade disponível em estoque.
+1

preco	REAL	
Valor unitário do produto.
+1

status	TEXT	
Estado do item (ex: "Estoque Normal", "Estoque Baixo").
+1


Exportar para as Planilhas

🚀 Como Executar
Certifique-se de ter o JDK instalado e configurado.

Importe o projeto em sua IDE (IntelliJ, Eclipse ou VS Code).

O arquivo .gitignore já está configurado para excluir arquivos de build e configurações locais de IDEs.

Execute a classe principal (localizada em src) para interagir com os dados.
