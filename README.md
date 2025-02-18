# Module5-SortedStack
SortedStack program reads a list of integer numbers from user input and stores them in a Stack sorted in ascending order.
# SortedStack 

## Overview 
The **SortedStack** program is a Java application that reads a list of integers from user input, stores them in a **Stack**, and sorts them in ascending order using **Java's Collections Framework**.

## Features 
-  Reads integers interactively from user input.
-  Uses Java's **Stack** for dynamic storage instead of LinkedList.
-  Sorts numbers using **Collections.sort()**.
-  Runs directly from the command line without requiring an IDE.

---

## Installation & Usage 

###  **Compilation**
```sh
javac SortedStack.java
```

###  **Execution**
```sh
java SortedStack
```

###  **Input Instructions**
- Enter integers **one by one**.
- Type **"done"** (without quotes) when finished entering numbers.
- If you enter a **non-integer value**, the program will prompt for a valid input.

---

## Example Runs 

###  **Positive Test Cases**
#### **Test Case 1: Basic Sorting**
```sh
Enter integers (type 'done' to finish):
5
2
9
4
done
Sorted Numbers: [2, 4, 5, 9]
```

#### **Test Case 2: Including Negative Numbers**
```sh
Enter integers (type 'done' to finish):
-3
7
0
-1
5
done
Sorted Numbers: [-3, -1, 0, 5, 7]
```

#### **Test Case 3: Duplicates Included**
```sh
Enter integers (type 'done' to finish):
8
3
8
1
3
done
Sorted Numbers: [1, 3, 3, 8, 8]
```

---

###  **Negative Test Cases**
#### **Test Case 4: Invalid Input Handling**
```sh
Enter integers (type 'done' to finish):
10
abc
3
done
Invalid input. Please enter an integer or 'done' to finish.
Sorted Numbers: [3, 10]
```

#### **Test Case 5: Only Non-Numeric Inputs**
```sh
Enter integers (type 'done' to finish):
hello
world
done
Invalid input. Please enter an integer or 'done' to finish.
Sorted Numbers: []
```

---

## Code Highlights 
-  **Uses `Stack<Integer>`** from Java Collections instead of LinkedList.
-  **Uses `Collections.sort()`** for sorting, avoiding manual sorting logic.
-  **Utilizes `Scanner`** for dynamic user input.

---

## How to Run from the Command Line 

1. Open a **terminal** or **command prompt**.
2. Navigate to the directory containing `SortedStack.java`.
3. Compile the program using:
   ```sh
   javac SortedStack.java
   ```
4. Run the program using:
   ```sh
   java SortedStack
   ```

---

## How to Generate Javadoc 

1. Ensure that **JDK** is installed by running:
   ```sh
   java -version
   ```
2. Generate documentation using:
   ```sh
   javadoc -d docs SortedStack.java
   ```
3. Open `docs/index.html` in a web browser to view the documentation.
