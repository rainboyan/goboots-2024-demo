# GoBoots 2024

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2024.0.0-M5`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2024.0.0-M5
------------------------------------------------------------

Build time:   2023-12-08 16:52:21 UTC
Revision:     70106a46425f7290333f7d51dc2e6898f7b98c4d

Spring Boot:  3.2.0
Gradle:       7.6.3
Groovy:       4.0.15
JVM:          17.0.8 (Azul Systems, Inc. 17.0.8+7-LTS)
OS:           Mac OS X 12.7.1 aarch64
```

### App Environment

```bash
➜  goboots-2024-demo git:(main) ✗ goboots about
| About your application's environment

Name:               goboots-2024-demo
Version:            0.1
Plugins:            [core:2024.0.0-M5], [dataSource:2024.0.0-M5], [i18n:2024.0.0-M5], [codecs:2024.0.0-M5], [restResponder:2024.0.0-M5], [controllers:2024.0.0-M5], [converters:2024.0.0-M5], [urlMappings:2024.0.0-M5], [interceptors:2024.0.0-M5], [domainClass:2024.0.0-M5], [services:2024.0.0-M5], [groovyPages:2024.0.0-M5], [cache:7.0.0-M2], [hibernate:2024.0.0-M4], [fields:7.0.0-RC1], [assetPipeline:7.0.0-RC1], [dynamicModules:2024.0.0-M5], [databaseMigration:7.0.0-M1], [geb:7.0.0-RC1]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo
Environment:        development

Grails:             2024.0.0-M5
Groovy:             4.0.15
Gradle:             8.5
Spring Boot:        3.2.0
JVM:                17.0.8 (Azul Systems, Inc. 17.0.8+7-LTS)
OS:                 Mac OS X 12.7.1 aarch64
```

### App Directory

```bash
.
├── app
│   ├── assets
│   ├── conf
│   ├── controllers
│   ├── domain
│   ├── i18n
│   ├── init
│   ├── services
│   ├── taglib
│   ├── utils
│   └── views
├── gradle
│   └── wrapper
├── src
│   ├── integration-test
│   ├── main
│   └── test
├── README.md
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```

### Installed Plugins

| Order   |   Plugin Name        |  Plugin Version               |
|---------|----------------------|-------------------------------|
|    1    |  Core                |  2024.0.0-M5                  |
|    2    |  DataSource          |  2024.0.0-M5                  |
|    3    |  I18n                |  2024.0.0-M5                  |
|    4    |  Codecs              |  2024.0.0-M5                  |
|    5    |  RestResponder       |  2024.0.0-M5                  |
|    6    |  Controllers         |  2024.0.0-M5                  |
|    7    |  Converters          |  2024.0.0-M5                  |
|    8    |  UrlMappings         |  2024.0.0-M5                  |
|    9    |  Interceptors        |  2024.0.0-M5                  |
|   10    |  DomainClass         |  2024.0.0-M5                  |
|   11    |  DynamicModules      |  2024.0.0-M5                  |
|   12    |  Services            |  2024.0.0-M5                  |
|   13    |  GroovyPages         |  2024.0.0-M5                  |
|   14    |  Hibernate           |  2024.0.0-M4                  |
|   15    |  AssetPipeline       |  7.0.0-RC1                    |
|   16    |  Cache               |  7.0.0-M2                     |
|   17    |  DatabaseMigration   |  7.0.0-M1                     |
|   18    |  Fields              |  7.0.0-RC1                    |


### Running App

```bash
➜  goboots-2024-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
2023-12-10 20:19:34.893  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 8.0.1.Final
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                      (v2024.0.0-M5)

2023-12-10 20:19:34.921  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 21 with PID 78219 (/Users/rain/Development/github/grails/grails-demos/goboots-2024-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo)
2023-12-10 20:19:34.922 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v3.2.0, Spring v6.1.1
2023-12-10 20:19:34.922  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-12-10 20:19:34.942  INFO --- [  restartedMain] o.s.b.devtools.restart.ChangeableUrls    : The Class-Path manifest attribute in /Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/4.0.4/92957850e97a2bb5903cbc0c2403835acfde86d3/jaxb-impl-4.0.4.jar referenced one or more files that do not exist: file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/4.0.4/92957850e97a2bb5903cbc0c2403835acfde86d3/jaxb-core.jar,file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/4.0.4/92957850e97a2bb5903cbc0c2403835acfde86d3/angus-activation.jar
2023-12-10 20:19:34.942  INFO --- [  restartedMain] o.s.b.devtools.restart.ChangeableUrls    : The Class-Path manifest attribute in /Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-core/4.0.4/a635cc22352614c2565001efc1dfed6e2698632c/jaxb-core-4.0.4.jar referenced one or more files that do not exist: file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-core/4.0.4/a635cc22352614c2565001efc1dfed6e2698632c/jakarta.activation-api.jar,file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-core/4.0.4/a635cc22352614c2565001efc1dfed6e2698632c/jakarta.xml.bind-api.jar
2023-12-10 20:19:34.942  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-12-10 20:19:34.943  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-12-10 20:19:35.503  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 18 plugins loaded successfully, take in 107 ms
2023-12-10 20:19:36.251  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2023-12-10 20:19:36.255  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-12-10 20:19:36.255  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-12-10 20:19:36.255  INFO --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2023-12-10 20:19:36.274  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-12-10 20:19:36.275  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1331 ms
2023-12-10 20:19:36.438  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-12-10 20:19:36.667  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-12-10 20:19:36.803  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-12-10 20:19:36.859  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-12-10 20:19:37.274  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-12-10 20:19:37.624  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-12-10 20:19:37.830  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-12-10 20:19:37.838  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-12-10 20:19:37.838  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-12-10 20:19:37.839  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-12-10 20:19:37.840  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2023-12-10 20:19:37.929  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.189 seconds (process running for 3.779)
2023-12-10 20:19:37.937  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2024.0.0-M5                              Y
    2      DataSource                               2024.0.0-M5                              Y
    3      I18n                                     2024.0.0-M5                              Y
    4      Codecs                                   2024.0.0-M5                              Y
    5      RestResponder                            2024.0.0-M5                              Y
    6      Controllers                              2024.0.0-M5                              Y
    7      Converters                               2024.0.0-M5                              Y
    8      UrlMappings                              2024.0.0-M5                              Y
    9      Interceptors                             2024.0.0-M5                              Y
   10      DomainClass                              2024.0.0-M5                              Y
   11      GroovyPages                              2024.0.0-M5                              Y
   12      AssetPipeline                            7.0.0-RC1                                Y
   13      Hibernate                                2024.0.0-M4                              Y
   14      DynamicModules                           2024.0.0-M5                              Y
   15      Fields                                   7.0.0-RC1                                Y
   16      DatabaseMigration                        7.0.0-M1                                 Y
   17      Services                                 2024.0.0-M5                              Y
   18      Cache                                    7.0.0-M2                                 Y
----------------------------------------------------------------------------------------------

2023-12-10 20:19:37.947  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2024-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.127:8080
----------------------------------------------------------------------------------------------
```

### Links

* [GoBoots 2022 Demo](https://github.com/rainboyan/goboots-2022-demo)
* [GoBoots 2023 Demo](https://github.com/rainboyan/goboots-2023-demo)
* [GoBoots 2024 Demo](https://github.com/rainboyan/goboots-2024-demo)
