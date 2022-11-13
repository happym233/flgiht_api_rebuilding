INSERT INTO Countries 
(countryId, countryName, countryIso2, countryIso3, countryIsoNumeric, population, capital, continent, currencyName, currencyCode, fipsCode, phonePrefix) VALUES
(NULL, "Andorra", "AD", "AND", "20", "84000", "Andorra la Vella", "EU", "Euro", "EUR", "AN", "376"),
(NULL, "United Arab Emirates", "AE", "ARE", "784", "4975593", "Abu Dhabi", "AS", "Dirham", "AED", "AE", "971"),
(NULL, "Afghanistan", "AF", "AFG", "4", "29121286", "Kabul", "AS", "Afghani", "AFN", "AF", "93"),
(NULL,"China","CN", "CHN", "156","1330044000","Beijing","AS", "Yuan Renminbi","CNY","CH", "86"),
(NULL,"New Zealand", "NZ","NZL", "554", "4252277","Wellington", "OC","Dollar", "NZD","NZ", "64"),
(NULL,"Brazil","BR","BRA", "76", "201103330","Brasilia", "Brasilia", "SA", "Real","BRL","BR", "55");

INSERT INTO Cites
(cityId,cityName,iataCode,latitude,longtitude,timezone,gmt,geonameId,countryId) VALUES
(NULL,"Anaa","AAA","-17.05","-145.41667","Pacific\/Tahiti","-10",NULL,"1" ),
(NULL,"Arrabury","AAB","-26.7","141.04167","Australia\/Brisbane","10",NULL, "2"),
(NULL,"El Arish","AAC","31.133333","33.75","Africa\/Cairo","2","361546","3");
(NULL,"Auckland","AKL","-36.84846","174.763331","Pacific\\/Auckland","12", "2193733", "5"),
(NULL,"Christchurch","CHC", "-43.488655","172.5389", "Pacific\\/Auckland","12", "2192362", "5"),
(NULL,"Tancredo Neves International Airport","CNF","-19.62444","-43.97194","America\/Sao_Paulo","3",NULL,"6"),
(NULL,"Eurico Sales","VIX","-20.2581","-40.2864","America\/Sao_Paulo","3",NULL,"6"),
(NULL,"Hengyang","HNY","26.85", "112.5", "Asia\\/Shanghai","8", NULL,"4"),
(NULL,"Shuangliu","CTU","30.567456","103.9492936","Asia\/Shanghai","8",NULL,"4");


INSERT INTO Airlines
(airlineId,airlineName,iataCode,iataPrefixAccounting,icaoCode,callsign,airlineType,status,fleetSize,fleetAverageAge,dateFounded,hubCode,countryId) VALUES
(NULL,"American Airlines","AA","1","AAL","AMERICAN","scheduled","active","963","10.9","1934","DFW","2"),
(NULL,"Delta Air Lines","DL","6","DAL","DELTA","scheduled,division","active","823","17","1928","ATL","3"),
(NULL, "China Southern Airlines", "CZ", "784", "CSN", "CHINA SOUTHERN", "scheduled","active", "498","6.9", "2004", "CAN", "4"),
(NULL,"TAM Linhas Aereas", "JJ","957", "TAM", "TAM", "scheduled", "active", "163","7.4", "1976", "CGH", "6"),
(NULL, "Air New Zealand", "NZ", "86","ANZ", "NEW ZEALAND","scheduled","active", "55", "7.6", "1940", "AKL","5");

INSERT INTO Airports
(airportId,airportName,iata,icao,cityId) VALUES
(NULL,"Anaa","AAA","NTGA","1"),
(NULL,"Arrabury","AAB","YARY","2"),
(NULL,"El Arish International Airport","AAC","HEAR","3"),
(NULL,"Auckland International","AKL","NZAA","4"),
(NULL,"Christchurch International","CHC","NZCH","8"),
(NULL,"Tancredo Neves International Airport","CNF","SBCF","6"),
(NULL,"Eurico Sales","VIX","SBVT","7"),
(NULL,"Hengyang","HNY","ZGHY","8"),
(NULL,"Shuangliu","CTU","ZUUU","9");

INSERT INTO  ScheduledAirports
(scheduledAirportId,terminal,scheduledTime,airportId) VALUES
(NULL,"2","2022-11-11T09:25:00+00:00","5"),
(NULL,"1","2022-11-11T07:15:00+00:00","7"),
(NULL,NULL,"2022-11-11T17:55:00+00:00","9"),
(NULL,"D","2022-11-11T08:00:00+00:00","4"),
(NULL,"1","2022-11-11T06:15:00+00:00","6"),
(NULL,NULL,"2022-11-11T15:50:00+00:00","8");

INSERT INTO  ActualAirports
(actualAirportId,gate,delay,baggage,estimateTime,actualTime,scheduledAirportId) VALUES
(NULL,"24","24",NULL,"2022-11-11T08:00:00+00:00","2022-11-11T08:24:00+00:00","4"),
(NULL,"22",NULL,NULL,"2022-11-11T06:15:00+00:00","2022-11-11T06:25:00+00:00","6"),
(NULL,"3,4",NULL,NULL,"2022-11-11T15:50:00+00:00","2022-11-11T15:50:00+00:00","8");

INSERT INTO  AircraftTypes
(aircraftTypeId,aircraftName,iataCode) VALUES
(NULL,"Fokker 100","100"),
(NULL,"British Aerospace BAe 146-100","141"),
(NULL,"Airbus Industrie A318","318"),
(NULL, "Boeing 747-100", "741"),
(NULL, "Boeing 767-400", "764"),
(NULL,"British Aerospace BAe 146-200","142");

INSERT INTO  Routes
(routeId,departAirportId,arriveAirportId,airlineId) VALUES
(NULL,"5", "4","5"),
(NULL,"7", "6","4"),
(NULL,"9", "8","3");


INSERT INTO  LiveFlightData
(liveFlightDataId,updated,latitude,longitude,altitude,direction,speedHorizontal,speedVertical,isGround) VALUES
(NULL,),
(NULL,),
(NULL,);

INSERT INTO  Flights
(flightId,flightDate,flightStatus,number,iata,icao,codeShared,  departAirportId,arriveAirportId,routeId,aircraftTypeId,liveFlightDataId) VALUES
(NULL,"2022-11-11","landed","3337","BR3337","EVA3337",NULL, "5", "4", "1","3",liveFlightDataId),
(NULL,"2022-11-11","scheduled","4715","AD4715","AZU4715",NULL, "7", "6", "2","5",liveFlightDataId),
(NULL,"2022-11-11","scheduled","2216","CZ2216","CSN2216",NULL, "9", "8", "3","6",liveFlightDataId);
