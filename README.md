# Validador de Senhas com Spring Boot

Este projeto é uma aplicação Spring Boot que valida senhas com base em critérios de segurança definidos. O endpoint fornecido permite enviar uma senha e receber uma resposta sobre sua validade.

## Funcionalidades

O serviço realiza as seguintes verificações para garantir a segurança da senha:

1. **Comprimento da Senha**: Pelo menos 8 caracteres.
2. **Letra Maiúscula**: Pelo menos uma letra maiúscula (A-Z).
3. **Letra Minúscula**: Pelo menos uma letra minúscula (a-z).
4. **Dígito Numérico**: Pelo menos um dígito numérico (0-9).
5. **Caractere Especial**: Pelo menos um caractere especial (por exemplo, @, #, $, etc.).

Se a senha não atender a todos os requisitos, a resposta incluirá uma lista de critérios que precisam ser ajustados.

## Endpoint

### Validar Senha

- **Método HTTP**: POST
- **URL**: `/validate-password`

#### Exemplo de Requisição

O corpo da requisição deve ser um JSON com a senha entre aspas, conforme o exemplo abaixo:

```http
POST /validate-password

"sua senha"
