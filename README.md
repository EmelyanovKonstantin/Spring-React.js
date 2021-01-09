<!-- PROJECT LOGO -->
<br />
<h1 align="center">
  <br>
  <img src="https://keyholesoftware.com/wp-content/uploads/Spring-Boot-React.png" height="200" alt="ArminC AutoExec"></a>
</h1>
<p align="center">
  <h3 align="center">Spring-React.js</h3>

  <p align="center">
    Spring Boot + React.js application
</p>


---
<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
     <li>
      <a href="#built-with">Built With</a>
     </li>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#usage">Usage</a></li>
        <li><a href="#develop">Develop</a></li>
      </ul>
    </li>
  </ol>
</details>

## Built With
* [Spring Boot](https://spring.io/projects/spring-boot) <img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" alt="Logo" width="" height="10">
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) <img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" alt="Logo" width="" height="10">
* [Spring Data REST](https://spring.io/projects/spring-data-rest) <img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" alt="Logo" width="" height="10">
* [Thymeleaf](https://www.thymeleaf.org) <img src="https://www.thymeleaf.org/images/thymeleaf.png" alt="Logo" width="" height="10">
* [PostgreSQL](https://www.postgresql.org) <img src="https://www.postgresql.org/media/img/about/press/elephant.png" alt="Logo" width="" height="10">
* [React](reactjs.org) <img src="https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg" alt="Logo" width="" height="10">
* [MATERIAL-UI](https://material-ui.com) <img src="https://material-ui.com/static/logo_raw.svg" alt="Logo" width="" height="10">
* [WebSocket]()
* [Babel](https://babeljs.io) <img src="https://d33wubrfki0l68.cloudfront.net/7a197cfe44548cc1a3f581152af70a3051e11671/78df8/img/babel.svg" alt="Logo" width="" height="10">
* [Webpack](https://webpack.js.org) <img src="https://webpack.js.org/site-logo.1fcab817090e78435061.svg" alt="Logo" width="" height="10">


<!-- ABOUT THE PROJECT -->
## About The Project
* Spring and React.js boilerplate App.<br>
* Created for training purposes.<br>
* App features:<br>
  * Authorization and authentication<br>
  * Browse PostgesSQL database:<br>
<img src="http://github.com/EmelyanovKonstantin/Spring-React.js/blob/master/images/browse.png?raw=true" alt="Logo" width="" height="400"><br><br>
  * Resize and explorers table:<br>
<img src="https://github.com/EmelyanovKonstantin/Spring-React.js/blob/master/images/resize.png?raw=true" alt="Logo" width="" height="400"><br><br>
  * Create, update and delete record in datebase:<br>
<img src="https://github.com/EmelyanovKonstantin/Spring-React.js/blob/master/images/create.png?raw=true" alt="Logo" width="" height="400"><br><br>
  * Receive information about events using websocket
<!-- GETTING STARTED -->
## Getting Started

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/EmelyanovKonstantin/Spring-React.js.git
   ```
2. Install NPM packages
   ```sh
   npm install
   ```
<!-- USAGE EXAMPLES -->
### Usage

1. Create Tables in your PostgreSQL DB
   ```sql
   CREATE TABLE employee
   (   first_name      TEXT,
       last_name       TEXT,
       description     TEXT,
       id              BIGSERIAL PRIMARY KEY,
       "version"       BIGINT DEFAULT 0,
       manager_id      BIGINT
   );
   CREATE TABLE manager
   (   name            TEXT,
       password        TEXT,
       roles           TEXT,
       id              BIGSERIAL PRIMARY KEY
   );
   ```
   
2. Add connection properties in `src/main/resources/application.properties`
   ```code
   spring.datasource.url=jdbc:postgresql://localhost:5432/spring-react
   spring.datasource.username=postgres
   spring.datasource.password=postgres
   ```
   
3. Uncomment `run` method body for autogenerate new Employees and Managers in your database
  `src/main/java/ru/emelyanovkonstantin/springreact/payroll/DatabaseLoader.java`

4. Run Maven on the command line
   ```sh
   ./mvnw spring-boot:run
   ```
5. Open browser on [http://localhost:8080/](http://localhost:8080/)
6. Enter login(`Sergey`) and password(`jktyu*2`)

### Develop
1. Run webpack-dev-server on the command line
   ```sh
   webpack-dev-server --content-base src --hot --inline
   ```