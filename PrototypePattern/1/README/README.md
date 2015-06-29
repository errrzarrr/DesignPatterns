## Interface for working with databases

> using Prototype Pattern

Back-end systems that handle connections through the network have the issue of long time delays; same happens in the case of a back-end system dealing with data from a database. They have the big issue of time constraints and time delays and big memory resources to handle. If they have both, this is if they have to deal with a database through the net, which happens to be the case for most databases in real life, the issue is double. 

#### Prototype Pattern comes to help.

In this system `DataBaseSimulation` represents an object which takes considerable amount of time to instantiate, as is the case in a query to a database or operations through the net.

Our system needs to query tables from our DB in many ways, many times; but because each query is so time taxing, it's necessary to make a local clone from `db`, `db` object makes all the queries and copies for the first and only time. From now on we will only make use of the clone, named `dbCopy`, which shall handle all the data for us. Time won't meddle anymore. Instant access.


