# CheckDate Java Program
This Java program allows users to input a date and provides information about the date, including the next and previous days.

## Table of Contents
- [Description](#description)
- [Features](#features)
- [How to Use](#how-to-use)
- [Input Validation](#input-validation)
- [Date Handling](#date-handling)
- [Example](#example)
- [Example Output](#example-output)
- [Contributing](#contributing)
- [License](#license)

## Description
The `CheckDate` Java program takes user input for a specific date (day, month, and year) and provides details such as the next day, the day after tomorrow, yesterday, and the day before yesterday. It handles leap years and validates the input for correctness.

## Features
- Date input validation
- Handling of leap years
- Displaying information about the input date and surrounding dates

## How to Use
1. Clone the repository to your local machine.
```bash
   git clone https://github.com/FaceND/CheckDate.git
```
2. Compile the Java program using your preferred IDE or command line.
3. Run the compiled program.
4. Follow the on-screen instructions to input the date.

## Input Validation
The program checks for valid input. It ensures that the day is between 1 and 31, the month is between 1 and 12, and the year is a positive number.

## Date Handling
The program considers leap years when determining the last day of February.

## Example
```java
// Example usage of the CheckDate program
public class Main {
    public static void main(String[] args) {
        CheckDate dateChecker = new CheckDate();
        dateChecker.printDate();
    }
}
```

## Example Output
Here's an example of the output for the input `1` for day, `1` for month, and `2023` for year.
```
--------------| Date |--------------

Today 1/1/2023 
Tomorrow 2/1/2023 
Yesterday 31/12/2022 
The day before Yesterday 30/12/2022 
The day after Tomorrow 3/1/2023 

------------------------------------
```
## Contributing
Feel free to contribute to the project by submitting bug reports, feature requests, or even pull requests. Your feedback is highly appreciated!

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
