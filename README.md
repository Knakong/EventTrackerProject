# EventTrackerProject


| HTTP Verb | URI                  | Request Body                       | Response Body           |
|-----------|----------------------|------------------------------------|-------------------------|
| GET       | `/api/events`        |                                    | JSON of `List<Event>`   |
| GET       | `/api/events/1`      |                                    | JSON of `Event` 1       |
| POST      | `/api/events`        | JSON of a new `Event`              | JSON of created `Event` |
| PUT       | `/api/events/1`      | JSON of a new version of `Event` 1 | JSON of updated `Event` |
| DELETE    | `/api/events/1`      |                                    |                         |
