# Hands-on 1: Creating Your First React Application

## Problem Statement

Create a React application named **myfirstreact** and display the heading **"Welcome the first session of React"** on the home page.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Create a React Project

Create a new React application using:

`ash
npx create-react-app myfirstreact
`

Navigate to the project folder:

`ash
cd myfirstreact
`

Start the development server:

`ash
npm start
`

---

## App.js

Replace the contents of \src/App.js\ with the following:

`jsx
function App() {
  return (
    <div>
      <h1>Welcome the first session of React</h1>
    </div>
  );
}

export default App;
`

---

## Project Structure

`	ext
myfirstreact
¦
+-- public
+-- src
¦   +-- App.js
¦   +-- index.js
¦   +-- ...
+-- package.json
+-- node_modules
`

---

## Run the Application

Execute the following command:

`ash
npm start
`

The application will be available at:

`	ext
http://localhost:3000
`

---

## Expected Output

`	ext
Welcome the first session of React
`

---

## Observation

- \create-react-app\ creates a React project with all required dependencies.
- \App.js\ is the main component rendered by React.
- JSX allows HTML-like syntax inside JavaScript.
- Running \
pm start\ launches the development server on port **3000**.
- Changes made to the source code are reflected automatically through hot reloading.
