## PHASE 0 : Absolute Basics(Foundation of Logic)
🎯 Understand what an array really is

### **Concepts:**
#### What is an array really is
  - **Definition:** An **array** stores multiple values of the same data type in contiguous memory locations.
  - **The Why:** Without arrays, if you wanted to store 100 student scores, you would have to create 100 different variables (score1, score2, etc.). With an array, you just create one variable: `scores[100]`.
    - Why arrays exist?</br>
      Without arrays:
        ```java
        int a = 10;
        int b = 20;
        int c = 30;
        ```
      With an array:
        ```java
        int[] arr = {10, 20, 30};
        ```
      Benefits:
        - ✔ Cleaner
        - ✔ Easier looping
        - ✔ Better logic building
      
#### Indexing(0 based)
  - Arrays are indexed starting from 0.
  - first element -> index 0
  - last element -> length - 1
    ```java 
    int[] arr = {10, 20, 30, 40};
    System.out.println(arr[0]); // 10
    System.out.println(arr[3]); // 40
    
    // ⚠️ arr[4] → ❌ ArrayIndexOutOfBoundsException

#### Memory representation
  - Arrays are stored in contiguous memory locations, each with a specific index.
    ```java
    Index:   0    1    2    3
    Value:  10   20   30   40
    Memory: [ ][ ][ ][ ]
  - All elements stored contiguously
  - Fast access → O(1)

#### Difference between array and variable

| Feature | Variable | Array |
| --- | --- | --- |
| Capacity | Holds a single value. | Holds multiple values. |
| Memory | Can be anywhere in memory. | Must be in a continuous block. |
| Access | Accessed by a unique name. | Accessed by name + index number. |
| Data Type | Usually holds one type. | Holds multiple values of the same type. |

### Problems: Total problems = 6
1. [Input & Output array](InputOutputArray.java)
2. [Find Index of First & Last Element](IndexOfElements.java)
3. [Print array in forward and reverse](ForwardReverseArray.java)
4. [Sum & Average](SumAverageArray.java)
5. [Count even and odd Numbers](EvenOddArray.java)
6. [Count Positive, Negative & Zero](CountPositiveNegativeZeroArray.java)