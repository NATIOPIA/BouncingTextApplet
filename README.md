# BouncingTextApplet

**Project Name:** BouncingTextApplet  
**Course:** Java Programming – Chapter 2 Challenge: Applet Archaeologist  
**Student:** Natnael Tsedeke  
**Student ID:** RMNS/7783-/23  
**University:** Dilla University  
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

BouncingTextApplet – Critical Analysis

Student Name: Natnael Tsedeke
Student ID: RMNS/7783-/23
Course: Java Programming
Instructor: Mr. Yared
University: Dilla University
Department: Computer Science

---

1. Security

Based on the "sandbox" model, an applet would NOT be allowed to:

   a) Access or modify files on your local computer without explicit permission.  
   b) Open network connections to arbitrary computers or servers other than the one it was downloaded from.

---

2. Modern Replacement

Java Applets have been completely replaced by modern web technologies such as:

   - HTML
   - CSS
   - JavaScript

Example: Creating a simple bouncing text animation using these technologies:

```html
<!DOCTYPE html>
<html>
<head>
  <style>
    #bouncingText {
      position: absolute;
      left: 0;
      top: 50px;
      font-size: 24px;
    }
  </style>
</head>
<body>
  <div id="bouncingText">Hello, Natnael!</div>

  <script>
    const text = document.getElementById('bouncingText');
    let pos = 0;
    const speed = 2;
    const width = window.innerWidth;

    function animate() {
      pos += speed;
      if (pos > width) pos = -text.offsetWidth;
      text.style.left = pos + 'px';
      requestAnimationFrame(animate);
    }

    animate();
  </script>
</body>
</html>


Legacy

Even though applets are deprecated, it is important for developers to know about them because:

They provide historical context on how Java was used in web applications.

Understanding legacy technologies helps when maintaining or migrating old systems.

Concepts like threading, GUI rendering, and sandbox security learned from applets are still applicable in modern programming.


---

### **How to Add to Git**

1. Save this as `README.txt` in your project root.  
2. Stage and commit:

```cmd
git add README.txt
git commit -m "Add Critical Analysis README.txt"

Push to GitHub:
git push

