# POO — Java Swing (2026.2)

Atividade da disciplina Programação Orientada a Objeto: construção visual de três telas de cadastro com Java Swing, conforme a apostila da Unidade I.

## Telas

1. **Cadastro de estudante** — nome, matrícula, curso e botões de ação.
2. **Cadastro de disciplina** — código, nome, professor e carga horária.
3. **Cadastro de atividade** — título, disciplina, prazo e situação.

## Conteúdos praticados

- JFrame como janela principal;
- JPanel como agrupador;
- JLabel, JTextField e JButton;
- gerenciadores de layout, sem posicionamento absoluto;
- organização em classes e métodos.

Os botões são apresentados como componentes visuais, sem listeners, porque a apostila orienta que esta etapa priorize a estrutura das telas.

## Como executar

Com Java 17 ou superior instalado:

```bash
javac -d out src/TelasAcademicas.java
java -cp out TelasAcademicas
```

A entrega da atividade no Moodle deve seguir o formato solicitado pela professora.
