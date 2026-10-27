# ⏰ Java Alarm Clock

A simple **Java Alarm Clock** developed in Java that allows users to set an alarm for a specific time. It displays a live clock in the terminal and plays an audio alert when the specified time is reached.

This project demonstrates fundamental Java programming concepts, including object-oriented programming, multithreading, time management, exception handling, input validation, and audio playback using the Java Sound API.

## ✨ Features

- **Set Alarm:** Set an alarm using the `HH:mm:ss` time format.
- **Live Clock:** Display the current time in the terminal while waiting for the alarm.
- **Play Alarm Sound:** Play an audio file when the specified alarm time is reached.
- **Stop Alarm:** Stop the alarm sound by pressing Enter.
- **Input Validation:** Handle invalid time formats and prompt the user to enter a valid time.
- **Multithreading:** Run the alarm process in a separate thread.
- **Exception Handling:** Handle unsupported audio formats, unavailable audio devices, and audio file access errors.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Date and Time:** `java.time.LocalTime`
- **Time Formatting:** `java.time.format.DateTimeFormatter`
- **Multithreading:** `Runnable` and `Thread`
- **Audio Playback:** `javax.sound.sampled`
- **User Input:** `java.util.Scanner`
- **File Handling:** `java.io.File`
- **Interface:** Command-Line Interface (CLI)
- **Audio File:** WAV format (`Music.wav`)
- **Compiler:** Java Development Kit (JDK)

## 📁 Project Structure

```text
Java-Alarm-Clock/
│
├── AlarmClock.java    # Main class for setting the alarm
├── Alarm.java         # Clock monitoring and audio playback
├── Music.wav          # Alarm sound file
└── README.md          # Project documentation
```

## 🚀 Getting Started

### Prerequisites

- Install the Java Development Kit (JDK).
- Ensure that `java` and `javac` are available in your terminal.
- Keep `AlarmClock.java`, `Alarm.java`, and `Music.wav` in the same directory.

### Compilation

Open a terminal in the project directory and run:

```bash
javac Alarm.java AlarmClock.java
```

### Run the Program

**Windows (PowerShell):**

```powershell
java AlarmClock
```

**Linux/macOS:**

```bash
java AlarmClock
```

## 💻 Example Output

### 1. Setting an Alarm

Enter the desired alarm time in 24-hour format.

```text
Enter an alarm time (HH:mm:ss) : 18:30:00
Alarm set for : 18:30
```

### 2. Live Clock Display

The current time updates dynamically on the same terminal line every second while the program waits for the alarm.

```text
18:29:55
```

*The displayed seconds change continuously. The program overwrites the previous time instead of printing a new line for every update.*

### 3. Alarm Triggered

When the specified time is reached, the alarm sound starts playing.

```text
== Alarm Noice ==
Press Enter to stop the alarm!
```

Press Enter to stop the alarm sound.

### 4. Invalid Time Format

If the user enters an incorrectly formatted time, the program displays an error message and asks for input again.

```text
Enter an alarm time (HH:mm:ss) : 6:30 PM
Invalid format! use (HH:mm:ss)
Enter an alarm time (HH:mm:ss) : 18:30:00
Alarm set for : 18:30
```

**Note:** The times shown above are illustrative. The live clock displays the actual system time, and the alarm triggers when the specified time is reached. If the entered time has already passed, the current implementation triggers the alarm immediately.

## 📚 Concepts Practiced

- Classes and objects
- Object-oriented programming
- Implementing the `Runnable` interface
- Creating and starting threads
- Date and time handling using `LocalTime`
- Time formatting using `DateTimeFormatter`
- Parsing and validating user input
- `while` loops and conditional statements
- `Thread.sleep()` for periodic execution
- Audio playback using `AudioSystem`, `AudioInputStream`, and `Clip`
- File handling using the `File` class
- Exception handling with `try-catch`
- Separating application logic into multiple classes
- Console output formatting using `System.out.printf()`

## ⚙️ How It Works

1. The `AlarmClock` class asks the user to enter an alarm time.
2. The program validates the input using `DateTimeFormatter` and parses it into a `LocalTime` object.
3. An `Alarm` object is created with the alarm time, audio file path, and scanner.
4. A separate thread starts the alarm process.
5. The program checks the current time and updates the terminal clock every second.
6. When the alarm time is reached, the program plays `Music.wav`.
7. The user presses Enter to stop the alarm sound.

## ⏱️ Time Complexity

| Operation | Description |
|---|---|
| Input validation | Parses the entered time until valid input is received |
| Clock monitoring | Checks the current time approximately once per second |
| Audio playback | Starts the alarm sound when the target time is reached |

The alarm-monitoring loop checks the time periodically, sleeping for one second between checks. The total waiting time depends on the difference between the current time and the specified alarm time.

## ⚠️ Limitations

- The application uses a command-line interface and does not include a graphical user interface.
- Only one alarm can be set at a time.
- The alarm uses the computer's local time.
- The program does not automatically schedule alarms for the following day.
- The `Music.wav` file must exist at the configured path.
- Audio playback depends on the system's audio configuration and Java Sound API support.
- Alarm settings are not saved after the program terminates.
- Entering a time that has already passed causes the alarm to trigger immediately.
- Thread interruption and resource cleanup could be improved.

## 🔮 Future Improvements

- Develop a graphical user interface using JavaFX or Swing.
- Support multiple alarms.
- Add snooze and repeat alarm functionality.
- Allow users to select custom alarm sounds.
- Support recurring alarms and specific dates.
- Add options to pause, resume, or cancel an alarm.
- Improve thread interruption and resource management.
- Save alarm settings for future sessions.
- Add more robust input validation and error handling.
- Display the remaining time until the alarm.

## 🎯 Project Objective

The objective of this project is to build a functional alarm clock in Java while gaining practical experience with multithreading, date and time handling, audio playback, exception handling, and object-oriented programming.

## 👨‍💻 Author

**Arun Saini**

This project is part of my programming practice and GitHub portfolio, demonstrating my progress in Java programming, object-oriented design, and application development.

## 📄 License

The source code can be published under a suitable open-source license. Ensure that you have the necessary permission to redistribute `Music.wav` before including it in the public repository.

---

⭐ If you find this project useful, consider giving the repository a star!
