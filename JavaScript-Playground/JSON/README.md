# 📁 Custom JSON Local CRUD Engine

A lightweight, local file-based database manager built with native Node.js modules to practice advanced JSON manipulation, data structures, and Object-Oriented Programming (OOP) concepts.

## 🚀 Key Features Implemented

* **Robust File I/O Management**: Abstracts complex parsing and serialization logic into atomic, reusable helper modules (`readData` and `writeData`).
* **Defensive Exception Handling**: Employs structural `try...catch` blocks to protect the runtime against file corruption, seamlessly resetting the database to a safe fallback array (`[]`).
* **Algorithmic Data Integrity**: 
  * Prevents duplicate data ingestion states using object properties lookup via `.some()`.
  * Implements dynamic in-place data updates via `.find()` and record filtering via `.filter()`.
  * Automatically re-indexes structural `id` values sequentially using array indexes upon record mutation.
* **Sensitive Data Masking**: Features a custom `JSON.stringify()` replacer algorithm to export user datasets with specific email anonymization patterns while retaining top-level data geometry.

## ⚙️ Core JSON Concepts Explored

1. **Serialization (`JSON.stringify`)**: Converting complex, in-memory JavaScript arrays and objects into compliant JSON strings for storage persistence.
2. **Deserialization (`JSON.parse`)**: Regenerating raw text streams from storage back into working memory-safe JavaScript structures.
3. **The Replacer Parameter**: Intercepting fields mid-serialization to mask personal information based on key evaluation.

## 🛠️ How to Run Locally

1. Stand in the root directory of this playground within your terminal.
2. Run the engine script:
   ```bash
   node app.js
   ```
3. Check the automatically generated `users.json` file to observe structural mutations in real time.
