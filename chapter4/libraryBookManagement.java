// =============================================================
// PROBLEM 1: LIBRARY BOOK MANAGER
// =============================================================

// THE PROBLEM
// Write a program that manages books in a small library.

// Class Book
//   - title (String), author (String), isAvailable (boolean)
//   - a constructor taking title and author (a new book is available by default)
//   - issue(): marks the book as issued and returns true.
//     If it is already issued, it returns false.
//   - giveBack(): marks the book as available again
//   - display(): prints the title, author, and status

// Class Library
//   - Book[] books (size 10) and an int count
//   - addBook(Book b): adds a book if there is space
//   - searchByTitle(String t): returns the Book, or null if not found
//   - issueBook(String t): finds the book and issues it. Prints a message for
//     success, "already issued", or "not found".
//   - countAvailable(): returns how many books are currently available
//   - showAll(): shows every book

// In main: add 4 books, issue 2 of them, try to issue one twice, then print the
// available count.

// WHAT IT WANTS FROM YOU
// The object's state changes over time (available becomes issued). issueBook()
// must combine two steps: search the array, then change the object you found.
// Your methods must also handle the "not found" case safely, because
// searchByTitle can return null.

// SAMPLE OUTPUT
//   Issued: Java Basics
//   Sorry, Java Basics is already issued.
//   Book not found: Python Intro
//   Available books: 2

// HINT
// Compare strings with .equals(), not ==. Check if (b != null) before using the
// result of a search.



public class libraryBookManagement {
    
    
}
