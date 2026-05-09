<div align="center">

<br/>

# 🧠 StressSense AI

### AI-Powered Stress Detection & Mental Wellness Platform 💙

<br/>

[![React](https://img.shields.io/badge/React.js-Frontend-00e5c8?style=for-the-badge&logo=react&logoColor=white)](https://reactjs.org)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-Backend-4fc3f7?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![OpenAI](https://img.shields.io/badge/OpenAI-Chatbot-e040fb?style=for-the-badge&logo=openai&logoColor=white)](https://openai.com)
[![Vercel](https://img.shields.io/badge/Vercel-Frontend-ffca28?style=for-the-badge&logo=vercel&logoColor=black)](https://vercel.com)
[![Render](https://img.shields.io/badge/Render-Backend-ff5252?style=for-the-badge&logo=render&logoColor=white)](https://render.com)
[![License](https://img.shields.io/badge/Open_Source-❤️-00e5c8?style=for-the-badge)](LICENSE)

<br/>

> *"Sleep is the window to the mind — stress lives in the gaps."*

<br/>

**[🚀 Get Started](#%EF%B8%8F-installation--setup) · [👁 Demo](#-demo-screenshots) · [🛠 Tech Stack](#%EF%B8%8F-tech-stack) · [🤝 Contribute](#-contributing)**

<br/>

</div>

---

## 🚀 Overview

**StressSense AI** is a full-stack web application designed to analyze user stress levels and provide intelligent mental wellness support. It combines Machine Learning with an AI chatbot to deliver a complete, insight-driven mental health platform.

The platform is structured into two core components:

```
┌─────────────────────────────────────────────────────────────────┐
│                      StressSense AI                             │
│                                                                 │
│   📊 Dashboard                     🤖 Chatbot                  │
│   ─────────────────────            ──────────────────           │
│   ML-based stress analysis         Answers user queries         │
│   Random Forest + Neural Net       Powered by OpenAI API        │
│   History tracking & analytics     Mental wellness guidance     │
└─────────────────────────────────────────────────────────────────┘
```

---

## ✨ Features

| Icon | Feature | Description |
| :--: | :------ | :---------- |
| 📊 | **ML Stress Detection** | Dual-model approach using Random Forest + Neural Network |
| 📈 | **Stress History Tracking** | Monitor your stress levels over time |
| 📉 | **Advanced Analytics** | Visualize patterns and trends in your mental state |
| 🤖 | **AI Chatbot** | OpenAI-powered assistant for wellness guidance |
| 🧠 | **Personalized Insights** | Tailored recommendations based on your data |
| 🌐 | **Fully Responsive** | Works seamlessly on any device or screen size |
| 🔐 | **Secure API Handling** | API keys handled safely via environment variables |

---

## 🧠 Machine Learning Model

StressSense AI uses a **dual-model approach** for accurate, reliable predictions:

```
         User Input Data
               │
               ▼
  ┌────────────────────────────────┐
  │       ML Prediction Layer      │
  │                                │
  │  🌳 Random Forest              │
  │  ── Structured data input      │
  │  ── Stable, reliable results   │
  │                                │
  │  🧬 Neural Network             │
  │  ── Complex behavioral patterns│
  │  ── Deep, accurate predictions │
  └────────────────────────────────┘
               │
               ▼
         Stress Level Result
```

**🌳 Random Forest Model**
- Handles structured input data efficiently
- Provides stable and reliable predictions

**🧬 Neural Network Model**
- Captures complex behavioral patterns
- Improves prediction depth and accuracy

> 👉 Both models power the **stress analysis dashboard** together.

---

## 📊 Stress Analytics & History

The platform goes beyond prediction — it's fully insight-driven:

```
  High │  ██                    ██
       │  ██   ██          ██   ██
  Med  │  ██   ██   ██     ██   ██   ██
       │  ██   ██   ██  ██ ██   ██   ██
  Low  └──────────────────────────────────
        Mon  Tue  Wed  Thu  Fri  Sat  Sun
```

- 📈 Tracks user stress levels over time
- 📊 Displays patterns and trends
- 🧠 Helps users understand their mental state evolution
- 📉 Enables better decision-making for stress management

---

## 🤖 Chatbot Functionality

The AI chatbot is designed to complement the ML dashboard:

- ✅ Answers user queries about stress and wellness
- ✅ Provides general mental wellness guidance
- ✅ Helps users understand stress-related concepts
- ❌ Does **not** perform stress prediction — that is handled by the ML models

> 👉 Stress analysis is handled exclusively by the ML dashboard.

---

## 🛠️ Tech Stack

### 💻 Frontend

| Technology | Purpose |
| :--------- | :------ |
| React.js | UI framework |
| HTML & CSS | Structure and styling |
| JavaScript | Client-side logic |

### ⚙️ Backend

| Technology | Purpose |
| :--------- | :------ |
| Java | Core backend language |
| Spring Boot | REST API framework |
| REST APIs | Client-server communication |

### 🤖 AI / ML

| Technology | Purpose |
| :--------- | :------ |
| Random Forest | Structured data stress prediction |
| Neural Network | Deep behavioral pattern detection |
| OpenAI API | AI chatbot assistance |

### 🗄️ Tools & Platforms

| Tool | Purpose |
| :--- | :------ |
| Git & GitHub | Version control |
| Postman | API testing |
| Vercel | Frontend deployment |
| Render | Backend deployment |

---

## 📁 Project Structure

```
StressSense-AI/
│
├── 📂 frontend/          ← ⚛️  React.js frontend
│
├── 📂 backend/           ← ☕ Spring Boot backend
│
├── 📂 dataset/           ← 📦 Dataset for ML training
│
├── 📂 ml-model/          ← 🧠 Trained ML models
│
├── 📂 templates/         ← 📄 HTML templates
│
├── 📂 static/            ← 🖼️  Static resources
│
├── 📄 requirements.txt   ← 📦 Python dependencies
├── 📄 Procfile           ← 🚀 Deployment config
└── 📄 README.md
```

---

## ⚙️ Installation & Setup

### Prerequisites

![Node](https://img.shields.io/badge/-Node.js_%26_npm-00e5c8?logo=node.js&logoColor=white&style=flat-square)
![Java](https://img.shields.io/badge/-Java_17+-ffca28?logo=openjdk&logoColor=black&style=flat-square)
![Git](https://img.shields.io/badge/-Git-4fc3f7?logo=git&logoColor=white&style=flat-square)

**① Clone the repository**
```bash
git clone https://github.com/chittoralovesh/StressSense-AI.git
cd StressSense-AI
```

**② Backend Setup**
```bash
cd backend
./mvnw spring-boot:run
```

**③ Frontend Setup**
```bash
cd frontend
npm install
npm start
```

Open `http://localhost:3000` in your browser. 🎉

**④ Environment Variables**

Create a `.env` file in the root directory:
```env
OPENAI_API_KEY=your_api_key_here
```

> ⚠️ **Never expose your API key publicly.** Add `.env` to your `.gitignore`.

---

## 🌐 Deployment

| Component | Platform | Trigger |
| :-------- | :------- | :------ |
| 💻 Frontend | Vercel | Auto-deploys on push to `main` |
| ⚙️ Backend | Render | REST API live server |

```
  GitHub Repo
       │
       ├──► Vercel ──► React Frontend 🌐
       │
       └──► Render ──► Spring Boot Backend ⚙️
```

---

## 📸 Demo Screenshots

### 📋 Stress Analysis Dashboard

```
┌─────────────────────────────────────────────────────────────────┐
│  ● ● ●   stresssense.ai/dashboard                               │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│   📊 Stress Analysis Dashboard                                 │
│                                                                 │
│   Sleep Duration   ████████████░░░░░░░░  6.5 hrs                │
│   Sleep Quality    ██████░░░░░░░░░░░░░░  5 / 10                 │
│   Heart Rate       [ 78 bpm             ]                       │
│   Snoring Rate     [ Moderate           ]                       │
│                                                                 │
│   Low ─────────── Moderate ─────────────────────── High         │
│   ████████████████████████░░░░░░░░░░░░░░░░░░░  62%              │
│                    ⚠️  Moderate Stress Detected                │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
```

### 📈 Stress History & Analytics

```
┌─────────────────────────────────────────────────────────────────┐
│  ● ● ●   stresssense.ai/history                                 │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│   📈 Your Stress Trend — Last 7 Days                           │
│                                                                 │
│   High │  ██                         ██                         │
│        │  ██   ██              ██    ██                         │
│   Med  │  ██   ██    ██        ██    ██    ██                   │
│        │  ██   ██    ██   ██   ██    ██    ██                   │
│   Low  └────────────────────────────────────────                │
│          Mon  Tue  Wed  Thu  Fri  Sat  Sun                      │
│                                                                 │
│   🧠 Insight: Stress peaks on Monday & Friday                  │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
```

### 🤖 AI Chatbot

```
┌─────────────────────────────────────────────────────────────────┐
│  ● ● ●   stresssense.ai/chat                                    │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│   🤖 StressSense Assistant                         💙 Onlin    │
│   ─────────────────────────────────────────────────────────     │
│                                                                 │
│   🤖  Hi! I'm here to support your mental wellness journey.     │
│       How are you feeling today?                                │
│                                                                 │
│   👤  I've been feeling anxious lately, what should I do?      │
│                                                                 │
│   🤖  Here are some techniques that can help:                  │
│       1. Practice deep breathing for 5 minutes                  │
│       2. Take short breaks every hour                           │
│       3. Check your stress dashboard for patterns 📊           │
│                                                                 │
│   [ Type your message...                           Send →  ]    │
└─────────────────────────────────────────────────────────────────┘
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

## 💡 Future Enhancements

| Icon | Enhancement | Description |
| :--: | :---------- | :---------- |
| 📱 | **Mobile Application** | Native iOS & Android app |
| 📊 | **Advanced Predictive Analytics** | Deeper trend forecasting |
| 🧘 | **Wellness & Meditation Plans** | Personalized mindfulness content |
| 🔐 | **User Authentication** | Secure login & profile system |

---

## 🤝 Contributing

All contributions are welcome!

```bash
# 1. Fork the repo on GitHub

# 2. Create a feature branch
git checkout -b feature/your-awesome-feature

# 3. Commit your changes
git add .
git commit -m "✨ Add your awesome feature"

# 4. Push and open a Pull Request
git push origin feature/your-awesome-feature
```

---

## 📬 Contact

**chittoralovesh** — [@chittoralovesh](https://github.com/chittoralovesh)

[![GitHub](https://img.shields.io/badge/GitHub-@chittoralovesh-00e5c8?style=flat-square&logo=github&logoColor=white)](https://github.com/chittoralovesh/StressSense-AI)

---

<div align="center">

<br/>

Made with ❤️ and lots of ☕

<br/>

**⭐ If this project helped you, please give it a star! ⭐**

<br/>

[![Star](https://img.shields.io/github/stars/chittoralovesh/StressSense-AI?style=social)](https://github.com/chittoralovesh/StressSense-AI)

</div>
