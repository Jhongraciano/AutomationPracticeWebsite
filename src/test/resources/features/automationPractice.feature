
@Stories
  Feature: Automation Practice Website
    As a customer, I want to log in to the Automation Practice Website for visualizar some products and make a purchase.


    Background: Successful login
      Given that JD opens the Automation Practice Website page
      And proceeds to log in with its corresponding user
        |          strEmail                |   password  |
        | pruebaautomatizacion8@gmail.com  | Prueba2022* |

    @scenario1
    Scenario: Update my personal information
      When enter the option My personal information and change date of birth
        |  strDay | strMonth  | strYear |   passwd  |
        |   16    |     11    | 2000    |Prueba2022* |

      Then Validate the message that has been successfully updated
       | strValidatingTheMessage |
       |Your personal information has been successfully updated.|

      @scenario2
      Scenario: Add a new address
        When enter the my addresses option and add a new address
        | strFirstName | lastName | strCompany | strAddress  | strCity | strState | postalCode | homephone | mobilePhone |additionalInformation                     |futureReference|
        | Juan         | Perez    | Shopos     | Cll 23 cr42b| Cali    | Texas    | 09463      |  08353735 | 4307542     |se dedica a realizar pruebas automatizadas| Quality1      |
        Then validate that if it was created successfully
          |futureReference|
          | Quality1       |

        @scenario3
        Scenario: Make a purchase of a ladys product
          When I am looking for the product I want to buy
           | strNameProduct |
           |Blouse          |
          Then Validate that if it appears to me that it was successful
           | strValidations |
          |Your order on My Store is complete.|

