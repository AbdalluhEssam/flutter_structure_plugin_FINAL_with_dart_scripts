# Flutter Full Structure Generator 🏗️

A powerful Android Studio & VS Code plugin that helps you scaffold **Clean Architecture** in Flutter apps in seconds.

This tool creates full project structure or feature modules with domain/data/presentation layers, as well as shared layers like `core`, `routing`, `theme`, and `utils`.

---

## ✨ Features

- ✅ **Generate Full Project**:
  - `core/` (constants, network, services, utils, theme, routing, cubits)
  - `features/` (splash, onboarding, etc.)
  - `main.dart`, `app.dart`, `app_bloc_observer.dart`
  - Ready `pubspec.yaml`
  - Assets folder support

- ✅ **Generate Feature Only**:
  - Create new module: domain, data, presentation
  - Files like:
    - `feature_entity.dart`
    - `feature_model.dart`
    - `feature_usecase.dart`
    - `feature_repository.dart`
    - Cubit & state
    - View with `BlocBuilder`

- ✅ Copies & runs Dart scripts automatically
- ✅ Works on Windows, macOS, and Linux
- ✅ Supports both Android Studio & VS Code

---

## 🚀 How to Use

### 🔹 Full Project
1. Right click → `Flutter Full Structure: Generate`
2. Choose `Generate Full Project`

### 🔹 Add Feature
1. Right click → `Flutter Full Structure: Generate`
2. Choose `Generate Feature`
3. Enter feature name → It’s created instantly!

---

## 📁 Structure (Full Project)

lib/
├── core/
│   ├── constants
│   ├── network
│   ├── services
│   ├── routing
│   ├── theme
│   ├── utils
│   ├── cubit
├── features/
│   ├── splash
│   ├── onboarding
├── app.dart
├── main.dart
└── app_bloc_observer.dart

---

## 🛠️ Included Dart Scripts

- `tool/generate_project.dart`
- `tool/generate_feature.dart`

Automatically copied from plugin's `assets/`.

---

## 📦 Requirements

- ✅ Flutter SDK
- ✅ Dart SDK
- No extra setup required

---

## 📸 Preview

![preview](plugin_preview.png)

---

## 👨‍💻 Author

Built with ❤️ by **Abdalluh Essam** 🇪🇬  
📩 Email: [abdallhesam100@gmail.com](mailto:abdallhesam100@gmail.com)

---

## 📄 License

MIT License. Use freely and contribute!
