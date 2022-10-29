# TechTest

Technical Test Solution: A Java swing application for Fare Calculation.

## Register Driver Profile

**The Application start with a driver profile registration form.**
![image](https://user-images.githubusercontent.com/32252705/198826551-a227c279-48a1-4bd7-8893-7b91558fe8fa.png)

**Buttons: _Register, View Driver Profiles**_

_**Register:** register new dirver profile with the above input and show the table of Registered Driver Profiles, there is a simple validation on email input (format should be x@x.x , x for any length)_

_**View Driver Profiles:** change to Driver Profiles panel for edit, delete driver profiles and fare calculation_

## Edit / Delete Driver Profile, Fare Calculation

**From _View Driver Profiles_, a table of Driver Profiles will be shown with Buttons on the right side.**
![image](https://user-images.githubusercontent.com/32252705/198826463-285df733-4ab4-475e-8d6c-9fa5833411bb.png)

**Table action:** _by double clicking on the table cell, the selected cell will become editable. The record will be updated with modified value on **Enter Key**._

![image](https://user-images.githubusercontent.com/32252705/198826629-e08b668e-016b-4a1a-a649-a58347cec82a.png)


**Buttons: _Add Driver, Delete Driver, Calculate Fare, Fare History**_

_**Add Driver:** back to the Driver Profile registration form_

_**Delete Driver:** delete the driver profile selected in the Driver Profiles table. Confirmation dialog will pop up before the delete action_

_**Calculate Fare:** retrieve Fare information from info.csv, calculate the cheapest fare cost with the registered driver profiles, then show the Fare Calculation History_

_**Fare History:** show the table of Fare Calculation History_

## View Saved Fare

**Form Fare History, a table of previous Fare Calculation will be shown with a button on the right.**
![image](https://user-images.githubusercontent.com/32252705/198826481-6921587a-d612-45a8-aab9-c09afab22670.png)

**Button: _View Driver Profiles**_

_**View Driver Profiles:** back to the table of Driver Profiles panel_

