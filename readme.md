
# Christmas Draw API
Spring Boot version of the Christmas Draw App API.


## Technologies


**Java**\
**Spring Boot** 

  
## Post Structure

```json
{
    "id": 287,
    "name": "participant1",
    "pair": "participant2",
    "drawID": "de8ef80f-0ed1-04ef-9949-659d6f2d7ce6"
}
```

  
## API Usage

#### Create a participant

```http
  POST /api/participants/add
```

| Parameter | Type     | Description                |
| :-------- | :------- | :-------------------------------- |
| `name`      | `string` | The name of the participant. |
| `pair`      | `string` | The pait of the participant. |
| `drawID`      | `string` | UUID of the draw. |


#### Read all participants of draw.

```http
  GET /api/participants/getbyid?drawID={drawID}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :-------------------------------- |
| `drawID`      | `string` | UUID of the draw. |


