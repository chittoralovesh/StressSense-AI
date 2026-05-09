<div align="center">

<br/>

# 🧠 StressSense AI

### Human Stress Detection Based on Sleeping Habits

[![Python](https://img.shields.io/badge/Python-3.9+-00e5c8?style=for-the-badge&logo=python&logoColor=white)](https://python.org)
[![Flask](https://img.shields.io/badge/Flask-3.1-00b8a4?style=for-the-badge&logo=flask&logoColor=white)](https://flask.palletsprojects.com)
[![TensorFlow](https://img.shields.io/badge/TensorFlow-2.x-e040fb?style=for-the-badge&logo=tensorflow&logoColor=white)](https://tensorflow.org)
[![scikit-learn](https://img.shields.io/badge/scikit--learn-1.6-4fc3f7?style=for-the-badge&logo=scikit-learn&logoColor=white)](https://scikit-learn.org)
[![Java](https://img.shields.io/badge/Java-17+-ffca28?style=for-the-badge&logo=openjdk&logoColor=black)](https://java.com)
[![License](https://img.shields.io/badge/Open_Source-❤️-ff5252?style=for-the-badge)](LICENSE)

<br/>

> *"Sleep is the window to the mind — stress lives in the gaps."*

<br/>

**[🚀 Get Started](#-getting-started) · [👁 View Demo](#-demo-screenshots) · [🛠 Tech Stack](#-tech-stack) · [🤝 Contribute](#-contributing)**

<br/>

</div>

---

## 🌟 What is StressSense AI?

**StressSense AI** is a web application that predicts stress levels by analyzing sleep patterns and physiological data. Using a blend of classical machine learning and deep learning, it transforms raw sleep metrics into actionable mental health insights — served through a clean, responsive web interface.

```
  Sleep Hours  ──┐
  Sleep Quality ─┤──► Preprocessing ──► ML Model ──► Stress Level
  Heart Rate  ───┤          (pandas, numpy)      (sklearn / TF)
  Snoring     ───┘
```

---

## 🎯 Features

|  | Feature | Description |
|--|---------|-------------|
| 🔮 | **Real-Time Prediction** | Instant stress classification — no loading, no delay |
| 🤖 | **Dual ML Engine** | scikit-learn + TensorFlow for high-accuracy detection |
| 🌐 | **Flask Web Interface** | Responsive UI with Jinja2 templating, runs on any device |
| 📊 | **Smart Data Pipeline** | Robust preprocessing with numpy, pandas, and scipy |
| ⚡ | **Java Backend** | Spring Boot service for high-performance business logic |
| ☁️ | **One-Click Deploy** | Gunicorn + Procfile — live on Heroku in minutes |

---

## 🖥️ Demo Screenshots

### 📋 Input Form — Enter Your Sleep Data

```
┌─────────────────────────────────────────────────────────────────┐
│  ● ● ●   stresssense.ai/analyze                                 │
├─────────────────────────────────────────────────────────────────┤
│                                                                  │
│   📋 Enter Your Sleep Data                                      │
│                                                                  │
│   Sleep Duration (hours)   ████████████░░░░░░  6.5 hrs          │
│   Sleep Quality  (1-10)    ██████░░░░░░░░░░░░  5 / 10           │
│   Resting Heart Rate       [ 78 bpm              ]              │
│   Snoring Rate             [ Moderate            ]              │
│   Limb Movement            [ Low                 ]              │
│                                                                  │
│              [ Analyze Stress Level → ]                         │
│                                                                  │
└─────────────────────────────────────────────────────────────────┘
```

### 📈 Result — Stress Analysis Output

```
┌─────────────────────────────────────────────────────────────────┐
│  ● ● ●   stresssense.ai/result                                  │
├─────────────────────────────────────────────────────────────────┤
│                                                                  │
│   📈 Stress Analysis Result                                     │
│                                                                  │
│   Low ─────────────── Moderate ─────────────────── High        │
│   ████████████████████████░░░░░░░░░░░░░░░░░░░░░░░  62%         │
│                                                                  │
│   ⚠️  MODERATE STRESS DETECTED                                  │
│                                                                  │
│   ┌──────────────┬───────────────┬────────────────┐            │
│   │ Stress Score │  Confidence   │  Response Time │            │
│   │     62%      │     94%       │     0.3s       │            │
│   └──────────────┴───────────────┴────────────────┘            │
│                                                                  │
│   💡 Recommendation: Improve sleep hygiene, reduce screen time  │
│                                                                  │
└─────────────────────────────────────────────────────────────────┘
```

### 🔄 ML Pipeline — Under the Hood

```
  📥 Input        🔧 Preprocess      🤖 Inference       📊 Output
┌──────────┐     ┌──────────────┐   ┌─────────────┐   ┌──────────┐
│  Sleep   │     │   pandas     │   │ scikit-learn│   │  Stress  │
│  Data    │────►│   numpy      │──►│ TensorFlow  │──►│  Result  │
│  (JSON)  │     │   scipy      │   │   joblib    │   │   (UI)   │
└──────────┘     └──────────────┘   └─────────────┘   └──────────┘
```

---

## 🛠️ Tech Stack

```
┌──────────────────────────────────────────────────────────────────┐
│                       StressSense AI                            │
│                                                                  │
│  ┌────────────┐  ┌─────────────┐  ┌────────────────────────┐  │
│  │  Frontend  │  │  Web Layer  │  │       ML / AI          │  │
│  │            │  │             │  │                        │  │
│  │  HTML5     │  │  Flask 3.1  │  │  TensorFlow 2.x        │  │
│  │  CSS3      │  │  Werkzeug   │  │  scikit-learn 1.6      │  │
│  │  Jinja2    │  │  Gunicorn   │  │  numpy · pandas        │  │
│  └────────────┘  └─────────────┘  │  scipy · joblib · h5py │  │
│                                    └────────────────────────┘  │
│  ┌────────────────────────────────────────────────────────────┐ │
│  │               Java Backend (Spring Boot)                   │ │
│  └────────────────────────────────────────────────────────────┘ │
└──────────────────────────────────────────────────────────────────┘
```

| Layer | Technology | Purpose |
|-------|-----------|---------|
| 🌐 Web Framework | Flask 3.1 + Werkzeug | HTTP handling, routing |
| 🧠 Deep Learning | TensorFlow 2.x + h5py | Neural network inference |
| 📐 Classical ML | scikit-learn 1.6 + joblib | Traditional algorithms |
| 📊 Data Science | numpy · pandas · scipy | Preprocessing pipeline |
| 🎨 Frontend | HTML5 · CSS3 · Jinja2 | Responsive UI rendering |
| ☕ Backend | Java · Spring Boot | Business logic service |
| 🚀 Production | Gunicorn | WSGI application server |

---

## 📁 Project Structure

```
StressSense-AI/
│
├── 📂 backend/
│   └── stress-backend/        ← ☕ Java Spring Boot service
│
├── 📂 frontend/               ← 🎨 Frontend source assets
│
├── 📂 static/                 ← 🖼️  CSS, JavaScript, images
│
├── 📂 templates/              ← 📄 Jinja2 HTML templates
│
├── 📄 requirements.txt        ← 📦 Python dependencies
├── 📄 Procfile                ← 🚀 Gunicorn deploy config
├── 📄 .gitignore
└── 📄 README.md
```

---

## 🚀 Getting Started

### Prerequisites

![Python](https://img.shields.io/badge/-Python_3.9+-00e5c8?logo=python&logoColor=white&style=flat-square)
![Java](https://img.shields.io/badge/-Java_17+-ffca28?logo=openjdk&logoColor=black&style=flat-square)
![pip](https://img.shields.io/badge/-pip-4fc3f7?logo=pypi&logoColor=white&style=flat-square)

### Installation

**① Clone the repository**
```bash
git clone https://github.com/chittoralovesh/StressSense-AI.git
cd StressSense-AI
```

**② Create and activate a virtual environment**
```bash
python -m venv venv
source venv/bin/activate        # 🪟 Windows: venv\Scripts\activate
```

**③ Install Python dependencies**
```bash
pip install -r requirements.txt
```

**④ Launch the application**
```bash
flask run
# ✅ Open http://localhost:5000
```

---

## ☁️ Deploy to Heroku

```bash
heroku create stresssense-ai
git push heroku main
heroku open
```

The included `Procfile` handles the rest:
```
web: gunicorn app:app
```

---

## 🔬 How It Works

```
   STEP 1            STEP 2             STEP 3            STEP 4
  ────────          ────────           ────────          ────────
  📥 Input         🔧 Process          🤖 Predict        📊 Result

  User enters    pandas cleans &    scikit-learn /    Stress level
  sleep data     normalizes data    TensorFlow runs   shown on UI
  via web form   + feature eng.     inference model   with score
```

---

## 📊 Language Breakdown

```
  Java         ████████████████████████████████████░░░░░  72.7%
  HTML         ██████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  21.5%
  CSS          ███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░   5.6%
  Other        ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░   0.2%
```

---

## 🤝 Contributing

All contributions are welcome! Here's how:

```bash
# 1. Fork the repo on GitHub

# 2. Create a feature branch
git checkout -b feature/your-awesome-feature

# 3. Make your changes and commit
git add .
git commit -m "✨ Add your awesome feature"

# 4. Push and open a Pull Request
git push origin feature/your-awesome-feature
```

Please keep code clean, tested, and well-documented. 💚

---

## 📬 Contact

**chittoralovesh**

[![GitHub](https://img.shields.io/badge/GitHub-@chittoralovesh-00e5c8?style=flat-square&logo=github&logoColor=white)](https://github.com/chittoralovesh)

---

<div align="center">

<br/>

Made with ❤️ and lots of ☕

<br/>

**⭐ If this project helped you, please give it a star! ⭐**

<br/>

[![Star](https://img.shields.io/github/stars/chittoralovesh/StressSense-AI?style=social)](https://github.com/chittoralovesh/StressSense-AI)

</div>

