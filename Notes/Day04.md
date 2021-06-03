03/06/2021

# Recap

- HTTP Version 1.1
- Handle Requests
- Perform CRUD Operations
- Produce Response
- CRUD Operations
- HTTP Methods
- @GetMapping
- @PostMapping
- @PutMapping
- @DeleteMapping
- @PathVariable
- PostMan
- @RequestBody
- Layered
    - Model
    - Controller
- Lambda
- Streams API

# Blog 2

Timestamp: 9:58

## Final Form of the API


GET all

Current Response

```json
[
    {
        "id": 0,
        "title": "The Fourth Post",
        "content": "asdass"
    },
    {
        "id": 1,
        "title": "The Fourth Post",
        "content": "asdass"
    },
    {
        "id": 2,
        "title": "The Fourth Post",
        "content": "asdass"
    }
]
```

Better Response

```json
{
    "message": "3 Records Successfully Retrieved",
    "posts": [
        {
            "id": 0,
            "title": "The Fourth Post",
            "content": "asdass"
        },
        {
            "id": 1,
            "title": "The Fourth Post",
            "content": "asdass"
        },
        {
            "id": 2,
            "title": "The Fourth Post",
            "content": "asdass"
        }
    ]
}
```

200 OK