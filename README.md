# RealTimeLocationService
Monitor and track vehicle information

First install all service packages.  
./mvn clean install

##Service Start Sequence
1. docker-compose up
2. sh ./start-location-simulator.sh
3. sh ./start-location-ingest.sh
4. sh ./start-location-updater.sh
5. sh ./start-location-service.sh
6. go to driver location service folder and run sh ./upload-fleet.sh
7. sh ./start-service-location-service.sh
8. go to service location service folder and run sh ./upload-serviceLocations.sh
9. sh ./start-dashboard.sh

##UI
0. Open RabbitMQ UI on http://localhost:15672
1. Open Dashboard UI on http://localhost:8080
2. Open Simulator UI on http://localhost:9005
3. Click run simulation
4. Driver location: http://localhost:9000
5. Service location: http://localhost:9001
