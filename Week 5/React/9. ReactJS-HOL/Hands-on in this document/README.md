# Hands-on 9: React ES6 Features

## Problem Statement

Create a React application named **cricketapp** to demonstrate ES6 features such as:

- \map()\
- Arrow Functions
- Destructuring
- Spread Operator (Merge Arrays)

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
+-- Components
¦   +-- ListofPlayers.js
¦   +-- Scorebelow70.js
¦   +-- IndianPlayers.js
¦   +-- ListofIndianPlayers.js
¦
+-- App.js
`

---

## Run the Application

`ash
npm install
`

`ash
npm start
`

Open:

`	ext
http://localhost:3000
`

---

## Expected Output

### When

`javascript
const flag = true;
`

- Display all players.
- Display players whose scores are less than or equal to 70.

### When

`javascript
const flag = false;
`

- Display Odd Team Players using array destructuring.
- Display Even Team Players using array destructuring.
- Display merged list of T20 and Ranji Trophy players using the spread operator.

---

## ES6 Concepts Used

- \map()\ for rendering lists.
- Arrow Functions (\=>\).
- Array Destructuring.
- Spread Operator (\...\) for merging arrays.
- \const\ declarations.
- JSX list rendering using \key\.

---

## Observation

- \map()\ is used to render collections efficiently.
- Arrow functions provide concise function syntax.
- Destructuring simplifies accessing array elements.
- Spread operator merges multiple arrays into one.
- ES6 features make React components cleaner, shorter, and easier to maintain.
