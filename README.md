# App Demo Projects

This repository contains a collection of demo applications showcasing various Android development concepts and best practices. Each project is designed to provide a hands-on understanding of key components and patterns used in modern Android development.

---

## Projects Overview

### 1. **LiveData**
- **Description**: Demonstrates the use of `LiveData` to observe and react to changes in data in a lifecycle-aware manner.
- **Use Case**: Ideal for scenarios where UI components need to react to changes in underlying data, such as updating a list or reflecting user preferences dynamically.

---

### 2. **MVVM - Expense Tracker**
- **Description**: Implements the Model-View-ViewModel (MVVM) architecture in an expense tracker app.
- **Use Case**: Learn how to structure your app for better separation of concerns, maintainability, and scalability.
- **Features**:
  - Add, delete, and view expenses.
  - Integration with `RoomDB` for persistent storage.
  - `ViewModel` for managing UI-related data.
  - `LiveData` for observing database changes.

---

### 3. **ViewModel**
- **Description**: A simple app showcasing how to use `ViewModel` to store and manage UI-related data across configuration changes.
- **Use Case**: Perfect for understanding how to handle device rotations and lifecycle-related challenges without losing data.

---

### 4. **RoomDB**
- **Description**: Demonstrates the use of `RoomDB` for local database storage.
- **Use Case**: Suitable for learning how to store, retrieve, and manage structured data locally within the app.

---

### 5. **Repository Pattern**
- **Description**: A project showcasing the Repository Pattern for managing data sources.
- **Use Case**: Understand how to abstract data access logic, making it easier to swap between different data sources (e.g., local database, network API).

---

### 6. **DiffUtil**
- **Description**: Demonstrates the use of `DiffUtil` for efficiently updating RecyclerView data.
- **Use Case**: Learn how to optimize RecyclerView updates by calculating and applying differences between old and new datasets.

---

### 7. **Retrofit**
- **Description**: A simple app integrating `Retrofit` to perform network operations.
- **Use Case**: Understand how to fetch, post, or update data from a remote API and parse responses.

---

### 8. **Cache**
- **Description**: Demonstrates caching techniques for offline data handling.
- **Use Case**: Learn how to implement caching mechanisms to provide a seamless user experience even when the app is offline.

---

## Purpose
These demo applications are designed for:
- **Beginners**: To understand and practice core Android development concepts.
- **Experienced Developers**: To explore best practices and architectural patterns.
- **Reference**: As a starting point for integrating these concepts into your own projects.

Each project is well-documented to help you quickly understand the implementation and its use case. Explore the projects to strengthen your Android development skills!

