## /airplanes

original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

Parameters:


| Object        |  Description          |
| ------------- |:-------------|
|  model_name  | Filter results by providing the model name of the airplane. |
|  model_code   |   Filter results by providing the model code of the airplane.  |
| airplane_iata_code |   Filter results by providing the iata code of the airplane. |
| airplane_icao_code |   Filter results by providing the icao code of the airplane. |


Example response:
```json 
{
   "data": [
      {
         "registration_number": "YR-BAC",
         "production_line": "Boeing 737 Classic",
         "iata_type": "B737-300",
         "model_name": "737",
         "model_code": "B737-377",
         "icao_code_hex": "4A0823",
         "iata_code_short": "B733",
         "construction_number": "23653",
         "test_registration_number": null,
         "rollout_date": null,
         "first_flight_date": "1986-08-02T22:00:00.000Z",
         "delivery_date": "1986-08-21T22:00:00.000Z",
         "registration_date": "0000-00-00",
         "line_number": "1260",
         "plane_series": "377",
         "airline_iata_code": "0B",
         "airline_icao_code": null,
         "plane_owner": "Airwork Flight Operations Ltd",
         "engines_count": "2",
         "engines_type": "JET",
         "plane_age": "31",
         "plane_status": "active",
         "plane_class": null
      },
      [...]
   ]
}
```
