# Hands-on 12: React Conditional Rendering

## Problem Statement

Create a React application named **ticketbookingapp** to demonstrate conditional rendering.

The application should:

- Display a **Guest Page** when the user is not logged in.
- Display a **User Page** after login.
- Toggle between **Login** and **Logout** buttons.
- Use conditional rendering based on the login state.

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
+-- LoginButton.js
+-- LogoutButton.js
+-- GuestGreeting.js
+-- UserGreeting.js
+-- Greeting.js
`

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

### Initial State

`
Please sign up.

[Login]
`

---

### After Clicking Login

`
Welcome back

[Logout]
`

---

### After Clicking Logout

`
Please sign up.

[Login]
`

---

## React Concepts Used

- Conditional Rendering
- \useState()\ Hook
- Component Rendering
- Props
- Event Handling
- Element Variables
- if-else Conditional Logic

---

## Observation

- Conditional rendering displays different UI based on application state.
- \useState()\ manages the login status.
- Props allow communication between parent and child components.
- Button components trigger state changes through event handlers.
- React re-renders the component automatically whenever the state changes.
