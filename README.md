# AtividadeFinal - Doações Rio Grande do Sul

Desenvolva um sistema de gerenciamento de doações destinado a ajudar as vítimas de uma enchente no Rio Grande do Sul. O sistema deve permitir o registro de doações, armazenamento dos dados em um arquivo de texto, e exibição das doações registradas. O sistema deve ser capaz de lidar com diferentes tipos de doações: dinheiro, alimentos e roupas. Para cada tipo de doação, devem ser solicitadas informações específicas, e as doações devem ser armazenadas e exibidas adequadamente. Além disso, o sistema deve tratar exceções para garantir a robustez.

# Requisitos Funcionais
### Tela de Entrada de Doações:

O sistema deve oferecer uma interface onde os doadores possam registrar suas doações.
### Campos de Doação:

A interface deve conter campos para inserir o tipo de doação (dinheiro, alimentos, roupas).
Para doações em dinheiro, deve ser solicitado o valor.
Para doações de alimentos, deve ser solicitado o nome do produto e a quantidade.
Para doações de roupas, deve ser solicitado o nome do produto e o tamanho.
### Validação de Entrada:

O sistema deve validar as entradas para garantir que todos os campos obrigatórios sejam preenchidos corretamente antes de aceitar a doação.
### Armazenamento de Doações:

O sistema deve armazenar todas as informações de doações em um arquivo de texto utilizando BufferedWriter e FileWriter.
### Exibição de Doações:

O sistema deve exibir todas as doações registradas de forma clara e fácil de entender.
### Tratamento de Exceções:

O sistema deve tratar exceções para garantir a robustez, informando o usuário sobre entradas inválidas e problemas ao salvar os dados.
