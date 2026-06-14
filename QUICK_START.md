# Quick Start Guide

## For Windows Users

### Method 1: Using the run.bat file (Easiest)
1. Open Command Prompt or PowerShell in the NayePankh folder
2. Type and run:
   ```
   run.bat
   ```
3. The application will compile and launch automatically!

### Method 2: Manual Compilation
1. Open Command Prompt in the `src` folder
2. Type:
   ```
   javac *.java
   java VolunteerManagementUI
   ```

---

## For Mac/Linux Users

### Method 1: Using the run.sh file (Easiest)
1. Open Terminal in the NayePankh folder
2. Make the script executable:
   ```bash
   chmod +x run.sh
   ```
3. Run:
   ```bash
   ./run.sh
   ```
4. The application will compile and launch!

### Method 2: Manual Compilation
1. Open Terminal in the `src` folder
2. Type:
   ```bash
   javac *.java
   java VolunteerManagementUI
   ```

---

## For IDE Users (Eclipse, IntelliJ, NetBeans)

### Eclipse:
1. File → New → Java Project
2. Project name: `NayePankh`
3. Finish
4. Right-click on project → New → Folder → Name: `src`
5. Copy all `.java` files from the `src` folder into the `src` package
6. Right-click `VolunteerManagementUI.java` → Run As → Java Application

### IntelliJ:
1. File → New → Project
2. Choose "Java" → Next
3. Project name: `NayePankh`
4. Create
5. Right-click on `src` → Paste Java files here
6. Click on `VolunteerManagementUI.java` → Right-click → Run

---

## Using the Application

### Window Components:
- **Top Section:** Add New Volunteer form
- **Middle Section:** Action buttons (Add, View, Search, Clear)
- **Bottom Section:** Display area for results

### Step-by-Step Usage:

1. **Add a Volunteer:**
   - Enter Name, Email, Phone, and Address
   - Click "Add Volunteer"
   - You'll see a success message
   - Data is automatically saved to `volunteers.txt`

2. **View All Volunteers:**
   - Click "View All" button
   - All registered volunteers are displayed

3. **Search for a Volunteer:**
   - Enter a volunteer's name in the "Search Name" field
   - Click "Search"
   - Matching results are displayed

4. **Clear Everything:**
   - Click "Clear" to empty all input fields

---

## Data Storage

- All volunteer data is saved in `volunteers.txt`
- File is created automatically in the same directory
- Format: `Name|Email|Phone|Address`
- Data persists between application restarts

### Example volunteers.txt:
```
John Doe|john@email.com|9876543210|123 Main St
Jane Smith|jane@email.com|9123456789|456 Oak Ave
```

---

## Files Explained

| File | Purpose |
|------|---------|
| `Volunteer.java` | Stores volunteer data (name, email, phone, address) |
| `VolunteerManager.java` | Handles operations (add, search, view, save/load) |
| `VolunteerManagementUI.java` | User interface with Swing components |
| `README.md` | Complete project documentation |
| `GITHUB_UPLOAD_INSTRUCTIONS.md` | Guide to upload on GitHub |
| `run.bat` | Windows execution script |
| `run.sh` | Linux/Mac execution script |

---

## Troubleshooting

### Problem: "javac is not recognized"
- **Windows:** Java is not in your PATH
  - Download Java from https://www.oracle.com/java/technologies/downloads/
  - Install and add Java to PATH

- **Mac/Linux:** Install Java first
  ```bash
  brew install openjdk
  # or
  sudo apt-get install default-jdk
  ```

### Problem: "cannot find symbol"
- Make sure all three `.java` files are in the same folder
- Compile with: `javac *.java` (compiles all .java files)

### Problem: Application window doesn't appear
- Make sure Java is correctly installed
- Try running from command line instead of IDE

### Problem: "volunteers.txt" not found
- It will be created automatically on first save
- Make sure you have write permissions in the directory

---

## Next Steps

1. **Learn the code:** Read through each Java file to understand OOP concepts
2. **Modify the code:** Try adding new features
3. **Upload to GitHub:** Follow `GITHUB_UPLOAD_INSTRUCTIONS.md`
4. **Share with others:** Show your project to friends and get feedback

---

**Enjoy learning Java! 🎓**
