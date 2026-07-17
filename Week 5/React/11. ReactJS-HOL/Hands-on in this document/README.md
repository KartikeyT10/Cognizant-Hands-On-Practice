# Hands-on 11: React Event Handling

## Problem Statement

Create a React application named **eventexamplesapp** to demonstrate React event handling.

The application should:

- Increase and decrease a counter.
- Display alert messages using button click events.
- Demonstrate multiple event handlers.
- Handle form input events.
- Convert Euro to Indian Rupees.

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
+-- CurrencyConverter.js
`

---

## Run the Application

Install packages:

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

### Increment Button

- Counter increases by **1**
- Displays

`
Hello! Member1
`

---

### Decrement Button

- Counter decreases by **1**

---

### Say Welcome Button

Displays

`
welcome
`

---

### Click on Me Button

Displays

`
I was clicked
`

---

### Currency Converter

Input:

`
Amount : 80
Currency : Euro
`

Output:

`
Converting to Euro Amount is 6400
`

(Using conversion rate **1 Euro = ?80**)

---

## React Concepts Used

- Event Handling
- onClick Event
- onChange Event
- onSubmit Event
- Synthetic Events
- Arrow Functions
- useState Hook
- Controlled Components
- Form Handling
- Event Object (\preventDefault()\)

---

## Observation

- React events are called **Synthetic Events**.
- Event names use **camelCase** (\onClick\, \onSubmit\, \onChange\).
- Functions can be passed directly or through arrow functions.
- Multiple functions can be invoked from a single event.
- \preventDefault()\ prevents the default form submission behavior.
