## /airlines
original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

: get data about global airlines

Parameters:

| Object       |  Description          |
|--------------|:-------------|
| airline_name | Filter results by providing the full name of the airline. |

Example response:

```json
{
   "data": [
      {
         "airline_name": "American Airlines",
         "iata_code": "AA",
         "iata_prefix_accounting": "1",
         "icao_code": "AAL",
         "callsign": "AMERICAN",
         "type": "scheduled",
         "status": "active",
         "fleet_size": "963",
         "fleet_average_age": "10.9",
         "date_founded": "1934",
         "hub_code": "DFW",
         "country_name": "United States",
         "country_iso2": "US"
      },
      [...]
   ]
}
```