# Java CLI Financial Tracker

A simple, command-line Java application that helps you track financial transactions including deposits and payments. The application reads and writes to a CSV file and provides a user-friendly menu interface to manage and view your financial data.

## Features

- 📥 Add new deposits and payments
- 📃 View full transaction ledger
- 📈 Generate financial reports:
  - Deposits only
  - Payments only
  - Custom search by vendor
- 💾 All transactions are stored in a CSV file for easy data persistence and portability

## Technologies Used

- Java 17+
- File I/O
- Scanner for user input
- Exception handling
- OOP principles (modular classes)

## Getting Started

### Prerequisites

- Java SDK 17 or newer installed
- A Java IDE (like IntelliJ, Eclipse) or terminal with `javac`/`java` support

### File Structure

 ```bash
- ├── Transaction.java    # Model class for financial transactions
├── Ledger.java         # Handles transaction storage and filtering
├── transactions.csv    # Automatically created data file
└── README.md           # Project documentation
 ```
### Example Menu

 ```bash
         |Home|
|Please choose a Option|
D) Add Deposit
P) Make Payment (Debit)
L) Ledger
X) Exit

Enter:
 ```

### Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-financial-tracker.git
   cd java-financial-tracker
   ```
Made with ☕ by Preston Panom App dev track at Year Up United
