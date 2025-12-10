test:
	mvn -q -DskipTests=false test

package:
	docker build --no-cache -t cicdtest:dev .
