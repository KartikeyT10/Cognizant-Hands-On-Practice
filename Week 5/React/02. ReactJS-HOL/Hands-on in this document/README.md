# Hands-on 2: Creating Multiple React Components

## Problem Statement

Create a React application named **StudentApp** with three class components:

- Home
- About
- Contact

Each component should display its respective welcome message, and all components should be rendered from the main \App\ component.

---

## Create the Project

`ash
npx create-react-app StudentApp
`

Navigate to the project directory:

`ash
cd StudentApp
`

Create a folder named **Components** inside the \src\ directory.

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
Welcome to the Home Page of Student Management Portal

Welcome to the About Page of Student Management Portal

Welcome to the Contact Page of Student Management Portal
`

---

## Observation

- React applications can be divided into reusable components.
- Class components extend the \Component\ class and implement the \ender()\ method.
- The \App\ component acts as the parent component.
- Child components (\Home\, \About\, and \Contact\) are rendered inside \App\.
- Component-based architecture improves code organization and reusability.
