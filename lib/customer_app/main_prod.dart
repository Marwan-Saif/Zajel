import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
// استدعاء ملف مفاتيح الـ Dev
import '../core/firebase/firebase_options_prod.dart'; 

void main() async {
  // السطر ده مهم جداً قبل تهيئة فايربيز
  WidgetsFlutterBinding.ensureInitialized(); 

  // تهيئة فايربيز باستخدام المفاتيح بتاعة الـ Dev
  await Firebase.initializeApp(
    options: DefaultFirebaseOptions.currentPlatform,
  );

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
            'أهلاً بيك في تطبيق العميل - نسخة الانتاج 🛠️',
            style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
            textDirection: TextDirection.rtl,
          ),
        ),
      ),
    );
  }
}