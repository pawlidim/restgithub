RestGitHub is a free and flexible Java library for GitHub based on Retrofit (A type-safe HTTP client for Android and Java) and GitHub REST API.

##How To Use

Add restgithub jar file to your application classpath. The following example shows the basic usage of this library. Create new GitHub object with  authentification method. In this example we use the basic method. It possible to use the access token. 

[Read more](https://developer.github.com/v3/oauth/)

```java
//create git hub service with basic authentification method
GitHub gitHub = new GitHub("username", "password");

//get git hub user service
GitHubUserService userService = gitHub.getUserService();

// get git hub user with login name pawlidim
User user = userService.getUserForName("pawlidim");
```