# Requirements

**Requirements for the Music Store Application**

Develop a simple console-based music store application using Java that allows users to manage and interact with a collection of music tracks. The application should include basic functionalities such as adding, viewing, searching, and updating music information.

### **Functional Requirements**

1. **Music Information Management**
    - The application should store details for each music track, including:
        - **Title**: The name of the music track (String).
        - **Author**: The artist or band that created the music (String).
        - **Listeners**: The number of times the music track has been played (Integer).
        - **Genre**: The category or style of the music, e.g., Pop, Indie, R&B (String).
        - **Likes**: The number of likes the music track has received (Integer).
2. **Music Database Initialization**
    - The application should have a small preloaded database with sample music tracks when it starts.
3. **Add New Music**
    - Users should be able to add a new music track by providing:
        - Title
        - Author
        - Listeners count
        - Genre
        - Likes count
    - The newly added music track should be stored in the application’s database.
4. **Display All Music**
    - Users should be able to view a list of all music tracks with their details, displayed in a user-friendly format.
5. **Search for Music**
    - Users should be able to search for music based on:
        - **Title**
        - **Author**
        - **Genre**
    - The application should display all matching results or a message indicating no results were found.
6. **Update Likes**
    - Users should be able to update the number of likes for a specific music track by providing its title.
7. **Exit the Program**
    - Users should be able to exit the application gracefully.

### **Non-Functional Requirements**

1. **Ease of Use**
    - The application should provide a clear and intuitive menu for navigating functionalities.
2. **Data Consistency**
    - The application should ensure that all data entered by the user is appropriately validated and stored consistently.
3. **Performance**
    - The system should handle a reasonable number of music tracks efficiently without noticeable delays.
4. **Reliability**
    - The application should handle invalid input gracefully, providing helpful error messages and allowing the user to retry.

### **Constraints**

1. The application should be built using **basic Java features** and avoid the use of advanced object-oriented programming concepts like custom classes.
2. Data should be stored in **`ArrayLists`**, and no external database should be used.
3. The application should run in the **console/terminal** without any graphical user interface (GUI).
