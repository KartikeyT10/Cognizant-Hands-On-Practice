# Hands-on 4: Difference between JPA, Hibernate and Spring Data JPA

## Objective

Understand the differences between JPA, Hibernate, and Spring Data JPA, and compare how data persistence is implemented using Hibernate and Spring Data JPA.

## Comparison

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| Java Persistence API (Specification) | ORM framework that implements JPA | Framework built on top of JPA |
| Defines standard persistence APIs | Provides actual implementation | Reduces boilerplate code |
| Not an ORM tool | Manages object-relational mapping | Simplifies database operations using repositories |
| Vendor-independent | Popular JPA implementation | Works with JPA providers such as Hibernate |

## Key Differences

- JPA is only a specification and does not provide an implementation.
- Hibernate is a popular ORM framework that implements JPA.
- Spring Data JPA sits on top of JPA and minimizes the amount of code required.
- Spring Data JPA automatically provides CRUD operations through JpaRepository.
- Transaction management is handled easily using the @Transactional annotation.

## Observation

Hibernate requires manual session and transaction management, resulting in more code. Spring Data JPA simplifies development by providing repository interfaces and built-in CRUD methods, making applications easier to develop and maintain.
