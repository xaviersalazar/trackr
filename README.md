# Trackr
Workout logging application

## Features
- [ ] **Login Page**
- [ ] **Home Page**
  - [ ] Shows most recent log in card view that is clickable to show more information
  - [ ] Shows table of all logs sorted by default by date
    - [ ] Clickable rows to show card/modal of more information
- [ ] **Logger Page**
  - [ ] Add a new log entry
    - [ ] Modal/Card view with information to add a log
  - [ ] Remove a log entry
- [ ] Logout functionality 

## Tech Stack
- **Backend**: Springboot (Java)
- **Frontend**: React, Bootstrap
- **Database**: Postgres

## Stories
- [ ] As a user I would to see my most recent log in the home page
- [ ] As a user I would like to be able to click on my most recent log to view more information about that log like the workouts I did, etc
- [ ] As a user I would see to see all my logs on the home page sorted by date (asc)
- [ ] As a user I would like the table of all my logs to be paginated, by 15 per page
- [ ] As a user I would like each row of the table of all my logs to be clickable so I can view more information about that log
- [ ] As a user I would like to be able to add a new entry to my logs
- [ ] As a user I would like to be able to remove an existing log entry

# Database Schema
![Schema](./db-schema.png)