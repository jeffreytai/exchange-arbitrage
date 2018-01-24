# exchange-arbitrage
Calculate arbitrage opportunities amongst digital exchanges and send alerts when threshold is met
- - - -
### Usage
Add a "slack.properties" file under src/main/resources with the following format:
```
webhook-url=<webhook-url>
```

Package the project with maven:
```
mvn clean package
```

Execute the jar file:
```
java -jar target/exchange-arbitrage-1.0-SNAPSHOT-with-dependencies.jar <base-exchange> <arbitrage-exchange>
```

Example:
```
java -jar target/exchange-arbitrage-1.0-SNAPSHOT-with-dependencies.jar binance coinrail
```
