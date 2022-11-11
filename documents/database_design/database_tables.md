## Database tables

Countries

| Variable Name     | Type        |
|-------------------|:------------|
| countryId         | integer     |
| countryName       | varchar(20) |
| countryIso2       | varchar(10) |
| countryIso3       | varchar(10) |
| countryIsoNumeric | integer     |
| population        | integer     |
| capital           | varchar(20) |
| continent         | varchar(20) |
| currencyName      | varchar(20) |
| currencyCode      | varchar(20) |
| fipsCode          | varchar(20) |
| phonePrefix       | varchar(10) |

Cities

| Variable Name | Type        |
|---------------|:------------|
| cityId        | integer     |
| cityName      | varchar(50) |
| iataCode      | varchar(50) |
| latitude      | double      |
| longtitude    | double      |
| timezone      | varchar(10) |
| gmt           | varchar(10) |
| geonameId     | varchar(10) |
| countryId     | integer     |

Airlines

| variable name        | type        |
|----------------------|:------------|
| airlineId            | integer     |
| airlineName          | varchar(50) |
| iataCode             | varchar(50) |
| iataPrefixAccounting | varchar(50) |
| icaoCode             | varchar(50) |
| callsign             | varchar(50) |
| type                 | varchar(50) |
| status               | varchar(50) |
| fleetSize            | integer     |
| fleetAverageAge      | float       |
| dateFounded          | integer     |
| hubCode              | varchar(50) |
| countryId            | integer     |

Airports

| variable name | type        |
|---------------|:------------|
| airportId     | integer     |
| airportName   | varchar(50) |
| iata          | varchar(50) |
| icao          | varchar(50) |

ScheduledAirports

| variable name      | type        |
|--------------------|:------------|
| scheduledAirportId | integer     |
| terminal           | varchar(50) |
| time               | varchar(50) |
| airportId          | integer     |


Routes

| variable name   | type    |
|-----------------|:--------|
| routeId         | integer |
| departAirportId | integer |
| arriveAirportId | integer |
| airlineId       | integer |

ActualAirports

| variable name      | type        |
|--------------------|:------------|
| actualAirportId    | integer     |
| gate               | varchar(50) |
| delay              | integer     |
| baggage            | varchar(50) |
| estimateTime       | datetime    |
| actualTime         | datetime    |
| scheduledAirportId | integer     |


AircraftTypes

| variable name  | type         |
|----------------|:-------------|
| aircraftTypeId | integer      |
| aircraftName   | varchar(50)  |
| iataCode       | varchar(50)  |

LiveFlightData

| variable name    | type     |
|------------------|:---------|
| liveFlightDataId | integer  |
| updated          | datetime |
| latitude         | float    |
| longitude        | float    |
| altitude         | float    |
| direction        | float    |
| speedHorizontal  | float    |
| speedVertical    | float    |
| isGround         | boolean  |


Flights

| variable name    | type        |
|------------------|:------------|
| flightId         | integer     |
| flightDate       | varchar(50) |
| flightStatus     | varchar(50) |
| number           | integer     |
| iata             | varchar(50) |
| icao             | varchar(50) |
| codeShared       | varchar(50) |
| departAirportId  | integer     |
| arriveAirportId  | integer     |
| routeId          | integer     |
| aircraftTypeId   | integer     |
| liveFlightDataId | integer     |
