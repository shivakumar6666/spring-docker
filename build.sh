rm -f *.jar
./mvnw clean install -DskipTests
cp target/*.jar runnable.jar

echo "Succeded"