# Ride Sharing System (OLA/UBER) LLD

## Functional Requirements
 ### Rider
- Can request for ride
- Cancel a ride
- View ride details
 ### Driver
- Can be Online/Offline
- Can accept / reject the ride
 ### System
- Should match rider to driver based on algorithm
- Track the ride status (  REQUESTED , ONGOING ,COMPLETED, CANCELLED)
- Calculate fare dynamically
- Handles payment

## Non Functional Requirement
- Low Latency
- High Availability
- Scalable
- Concurrency (No double booking)
- Fault Tolerance


## Design Patterns
- Composite Pattern
- Strategy Pattern

## Tech
- Java
- In-memory storage

## Schema design 
 ### Rider 
- riderId(primary key)
- name - String
- loc_lat -Double
- loc_lat - DOuble
- address -string
- createdAt - time

 ### Driver
- driverId : pk(string)
- name : string
- loc_lat :Double
- loc_log : Double
- location :String
- isAvailable : Boolean

 ### Trip
- trip_id : String
- driver_id :String 
- rider_id :String 
- src_lat : Double
- src_long: Double
- dest_lat :Double 
- dest_long:Double
- src_address : String
- dest_address : String 
