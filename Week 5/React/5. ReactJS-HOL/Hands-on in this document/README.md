# Hands-on 5: Styling React Components

## Problem Statement

Style a React application that displays cohort details using **CSS Modules** and **inline styles**.

---

## Prerequisites

- Node.js
- npm
- Visual Studio Code

---

## Project Setup

Extract the provided React application and install the required dependencies:

`ash
npm install
`

Run the application:

`ash
npm start
`

---

## Project Structure

`	ext
src
¦
+-- Components
¦   +-- CohortDetails.js
¦   +-- CohortDetails.module.css
¦
+-- App.js
+-- index.js
`

---

## Run the Application

`ash
npm start
`

Open the browser:

`	ext
http://localhost:3000
`

---

## Expected Output

- Three cohort cards are displayed.
- Each card has a bordered box with rounded corners.
- The heading is:
  - **Green** when the status is **Ongoing**.
  - **Blue** for all other statuses.
- The labels (\Started On\, \Current Status\, \Coach\, \Trainer\) are displayed in bold.

---

## Observation

- CSS Modules provide locally scoped styles to React components.
- Styles are applied using the \className\ attribute.
- Inline styles are useful for applying dynamic styles based on component data.
- React allows combining CSS Modules and inline styling within the same component.
- Styling components improves readability and enhances the user interface.
