# GoBoots 2024

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2024.0.0-M4`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2024.0.0-M4
------------------------------------------------------------

Build time:   2023-11-20 08:49:13 UTC
Revision:     8f7b2aa490c1f50647492c6ef23cb2875dcd5eb3

Spring Boot:  3.2.0-RC2
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
Plugins:            [core:2024.0.0-M4], [dataSource:2024.0.0-M4], [i18n:2024.0.0-M4], [codecs:2024.0.0-M4], [restResponder:2024.0.0-M4], [controllers:2024.0.0-M4], [converters:2024.0.0-M4], [urlMappings:2024.0.0-M4], [interceptors:2024.0.0-M4], [domainClass:2024.0.0-M4], [services:2024.0.0-M4], [groovyPages:2024.0.0-M4], [assetPipeline:7.0.0-M3], [fields:7.0.0-M1], [geb:7.0.0-M1], [cache:7.0.0-M1], [hibernate:2024.0.0-M3], [dynamicModules:2024.0.0-M4]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo
Environment:        development

Grails:             2024.0.0-M4
Groovy:             4.0.15
Gradle:             8.4
Spring Boot:        3.2.0-RC2
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
|    1    |  Core                |  2024.0.0-M4                  |
|    2    |  DataSource          |  2024.0.0-M4                  |
|    3    |  I18n                |  2024.0.0-M4                  |
|    4    |  Codecs              |  2024.0.0-M4                  |
|    5    |  RestResponder       |  2024.0.0-M4                  |
|    6    |  Controllers         |  2024.0.0-M4                  |
|    7    |  Converters          |  2024.0.0-M4                  |
|    8    |  UrlMappings         |  2024.0.0-M4                  |
|    9    |  Interceptors        |  2024.0.0-M4                  |
|   10    |  DomainClass         |  2024.0.0-M4                  |
|   11    |  DynamicModules      |  2024.0.0-M4                  |
|   12    |  Services            |  2024.0.0-M4                  |
|   13    |  GroovyPages         |  2024.0.0-M4                  |
|   14    |  Hibernate           |  2024.0.0-M3                  |
|   15    |  AssetPipeline       |  7.0.0-M3                     |
|   16    |  Cache               |  7.0.0-M1                     |
|   17    |  Fields              |  7.0.0-M1                     |


### Running App

```bash
➜  goboots-2024-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
2023-11-23 14:58:07.372  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 8.0.1.Final
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                      (v2024.0.0-M4)

2023-11-23 14:58:07.408  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 21 with PID 51894 (/Users/rain/Development/github/grails/grails-demos/goboots-2024-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2024-demo)
2023-11-23 14:58:07.408 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v3.2.0-RC2, Spring v6.1.0-RC2
2023-11-23 14:58:07.408  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-11-23 14:58:07.430  INFO --- [  restartedMain] o.s.b.devtools.restart.ChangeableUrls    : The Class-Path manifest attribute in /Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/4.0.4/92957850e97a2bb5903cbc0c2403835acfde86d3/jaxb-impl-4.0.4.jar referenced one or more files that do not exist: file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/4.0.4/92957850e97a2bb5903cbc0c2403835acfde86d3/jaxb-core.jar,file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/4.0.4/92957850e97a2bb5903cbc0c2403835acfde86d3/angus-activation.jar
2023-11-23 14:58:07.430  INFO --- [  restartedMain] o.s.b.devtools.restart.ChangeableUrls    : The Class-Path manifest attribute in /Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-core/4.0.4/a635cc22352614c2565001efc1dfed6e2698632c/jaxb-core-4.0.4.jar referenced one or more files that do not exist: file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-core/4.0.4/a635cc22352614c2565001efc1dfed6e2698632c/jakarta.activation-api.jar,file:/Users/rain/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-core/4.0.4/a635cc22352614c2565001efc1dfed6e2698632c/jakarta.xml.bind-api.jar
2023-11-23 14:58:07.430  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-11-23 14:58:07.430  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-11-23 14:58:08.035  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 17 plugins loaded successfully, take in 109 ms
2023-11-23 14:58:08.773  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2023-11-23 14:58:08.777  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-11-23 14:58:08.778  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-11-23 14:58:08.778  INFO --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.15]
2023-11-23 14:58:08.798  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-11-23 14:58:08.798  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1368 ms
2023-11-23 14:58:08.964  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-11-23 14:58:09.189  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-11-23 14:58:09.301  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-11-23 14:58:09.381  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-11-23 14:58:09.795  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-11-23 14:58:10.144  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-11-23 14:58:10.349  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-11-23 14:58:10.357  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-11-23 14:58:10.357  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-11-23 14:58:10.358  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-11-23 14:58:10.359  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2023-11-23 14:58:10.442  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.23 seconds (process running for 3.802)
2023-11-23 14:58:10.449  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2024.0.0-M4                              Y
    2      DataSource                               2024.0.0-M4                              Y
    3      I18n                                     2024.0.0-M4                              Y
    4      Codecs                                   2024.0.0-M4                              Y
    5      RestResponder                            2024.0.0-M4                              Y
    6      Controllers                              2024.0.0-M4                              Y
    7      Converters                               2024.0.0-M4                              Y
    8      UrlMappings                              2024.0.0-M4                              Y
    9      Interceptors                             2024.0.0-M4                              Y
   10      DomainClass                              2024.0.0-M4                              Y
   11      GroovyPages                              2024.0.0-M4                              Y
   12      AssetPipeline                            7.0.0-M3                                 Y
   13      Fields                                   7.0.0-M1                                 Y
   14      DynamicModules                           2024.0.0-M4                              Y
   15      Hibernate                                2024.0.0-M3                              Y
   16      Services                                 2024.0.0-M4                              Y
   17      Cache                                    7.0.0-M1                                 Y
----------------------------------------------------------------------------------------------

2023-11-23 14:58:10.461  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
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
