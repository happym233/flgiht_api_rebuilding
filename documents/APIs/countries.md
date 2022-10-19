## /countries
original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

: get data about destination countries

Parameters:

| Object        |  Description          |
| ------------- |:-------------|
|  country_name  | Filter results by providing the country_name of a country. |

Example response:
```json 
{
   "data": [
      {
         "country_name": "Andorra",
         "country_iso2": "AD",
         "country_iso3": "AND",
         "country_iso_numeric": "20",
         "population": "84000",
         "capital": "Andorra la Vella",
         "continent": "EU",
         "currency_name": "Euro",
         "currency_code": "EUR",
         "fips_code": "AN",
         "phone_prefix": "376"
      },
      [...]
   ]
} 
```
