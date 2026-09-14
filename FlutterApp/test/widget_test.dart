import 'package:flutter_test/flutter_test.dart';
import 'package:flutter/material.dart';
import 'package:flutter_app/main.dart';

void main() {
  testWidgets('contador incrementa quando o FAB é pressionado', (WidgetTester tester) async {
    await tester.pumpWidget(const MyApp());

    // Verifica o estado inicial do contador
    expect(find.text('0'), findsOneWidget);

    // Pressiona o FAB para incrementar
    final Finder fab = find.byKey(const Key('increment_fab'));
    expect(fab, findsOneWidget);

    await tester.tap(fab);
    await tester.pumpAndSettle();

    // Verifica se o contador foi incrementado para 1
    expect(find.text('1'), findsOneWidget);
  });
}
