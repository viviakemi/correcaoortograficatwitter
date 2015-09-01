# correcaoortograficatwitter
Para testar configurar:
1- alterar o twitter4j.properties (com as configurações para acesso a api do twitter)
2- Utilizar a classe RESTEasyClient.java passando no args[0] o tempo em que a requisição ficará ativa.
3- O servico deve ser acessado através http://ip:porta/teste_vivi/jsonServices/send

Há um problema no filtro de locations localizado no arquivo RestServiceToTwitter.java. Apesar de informar as coordenadas das cidades
(BH e RJ) ocorre um erro na leitura das coordenadas. Se comentar o filtro de locations, o programa utiliza as mensagens postadas em portugues
e que possuem a letra a.
