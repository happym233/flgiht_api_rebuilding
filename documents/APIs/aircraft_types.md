## /aircraft_types

original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

: get data about different aircraft types

Parameters:

| Object        |  Description          |
| ------------- |:-------------|
|  aircraft_name  | Filter results by providing the aircraft name of the aircraft type. |
|  iata_code   |   Filter results by providing the iata code of the aircraft type.  |

Example response:
```json 
{
   "data": [
      {
         "aircraft_name": "Fokker 100",
         "iata_code": "100"
      },
      [...]
   ]
}
```
