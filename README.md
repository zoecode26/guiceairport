# Airport Challenge

This program can be used to keep track of planes at various airports and takeoff & land these planes depending on randomly generated weather conditions.
This project was created for the purpose of learning Guice for dependency injection.

## Project Structure

Consists of three main classes:
- The Plane class that has attributes of the name of the plane and whether it is currently airbourne, stored as a boolean.
- The Weather class that has a single method, forecast, that returns stormy or sunny based on a random number that is generated.
- The Airport class that has attributes of the name of the airport, it's capacity and an list of planes it contains that is updated as planes land/takeoff. It has land and 
takeoff methods that take a plane object and a display_planes method to display all the planes currently at that airport. The Airport class is injected with a Weather instance
allowing the forecast method to be called each time a plane is to takeoff/land to check the conditions are appropriate.

### Constructor Overloading

This project also uses constructor overloading, allowing the user to optionally specify a capacity for the airport. If they only provide a name when creating the airport, the
capacity will be set to 100. This is carried out in the AirportImpl class, that passes the arguments the user provided to the correct constructor in the airport class. The 
AirportFactory also has two identically named createAirport methods that both instantiate new Airport objects, one with a user specified capacity, and one with the default 
capacity.
