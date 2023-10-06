# GoBoots 2024

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2024.0.0-M2`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2024.0.0-M2
------------------------------------------------------------

Build time:   2023-09-27 02:46:36 UTC
Revision:     a99257ee467243fd513688831fe57e787975b256

Spring Boot:  3.2.0-M3
Gradle:       7.6.2
Groovy:       4.0.15
JVM:          21 (Oracle Corporation 21+35-2513)
OS:           Mac OS X 12.6.9 aarch64
```

### App Environment

```bash
➜  goboots-2024-demo git:(main) ✗ goboots about
| About your application's environment

Name:               goboots-2024-demo
Version:            0.1
Plugins:            [core:2024.0.0-M2], [dataSource:2024.0.0-M2], [i18n:2024.0.0-M2], [codecs:2024.0.0-M2], [restResponder:2024.0.0-M2], [controllers:2024.0.0-M2], [converters:2024.0.0-M2], [urlMappings:2024.0.0-M2], [interceptors:2024.0.0-M2], [domainClass:2024.0.0-M2], [services:2024.0.0-M2], [groovyPages:2024.0.0-M2], [controllersAsync:6.0.3], [dynamicModules:2024.0.0-M2], [scaffolding:6.0.3], [geb:6.0.3], [hibernate:2023.0.3], [assetPipeline:7.0.0-M1], [cache:6.0.3], [eventBus:6.0.3], [fields:6.0.3], [databaseMigration:4.2.0]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo
Environment:        development

Grails:             2024.0.0-M2
Groovy:             4.0.15
Gradle:             8.4
Spring Boot:        3.2.0-M3
JVM:                21 (Oracle Corporation 21+35-2513)
OS:                 Mac OS X 12.6.9 aarch64
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
|    1    |  Core                |  2024.0.0-M2                  |
|    2    |  DataSource          |  2024.0.0-M2                  |
|    3    |  I18n                |  2024.0.0-M2                  |
|    4    |  Codecs              |  2024.0.0-M2                  |
|    5    |  RestResponder       |  2024.0.0-M2                  |
|    6    |  Controllers         |  2024.0.0-M2                  |
|    7    |  Converters          |  2024.0.0-M2                  |
|    8    |  UrlMappings         |  2024.0.0-M2                  |
|    9    |  Interceptors        |  2024.0.0-M2                  |
|   10    |  DomainClass         |  2024.0.0-M2                  |
|   11    |  DynamicModules      |  2024.0.0-M2                  |
|   12    |  Services            |  2024.0.0-M2                  |
|   13    |  GroovyPages         |  2024.0.0-M2                  |
|   14    |  Hibernate           |  2023.0.3                     |
|   15    |  AssetPipeline       |  7.0.0-M1                     |
|   16    |  ControllersAsync    |  6.0.3                        |
|   17    |  EventBus            |  6.0.3                        |
|   18    |  Cache               |  6.0.3                        |
|   19    |  Fields              |  6.0.3                        |
|   20    |  Geb                 |  6.0.3                        |
|   21    |  Scaffolding         |  6.0.3                        |
|   22    |  DatabaseMigration   |  4.2.0                        |


### Running App

```bash
➜  goboots-2024-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
2023-10-06 17:48:06.643  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 8.0.1.Final
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                      (v2024.0.0-M2)

2023-10-06 17:48:06.704  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 21 with PID 62539 (/Users/rain/Development/github/grails/grails-demos/goboots-2024-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo)
2023-10-06 17:48:06.704 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v3.2.0-M3, Spring v6.1.0-M5
2023-10-06 17:48:06.705  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-10-06 17:48:06.725  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-10-06 17:48:06.726  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-10-06 17:48:07.286  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 22 plugins loaded successfully, take in 118 ms
2023-10-06 17:48:08.085  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2023-10-06 17:48:08.089  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-10-06 17:48:08.090  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-06 17:48:08.091  INFO --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.13]
2023-10-06 17:48:08.119  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-06 17:48:08.119  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1393 ms
2023-10-06 17:48:08.334  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-10-06 17:48:08.538  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-10-06 17:48:08.657  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-10-06 17:48:08.706  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-10-06 17:48:08.833  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-10-06 17:48:09.172  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-10-06 17:48:09.373  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-10-06 17:48:09.380  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-10-06 17:48:09.380  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-10-06 17:48:09.381  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-10-06 17:48:09.381  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2023-10-06 17:48:09.485  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 2.991 seconds (process running for 3.427)
2023-10-06 17:48:09.493  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2024.0.0-M2                              Y
    2      DataSource                               2024.0.0-M2                              Y
    3      I18n                                     2024.0.0-M2                              Y
    4      Codecs                                   2024.0.0-M2                              Y
    5      RestResponder                            2024.0.0-M2                              Y
    6      Controllers                              2024.0.0-M2                              Y
    7      Converters                               2024.0.0-M2                              Y
    8      UrlMappings                              2024.0.0-M2                              Y
    9      Interceptors                             2024.0.0-M2                              Y
   10      DomainClass                              2024.0.0-M2                              Y
   11      GroovyPages                              2024.0.0-M2                              Y
   12      Geb                                      6.0.3                                    Y
   13      Hibernate                                2023.0.3                                 Y
   14      AssetPipeline                            7.0.0-M1                                 Y
   15      Scaffolding                              6.0.3                                    Y
   16      DynamicModules                           2024.0.0-M2                              Y
   17      DatabaseMigration                        4.2.0                                    Y
   18      ControllersAsync                         6.0.3                                    Y
   19      EventBus                                 6.0.3                                    Y
   20      Fields                                   6.0.3                                    Y
   21      Services                                 2024.0.0-M2                              Y
   22      Cache                                    6.0.3                                    Y
----------------------------------------------------------------------------------------------

2023-10-06 17:48:09.601  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
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
