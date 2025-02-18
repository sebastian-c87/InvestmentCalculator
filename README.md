# 📌 Investment Calculator
**A simple Java + Spring Boot project for calculating investment returns**

## 🚀 Project Description
Investment Calculator is a backend application built with **Java + Spring Boot**, allowing users to calculate investment returns based on provided parameters.

## 🛠 Technologies Used
- **Java 17**
- **Spring Boot**
- **Gradle**
- **REST API**
- **Postman (for testing)**

## 📄 Features
- ✅ Calculate investment returns (based on initial amount, duration, and interest rate)
- ✅ REST API with GET and POST operations
- ✅ API testing using **Postman**

## 🔧 Installation & Running the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/investment-calculator.git
   ```
2. Navigate to the project folder:
   ```bash
   cd investment-calculator
   ```
3. Run the application locally:
   ```bash
   ./gradlew bootRun
   ```
4. The application will start on **port 8080**

## 🔄 API Testing (Postman)
Example requests:

### 1️⃣ Investment Calculation
**POST /api/investment/calculate**
#### 🔹 Sample Request:
```json
{
  "amount": 10000,
  "interestRate": 5,
  "years": 10
}
```
#### 🔹 Sample Response:
```json
{
  "finalAmount": 16288.95
}
```

## 🏰 Future Plans
- ✅ Add API documentation
- ✅ Store investment data in a database
- ✅ Build a frontend interface (React / Vue)
