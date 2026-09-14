// Aplicativo Flutter simples em português
// Título: Desenvolvimento Mobile I
// Identificação: UESB — 2026.2

import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Desenvolvimento Mobile I',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const HomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Desenvolvimento Mobile I'),
        centerTitle: true,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            const Text(
              'UESB — 2026.2',
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.w600),
            ),
            const SizedBox(height: 12),
            const Text(
              'Este aplicativo de exemplo apresenta uma interface introdutória em Flutter e Dart. ' 
              'Flutter é um framework UI do Google para criar aplicações nativas para mobile, web e desktop a partir de uma única base de código. Dart é a linguagem utilizada pelo Flutter, com foco em produtividade e desempenho.',
              style: TextStyle(fontSize: 16),
            ),
            const SizedBox(height: 20),
            const Text(
              'Interação principal (exemplo): contador simples',
              style: TextStyle(fontSize: 16, fontWeight: FontWeight.w500),
            ),
            const SizedBox(height: 8),
            Row(
              children: [
                const Text('Contador atual: ', style: TextStyle(fontSize: 16)),
                Text('$_counter', key: const Key('counter'), style: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold)),
              ],
            ),
            const SizedBox(height: 20),
            const Text(
              'Pressione o botão flutuante para incrementar o contador. Um teste automatizado verifica essa interação.',
              style: TextStyle(fontSize: 14, color: Colors.black54),
            ),
            const Spacer(),
            Center(
              child: Text(
                'Boa aula — Desenvolvimento Mobile I',
                style: TextStyle(color: Colors.blueGrey[700]),
              ),
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        key: const Key('increment_fab'),
        onPressed: _incrementCounter,
        tooltip: 'Incrementar',
        child: const Icon(Icons.add),
      ),
    );
  }
}
