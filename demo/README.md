# Demo Spring Boot Project

이 프로젝트는 Spring Boot를 사용하여 생성된 기본적인 웹 애플리케이션입니다.

## 📝 개요

본 프로젝트는 Spring Boot의 기본적인 구조와 실행 방법을 보여주기 위한 샘플 프로젝트입니다. 현재는 핵심적인 기능 없이, 애플리케이션이 정상적으로 실행되고 테스트 컨텍스트가 로드될 수 있는지만 확인하는 코드로 구성되어 있습니다.

## 🛠️ 기술 스택

- **Java**: 프로젝트에서 사용하는 주 프로그래밍 언어
- **Spring Boot**: 애플리케이션의 핵심 프레임워크
- **Maven/Gradle**: 의존성 관리 및 빌드 도구

## 🚀 시작하기

### 사전 준비

- **Java Development Kit (JDK)**: 17 버전 이상 설치가 필요합니다.
- **Maven** 또는 **Gradle**: 빌드 및 의존성 관리를 위해 필요합니다.

### 애플리케이션 실행

1.  **프로젝트 클론**
    ```bash
    # git clone [저장소 URL]
    cd demo
    ```

2.  **빌드 및 실행 (Maven 기준)**
    ```bash
    # Maven을 사용하여 애플리케이션 실행
    ./mvnw spring-boot:run
    ```
    또는
    ```bash
    # 프로젝트 빌드
    ./mvnw clean package

    # JAR 파일 실행
    java -jar target/demo-0.0.1-SNAPSHOT.jar
    ```

애플리케이션이 시작되면 기본적으로 8080 포트에서 실행됩니다.

## ✅ 테스트

프로젝트의 기본 테스트를 실행하여 애플리케이션 컨텍스트가 정상적으로 로드되는지 확인할 수 있습니다.

```bash
# Maven을 사용하여 테스트 실행
./mvnw test
```

## 📁 프로젝트 구조

- `src/main/java/com/example/demo/DemoApplication.java`: Spring Boot 애플리케이션의 주 실행 클래스
- `src/main/resources/application.properties`: 애플리케이션 설정 파일 (예: 서버 포트, 데이터베이스 연결 정보)
- `src/test/java/com/example/demo/DemoApplicationTests.java`: 기본 통합 테스트 클래스