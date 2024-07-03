
# Foro Hub Alura Project

```Currently working in the security with Spring Security and JWT Tokens.```

This project teaches how to make a API Rest for your own and how to make it  secure and optimized.

Mainly it uses Insomnia software to work with the HTTP Requests but you can use another one that you like.




## Authors

- [@albertscpv](https://github.com/Albertscpv)


### Instructions:

To login use the following Json structure: 
```json
{
	"login":"test.users",
	"password": "12112011"
}

```

To add a question use the following Json structure:
```json
{
	"user": "Test 1",
	"topic" : " Test 1 Question",
	"message": "Test 1 ",
	"creation_date": "Current date: dd/MM/yy"
}
```

To add an answer you need the message Id to response, you could get it with the HTTP request GET. 

```json
{
	"message_to_answer": "Test 1 post answer",
	"user": "Test 22",
	"topic": "Software test",
	"creation_date":"Current date: dd/MM/yy",
	"answer":"Checking the answers way"
}
```

You also could use the following HTTP request to prove some functions: 

- GET
- DELETE  __In this app is a Logical DELETE__
- POST
- PUT   __To update your answers or questions.__

To delete an specific message or answer you would need the "id"

	localhost:8080/path/{id}

Where path is the target and the id the target to manage.

## License

## [Apache](https://choosealicense.com/licenses/apache)

You can work and share your feedback if you want

