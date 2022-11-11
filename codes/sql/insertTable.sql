INSERT INTO Countries 
(countryId, countryName, countryIso2, countryIso3, countryIsoNumeric, population, capital, continent, currencyName, currencyCode, fipsCode, phonePrefix) VALUES
("1", "Andorra", "AD", "AND", "20", "84000", "Andorra la Vella", "EU", "Euro", "EUR", "AN", "376"),
("2", "United Arab Emirates", "AE", "ARE", "784", "4975593", "Abu Dhabi", "AS", "Dirham", "AED", "AE", "971"),
("3", "Afghanistan", "AF", "AFG", "4", "29121286", "Kabul", "AS", "Afghani", "AFN", "AF", "93");

INSERT INTO Cites
(cityId,cityName,iataCode,latitude,longtitude,timezone,gmt,geonameId,countryId) VALUES
("1","Anaa","AAA","-17.05","-145.41667","Pacific\/Tahiti","-10",NULL,"1" ),
("2","Arrabury","AAB","-26.7","141.04167","Australia\/Brisbane","10",NULL, "2"),
("3","El Arish","AAC","31.133333","33.75","Africa\/Cairo","2","361546","3");


INSERT INTO Airlines
(airlineId,airlineName,iataCode,iataPrefixAccounting,icaoCode,callsign,airlineType,status,fleetSize,fleetAverageAge,dateFounded,hubCode,countryId) VALUE
("1","American Airlines","AA","1","AAL","AMERICAN","scheduled","active","963","10.9","1934","DFW",),
("2","Delta Air Lines","DL","6","DAL","DELTA","scheduled,division","active","823","17","1928","ATL",),
("3","United Airlines","UA","16","UAL","UNITED","scheduled,division","active","715","13.8","1931","ORD",);

INSERT INTO Airports
(airportId,airportName,iata,icao,cityId) VALUES
("1","Anaa","AAA","NTGA","1"),
("2","Arrabury","AAB","YARY","2"),
("3","El Arish International Airport","AAC","HEAR","3");

INSERT INTO  ScheduledAirports
(scheduledAirportId,terminal,scheduledTime,airportId) VALUES
("1","2","2022-11-11T09:25:00+00:00","1"),
("2","1","2022-11-11T07:15:00+00:00","2"),
("3",NULL,"2022-11-11T17:55:00+00:00","3");

INSERT INTO  Routes
(routeId,departAirportId,arriveAirportId,airlineId) VALUES
("1",),
("2",),
("3",);

INSERT INTO  ActualAirports
(actualAirportId,gate,delay,baggage,estimateTime,actualTime,scheduledAirportId) VALUES
("1","24","24",NULL,"2022-11-11T08:00:00+00:00","2022-11-11T08:24:00+00:00",),
("2","22",NULL,NULL,"2022-11-11T06:15:00+00:00","2022-11-11T06:15:00+00:00",),
("3","3,4",NULL,NULL,"2022-11-11T15:50:00+00:00","2022-11-11T15:50:00+00:00",);

INSERT INTO  AircraftTypes
(aircraftTypeId,aircraftName,iataCode) VALUES
("1","Fokker 100","100"),
("2","British Aerospace BAe 146-100","141"),
("3","British Aerospace BAe 146-200","142");

INSERT INTO  LiveFlightData
( liveFlightDataId,updated,latitude,longitude,altitude,direction,speedHorizontal,speedVertical,isGround) VALUES
("1",),
("2",),
("3",);

INSERT INTO  Flights
(flightId,flightDate,flightStatus,number,iata,icao,codeShared,  departAirportId,arriveAirportId,routeId,aircraftTypeId,liveFlightDataId) VALUES
("1","2022-11-11","landed","3337","BR3337","EVA3337",NULL),
("2","2022-11-11","scheduled","4715","AD4715","AZU4715",NULL),
("3","2022-11-11","scheduled","2216","CZ2216","CSN2216",NULL);