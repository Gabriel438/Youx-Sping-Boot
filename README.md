### Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

- [x] Possível cadastro, update e delete dos dados
- [x] Publicação da aplicação no Heroku
- [ ] Autenticação Spring-boot utilizando oAuth2

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

* Você instalou a versão mais recente de `<Java / Spring Boot>`
* Você instalou o gerenciador de pacotes `Apache Maven`

## 🚀 Instalando

Para instalar o projeto, siga estas etapas:


Windows:
```
mkdir projeto

cd projeto

mvn install

mvn spring-boot:run

```

## 💻 Endpoints

<table>
  <thead>
    <tr>
      <td colspan="4">Todos os Endpoints deverão ser herdeiros da url https://final-spring-boot-youx.herokuapp.com/ ou http://localhost (caso tenha instalado a aplicação em sua máquina)</td>
    </tr>
    <tr>
      <th>URL</th>
      <th>Method</th>
      <th>Função</th>
      <th>Body</th>
    </tr>
  </thead>
  <tbody>
    <tr>
        <td>medico/</td>
        <td>GET</td>
        <td>Lista todos os médicos da aplicação cadastrado no banco de dados</td>
      </tr>
      <tr>
        <td>medico/create</td>
        <td>POST</td>
        <td>Cria um novo médico na aplicação.</td>
        <td>
          <code>
        {
          id: null,
          nome: String,
          cpf: String,
          senha: String,
            }</code>
        </td>
      </tr>
      <tr>
        <td>medico/{id}</td>
        <td>PUT</td>
        <td>Edita um médico na aplicacao</td>
      </tr>
      <tr>
        <td>enfermeiro/</td>
        <td>GET</td>
        <td>Lista todos os enferimeiros cadastrados no banco de dados.</td>
      </tr>
      <tr>
        <td>enfermeiro/create</td>
        <td>POST</td>
        <td>Cria um novo enfermeiro na aplicação.</td>
        <td><code>
        {
          id: null,
          nome: String,
          cpf: String,
          senha: String,
        }
        </code>
        </td>
      </tr>
      <tr>
        <td>enfermeiro/{id}</td>
        <td>PUT</td>
        <td>Edita um enfermeiro na aplicacao</td>
      </tr>
      <tr>
        <td>paciente/</td>
        <td>GET</td>
        <td>Lista todos os paciente cadastrados no banco de dados.</td>
      </tr>
      <tr>
        <td>paciente/create</td>
        <td>POST</td>
        <td>Cria um novo paciente na aplicação.</td>
        <td><code>
        {
          nome:String,
          sobrenome: String,
          email: String,
          senha: String,
          estado: String,
          cpf: String,
        }
        </code>
        </td>
      </tr>
      <tr>
        <td>paciente/{id}</td>
        <td>PUT</td>
        <td>Edita um paciente na aplicacao</td>
      </tr>
      <tr>
        <td>medico/{id}/delete</td>
        <td>DELETE</td>
        <td>Deleta um médico na aplicação</td>
      </tr>
      <tr>
        <td>enfermeiro/{id}/delete</td>
        <td>DELETE</td>
        <td>Deleta um enfermeiro na aplicação</td>
      </tr>
      <tr>
        <td>paciente/{id}/delete</td>
        <td>DELETE</td>
        <td>Deleta um paciente na aplicação</td>
      </tr>
  </tbody>
</table>
