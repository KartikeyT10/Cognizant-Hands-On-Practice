# Hands-on: Creating Microservices for Account and Loan

## Problem Statement

Create two independent Spring Boot REST microservices for a banking application:

- **Account Microservice**
- **Loan Microservice**

Each microservice runs as a separate Maven project and exposes its own REST API.

---

# Account Microservice

## Account.java

```java
package com.cognizant.account.model;

public class Account {

    private String number;
    private String type;
    private double balance;

    public Account(String number, String type, double balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }
}
```

## AccountController.java

```java
package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number) {

        return new Account(
                number,
                "Savings",
                234343
        );
    }
}
```

### API Details

| Method | Endpoint |
|---------|----------|
| GET | `/accounts/{number}` |

### Sample Request

```text
http://localhost:8080/accounts/00987987973432
```

### Sample Response

```json
{
    "number": "00987987973432",
    "type": "Savings",
    "balance": 234343
}
```

---

# Loan Microservice

## application.properties

```properties
server.port=8081
```

## Loan.java

```java
package com.cognizant.loan.model;

public class Loan {

    private String number;
    private String type;
    private double loan;
    private int emi;
    private int tenure;

    public Loan(String number, String type,
                double loan, int emi, int tenure) {

        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getLoan() {
        return loan;
    }

    public int getEmi() {
        return emi;
    }

    public int getTenure() {
        return tenure;
    }
}
```

## LoanController.java

```java
package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Loan getLoan(@PathVariable String number) {

        return new Loan(
                number,
                "Car",
                400000,
                3258,
                18
        );
    }
}
```

### API Details

| Method | Endpoint |
|---------|----------|
| GET | `/loans/{number}` |

### Sample Request

```text
http://localhost:8081/loans/00987987972342
```

### Sample Response

```json
{
    "number": "00987987972342",
    "type": "Car",
    "loan": 400000,
    "emi": 3258,
    "tenure": 18
}
```

---

## Observation

- Account and Loan are implemented as two independent Spring Boot microservices.
- Each microservice has its own Maven project and REST controller.
- Account Microservice runs on port **8080**.
- Loan Microservice runs on port **8081** to avoid port conflicts.
- Both services return dummy JSON responses without database connectivity.
- Microservices can be developed, deployed, and scaled independently.
