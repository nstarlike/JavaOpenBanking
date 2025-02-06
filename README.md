# JavaOpenBanking

&nbsp;&nbsp;KFCT(Korea Financial Telecommunications & Clearings Institute) is pursuing Open Innovation through Open Platforms and utilizaing APIs in the age of open finance. They provide various services with standarized APIs and support to vitalize innovated finance services of Fin Tech companies. One of the services which they provide is the Open Banking. It's the platform for open financial payments that provides public standardized APIs which enable developers to implement varied financial services like an integrated banking service provided with one app and deals with jobs related to engaging deals by those APIs.

## Architecture
* Microservices Architecture
  * Business Service Servers
  * Authorization Server
  * Config Server
  * API Gateway Server
  * Client Application

## Service
- Authorization
<br>This service authenticates and authorizes users to access other sevices and provides those functionalities using the OAuth2 specification. To do that, Spring Security and Spring Authorization Server frameworks are used.
- Management
<br>This service manages users and organizations. System manager can manage users, organizations and system settings, etc. and users can manage own information.
- Account
<br>This service provides account-related services. Users can check the balance and the bank statements in thier bank account. Also they can deposit and withdraw between accounts.
- Card
<br>This service provides card-related services. Users can check the list of their credit cards, the information of each card and the bills.
- Prepayment
<br>This service provides prepay-related services. Users can check the list of their prepayments, the balance, the information and the transactional history of each prepayment.
- Insurance
<br>This service provides insurance-related services. Users can check the list of their insurances which they contracted and the payment history of each insurance.
- Loan
<br>This service provides loan-related services. Users can check the list of their Loans and the basic information of each loan.

## Technology
- Java 17
- Spring Boot 3.4.1
- Spring Security
- Spring Cloud
- Oracle
- React.js

## Reference
- [Open API Portal](https://openapi.kftc.or.kr/main)
- [Open API Developers](https://developers.kftc.or.kr/dev)
