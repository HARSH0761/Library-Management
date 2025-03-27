# Library-Management
This is a Java-based Library Management System to add, view, search, update, and delete books with attractive interface.  
--------------------------------------------------------------------------------------------------------------------------------------------------
Challenge:
1.Ensuring that only valid book details are accepted, such as non-empty strings for title/author and a status restricted to Available or Checked Out.
2.Handling cases where the user inputs invalid or empty values 
Solution:
1,Added validation checks to restrict the status input to only Available or Checked Out.
2.Displayed clear error messages when invalid data was entered.

Challenge:
1.Implementing a flexible search that works with both ID and title.
2.Ensuring that partial matches or case sensitivity don't create issues.
Solution:
1,Used a loop with .equalsIgnoreCase() to make the search case-insensitive, enhancing user-friendliness.
2.Displayed a message if no matching book was found, preventing silent failures.

Challenge:

1.Ensuring the program correctly finds the target book when updating or deleting.
2.Avoiding accidental deletion of multiple books with the same title.
Solution:
1.Used List.removeIf() with book ID as the key to ensure only the specified book is deleted.
2.Displayed a confirmation message to indicate whether the operation was successful or not.

-------------------------------------------------------------------------------------------------------------------------------------------------------

User Authentication
Improvement:
1.Add user authentication with login credentials for librarians.
2.Allow different access levels (e.g., admin vs. regular user).
Benefit:
1.Enhanced security and restricted access.
2.Prevents unauthorized modifications.

Improvement:
1.Instead of using a text-based console, I would create a Graphical User Interface (GUI) using Java Swing or JavaFX.
2.The GUI would have buttons, text fields, and a table view to make it more user-friendly and visually appealing.
Benefit:
1.Easier navigation with clickable buttons instead of console-based commands.
2.Better presentation of book details in a table format with sorting and filtering options.

Improvement:

1.Instead of storing book data in memory (which is lost when the program closes), I would use a relational database like MySQL or MongoDB.
2.Each book entry would be stored as a record in a table, making the data permanent.
Benefit:
1.Data persistence: Books remain in the catalog even after the program is closed.
2.Faster searching and sorting using SQL queries.

-------------------------------------------------------------------------------------------------------------------------------------------------------------
Run Instructions-
1. Upload the given .java file in VS CODE or any other online compiler.
2. Ensure the compiler supports the symbols included within the library management system interface for best experience.
