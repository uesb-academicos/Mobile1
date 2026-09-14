# Desenvolvimento Mobile I — Atividade 6

UESB · ADS · 2026.2 · Unidade I, Semana 3.

## Objetivo

Configurar Flutter no GitHub Codespaces, executar o aplicativo web e entregar o link da branch da atividade no GitHub. Prazo informado no Moodle: 14/09/2026 às 23:59. Valor: 10 pontos (peso 5).

## Referências

- Agenda da Semana 3: https://moodle4.uesb.br/mod/page/view.php?id=30091
- Roteiro de Estruturas de Controle: https://moodle4.uesb.br/mod/resource/view.php?id=30135
- Videoaula GitHub Codespaces: https://www.youtube.com/watch?v=mnEUJM4pH0Q
- Dart, capítulos II e III: https://moodle4.uesb.br/mod/resource/view.php?id=30378

O arquivo do roteiro descreve a configuração do ambiente e a publicação da branch semana1; não há enunciados adicionais de exercícios no documento. O aplicativo e os testes que já estavam no repositório foram preservados.

## Estrutura

- .devcontainer/devcontainer.json: imagem Flutter e extensões Dart/Flutter.
- .vscode/launch.json: execução Flutter Web na porta 8080.
- lib/main.dart: aplicativo introdutório e contador.
- test/widget_test.dart: teste do contador.
- web/: suporte web gerado pelo Flutter.
- docs/historico/README-original.md: README anterior preservado.

## Como executar

No Codespaces, use Codespaces: Rebuild Container para aplicar a configuração. Depois, na raiz do projeto:

flutter pub get
flutter run -d web-server --web-port=8080 --web-hostname=0.0.0.0

Também é possível selecionar Flutter Web em Executar e Depurar e pressionar F5. Abra a porta 8080 na aba Portas.

## Validação

Execute dart format, flutter analyze, flutter test e flutter build web.

Validação anterior: Flutter 3.47.4 e Dart 3.13.3; análise sem problemas e teste do contador aprovado.

## Entrega

Publicar a branch semana1 e enviar seu link permanente na Atividade 6 do Moodle. O endereço do Codespace é apenas o ambiente de desenvolvimento. A entrega da Semana 4 possui prazo separado, em 21/09/2026.
