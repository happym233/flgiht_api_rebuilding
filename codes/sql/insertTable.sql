INSERT INTO Country
(countryId, countryName, countryIso2, countryIso3, countryIsoNumeric, population, capital, continent, currencyName, currencyCode, fipsCode, phonePrefix) VALUES
(1, "New Zealand", "NZ", "NZL", 554, 4252277, "Wellington", "OC", "Dollar", "NZD", "NZ", "64"),
(2, "Austria", "AT", "AUT", 40, 8205000, "Vienna", "EU", "Euro", "EUR", "AU", "43"),
(3, "Qatar", "QA", "QAT", 634, 840926, "Doha", "AS", "Rial", "QAR", "QA", "974"),
(4, "Hong Kong", "HK", "HKG", 344, 6898686, "Hong Kong", "AS", "Dollar", "HKD", "HK", "852"),
(5, "Singapore", "SG", "SGP", 702, 4701069, "Singapor", "AS", "Dollar", "SGD", "SN", "65"),
(6, "Switzerland", "CH", "CHE", 756, 7581000, "Berne", "EU", "Franc", "CHF", "SZ", "41"),
(7, "China", "CN", "CHN", 156, 1330044000, "Beijing", "AS", "Yuan Renminbi", "CNY", "CH", "86");

INSERT INTO City
(cityId, cityName, iataCode, latitude, longtitude, timezone, gmt, geonameId, countryId) VALUES
(1, "Auckland", "AKL", -36.84846, 174.763331, "Pacific\/Auckland", "12", "2193733", 1),
(2, "Queenstown", "UEE", -42.083332, 145.55, "Australia\/Hobart", "10", "2152272", 2),
(3, "Wellington", "WLG", -41.329037, 174.81216, "Pacific\/Auckland", "12", "2179537", 1),
(4, "Sydney", "SYD", -33.868901, 151.207091, "Australia\/Sydney", "10", "2147714", 2),
(5, "Doha", "DOH", 25.267569, 51.558067, "Asia\/Qatar", "3", "290030", 3),
(6, "Hong Kong", "HKG", 22.24786, 114.203384, "Asia\/Hong_Kong", "8", "1819729", 4),
(7, "Singapore", "SIN", 1.289437, 103.84998, "Asia\/Singapore", "8", "1880252", 5),
(8, "Zurich", "ZRH", 47.367347, 8.550002, "Europe\/Zurich", "1", "2657896", 6),
(9, "Fuzhou", "FOC", 25.93123, 119.66923, "Asia\/Shanghai", "8", "1810821", 7),
(10, "Dalian", "DLC", 38.96102, 121.53999, "Asia\/Shanghai", "8", "1814087",7);

INSERT INTO Airline
(airlineId, airlineName, iataCode, iataPrefixAccounting, icaoCode, callsign, airlineType, status, fleetSize, fleetAverageAge, dateFounded, hubCode, countryId) VALUES
(1, "Air New Zealand", "NZ", "86", "ANZ", "NEW ZEALAND", "scheduled", "active", 55, 7.6, 1940, "AKL", 1),
(2, "Qantas", "QF", "81", "QFA", "Q LINK", "scheduled", "active", 118, 9.2, 1920, "TMW", 2),
(3, "Qatar Airways", "QR", "157", "QTR", "QATARI", "scheduled", "active", 176, 5.7, 1994, "DOH", 3),
(4, "Silkair", "MI", "629", "SLK", "SILKAIR", "scheduled", "active", 30, 4, 1975, "SIN", 5),
(5, "Sichuan Airlines", "3U", "876", "CSC", "SICHUAN", "scheduled", "active", 107, 4.8, 1986, "CTU", 7);

INSERT INTO Airport
(airportId, airportName, iata, icao, cityId) VALUES
(1, "Auckland International", "AKL", "AKL", 1),
(2, "Queenstown", "UEE", "YQNS", 2),
(3, "Wellington International", "WLG", "NZWN", 3),
(4, "Kingsford Smith", "SYD", "YSSY", 4),
(5, "Doha International", "DOH", "OTHH", 5),
(6, "Hong Kong International", "HKG", "VHHH", 6),
(7, "Singapore Changi", "SIN", "WSSS", 7),
(8, "Zurich", "ZRH", "LSZH", 8),
(9, "Fuzhou", "FOC", "ZSFS", 9),
(10, "Dalian", "DLC", "ZYTL", 10);


