# Elevator-Project
### Elevator Project Description

The **Elevator Project (2021)** is a Java-based simulation designed to model an elevator system with user authentication and movement control. It consists of two main components: `Elevator.java`, which manages user settings and permissions, and `Elevator_move.java`, which handles the elevator's movement logic.

#### **Key Features**
1. **User Management System** (`Elevator.java`):
   - Allows users to register with a username and ID.
   - Users can define their accessible floors.
   - Provides options to add, edit, or remove floors for each user.
   - Supports user deletion.

2. **Elevator Movement Control** (`Elevator_move.java`):
   - The elevator can move **up** or **down** based on user commands.
   - Users must input their ID to request an elevator trip.
   - The system verifies if the user has permission to access the requested floor.
   - Prevents incorrect movement (e.g., going **up** when the requested floor is lower).
   - Displays real-time floor transition with delays to simulate elevator travel.

#### **Technical Details**
- Uses **LinkedList** for storing user data and floor permissions.
- Implements **switch-case** structures for menu-driven user interaction.
- **Thread.sleep()** is used to simulate the elevator's real-time movement.
- Input validation ensures that only registered users can operate the elevator.

This project is a functional simulation that emphasizes **user permissions, real-time interactions, and logical movement constraints**, making it a useful learning tool for object-oriented programming and system simulation.
