# Hands-on: Creating Microservices for Account and Loan

## Problem Statement

Create two independent Spring Boot REST microservices for a banking application:

- **Account Microservice**
- **Loan Microservice**

Each microservice runs as a separate Maven project and exposes its own REST API.

---

# Account Microservice

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
