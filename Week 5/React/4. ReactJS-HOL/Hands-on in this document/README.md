# Hands-on 4: React Component Lifecycle

## Problem Statement

Create a React application named **blogapp** that fetches posts from a REST API using the \componentDidMount()\ lifecycle method and handles errors using \componentDidCatch()\.

---

## Create the Project

`ash
npx create-react-app blogapp
`

Navigate to the project directory:

`ash
cd blogapp
`

---

## Project Structure

`	ext
blogapp
¦
+-- src
¦   +-- App.js
¦   +-- Posts.js
¦   +-- Post.js
¦   +-- index.js
¦
+-- package.json
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

The application fetches posts from:

`	ext
https://jsonplaceholder.typicode.com/posts
`

Each post is displayed with:

- Title
- Body

---

## Observation

- \componentDidMount()\ is executed after the component is rendered.
- API calls are typically made inside \componentDidMount()\.
- The fetched data is stored in the component state using \setState()\.
- The \ender()\ method updates the UI whenever the state changes.
- \componentDidCatch()\ is used to handle rendering errors gracefully.
