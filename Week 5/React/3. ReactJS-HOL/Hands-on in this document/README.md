# Hands-on 3: Functional Component with Props and Styling

## Problem Statement

Create a React application named **scorecalculatorapp**. Develop a functional component named \CalculateScore\ that accepts student details as props, calculates the percentage score, and displays the result with CSS styling.

---

## Create the Project

`ash
npx create-react-app scorecalculatorapp
`

Navigate to the project directory:

`ash
cd scorecalculatorapp
`

Create the following folders inside \src\:

`	ext
src
+-- Components
¦   +-- CalculateScore.js
¦
+-- Stylesheets
¦   +-- mystyle.css
¦
+-- App.js
+-- index.js
`

---

## Run the Application

`ash
npm start
`

Open your browser:

`	ext
http://localhost:3000
`

---

## Expected Output

`	ext
Student Details

Name: Steeve
School: DNV Public School
Total: 284 Marks
Score: 94.67%
`

---

## Observation

- Functional components are simple JavaScript functions that return JSX.
- Props are used to pass data from the parent component to the child component.
- CSS styles can be applied by importing external stylesheet files.
- Helper functions are used to calculate and format the percentage.
- React automatically updates the UI when props change.
