
# Challenge Back-end Uber

Realizei a criação desse repositorio, para guardar os conhecimentos adquiridos ao realizar a criação dessa API para solução do problema proposto pela Uber.
Foi criado um Email Service para enviar emails utilizando o AWS Ses.


## Referência

 - [Documentação do projeto original ](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md)
 - [Linkedin Pessoal](https://www.linkedin.com/in/vitorlucascrispim/)



## Documentação da API

#### Para o funcionamento do projeto e necessario possuir um  IAM e permissões no sos emails do SeS da AWS, as configurações abaixo são necessarias no AWS Cli

```http
aws:
accessKeyId: SUA_ACESS_KEY_ID
secretKey: SUA_SECRET_KEY
region: REGIÃO_DEFAULT
```
#### O servico na sua verão 1.0 conta somente com uma requisão do tipo POST

```http
 POST:/api/email
 Com o seguinte JSON
 {
	"to":"email",
	"subject":"teste aws  ",
	"body":" teste"

}
```


## Instalação

Necessario todo ambiente spring
  - [Documentação Spring - Intellij](https://www.jetbrains.com/help/idea/spring-support.html)   
- [Documentação Spring - Eclipse](https://www.eclipse.org/community/eclipse_newsletter/2018/february/springboot.php)   

## Rodando localmente

Realize a instação de dependencias do pom.xml e utilize a IDE de preferencia para rodar o spring 




