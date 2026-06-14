# NayePankh Volunteer Management System

A simple Java-based volunteer management application with a GUI built using Swing.

## Features
✅ Add Volunteer - Add new volunteers with their details  
✅ View Volunteers - View all registered volunteers  
✅ Search Volunteer by Name - Search for volunteers by their name  
✅ Save Data to Text File - Automatically saves data to `volunteers.txt`  

## Project Structure
```
NayePankh/
├── src/
│   ├── Volunteer.java              (Volunteer data class)
│   ├── VolunteerManager.java        (Business logic & file operations)
│   └── VolunteerManagementUI.java   (Swing GUI)
├── README.md
└── volunteers.txt                   (Auto-generated data file)
```

## Requirements
- Java 8 or higher
- No external dependencies (uses only built-in Java libraries)

## How to Compile and Run

### Using Command Line

**1. Compile all Java files:**
```bash
cd src
javac *.java
```

**2. Run the application:**
```bash
java VolunteerManagementUI
```

### Using IDE (Eclipse, IntelliJ, etc.)
1. Create a new Java project
2. Copy the `src` folder contents into the project
3. Run `VolunteerManagementUI.java` as Java Application

## How to Use the Application

1. **Add Volunteer:**
   - Fill in all fields (Name, Email, Phone, Address)
   - Click "Add Volunteer" button
   - Volunteer will be added and saved to file

2. **View All Volunteers:**
   - Click "View All" button
   - All registered volunteers will be displayed

3. **Search Volunteer:**
   - Enter the name in "Search Name" field
   - Click "Search" button
   - Matching volunteers will be displayed

4. **Clear:**
   - Click "Clear" button to clear all input fields

## Data Storage
- Volunteers are automatically saved to `volunteers.txt` file
- Format: `Name|Email|Phone|Address`
- Data persists even after closing the application
- File is created automatically in the same directory where you run the application

## Technologies Used
- **Language:** Java
- **GUI Framework:** Swing (javax.swing)
- **Data Structure:** ArrayList
- **File I/O:** BufferedReader, BufferedWriter
- **Concepts:** OOP (Classes, Objects, Encapsulation)

## Notes
- Simple and easy-to-understand code
- No exception handling (as per requirements)
- No advanced data structures used
- Basic Swing GUI - beginner-friendly
- Perfect for learning Java fundamentals

## Future Enhancements
- Add Delete volunteer feature
- Add Update volunteer details
- Add sorting by different fields
- Add data validation
- Add date of joining
- Generate volunteer reports
