CREATE TABLE Country
(
    countryId         integer primary key autoincrement,
    countryName       varchar(20),
    countryIso2       varchar(10),
    countryIso3       varchar(10),
    countryIsoNumeric integer,
    population        integer,
    capital           varchar(20),
    continent         varchar(20),
    currencyName      varchar(20),
    currencyCode      varchar(20),
    fipsCode          varchar(20),
    phonePrefix       varchar(10)
);

CREATE TABLE City
(
    cityId     integer primary key autoincrement,
    cityName   varchar(50),
    iataCode   varchar(50),
    latitude   double,
    longtitude double,
    timezone   varchar(10),
    gmt        varchar(10),
    geonameId  varchar(10),
    countryId  integer,
    foreign key (countryId) references  Countries(countryId)
);


CREATE TABLE Airline
(
    airlineId            integer primary key autoincrement,
    airlineName          varchar(50),
    iataCode             varchar(50),
    iataPrefixAccounting varchar(50),
    icaoCode             varchar(50),
    callsign             varchar(50),
    airlineType          varchar(50),
    status               varchar(50),
    fleetSize            integer,
    fleetAverageAge      float,
    dateFounded          integer,
    hubCode              varchar(50),
    countryId            integer,
    foreign key (countryId) references  Countries(countryId)
);

CREATE TABLE Airport
(
    airportId   integer primary key autoincrement,
    airportName varchar(50),
    iata        varchar(50),
    icao        varchar(50),
    cityId  integer,
    foreign key (cityId) references  Cities(cityId)
);

CREATE TABLE ScheduledAirport
(
    scheduledAirportId integer primary key autoincrement,
    terminal           varchar(50),
    scheduledTime      dateTime,
    airportId          integer,
    foreign key (airportId) references  Airports(airportId)
);

CREATE TABLE Route
(
    routeId         integer primary key autoincrement,
    departAirportId integer,
    arriveAirportId integer,
    airlineId       integer,
    foreign key (departAirportId) references  ScheduledAirports(scheduledAirportId),
    foreign key (arriveAirportId) references  ScheduledAirports(scheduledAirportId),
    foreign key (airlineId) references  Airlines(airlineId)
);

CREATE TABLE ActualAirport
(
    actualAirportId    integer primary key autoincrement,
    gate               varchar(50),
    delay              integer,
    baggage            varchar(50),
    estimateTime       datetime,
    actualTime         datetime,
    scheduledAirportId integer,
    foreign key (scheduledAirportId) references  ScheduledAirports(scheduledAirportId)
);


CREATE TABLE AircraftType
(
    aircraftTypeId integer primary key autoincrement,
    aircraftName   varchar(50),
    iataCode       varchar(50)
);

CREATE TABLE LiveFlightData
(
    liveFlightDataId integer primary key autoincrement,
    updated          datetime,
    latitude         float,
    longitude        float,
    altitude         float,
    direction        float,
    speedHorizontal  float,
    speedVertical    float,
    isGround         boolean
);


CREATE TABLE Flight
(
    flightId         integer primary key autoincrement,
    flightDate       varchar(50),
    flightStatus     varchar(50),
    flightNumber           integer,
    iata             varchar(50),
    icao             varchar(50),
    codeShared       varchar(50),
    departAirportId  integer,
    arriveAirportId  integer,
    routeId          integer,
    aircraftTypeId   integer,
    liveFlightDataId integer,
    foreign key (departAirportId) references  ActualAirports(actualAirportId),
    foreign key (arriveAirportId) references  ActualAirports(actualAirportId),
    foreign key (routeId) references  Routes(routeId),
    foreign key (aircraftTypeId) references  AircraftTypes(aircraftTypeId),
    foreign key (liveFlightDataId) references  LiveFlightData(liveFlightDataId)
);
