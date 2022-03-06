# spring-boot-microservice-3-gateway

Jwt Gradle kütüphanelerini bulup programa eklemek gerekli.
build.gradle a ekle.
jjwt maven yazın mvn repositorye girip jwt-jackson , jwt-imp ve jwt-api yi indir.

// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-impl
runtimeOnly group: 'io.jsonwebtoken', name: 'jjwt-impl', version: '0.11.2'

// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api
implementation group: 'io.jsonwebtoken', name: 'jjwt-api', version: '0.11.2'

// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-jackson
runtimeOnly group: 'io.jsonwebtoken', name: 'jjwt-jackson', version: '0.11.2'

online rsa key generator devglan.com a gir. 2048 bit olarak oluştur ve applicaion.properties e gir.
