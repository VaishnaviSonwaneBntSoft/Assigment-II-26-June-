# Assigment-II-26-June-
# Basic Calculation API

The Basic Calculation API is a Spring Boot application that provides endpoints to perform various mathematical calculations asynchronously using multithreading.

## Features

- **Square Calculation:** Calculates the square of a given number.
- **Cube Calculation:** Computes the cube of a given number.
- **Even or Odd Check:** Determines if a number is even or odd.
- **Prime Check:** Checks if a number is prime.
- **Armstrong Number Check:** Verifies if a number is an Armstrong number.
- **Palindrome Check:** Checks if a number is a palindrome.
- **Factorial Calculation:** Computes the factorial of a number.
- **Reverse Number:** Reverses the digits of a number.

## Prerequisites

- Java Development Kit (JDK) installed
- Maven or Gradle installed
- Text editor or Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse

## Setup

1. Clone the repository or download the ZIP file.
   ```bash
   git clone <repository_url>
2. Navigate to the project directory:
   cd basic-calculation-api
3. Build the project using Gradle:
   ./gradlew build
4.  Run the application

## Usage

1.The API exposes the following endpoint for calculations:

POST /api/calculator/calculate/{number}

Performs all the above calculations for the provided {number} asynchronously using multithreading.

Request:
Method: POST
Path: /api/calculator/calculate/{number}
Path Parameters:
{number}: The integer number (max 4 digits) for which calculations are to be performed.
Response:
HTTP Status 200 OK on success with a JSON response containing calculation results.
HTTP Status 500 Internal Server Error on failure.

2.Example usage:

Send a POST request to perform calculations:
curl -X POST http://localhost:8080/api/calculator/calculate/1234
Replace 1234 with the desired number for calculations.

3.Logging:
The application logs calculation requests and results using SLF4J with logback.
Logs can be found in the console or configured to write to a file for production use.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Authors
Vaishnavi Sonwane (@VaishnaviSonwaneBntSoft)

### Explanation:

- **Structure:** The README.md file is structured into sections for clarity:
  - **Title and Introduction:** Clearly states the purpose of the application and its key features.
  - **Prerequisites:** Lists the software required to run the application.
  - **Setup:** Provides step-by-step instructions for cloning, building, and running the application using Maven.
  - **Usage:** Explains how to use the API endpoint for calculations, including example usage with curl.
  - **Logging:** Mentions logging using SLF4J with logback for monitoring and debugging.
  - **Contributing:** Encourages contributions and provides guidance on how to contribute to the project.
  - **License:** States the license under which the project is distributed.
  - **Authors:** Provides attribution to the project author(s) or contributors.
