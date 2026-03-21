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