## /aviation_taxes
original api(with description) url: [https://aviationstack.com/documentation](https://aviationstack.com/documentation)

: get data about aviation taxes

Parameters:

| Object        |  Description          |
| ------------- |:-------------|
|  tax_name  | Filter results by providing the aircraft name of the aviation tax. |
|  iata_code   |   Filter results by providing the iata code of the aviation tax.  |

Example response:
```json 
{
   "data": [
      {
         "tax_name": "Government Tax",
         "iata_code": "AB"
      },
      [...]
   ]
}
```



