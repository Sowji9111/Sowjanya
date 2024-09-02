Feature: packer and mover 

Scenario: select within city successfull

Given i am on the packer and mover page
When i select city
When i select locality
And i click on check price button
And i click on furniture option
Then the summary page will be displayed

Scenario: select between cities sucessfull

Given i am on the packer and mover page
When i search for source city
When i search for destination city
When i select shifting date
And i click on check price button
And i add items in inventory
And i click on continue button
And it shows the relocate pop-up
And i enter pickup locality
And i enter destination locality
And i click to update location
Then the request is sucessfully submitted



Scenario: select vehicle shifting successfull

Given i am on the packer and mover page
When i search for source city
When i search for destination city
When i select shifting date
And i click on check price button
And i click the vehicle for relocation
And i click the continue button
Then the summary page will be displayed

Scenario Outline: select location successfull

Given i am on the packer and mover page
When i select the <"<Location>">
When i search for pickup from
When i search for dropat
And i click on check price button
And i select the vehicle
And i click on the schedule
And i click confirm on Confirm your shifting Date & Slot pop-up
Then the summary page will be displayed

Examples:
| Location  | 
| Chennai   |
| Bangalore |
| Mumbai    |

Scenario: select city without locality 

Given i am on the packer and mover page
When i select the city only
And i click on check price button
Then error is displayed
























