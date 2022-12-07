# Supermarket Pricer Kata Ghassen
This repository represents a Java implementation of a simple Supermarket Pricing app as a part of Kata test.
# Minimum requirements
This module requires the following modules:

 * Java JDK 8
 
## Build the project
```bash
mvn clean install
```
## Launch tests
```bash
mvn test
```
## Usage
Following the build step, a set of files should appear within the target folder, among them, you could find the pricer-0.0.1-SNAPSHOT.jar.
Simply execute it via the following command:
```bash
java -jar pricer-0.0.1-SNAPSHOT.jar

```
And voilà! you've got the app up and running as depicted below:

![image](https://user-images.githubusercontent.com/36883091/202902146-b083f380-039e-46a5-9e16-9fedfffca048.png)

Once the app is running you should see a list of the possible items, a simple usage scenario would be typing a product ID and how many items
to add into the basket from that particular item as depicted below:

![image](https://user-images.githubusercontent.com/36883091/206273883-06f83a5c-6f60-4043-b5df-cbdeae385b7c.png)

The app will endlessly ask you whether or not you finished adding items to your basket.
Type N to continue adding items or Y to show the basket total price.

If Y has been typed you should view the basket total price as shown below:
![image](https://user-images.githubusercontent.com/36883091/206273590-e01a8a4d-82f1-4c39-be31-bac5db1500be.png)
