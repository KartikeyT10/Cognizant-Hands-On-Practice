# Hands-on 10: React JSX

## Problem Statement

Create a React application named **officespacerentalapp** using JSX.

The application should:

- Display a heading.
- Display an office image.
- Display office details such as Name, Rent and Address.
- Use JSX expressions.
- Apply conditional CSS to Rent.
- Show Rent in **Red** if it is below **60000**, otherwise **Green**.

---

## Prerequisites

- Node.js
- npm
- Visual Studio Code

---

## Project Structure

`	ext
src
¦
+-- App.js
+-- App.css
+-- office.jpg
`

> Place any office image inside the **src** folder and name it **office.jpg**.

---

## Run the Application

Install dependencies:

`ash
npm install
`

Run the project:

`ash
npm start
`

Open:

`	ext
http://localhost:3000
`

---

## Expected Output

`
Office Space , at Affordable Range

[Office Image]

Name : DBS
Rent : Rs. 50000     (Red)
Address : Chennai

[Office Image]

Name : Regus
Rent : Rs. 75000     (Green)
Address : Bangalore

[Office Image]

Name : WeWork
Rent : Rs. 55000     (Red)
Address : Hyderabad
`

---

## JSX Concepts Used

- JSX syntax
- JavaScript expressions using \{ }\
- Rendering objects
- Rendering arrays using \map()\
- Conditional CSS using the ternary operator
- Importing images in React
- \className\ instead of \class\
- Component-based rendering

---

## Observation

- JSX allows HTML-like syntax inside JavaScript.
- JavaScript expressions are written inside \{}\.
- \map()\ is used to display multiple office objects.
- Conditional rendering is achieved using the ternary operator.
- CSS classes are applied dynamically based on the office rent value.
