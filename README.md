# OOP

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Language](https://img.shields.io/badge/language-Java%20✨-blue)](https://www.java.com)

A comprehensive collection of **Object-Oriented Programming** examples, exercises, and design patterns implemented in **Java** (with plans to support more languages in the future).

Perfect for learning, teaching, or preparing for technical interviews!

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation / Setup](#installation--setup)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Core OOP Concepts](#core-oop-concepts)
- [Design Patterns Implemented](#design-patterns-implemented)
- [Future Plans](#future-plans)
- [Contributing](#contributing)
- [License](#license)

## Overview

This repository demonstrates fundamental and advanced Object-Oriented Programming concepts using clean, modern **Java**.  
Each concept comes with clear explanations, real-world analogies, and executable examples.

Ideal for:
- Students learning OOP
- Developers switching to Java
- Interview preparation (system design & OOP questions)

## Features

- Clean, heavily commented Java code
- Progressive difficulty (beginner → advanced)
- Real-world use cases and analogies
- Full implementation of the 23 Gang of Four (GoF) design patterns
- Ready-to-run examples (no build tool required for most)

## Installation / Setup

```bash
git clone https://github.com/your-username/oop.git
cd oop
```

Most examples can be run directly with `javac` + `java`.  
For larger examples using packages:

```bash
# From the root of the repo
javac design_patterns/factory/*.java
java design_patterns.factory.Main
```

(Optional) Use your favorite IDE (IntelliJ IDEA, Eclipse, VS Code) – just open the folder and run!

## Project Structure

```
oop/
├── basics/
│   ├── encapsulation/
│   ├── inheritance/
│   ├── polymorphism/
│   └── abstraction/
├── design-patterns/
│   ├── creational/
│   ├── structural/
│   └── behavioral/
├── exercises/
├── solid-principles/
└── README.md
```

## Core OOP Concepts

- **Encapsulation** – Data hiding & bundling
- **Inheritance** – Code reuse with `extends`
- **Polymorphism** – Method overriding & interfaces
- **Abstraction** – Abstract classes & interfaces

## Design Patterns Implemented

| Category       | Patterns                                                                 |
|----------------|--------------------------------------------------------------------------|
| Creational     | Singleton, Factory Method, Abstract Factory, Builder, Prototype         |
| Structural     | Adapter, Bridge, Composite, Decorator, Facade, Proxy, Flyweight         |
| Behavioral     | Observer, Strategy, Command, State, Template Method, Iterator, Memento, Visitor, Chain of Responsibility, Mediator, Interpreter |

Each pattern includes:
- UML diagram (in comments or separate `.md`)
- Problem it solves
- Java implementation
- Usage example

## Future Plans

- Add Python, C++, and TypeScript versions
- Include unit tests (JUnit)
- Add visual UML diagrams
- Create interactive exercises

## Contributing

Contributions are very welcome!  
Whether you want to:
- Add a new design pattern
- Improve explanations
- Port examples to another language
- Fix typos or bugs

Just fork → make changes → open a PR!  
(Feel free to open an issue first for big changes)

## License

This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.

---

Happy coding & happy learning!  
Java + OOP = ❤️
