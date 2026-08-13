# 🟨 JavaScript Playground & OOP Lab

Welcome to my personal JavaScript playground! Located inside my broader Object-Oriented Programming (OOP) repository, this laboratory is dedicated to mastering core JavaScript mechanics, advanced array algorithms, and server-side engineering architectures using Node.js—with a heavy emphasis on OOP principles.

## 📂 Featured Implementations

### 1. 📁 Custom JSON Local CRUD Engine (`JSON-Local-Database/`)
A lightweight, local file-based database manager built with native Node.js modules. It serves as a practical implementation of OOP Encapsulation and high-level data handling.
* **Encapsulated Architecture**: Leverages a robust JavaScript class blueprint (`JSONDatabase`) that hides internal file system I/O mechanics from global execution scopes.
* **JSON Lifecycle Automation**: Hand-codes data serialization (`JSON.stringify`) and deserialization (`JSON.parse`) pipelines to sync in-memory objects with physical files.
* **Data Masking via Replacers**: Implements a structural stringification algorithm to selectively mask sensitive fields (email anonymization) during database exports.
* **Defensive Exception Handling**: Uses structured `try...catch` blocks to capture structural file corruptions, preventing crashes by supplying automatic fallback defaults.

## 🛠️ OOP & Software Engineering Concepts Practiced

* **Class Instantiation**: Constructing reusable code models via `class` syntax and tracking instances using dynamic workspace properties (`this.filePath`).
* **Encapsulation**: Restricting direct access to low-level processes (like raw text parsing) by bundling them behind safe public method interfaces (like `.addUser()` or `.deleteUser()`).
* **Advanced Data Manipulation**: Utilizing structural array iterations (`.filter()`, `.find()`, `.some()`, and `.forEach()`) to handle runtime modifications in-place.
* **Deterministic File Paths**: Utilizing Node.js system variables like `__dirname` alongside the `path` module to ensure absolute file indexing across different operating systems.

## 🚀 Execution Instructions

To test the engineering modules inside this laboratory, navigate to the specific sub-folder in your terminal and execute via Node.js:

```bash
# Navigate to the JSON local database implementation
cd JSON-Local-Database

# Run the engine track
node app.js
```
