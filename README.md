# BouncingTextApplet

**Project Name:** BouncingTextApplet  
**Course:** Java Programming – Chapter 2 Challenge: Applet Archaeologist  
**Author / Student:** Natnael Tsedeke  
**Student ID:** RMNS/7783-/23  
**University / College:** Dilla University  
**Department:** Computer Science  
**Instructor:** Mr. Yared  

---

## **Project Description**

BouncingTextApplet is a simple Java Applet project designed for educational purposes. The applet displays a string (your name) that moves horizontally across the applet window. This project helps students explore deprecated Java applet technology using the `appletviewer` tool and practice animation with threads.

---

## **Features**

- Extends `Applet` and implements `Runnable`.
- Animates text by updating the x-coordinate in a separate thread.
- Resets text position when it reaches the right edge of the window.
- Uses `Thread.sleep()` to control animation speed.
- Customizable applet size, background color, and displayed text.

---

## **Installation / Running**

1. Ensure Java JDK is installed (Java 8 recommended).  
2. Open the project in NetBeans or any Java IDE.  
3. Compile the Java source file:

```bash
javac src/BouncingTextApplet.java
Run the applet using appletviewer:

File Structure
BouncingTextApplet/
│
├── src/                     # Java source code
│   └── BouncingTextApplet.java
│
├── .gitignore               # Git ignore file
├── README.md                # Project description



---

### **How to Add README.md to Git**

1. Save the above content as `README.md` in your project root.  
2. Stage and commit it:

```cmd
git add README.md
git commit -m "Add full README with personal information"

Push to GitHub:
git push -u origin master
