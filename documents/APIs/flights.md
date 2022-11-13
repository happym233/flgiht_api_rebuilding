## /fights
original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

:look up real-time information about one or multiple flights

Parameters:

| Object        |  Description          |
| ------------- |:-------------|
| flight_status      | Filter results by flight status. Available values: *scheduled*, *active*, *landed*, *cancelled*, *incident*, *diverted* |
|airline_name|Filter results by airline name|
|airline_iata|Filter results by airline IATA code.|
|airline_icao|Filter results by airline ICAO code.|
|flight_number|Filter results by providing a flight number. Example: *2557*|
|flight_iata|Filter results by providing a flight IATA code. Example: *MU2557*|
|flight_icao|Filter results by providing a flight ICAO code. Example: *CES2557*|

Example response:
    
```json
{
    "data": [
        {
            "flight_date": "2019-12-12",
            "flight_status": "active",
            "departure": {
                "airport": "San Francisco International",
                "timezone": "America/Los_Angeles",
                "iata": "SFO",
                "icao": "KSFO",
                "terminal": "2",
                "gate": "D11",
                "delay": 13,
                "scheduled": "2019-12-12T04:20:00+00:00",
                "estimated": "2019-12-12T04:20:00+00:00",
                "actual": "2019-12-12T04:20:13+00:00",
            },
            "arrival": {
                "airport": "Dallas/Fort Worth International",
                "timezone": "America/Chicago",
                "iata": "DFW",
                "icao": "KDFW",
                "terminal": "A",
                "gate": "A22",
                "baggage": "A17",
                "delay": 0,
                "scheduled": "2019-12-12T04:20:00+00:00",
                "estimated": "2019-12-12T04:20:00+00:00",
                "actual": null,
            },
            "airline": {
                "name": "American Airlines",
                "iata": "AA",
                "icao": "AAL"
            },
            "flight": {
                "number": "1004",
                "iata": "AA1004",
                "icao": "AAL1004",
                "codeshared": null
            },
            "aircraft": {
               "registration": "N160AN",
               "iata": "A321",
               "icao": "A321",
               "icao24": "A0F1BB"
            },
            "live": {
                "updated": "2019-12-12T10:00:00+00:00",
                "latitude": 36.28560000,
                "longitude": -106.80700000,
                "altitude": 8846.820,
                "direction": 114.340,
                "speed_horizontal": 894.348,
                "speed_vertical": 1.188,
                "is_ground": false
            }
        }, 
        [...]
    ]
}
```
