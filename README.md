# GraphQL API Automation Framework
 
## Table of Contents
- [Installation & Run](#installation)
    - [Quick Start](#quick-start)
    - [MVN commands](#mvn-commands)
    - [Allure Commands](#allure-commands)
- [Useful information](#useful-information)
    - [Project Structure](#project-stracture)
    - [Links](#links) 
 
 ## <a name="installation"></a>Installation & Run
 ### <a name="quick-start"></a>Quick Start for Mac User
 ```bash
 # Install maven 
 brew install maven
 
 #Install allure
 brew install allure
 
 # Run Tests
 mvn clean -Denvironment={environment_variable} test
 
 # Generate Allure Report 
 allure serve <directory-with-results>
 ```
**TO RUN ALLURE AND MAVEN: Make sure you have Java version = 1.8.0_161 and allure version = 2.6.0** <br> 
**! DO NOT FORGOT set global variable JAVA_HOME in your terminal.** <br>

### <a name="mvn-commands"></a>MVN commands 
 | Task                                     | Description                                            |
 |------------------------------------------|--------------------------------------------------------|
 | `compile`                                | Compile the source code of the project                 |
 | `clean`                                  | remove all files generated by the previous build       |
 | `dependency:tree`                        | output the resolved tree of dependencies               |
 | `test`                                   | test the compiled source code                          |
 |                                          | using a suitable unit testing framework.               |
 | `validate`                               | validate the project is correct and all necessary      |
 |                                          |  information is available                              |
 | `-Dtest={test_name}`                     | Run specific test                                      |      
 | `-Denvironment={environment_variable}`   | Define environment variable                            |
 
 ### <a name="allure-commands"></a>Allure commands
  Note: After when tests are finished their work allure automatically generate allure-result folder. 
        After that you can generate report. If you try to generate locally use `server` for 
  
  | Task                                            | Description                                            |
  |-------------------------------------------------|--------------------------------------------------------|
  | `allure serve <directory-with-results>`         | Generates a report in temporary folder from the data   |
  |                                                 | found in the provided path and then creates a local    |
  |                                                 | jetty server instance, serves generated report and     |
  |                                                 | opens it in the default browser.                       |
  | `allure generate <directory-with-results>`      | Generate the report. The report will be generated      |
  |                                                 | to allure-report folder.                               |
  | `allure open <directory-with-report>`           | When the report is generated you can open it in your   |
  |                                                 | default system browser.                                |
  
  
 ## <a name="useful-information"></a>Useful information
 ### <a name="project-stracture"></a>Project Structure
 
 | Path                                     | Description                                            |
 |------------------------------------------|--------------------------------------------------------|
 | `src/test/java/graphql/`                 | Folder for graphql schemas                             |
 | `src/test/java/payload/`                 | Folder for predefined queries for Rest Assured requests|
 | `src/main/java/`                         | Base folder for core code                              |
 | `src/main/java/utilities`                | Util folder for RestClient and other utilities         |
 | `src/main/test/java/query`               | Folder for query tests                                 |
 | `src/main/test/java/mutation/`           | Folder for mutation tests                              |
 | `src/main/test/java/testconfig`          | Precondition -> Before Tests                           |
 
### <a name="links"></a>Links
1. [Allure Documentation](https://docs.qameta.io/allure/#_testng)
2. [TestNG Documentation](https://testng.org/doc/documentation-main.html)
3. [Rest Assured Documentation](https://github.com/rest-assured/rest-assured/wiki/Usage)
4. [Maven Documentation](https://maven.apache.org/guides/)
 