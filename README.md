# GoBoots 2024

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2024.0.0-M1`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2024.0.0-M1
------------------------------------------------------------

Build time:   2023-09-08 08:41:42 UTC
Revision:     dd6cf85dc5881ea7d35e95ad0db40f6ceb33e5c2

Spring Boot:  3.2.0-M2
Gradle:       7.6.2
Groovy:       4.0.14
JVM:          17.0.8 (Azul Systems, Inc. 17.0.8+7-LTS)
OS:           Mac OS X 12.6.8 aarch64
```

### App Environment

```bash
➜  goboots-2024-demo git:(main) ✗ goboots about
| About your application's environment

Name:               goboots-2024-demo
Version:            0.1
Plugins:            [core:2024.0.0-M1], [dataSource:2024.0.0-M1], [i18n:2024.0.0-M1], [codecs:2024.0.0-M1], [restResponder:2024.0.0-M1], [controllers:2024.0.0-M1], [converters:2024.0.0-M1], [urlMappings:2024.0.0-M1], [interceptors:2024.0.0-M1], [domainClass:2024.0.0-M1], [groovyPages:2024.0.0-M1], [hibernate:2023.0.2], [databaseMigration:4.2.0], [scaffolding:6.0.2], [assetPipeline:7.0.0-M1], [fields:6.0.2], [controllersAsync:6.0.2], [eventBus:6.0.2], [dynamicModules:2024.0.0-M1], [geb:6.0.2], [services:2024.0.0-M1], [cache:6.0.2]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo
Environment:        development

Grails:             2024.0.0-M1
Groovy:             4.0.14
Gradle:             7.6.2
Spring Boot:        3.2.0-M2
JVM:                17.0.8 (Azul Systems, Inc. 17.0.8+7-LTS)
OS:                 Mac OS X 12.6.8 aarch64

| EXECUTE SUCCESSFUL
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
|    1    |  Core                |  2024.0.0-M1                  |
|    2    |  DataSource          |  2024.0.0-M1                  |
|    3    |  I18n                |  2024.0.0-M1                  |
|    4    |  Codecs              |  2024.0.0-M1                  |
|    5    |  RestResponder       |  2024.0.0-M1                  |
|    6    |  Controllers         |  2024.0.0-M1                  |
|    7    |  Converters          |  2024.0.0-M1                  |
|    8    |  UrlMappings         |  2024.0.0-M1                  |
|    9    |  Interceptors        |  2024.0.0-M1                  |
|   10    |  DomainClass         |  2024.0.0-M1                  |
|   11    |  DynamicModules      |  2024.0.0-M1                  |
|   12    |  Services            |  2024.0.0-M1                  |
|   13    |  GroovyPages         |  2024.0.0-M1                  |
|   14    |  Hibernate           |  2024.0.0-M1                  |
|   15    |  AssetPipeline       |  7.0.0-M1                     |
|   16    |  ControllersAsync    |  6.0.1                        |
|   17    |  EventBus            |  6.0.1                        |
|   18    |  Cache               |  6.0.1                        |
|   19    |  Fields              |  6.0.1                        |
|   20    |  Geb                 |  6.0.1                        |
|   21    |  Scaffolding         |  6.0.1                        |
|   22    |  DatabaseMigration   |  4.2.0                        |


### Running App

```bash
➜  goboots-2024-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
2023-09-08 17:13:25.627  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 8.0.1.Final
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                   (v2024.0.0-M1)

2023-09-08 17:13:25.691  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 8.0.1.Final
2023-09-08 17:13:25.715  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 17.0.8 with PID 57969 (/Users/rain/Development/github/grails/grails-demos/goboots-2024-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo)
2023-09-08 17:13:25.715 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v3.2.0-M2, Spring v6.1.0-M4
2023-09-08 17:13:25.715  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-09-08 17:13:25.737  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-09-08 17:13:25.737  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-09-08 17:13:26.308  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 22 plugins loaded successfully, take in 119 ms
2023-09-08 17:13:27.128  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2023-09-08 17:13:27.132  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-09-08 17:13:27.133  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-09-08 17:13:27.133  INFO --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.12]
2023-09-08 17:13:27.163  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-09-08 17:13:27.163  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1426 ms
2023-09-08 17:13:27.341  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-09-08 17:13:27.551  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-09-08 17:13:27.695  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-09-08 17:13:27.748  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-09-08 17:13:27.874  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-09-08 17:13:28.230  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-09-08 17:13:28.443  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-09-08 17:13:28.449  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-09-08 17:13:28.449  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-09-08 17:13:28.450  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-09-08 17:13:28.451  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2023-09-08 17:13:28.557  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.01 seconds (process running for 3.452)
2023-09-08 17:13:28.561  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2024.0.0-M1                              Y
    2      DataSource                               2024.0.0-M1                              Y
    3      I18n                                     2024.0.0-M1                              Y
    4      Codecs                                   2024.0.0-M1                              Y
    5      RestResponder                            2024.0.0-M1                              Y
    6      Controllers                              2024.0.0-M1                              Y
    7      Converters                               2024.0.0-M1                              Y
    8      UrlMappings                              2024.0.0-M1                              Y
    9      Interceptors                             2024.0.0-M1                              Y
   10      DomainClass                              2024.0.0-M1                              Y
   11      GroovyPages                              2024.0.0-M1                              Y
   12      DynamicModules                           2024.0.0-M1                              Y
   13      Fields                                   6.0.2                                    Y
   14      AssetPipeline                            7.0.0-M1                                 Y
   15      Hibernate                                2023.0.2                                 Y
   16      EventBus                                 6.0.2                                    Y
   17      Geb                                      6.0.2                                    Y
   18      Scaffolding                              6.0.2                                    Y
   19      DatabaseMigration                        4.2.0                                    Y
   20      ControllersAsync                         6.0.2                                    Y
   21      Services                                 2024.0.0-M1                              Y
   22      Cache                                    6.0.2                                    Y
----------------------------------------------------------------------------------------------

2023-09-08 17:13:28.590  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2024-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.128:8080
----------------------------------------------------------------------------------------------
```
