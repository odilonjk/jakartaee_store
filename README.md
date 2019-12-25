# Jakarta EE Store

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
 
Repository where I'll put part of my Jakarta EE studies.

---

### This project uses

* JDK 13
* Jakarta EE 8
* JNoSQL 0.0.9
* Maven 3.6
* MongoDB
---

### MongoDB

To run properly the API, you'll need to have running a MongoDB instance on the default properties: `localhost:27017`.

Feel free to change the `jnosql.json` file if there's a need to use another configuration.

---

### Running from terminal in dev mode

```
mvn liberty:dev
```

---

### Using the API

`http://localhost:9080/stores/api/health` return the health check.

`http://localhost:9080/stores/api/store/{store_name}` persist a new store on MongoDB.

`http://localhost:9080/stores/api/store/0/{store_id}` return the store.

