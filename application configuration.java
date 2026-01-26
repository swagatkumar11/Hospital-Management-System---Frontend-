spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/mednex_db
    username: postgres
    password: postgres

  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        multiTenancy: SCHEMA
        show_sql: true
        format_sql: true