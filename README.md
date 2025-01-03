# IPL Player Management System

The **IPL Player Management System** is a simple Java application designed to manage information about IPL players. It allows users to perform CRUD (Create, Read, Update, Delete) operations on player data through a menu-driven interface.

---

## Features

- **Add Players**: Add new players to the system with details like ID, name, team, role, runs, and wickets.
- **View All Players**: Display a list of all players in the system.
- **View Individual Player**: Fetch and display details of a specific player by their ID.
- **Update Player Stats**: Update the runs and wickets of a specific player.
- **Menu-Driven Interface**: User-friendly navigation to perform various operations.
- **Pre-Loaded Players**: The application comes with a few pre-loaded players for demonstration.

---

## Technology Stack

- **Programming Language**: Java
- **Structure**: Model-View-Controller (MVC) design pattern

---

## How It Works

1. **Model**:
   - `Player`: Represents a player with attributes like ID, name, team, role, runs, and wickets.

2. **View**:
   - `PlayerView`: Handles all interactions with the user, such as displaying data and messages.

3. **Controller**:
   - `PlayerController`: Manages the flow of data between the view and model. It handles player management operations like add, display, and update.

4. **Main**:
   - The `Main` class initializes the system and provides a menu-driven interface for user interaction.

---

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone <repository_url>
