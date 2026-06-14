# How to Upload NayePankh Project to GitHub

## Step 1: Create a GitHub Account (if you don't have one)
- Go to https://github.com
- Sign up for a free account

## Step 2: Create a New Repository on GitHub

1. Log in to your GitHub account
2. Click on the **"+"** icon at the top right
3. Select **"New repository"**
4. Fill in the details:
   - **Repository name:** `NayePankh-Volunteer-Management`
   - **Description:** "A simple Java-based volunteer management system"
   - **Visibility:** Public (or Private if you prefer)
   - **Initialize with:** Leave unchecked (we'll push existing code)
5. Click **"Create repository"**

## Step 3: Install Git (if not already installed)

### For Windows:
- Download from https://git-scm.com/download/win
- Install with default settings

### For Mac:
```bash
brew install git
```

### For Linux (Ubuntu/Debian):
```bash
sudo apt-get install git
```

## Step 4: Upload Project to GitHub

### Option A: Using Command Line (Recommended for Beginners)

1. **Open Terminal/Command Prompt** in the NayePankh folder

2. **Initialize Git:**
```bash
git init
```

3. **Add all files:**
```bash
git add .
```

4. **Create first commit:**
```bash
git commit -m "Initial commit: Add NayePankh Volunteer Management System"
```

5. **Add remote repository:** (Replace USERNAME with your GitHub username)
```bash
git remote add origin https://github.com/USERNAME/NayePankh-Volunteer-Management.git
```

6. **Rename branch to main (if needed):**
```bash
git branch -M main
```

7. **Push to GitHub:**
```bash
git push -u origin main
```

8. **When prompted, enter your GitHub credentials:**
   - Username: Your GitHub username
   - Password: Your GitHub personal access token (see Step 5)

### Step 5: Create GitHub Personal Access Token (for authentication)

1. Go to GitHub Settings: https://github.com/settings/tokens
2. Click **"Generate new token"**
3. Give it a name like "git-upload"
4. Select scopes:
   - ✅ repo (all)
   - ✅ workflow
5. Click **"Generate token"**
6. **Copy and save the token** (you won't see it again!)
7. Use this token as your password when pushing to GitHub

### Option B: Using GitHub Desktop (GUI - Even Easier)

1. **Download GitHub Desktop:** https://desktop.github.com
2. **Install and sign in** with your GitHub account
3. **Create a new repository:**
   - Click "Create a new repository"
   - Name: `NayePankh-Volunteer-Management`
   - Local path: Select your NayePankh folder
   - Click "Create Repository"
4. **Commit and Push:**
   - Make changes appear in GitHub Desktop
   - Click "Commit to main"
   - Add message: "Initial commit: Add volunteer management system"
   - Click "Push to origin"
5. **Done!** Your code is now on GitHub

## Step 6: Verify Upload

1. Go to your repository URL: `https://github.com/USERNAME/NayePankh-Volunteer-Management`
2. You should see all your files displayed
3. README.md will be displayed as the main description

## Common Git Commands for Future Updates

```bash
# Check status
git status

# Add changes
git add .

# Commit with message
git commit -m "Your message here"

# Push to GitHub
git push origin main

# Pull latest changes
git pull origin main
```

## Directory Structure on GitHub

After uploading, your GitHub repository should look like:
```
NayePankh-Volunteer-Management/
├── src/
│   ├── Volunteer.java
│   ├── VolunteerManager.java
│   └── VolunteerManagementUI.java
├── README.md
├── GITHUB_UPLOAD_INSTRUCTIONS.md
└── .gitignore (optional)
```

## Optional: Add .gitignore file

Create a `.gitignore` file in the root folder to exclude unnecessary files:

```
# Compiled class files
*.class

# Package files
*.jar
*.war

# IDE files
.idea/
*.iml
.vscode/

# OS files
.DS_Store
Thumbs.db

# Data files (optional - remove if you want to track volunteers.txt)
volunteers.txt
```

## Troubleshooting

**Problem:** "fatal: not a git repository"
- **Solution:** Run `git init` first

**Problem:** "fatal: Authentication failed"
- **Solution:** Use personal access token instead of password

**Problem:** "fatal: remote origin already exists"
- **Solution:** Run `git remote remove origin` then add the remote again

**Problem:** "rejected - non-fast-forward"
- **Solution:** Pull first: `git pull origin main` then push

## Additional Resources

- GitHub Guide: https://guides.github.com
- Git Documentation: https://git-scm.com/doc
- GitHub Help: https://docs.github.com

---

**Happy coding! 🚀**
