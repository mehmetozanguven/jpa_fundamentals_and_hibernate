This repo is a collection of the JPA Fundamentals examples. You can learn the JPA Fundamentals & Hibernate on my blog.



## Repositories:

- `entity-and-context` : Kind of a Hello world application for the JPA.
- `id-generation`: What are the `GenerationType.TABLE` and `GenerationType.IDENTITY` and where to use `@GenericGenerator(...)`
- `enumarated-and-temporal`: How to work with enum types (`@Enumaration`), date types and usage of `@Temporal` annotation
- `composed-keys`: How to work with composed key with `@Embeddable` way or `@IdClass` way 
- `one-to-one-relation`: Learn how to create one-to-one relationship between entities using `@SecondaryTable` or `@OneToOne` annotation
- `one-to-many-and-many-to-one`: Learn how to map one-to-many relationship and which methods are the best for the perfomance.
- `many-to-many`: Learn how to map many-to-many relationship.
- `association-override`: How to create relationship using `@Embeddable` and `@Embedded`
- `inheritance-strategies`: Learn options to construct inheritance relationship in JPA and also learn how to use `@MappedSuperclass`
- `entity-lifecycle`: Learn how to use entity lifecycle events.