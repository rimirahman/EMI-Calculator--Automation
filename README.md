# EMI-Calculator--Automation

## How to run this project
- clone the project
- execute with intellij


## Technology used:

- Tool: Selenium Webdriver
- IDE: Intellij, Android Studio
- Build tool: Gradle
- Language: Java
- Test_Runner: Appium


## Prerequisites

- Install Android Studio latest version
- Install Appium 1.17.1
- Install jdk 8 or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME
- Test_Runner: Appium
- Stable internet connection


## Automate EMI-Calculator app and do following tests:

If an user take loan (?) tk from a bank with interest of (?)% and  want to give (?) tk per month as EMI (installment) and processing fee (?)%, how many time period it will take to complete the loan? Take the values from dataset and assert the monthly EMI, total interest, processing fee amount and total payment from the result view. (See below image)
For solve this question, create a dataset using following values:
Amount | Interest | EMI | Processing Fee | Monthly EMI | Total Interest | Processing Fee | Total Payment | Period (Year) | Period (Month)

100000 | 6 | 2000 | 2% | 2000 | 15361.08 | 2000 | 115361.08 | 4 | 10
200000 | 8 | 5000 | 2% | 5000 | 33391.61 | 4000 | 233391.61 | 3 | 11
250000 | 7 | 8000 | 1.5% | 8000 | 26804.51 | 3750 | 276804.51 | 2 | 11
50000 | 10 | 1000 | 5% | 1000 | 14949.12 | 2500 | 64949.12 | 5 | 5


## Allure reports

![report](https://user-images.githubusercontent.com/122162468/222814114-be127ed4-fbe3-41e9-bdad-8419b621ad3a.JPG)

![behaviour](https://user-images.githubusercontent.com/122162468/222814142-a04ee038-d5ef-463e-a6cc-99e60564236f.JPG)

## Video of the automation

https://user-images.githubusercontent.com/122162468/222814173-ebe689d7-da6e-44fd-ac3a-2421fb7a67d3.mp4

