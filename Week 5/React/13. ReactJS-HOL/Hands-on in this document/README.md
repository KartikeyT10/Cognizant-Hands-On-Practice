# Hands-on 13: React Lists, Keys and Conditional Rendering

## Problem Statement

Create a React application named **bloggerapp** with three components:

- Book Details
- Blog Details
- Course Details

The application should demonstrate:

- Rendering lists using \map()\
- Using \key\ attributes
- Conditional Rendering
- Rendering multiple components

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
+-- BookDetails.js
+-- BlogDetails.js
+-- CourseDetails.js
`

---

## Run the Application

Install dependencies:

`ash
npm install
`

Run the application:

`ash
npm start
`

Open:

`	ext
http://localhost:3000
`

---

## Expected Output

Three sections displayed side by side:

### Course Details

`
Angular
4/5/2021

React
6/3/2021
`

---

### Book Details

`
Master React
670

Deep Dive into Angular 11
800

Mongo Essentials
450
`

---

### Blog Details

`
React Learning
Stephen Biz
Welcome to learning React!

Installation
Schwzdenier
You can install React from npm.
`

---

## React Concepts Used

- Conditional Rendering
- Rendering Lists using \map()\
- \key\ Attribute
- Functional Components
- Props
- Array of Objects
- JSX Rendering
- CSS Styling

---

## Observation

- \map()\ is used to render multiple components from arrays.
- Every rendered element should have a unique \key\.
- Props are used to pass data from parent to child components.
- Components help organize UI into reusable parts.
- CSS Flexbox is used to arrange the three sections horizontally.
