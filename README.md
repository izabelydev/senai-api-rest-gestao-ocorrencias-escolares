# Projeto Integrador – Sistema de Gestão de Ocorrências Escolares

## Configuracoes


| Tecnologia | Versao |
|------------|--------|
| Java       | 25.0.1 |
| Maven      | 4.0.0  |
| SpringBoot | 4.0.0  |


Variaveis de ambiente:
```
DBN_NAME=dbnocorrenciasescolares
DBN_PASSWORD=sua_senha
DBN_URL=jdbc:mysql://localhost:3306/dbnocorrenciasescolares
DBN_USER=seu_usuario
```

Configurar conexão com banco de dados:

**Versao MySQL**: mysql-installer-web-community-8.0.43.0
**Nome do banco de dados**: dbnocorrenciasescolares
**Porta**: 3306


## 📌 Visão Geral
Sistema web desenvolvido para **registro e acompanhamento de ocorrências escolares** em instituições de ensino. A plataforma promove organização, transparência e agilidade na gestão de ocorrências, servindo como base para reuniões pedagógicas e tomadas de decisão.

## 👥 Perfis de Usuário e Permissões

### 1. **Professor**
- Registrar, consultar, alterar e excluir **suas próprias** ocorrências
- Apenas **consultar** ocorrências registradas por outros professores

### 2. **Analista de Qualidade**
- Consultar **todas as ocorrências**
- Acesso ao **dashboard** e relatórios

### 3. **Coordenador**
- **Acesso total** ao sistema
- Dashboard completo
- Consultas e relatórios completos

### 4. **Professor Administrativo**
- Cadastrar turmas e alunos
- Vincular alunos às turmas
- Cadastrar categorias e tipos de ocorrências

## 🚀 Funcionalidades Principais

### 🔐 Autenticação (RF01)
- Login com autenticação por perfil (usuário/senha)

### 👨‍🎓 Gerenciamento de Alunos e Turmas
- **Cadastro de Alunos (RF02)**: Registrar alunos com dados pessoais e foto
- **Cadastro de Turmas (RF03)**: Criar turmas semestrais (nome, semestre, ano letivo, turno)
- **Vincular Alunos às Turmas (RF04)**: Associar alunos às turmas criadas

### 📋 Configurações do Sistema
- **Cadastro de Categorias (RF05)**: Gerenciar categorias de ocorrência (disciplinar, pedagógica, administrativa)
- **Cadastro de Tipos de Ocorrência (RF06)**: Gerenciar tipos de ocorrência vinculados a categorias

### 📝 Registro de Ocorrências (RF07)
- Seleção de turma → alunos da turma disponíveis
- Escolha de categoria e tipo de ocorrência
- Campo para descrição detalhada
- Data e hora do ocorrido

### 🔍 Consultas e Relatórios
- **Consultar Ocorrências (RF08)**: Filtrar por aluno, turma, categoria, tipo e período
- **Detalhar Ocorrência (RF09)**: Visualização completa de cada registro
- **Histórico por aluno**: Todas as ocorrências em todas as turmas
- **Relatórios (RF13)**: Por período, turma, aluno ou categoria

### 📊 Dashboard (Coordenador)
- Visão geral por turma, categoria e tipo
- Ranking de alunos reincidentes
- Totalizadores por categorias e turmas
- Gráficos de volume por período

## 🗃️ Modelo de Dados (MER)

### Entidades Principais
- **USUARIO**: id_usuario, nome, login, senha, Perfil
- **PERFIL**: id_perfil, nome do perfil
- **ALUNO**: id_aluno, foto, nome, data de nascimento
- **TURMA**: id_turma, nome, turno, ano, semestre
- **CATEGORIA_OCORRENCIA**: id_categoria, nome
- **TIPO_OCORRENCIA**: id_tipo_ocorrencia, nome
- **OCORRENCIA**: id_ocorrencia, Turma, Aluno, Usuário, Categoria, Tipo, Data, Hora, Descrição

### Relacionamentos
- 1 Perfil → N Usuários
- 1 Professor → N Ocorrências
- N Alunos ↔ N Turmas (matrícula)
- 1 Aluno → N Ocorrências
- 1 Turma → N Ocorrências
- 1 Categoria → N Tipos de Ocorrência

## 🖥️ Protótipos de Telas

### 1. **Tela de Login**
- Autenticação por perfil

### 2. **Tela do Professor**
- Painel lateral com opções:
    - **Ocorrências**: Consulta com filtros (aluno, turma, período)
    - **Nova Ocorrência**: Formulário completo de registro

### 3. **Tela do Administrativo**
- Painel lateral com opções:
    - **Gerenciar Alunos**: Pesquisa e cadastro
    - **Gerenciar Turmas**: Pesquisa, cadastro e vinculação de alunos
    - **Gerenciar Categorias**
    - **Gerenciar Tipos de Ocorrências**

### 4. **Tela do Analista**
- Painel lateral com opções:
    - **Dashboard**
    - **Ocorrências**: Tela de consulta com filtros

### 5. **Tela do Coordenador**
- Painel lateral com opções:
    - **Dashboard** completo
    - **Ocorrências**: Tela de consulta com filtros
    - **Relatórios**

## ⚠️ Limites do Sistema (Fora do Escopo)

### ❌ **Não Inclui:**
- Gerenciamento de cursos e disciplinas
- Registro de notas e frequência
- Controle de professores por turma
- Acesso ao sistema por alunos e/ou responsáveis

## 🎯 Objetivos do Sistema
- Centralizar o registro de ocorrências escolares
- Facilitar o acompanhamento do histórico de alunos
- Gerar indicadores para tomada de decisão pedagógica
- Agilizar a comunicação entre diferentes setores da instituição

---