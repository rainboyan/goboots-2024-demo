# GoBoots 2024

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2024.0.0-M3`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2024.0.0-M3
------------------------------------------------------------

Build time:   2023-10-31 08:53:32 UTC
Revision:     5932792a99a9ce8f0bb98ca9fbf5e5747d4caae0

Spring Boot:  3.2.0-RC1
Gradle:       7.6.3
Groovy:       4.0.15
JVM:          21 (Oracle Corporation 21+35-2513)
OS:           Mac OS X 12.7.1 aarch64
```

### App Environment

```bash
➜  goboots-2024-demo git:(main) ✗ goboots about
| About your application's environment

Name:               goboots-2024-demo
Version:            0.1
Plugins:            [core:2024.0.0-M3], [dataSource:2024.0.0-M3], [i18n:2024.0.0-M3], [codecs:2024.0.0-M3], [restResponder:2024.0.0-M3], [controllers:2024.0.0-M3], [converters:2024.0.0-M3], [urlMappings:2024.0.0-M3], [interceptors:2024.0.0-M3], [domainClass:2024.0.0-M3], [services:2024.0.0-M3], [groovyPages:2024.0.0-M3], [cache:7.0.0-M1], [controllersAsync:7.0.0-M1], [fields:7.0.0-M1], [hibernate:2024.0.0-M2], [assetPipeline:7.0.0-M2], [scaffolding:7.0.0-M1], [eventBus:7.0.0-M1], [dynamicModules:2024.0.0-M3], [geb:7.0.0-M1], [databaseMigration:4.2.0]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo
Environment:        development

Grails:             2024.0.0-M3
Groovy:             4.0.15
Gradle:             8.4
Spring Boot:        3.2.0-RC1
JVM:                21 (Oracle Corporation 21+35-2513)
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
|    1    |  Core                |  2024.0.0-M3                  |
|    2    |  DataSource          |  2024.0.0-M3                  |
|    3    |  I18n                |  2024.0.0-M3                  |
|    4    |  Codecs              |  2024.0.0-M3                  |
|    5    |  RestResponder       |  2024.0.0-M3                  |
|    6    |  Controllers         |  2024.0.0-M3                  |
|    7    |  Converters          |  2024.0.0-M3                  |
|    8    |  UrlMappings         |  2024.0.0-M3                  |
|    9    |  Interceptors        |  2024.0.0-M3                  |
|   10    |  DomainClass         |  2024.0.0-M3                  |
|   11    |  DynamicModules      |  2024.0.0-M3                  |
|   12    |  Services            |  2024.0.0-M3                  |
|   13    |  GroovyPages         |  2024.0.0-M3                  |
|   14    |  Hibernate           |  2024.0.0-M2                  |
|   15    |  AssetPipeline       |  7.0.0-M2                     |
|   16    |  ControllersAsync    |  7.0.0-M1                     |
|   17    |  EventBus            |  7.0.0-M1                     |
|   18    |  Cache               |  7.0.0-M1                     |
|   19    |  Fields              |  7.0.0-M1                     |
|   20    |  Geb                 |  7.0.0-M1                     |
|   21    |  Scaffolding         |  7.0.0-M1                     |
|   22    |  DatabaseMigration   |  4.2.0                        |


### Running App

```bash
➜  goboots-2024-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
2023-10-31 17:38:58.310  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 8.0.1.Final
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                      (v2024.0.0-M3)

2023-10-31 17:38:58.372  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 21 with PID 29860 (/Users/rain/Development/github/grails/grails-demos/goboots-2024-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo)
2023-10-31 17:38:58.372 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v3.2.0-RC1, Spring v6.1.0-RC1
2023-10-31 17:38:58.372  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-10-31 17:38:58.399  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-10-31 17:38:58.399  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-10-31 17:38:58.951  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 22 plugins loaded successfully, take in 119 ms
2023-10-31 17:38:59.753  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2023-10-31 17:38:59.757  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-10-31 17:38:59.758  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-31 17:38:59.758  INFO --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.15]
2023-10-31 17:38:59.779  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-31 17:38:59.779  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1380 ms
2023-10-31 17:38:59.945  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-10-31 17:39:00.300  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-10-31 17:39:00.482  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-10-31 17:39:00.533  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-10-31 17:39:00.668  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-10-31 17:39:01.146  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-10-31 17:39:01.366  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-10-31 17:39:01.373  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-10-31 17:39:01.373  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-10-31 17:39:01.374  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-10-31 17:39:01.375  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2023-10-31 17:39:01.478  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.316 seconds (process running for 3.756)
2023-10-31 17:39:01.486  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2024.0.0-M3                              Y
    2      DataSource                               2024.0.0-M3                              Y
    3      I18n                                     2024.0.0-M3                              Y
    4      Codecs                                   2024.0.0-M3                              Y
    5      RestResponder                            2024.0.0-M3                              Y
    6      Controllers                              2024.0.0-M3                              Y
    7      Converters                               2024.0.0-M3                              Y
    8      UrlMappings                              2024.0.0-M3                              Y
    9      Interceptors                             2024.0.0-M3                              Y
   10      DomainClass                              2024.0.0-M3                              Y
   11      GroovyPages                              2024.0.0-M3                              Y
   12      Fields                                   7.0.0-M1                                 Y
   13      DynamicModules                           2024.0.0-M3                              Y
   14      ControllersAsync                         7.0.0-M1                                 Y
   15      AssetPipeline                            7.0.0-M2                                 Y
   16      EventBus                                 7.0.0-M1                                 Y
   17      Scaffolding                              7.0.0-M1                                 Y
   18      DatabaseMigration                        4.2.0                                    Y
   19      Hibernate                                2024.0.0-M2                              Y
   20      Geb                                      7.0.0-M1                                 Y
   21      Services                                 2024.0.0-M3                              Y
   22      Cache                                    7.0.0-M1                                 Y
----------------------------------------------------------------------------------------------

2023-10-31 17:39:01.507  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
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