INSERT INTO ScheduledAirport
(scheduledAirportId, terminal, scheduledTime, airportId) VALUES
(1, "D", "2022-11-13T07:00:00+00:00", 1),
(2, "D", "2022-11-13T08:50:00+00:00", 2),
(3, null, "2022-11-13T06:20:00+00:00", 3),
(4, "1", "2022-11-13T08:00:00+00:00", 4),
(5,  null, "2022-11-13T02:20:00+00:00", 5),
(6,  "1", "2022-11-13T14:45:00+00:00", 6),
(7,  "3", "2022-11-13T01:30:00+00:00", 7),
(8,  "2", "2022-11-13T07:50:00+00:00", 8),
(9, null, "2022-11-13T13:05:00+00:00", 9),
(10, null, "2022-11-13T15:30:00+00:00", 10);

INSERT INTO Route
(routeId, departAirportId, arriveAirportId, airlineId) VALUES
(1, 1, 2, 1),
(2, 3, 4, 2),
(3, 5, 6, 3),
(4, 7, 8, 4),
(5, 9, 10, 5);

INSERT INTO  ActualAirport
(actualAirportId, gate, delay, baggage, estimateTime, actualTime, scheduledAirportId) VALUES
(1, "30", 27, null, "2022-11-13T07:00:00+00:00", "2022-11-13T07:27:00+00:00", 1),
(2, null, 9, null, "2022-11-13T08:50:00+00:00", "2022-11-13T09:00:00+00:00", 2),
(3, "48", 7, null, "2022-11-13T06:27:00+00:00", "2022-11-13T06:27:00+00:00", 3),
(4, "54", null, 2, "2022-11-13T08:00:00+00:00", "2022-11-13T07:32:00+00:00", 4),
(5, "A9", 31, null, "2022-11-13T02:20:00+00:00", "2022-11-13T02:51:00+00:00", 5),
(6, null, 15, null, "2022-11-13T14:45:00+00:00", null, 6),
(7, null, 15, null, "2022-11-13T01:30:00+00:00", "2022-11-13T01:45:00+00:00", 7),
(8, null, null, null, "2022-11-13T07:50:00+00:00", null, 8),
(9, null, null, null, "2022-11-13T13:05:00+00:00", null, 9),
(10, null, null, null, "2022-11-13T15:30:00+00:00", null, 10);

INSERT INTO AircraftType
(aircraftTypeId, aircraftName, iataCode) VALUES
(1, "ZK-OYA", "A21N"),
(2, "VH-VZJ", "B738"),
(3, "A7-BAA", "B77W"),
(4, "9V-SWH", "B77W");

INSERT INTO LiveFlightData
(liveFlightDataId, updated, latitude, longitude, altitude, direction, speedHorizontal, speedVertical, isGround) VALUES
(1, "2022-11-13T02:01:34+00:00", 22.92, 71.39, 10668, 82, 1013.04, 0, false),
(2, "2022-11-12T21:37:48+00:00", 15.71, 76.82, 9753.6, 308.01, 947.304, 0, false);


INSERT INTO Flight
(flightId, flightDate, flightStatus, flightNumber, iata, icao, codeShared,  departAirportId, arriveAirportId, routeId, aircraftTypeId, liveFlightDataId) VALUES
(1, "2022-11-13", "landed", "611", "NZ611", "ANZ611", null, 1, 2, 1, 1, null),
(2, "2022-11-13", "landed", "162", "QF162", "QFA162", null, 3, 4, 2, 2, null),
(3, "2022-11-13", "active", "818", "QR818", "QTR818", null, 5, 6, 3, 3, 1),
(4, "2022-11-13", "active", "346", "SQ346", "SIA346", null, 7, 8, 4, 4, 2),
(5, "2022-11-13", "scheduled", "2057", "3U2057", "CSC2057", null, 9, 10, 5, null, null);



