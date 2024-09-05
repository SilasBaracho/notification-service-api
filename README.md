# Notification Manager API

## Descrição

**Notification Manager API** é um serviço responsável pelo envio de notificações via EMAIL ou SMS. O serviço é capaz de enviar notificações utilizando diferentes provedores, garantindo a entrega de mensagens para os destinatários via email ou SMS, dependendo da necessidade do sistema.

## Funcionalidades

- Envio de notificações via EMAIL.
- Envio de notificações via SMS.
- Integração com provedores de email e SMS.
- Suporte a diferentes formatos de templates (HTML e texto).
- Suporte a eventos assíncronos para disparo de notificações.
- Gerenciamento de logs de envio e erros.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Kafka** - Para publicação e consumo de eventos de notificação.
- **Schema Registry** - Para gerenciamento de esquemas de mensagens.
- **Thymeleaf** - Motor de templates para geração de emails.
- **JavaMailSender** - Para envio de emails.
- **Twilio** - Para envio de SMS.
- **Docker** - Para containerização da aplicação.
- **Maven** - Para gerenciamento de dependências e build.

## Requisitos

- **Java 17**
- **Kafka**
- **Schema Registry**
- **Twilio Account** (para envio de SMS)
- **Configurações de SMTP** (para envio de EMAIL)

## Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/notification-manager-api.git

2. Configure o envio de email:

- **Acesse o link para criar uma senha de app do Google e crie uma senha específica para o aplicativo.**

- **Adicione as seguintes propriedades no arquivo application.yml (username, password)**

    ```bash
    https://myaccount.google.com/apppasswords

## Utilização

A API oferece um endpoint REST para o envio de notificações.

### Endpoint

- **URL**: `/api/v1/notification-manager`
- **Método**: `POST`
- **Descrição**: Envia uma notificação para o destinatário especificado.

### Exemplo de Requisição

#### Request

   ```http
   curl -X POST http://localhost:8080/api/v1/notification-manager \
   -H "Content-Type: application/json" \
   -d '{
     "notificationType": "EMAIL",
     "contactInfo": "destinatario@example.com",
     "subject": "Assunto do Email",
     "message": "Conteúdo do Email"
   }'
