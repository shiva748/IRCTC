# 🚉 IRCTC Ticket Reservation System

This is my **very first fully-fledged Java project**, a console-based IRCTC-style ticket reservation system. I designed and implemented the **entire application logic** — including entities, services, and utilities — from scratch using Java. To complete the project, I integrated **AI-assisted data persistence** so that all booking data is retained across application restarts.

---

## 🧠 Features

- User registration and login
- Book tickets with seat and coach selection
- Cancel tickets
- View current and past bookings
- List all available trains
- Travel history tracking
- Seat availability logic
- File-based persistence using AI-generated serialization logic

---

## 📦 Project Structure

```
IRCTC/
├── src/
│   ├── entities/         # User, Ticket, Train, etc.
│   ├── services/         # BookingService, UserService, etc.
│   ├── storage/          # Data persistence logic
│   ├── utils/            # Date/time & I/O utilities
│   └── Main.java         # Entry point
```

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/shiva748/IRCTC.git
cd IRCTC
```

### 2. Compile the Source

Using terminal:

```bash
javac -d out src/**/*.java
```

Or open in your favorite IDE (IntelliJ, Eclipse, or VS Code with Java extension).

### 3. Run the Program

```bash
java -cp out Main
```

---

## 💡 Motivation

This project was a learning milestone where I independently developed all application components. My goal was to simulate a realistic reservation system and challenge myself with designing clean logic and structure. Toward the end, I used AI tools to implement a working persistence layer that saves the application state — giving the app real-world utility.

---

## 🧩 Technologies Used

- **Java** (Core)
- **File I/O** (for saving data)
- **UUID** (unique ticket IDs)
- **AI-assisted code generation** (for persistence)

---

## 🔮 Future Improvements

- GUI frontend with JavaFX
- Real database integration (e.g., PostgreSQL)
- REST API layer with Spring Boot
- Admin panel for train and schedule management

---

## 📄 License

This project is open-source and licensed under the [MIT License](LICENSE).

---

**Made with ❤️ by [shiva748](https://github.com/shiva748)**  
*First big step into Java development.*
