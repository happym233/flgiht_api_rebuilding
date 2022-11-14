# flgiht_api_rebuilding
soen 6441 project: rebuilding api from [aviationsstack.com](https://aviationstack.com/documentation)

APIs to rebuild:

1. [/flights](/documents/APIs/flights.md) 
2. [/airlines](/documents/APIs/airlines.md)
3. [/cities](/documents/APIs/cities.md)
4. [/countries](/documents/APIs/countries.md)
 
Design documents:

1. [class diagram](/documents/design_documents/class_diagram.md)
2. [data source architecture](/documents/design_documents/data_source.md)
3. [database](/documents/database_design/database_tables.md)
4. [design patterns](/documents/design_documents/design_patterns.md)
 
codes:
1. [database creating sql](/codes/sql/createTable.sql)
2. [database inserting sql](/codes/sql/insertTable.sql)
3. [java code](/codes/java)

project structure:

│  pom.xml
│  project.iml
│
└─src
    ├─main
    │  ├─java
    │  │  └─project
    │  │      │  Configuration.java
    │  │      │  FlightAPIApplication.java
    │  │      │  Main.java
    │  │      │
    │  │      ├─Controllers
    │  │      │      AircraftTypeController.java
    │  │      │      AirlineController.java
    │  │      │      CityController.java
    │  │      │      Controller.java
    │  │      │      ControllerFactory.java
    │  │      │      CountryController.java
    │  │      │      FlightController.java
    │  │      │
    │  │      ├─Entities
    │  │      │      ActualAirport.java
    │  │      │      AircraftType.java
    │  │      │      Airline.java
    │  │      │      Airport.java
    │  │      │      City.java
    │  │      │      Country.java
    │  │      │      Flight.java
    │  │      │      LiveFlightData.java
    │  │      │      Route.java
    │  │      │      ScheduledAirport.java
    │  │      │
    │  │      ├─Exceptions
    │  │      │      JsonException.java
    │  │      │
    │  │      ├─Gateway
    │  │      │  │  SqliteConnector.java
    │  │      │  │
    │  │      │  ├─Airline
    │  │      │  │      AirlineGateway.java
    │  │      │  │      AirlineGatewayImpl.java
    │  │      │  │
    │  │      │  ├─City
    │  │      │  │      CityGateway.java
    │  │      │  │      CityGatewayImpl.java
    │  │      │  │
    │  │      │  ├─Country
    │  │      │  │      CountryGateway.java
    │  │      │  │      CountryGatewayImpl.java
    │  │      │  │
    │  │      │  └─Flight
    │  │      │          FlightGateway.java
    │  │      │          FlightGatewayImpl.java
    │  │      │
    │  │      ├─Mappers
    │  │      │  ├─Airline
    │  │      │  │      AirlineMapper.java
    │  │      │  │      AirlineMapperImpl.java
    │  │      │  │
    │  │      │  ├─City
    │  │      │  │      CityMapper.java
    │  │      │  │      CityMapperImpl.java
    │  │      │  │
    │  │      │  ├─Country
    │  │      │  │      CountryMapper.java
    │  │      │  │      CountryMapperImpl.java
    │  │      │  │
    │  │      │  └─Flight
    │  │      │          FlightMapper.java
    │  │      │          FlightMapperImpl.java
    │  │      │
    │  │      └─VO
    │  │              AirlineVO.java
    │  │              CityVO.java
    │  │              CountryVO.java
    │  │              FlightVO.java
    │  │
    │  └─resources
    └─test
        └─java
            └─project
                ├─Controllers
                │      ControllerFactoryTest.java
                │      ControllerTest.java
                │
                ├─Gateway
                │  │  SqliteConnectorTest.java
                │  │
                │  ├─Airline
                │  │      AirlineGatewayImplTest.java
                │  │
                │  ├─City
                │  │      CityGatewayImplTest.java
                │  │
                │  └─Country
                │          CountryGatewayImplTest.java
                │
                └─Mappers
                    ├─Airline
                    │      AirlineMapperImplTest.java
                    │
                    ├─City
                    │      CityMapperImplTest.java
                    │
                    └─Country
                            CountryMapperImplTest.java
 
Interaction results:

[a record of interactions in terminal](/documents/results/interactions.pdf)

(reference: [https://aviationstack.com/documentation](https://aviationstack.com/documentation))

    
    

