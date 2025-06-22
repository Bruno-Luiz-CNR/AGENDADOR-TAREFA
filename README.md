# 📝 Sistema de Lista de Tarefas em Java (CLI)

Este projeto é um sistema simples de gerenciamento de tarefas feito em Java, utilizando a linha de comando (CLI). Desenvolvido como parte dos meus estudos, ele simula uma lista de tarefas básica com as funcionalidades essenciais para prática de programação orientada a objetos, controle de fluxo e uso de coleções.

---

## 📌 Funcionalidades

✅ Adicionar uma nova tarefa  
📋 Listar todas as tarefas cadastradas  
✔️ Marcar uma tarefa como concluída  
❌ Remover uma tarefa da lista  
🔁 Menu interativo persistente até o usuário escolher sair

---

## 🧰 Tecnologias Utilizadas

- 💻 Linguagem: **Java 17+**
- 📚 Biblioteca padrão (`java.util.Scanner`, `java.util.ArrayList`)
- 📦 Paradigma: **Programação Orientada a Objetos**
- ⚙️ Terminal (CLI) para entrada/saída de dados

---

## ▶️ Como Executar Localmente

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/java-todo-cli.git
cd java-todo-cli

# 2. Compile os arquivos Java
javac TarefaJava.java

# 3. Execute o programa
java TarefaJava

--------------------------
MENU PRINCIPAL TAREFA JAVA
--------------------------
1 - Adicionar uma nova tarefa
2 - Listar todas as tarefas
3 - Marcar uma tarefa como concluída
4 - Remover uma tarefa
5 - Sair
--------------------------
Digite uma opção: 1
Digite a tarefa: Estudar Java
Deseja adicionar mais tarefas? (sim/nao): nao

java-todo-cli/
├── TarefaJava.java        # Classe principal com o menu
├── Tarefa.java            # Classe auxiliar com métodos e lógica
└── README.md              # Documentação do projeto
