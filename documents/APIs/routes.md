## /routes
original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

: provide data about airline routes

Parameters

| Object        |  Description          |
| ------------- |:-------------|
|flight_number|Filter results by providing a flight number. Example: *2557*|
|dep_iata|Filter results by departure city or airport using an IATA code.|
|arr_iata|Filter results by arrival city or airport using an IATA code.|
|dep_icao|Filter results by departure airport using an ICAO code.|
|arr_icao|Filter results by arrival airport using an ICAO code.|
|airline_iata|Filter results by airline IATA code.|
|airline_icao|Filter results by airline ICAO code.|

Example response:
```json
{
   "data": [
      {
         "departure": {
            "airport": "Brussels Airport",
            "timezone": "Europe/Brussels",
            "iata": "BRU",
            "icao": "EBBR",
            "terminal": null,
            "time": "06:10:00"
         },
         "arrival": {
            "airport": "Girona-Costa Brava",
            "timezone": "Europe/Madrid",
            "iata": "GRO",
            "icao": "LEGE",
            "terminal": "1",
            "time": "07:55:00"
         },
         "airline": {
            "name": "Brussels Airlines",
            "callsign": "B-LINE",
            "iata": "SN",
            "icao": "BEL"
         },
         "flight": {
            "number": "3683"
         }
      },
      [...]
   ]
}
```