## /cities
original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

: get data about destination cities

Parameters:

| Object        |  Description          |
| ------------- |:-------------|
|  city_name  | Filter results by providing the city name of a city. |

Example response:
```json 
{    
   "data": [
      {
         "city_name": "Anaa",
         "iata_code": "AAA",
         "country_iso2": "PF",
         "latitude": "-17.05",
         "longitude": "-145.41667",
         "timezone": "Pacific/Tahiti",
         "gmt": "-10",
         "geoname_id": "0"
      },
      [...]
   ]
}
```
