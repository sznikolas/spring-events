Spring events: https://www.baeldung.com/spring-events
 - Annotation-Driven
 - Async
 - Generics Support
 - Transaction-Bound events
 - Useful in monolithic architecture
 - we can set the event orders if its synchronous (async case: @Order - but its not recommended approach, because async means can't predict)
 - This approach is only for within an application (intra application communication) 
 - With this approach we can avoid tight coupling
 - Easier testing