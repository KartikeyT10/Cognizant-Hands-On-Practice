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
