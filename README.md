This refers to [JERSEY-2933](https://java.net/jira/browse/JERSEY-2933)

It works as standalone Grizzly application (`mvn compile exec:java`) but when deploying in a CDI environment it breaks (compile the WAR with `mvn compile war:war`).
This inject the default Derby database resource `jdbc/__default`, but doesn't actually use it (the injection triggers the `ClassCastException`).

Deploy the application and go to:

<http://localhost:8888/filtering/api/hosts?fields=id,interfaces.items.functions.trigger.status>
