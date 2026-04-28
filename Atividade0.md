1. Quais protocolos (os principais) são usados em uma comunicação realizada na web? Descreva muito brevemente o papel de cada um deles. 
R: HTTP: responsável pela comunicação entre cliente e servidor (requisição e resposta)
HTTPS: versão segura do HTTP, usa criptografia para proteger os dados
TCP: garante a transmissão dos dados pela rede 
IP: serve para identificar o dispositivo e permitir a troca de dados, garantindo que as informações cheguem ao local correto 
DNS: traduz nomes de domínio legíveis por humanos (como google.com) em endereços IP numéricos 

2. Alguns autores usam o termo “arquitetura da web” para se referir a como as camadas tecnológicas da web estão organizadas e aos princípios que definem a troca de informações entre essas camadas. Por questões didáticas e de simplificação, convencionou-se chamar essa arquitetura de “arquitetura cliente x servidor” ou arquitetura “requisição x resposta”. Explique de forma simplificada como funciona essa arquitetura. 
R: É um modelo onde o cliente (navegador) envia uma requisição para o servidor, e o servidor processa essa requisição e retorna uma resposta


3. Em uma arquitetura web, qual o papel desempenhado pelo protocolo HTTP? 
R: O HTTP é o protocolo que define como as requisições e respostas são feitas entre cliente e servidor, permitindo a troca de dados na web. 

4. O HTTP possui padrões uniformes para requisição e para resposta.
a) Dê ao menos três exemplos métodos de requisição e suas características;
R:
GET: busca dados do servidor
POST: envia dados para o servidor
PUT: atualiza dados existentes

b) Dê ao menos três exemplos status de respostas e quando ocorrem; 
R:
200 OK: requisição bem-sucedida
404 Not Found: recurso não encontrado
500 Internal Server Error: erro interno no servidor






5. Em uma arquitetura web é sempre o cliente quem inicia o processo de comunicação: o cliente requisita, o servidor responde. Contudo, aplicações web como Gmail ou Instagram, “empurram” informações novas ao cliente, tais como um novo e-mail ou uma “curtida” em uma determinada publicação. Hipoteticamente, quais estratégias poderiam ser empregadas para se chegar a esse resultado?
R:WebSocket: comunicação em tempo real
Polling: cliente faz requisições frequentes ao servidor


6. Em uma aplicação web baseada no Spring MVC, o desenvolvedor cria classes anotadas com @Controller (ou @RestController no futuro) e define métodos para responder a URLs específicas. Entretanto, quando um usuário acessa uma URL no navegador (por exemplo, digitando /produtos), o navegador não “chama diretamente” o método do controller. Faça uma pesquisa e considerando a arquitetura do Spring MVC explique como o Spring consegue interceptar a requisição HTTP, decidir qual controller e qual método devem ser executados e, por fim, gerar a resposta ao cliente. 
R:O servidor recebe a requisição HTTP 
Converte os dados em um objeto HttpServletRequest
O Spring intercepta essa requisição
Usa as anotações (como @Controller e @GetMapping) para identificar qual método deve ser executado
Executa o método do controller
Retorna a resposta ao cliente


7. Em Java, é comum encontrarmos códigos que utilizam anotações como @Override, @Deprecated ou @SuppressWarnings. Diferentemente de comentários, essas marcações não servem apenas para documentação, mas podem influenciar o comportamento do compilador, das ferramentas e até da execução do programa. Considerando esse contexto, explique o que são anotações em Java e qual é o seu papel no desenvolvimento de aplicações modernas. 
R: São metadados adicionados ao código que fornecem informações para o compilador, frameworks ou ferramentas, sem alterar diretamente a lógica do programa. Elas podem influenciar comportamento, como validações, geração de código e configurações automáticas. 

8. Em aplicações baseadas no Spring Framework, é comum criar classes simples, sem código explícito de configuração, apenas utilizando anotações como @Component, @Controller, @Service ou @Repository. Mesmo assim, o Spring consegue instanciar objetos, injetar dependências e organizar a aplicação automaticamente. Considerando esse cenário, explique como as anotações do Spring permitem que o framework identifique, gerencie e conecte os componentes da aplicação sem que o desenvolvedor precise criar objetos manualmente. 
R: Anotações funcionam como marcadores que indicam ao container do Spring quais classes devem ser tratadas como componentes gerenciados. Durante a inicialização da aplicação, o Spring realiza um processo chamado component scanning, no qual ele percorre os pacotes definidos e identifica automaticamente essas classes anotadas. A partir disso, ele cria e armazena instâncias desses objetos em um contexto central chamado ApplicationContext. Além disso, por meio do princípio de Inversão de Controle (IoC) e Injeção de Dependência (DI), o framework é responsável por instanciar e conectar os objetos entre si, geralmente usando anotações como @Autowired para resolver dependências automaticamente 



