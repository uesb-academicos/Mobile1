import 'package:flutter_test/flutter_test.dart';
import 'package:flutterapp/main.dart';

void main() {
  testWidgets('exibe a apresentação e a linha do tempo', (tester) async {
    await tester.pumpWidget(const Mobile1App());

    expect(find.text('Minha jornada de aprendizagem'), findsOneWidget);
    expect(find.text('Linha do tempo'), findsOneWidget);
  });
}
