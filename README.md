﻿# Chatbot usando OpenAI GPT

Este é um projeto de chatbot que utiliza o modelo GPT-4 da OpenAI para gerar respostas em conversas.
Este chatbot recebe mensagens do usuário através de uma interface web e retorna respostas geradas pelo modelo GPT-4 da OpenAI. Ele utiliza Spring Boot como framework para o backend e WebSocket para a comunicação em tempo real.


## Organização de Pastas

O projeto está organizado da seguinte forma:

```
chatbot/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br.com.chatbot.chatbot/
│   │   │       ├── config/
│   │   │       │   ├── WebSocketConfig.java
│   │   │       │   └── Msg.java
│   │   │       ├── controller/
│   │   │       │   └── App.java
│   │   │       ├── service/
│   │   │       │   └── OpenAIChatService.java
│   │   │       └── ChatbotApplication.java
│   │   └── resources/
│   │       └── static/
│   │       |   ├── css/
│   │       |   │   └── index.css
│   │       |   ├── js/
│   │       |   │   ├── index.js
│   │       |   │   ├── sockjs.min.js
│   │       |   │   └── stomp.min.js
│   │       |   └── index.html
|   |       └── application.properties
│   └── test/
│       └── ... (testes)
├── pom.xml
└── README.md
```

## Funcionalidades

- Interface web simples para envio e recebimento de mensagens.
- Integração com o modelo GPT-4 da OpenAI para geração de respostas.
- Comunicação em tempo real utilizando WebSocket.

## Possíveis Melhorias

- Implementar tratamento de erros mais robusto.
- Adicionar funcionalidades avançadas de processamento de linguagem natural.
- Melhorar a interface do usuário com recursos como avatares e histórico de conversas.

## Como Instalar e Testar

1. Certifique-se de ter o Java Development Kit (JDK) e o Maven instalados em seu sistema.
2. Clone este repositório para o seu ambiente local.
3. Vá na pasta resources e crie um arquivo application.properties, seguindo o exemplo e adicione uma chave de API válida na variável.
4. Navegue até a pasta raiz do projeto e execute o seguinte comando para compilar e executar o aplicativo:
 ```
  mvn spring-boot:run
 ```
5. Abra um navegador da web e acesse http://localhost:8080 para iniciar a interface do chatbot.
6. Digite um nome de usuário quando solicitado e comece a conversar com o chatbot.
