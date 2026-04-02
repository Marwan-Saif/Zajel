import 'package:flutter/material.dart';

void main() {
  // هنا بعدين هنحط كود ربط فايربيز الخاص ببيئة الـ Dev للعميل
  runApp(const CustomerDevApp());
}

class CustomerDevApp extends StatelessWidget {
  const CustomerDevApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Zajel C-Dev',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: const Scaffold(
        body: Center(
          child: Text(
            'أهلاً بيك في تطبيق العميل - نسخة التطوير 🛠️',
            style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
            textDirection: TextDirection.rtl,
          ),
        ),
      ),
    );
  }
}