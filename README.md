#Sample Junit for RepositoryRestResource

**Note:** Frozen - reference only

## Run

* Ensure there is a database cifi3, if not, create it using `mysql> create database cifi3;`

* `mvn spring-boot:run -Dspring.profiles.active=local -Dlogback-debug=true -Dport=8080`

## Test

* In eclipse, right-click on `jtest.AppRepoTest` _Run As_ -> JUnit Test

* OPtional: _Run Configurations_ -> _Arguements_ -> Add `-Dspring.profiles.active=test` under _VM arguements_ -> Run
