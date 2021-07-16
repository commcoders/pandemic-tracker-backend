# pandemic-tracker-backend
Backend Application

## Prerequisites

- Install Gradle (See below)

## How to build the application 

1. Check out code
2. go to the project folder
3. provide DB connection details in `/src/main/resources/application.properties`
4. Build the app. The jar  file will be generated in `/build/libs`

```shell
gradle clean build  --refresh-dependencies
```

5. Using the Jar file run below comand

```shell
java - jar jarfileName.jar
```

6. application will be running on 8080 port
 

## Techonologies Planned
 -  Graddle(Need for building)
 -  Java 8(Need for build)
- SPRING BOOT(it will be automatically downloaded)
 - HIBERNATE(it will be automatically downloaded)
 - MYSQL-to be installed and provide details as mentioned above

## How to Install Gradle
(Debian 10)

```shell
sudo apt update
sudo apt install default-jdk

# check java version
java -version

# download and install gradle
wget https://services.gradle.org/distributions/gradle-6.3-bin.zip -P /tmp
sudo unzip -d /opt/gradle /tmp/gradle-*.zip
ls /opt/gradle/gradle-*

# Setting up the Environment Variables
sudo nano /etc/profile.d/gradle.sh
# add below content
export GRADLE_HOME=/opt/gradle/gradle-6.3
export PATH=${GRADLE_HOME}/bin:${PATH}

# enable execute permission
sudo chmod +x /etc/profile.d/gradle.sh
source /etc/profile.d/gradle.sh

# check version
gradle -v
```


## Design

  _<place holder>_
  
## Components

  _<place holder>_
