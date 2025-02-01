# Spring Boot Project


![Spring Boot](https://cdn.jsdelivr.net/gh/springcloud-community/image-bucket/2022/09/19/9f7a100756014b7da2fff823df64c5d2.png)


## Descrição

Este é um projeto de exemplo criado com Spring Boot. O objetivo é demonstrar a configuração básica e a execução de uma aplicação Spring Boot.

---

## Requisitos

- Java JDK 22 ou superior
- Apache Maven 3.8.7 ou superior
- Docker (opcional, para execução em contêineres)
  
---

# Instalação do Java JDK 22 e Apache Maven 3.8.7 no Linux

Este guia fornece instruções para baixar e instalar o Java JDK 22 e o Apache Maven 3.8.7 em sistemas Linux. 

Para instalar o Java JDK 22, comece baixando o arquivo binário com o comando:  
   ```bash
wget https://download.oracle.com/java/22/latest/jdk-22_linux-x64_bin.tar.gz -P /tmp  
   ```

Depois, extraia o arquivo baixado com:  
   ```bash
sudo tar -xzf /tmp/jdk-22_linux-x64_bin.tar.gz -C /opt
   ```

Em seguida, configure as variáveis de ambiente adicionando as linhas: 
   ```bash
export JAVA_HOME=/opt/jdk-22  
export PATH=$JAVA_HOME/bin:$PATH
   ```  
ao final do arquivo `~/.bashrc` ou `~/.profile`.  

Aplique as mudanças com o comando: 
   ```bash
source ~/.bashrc  
   ```

Verifique a instalação executando:  
   ```bash
java --version  
   ```

Para instalar o Apache Maven 3.8.7, comece baixando o arquivo binário usando o comando:  
   ```bash
wget https://archive.apache.org/dist/maven/maven-3/3.8.7/binaries/apache-maven-3.8.7-bin.tar.gz -P /tmp  
   ```

Extraia o arquivo com:
   ```
sudo tar xf /tmp/apache-maven-3.8.7-bin.tar.gz -C /opt
   ```

Configure as variáveis de ambiente adicionando:  
   ```
export M2_HOME=/opt/apache-maven-3.8.7  
export PATH=$M2_HOME/bin:$PATH
   ```
ao final do arquivo `~/.bashrc` ou `~/.profile`.


Aplique as mudanças com:  
   ```bash
source ~/.bashrc  
   ```

Verifique a instalação executando:  
   ```bash
mvn --version  
   ```

Após seguir este guia, você deverá ter o Java JDK 22 e o Apache Maven 3.8.7 instalados e prontos para uso em seu sistema Linux.

---

# Spring Boot Docker Application

## Rodando Localmente

### Passos:

1. Execute o comando abaixo para compilar o projeto sem rodar os testes:

   ```bash
   ./mvnw package -DskipTests
   ```

2. Em seguida, rode a aplicação Spring Boot:

   ```bash
   java -jar target/spring-boot-docker-0.0.1-SNAPSHOT.jar
   ```

3. Ou use o comando abaixo para fazer tudo em um único passo:

   ```bash
   ./mvnw package -DskipTests && java -jar target/spring-boot-docker-0.0.1-SNAPSHOT.jar
   ```

## Rodando no Docker

1. Construa a imagem Docker:

   ```bash
   docker build -t springio/spring-boot-docker .
   ```

2. Execute o contêiner na porta 8080:

   ```bash
   docker run -p 8080:8080 springio/spring-boot-docker
   ```

3. Ou use o comando abaixo para fazer tudo em um único passo:

   ```bash
   docker build -t springio/spring-boot-docker . && docker run -p 8080:8080 springio/spring-boot-docker
   ```
   
4. Para parar o contêiner, você pode usar:

   ```bash
   docker stop <container_id_or_name>
   ```

5. Ou simplesmente pressionar `Ctrl+C` no terminal onde o contêiner está rodando.

---

## Acesso com Spring Security

- **Login:** `user`
- **Senha:** A senha será exibida no terminal após iniciar o Spring Boot com `spring-boot-starter-security`.

---
