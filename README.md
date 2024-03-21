# SimpleBanking

Bu proje basit bankacılık işlemlerini gerçekleştirmek için bir RESTful API sunar.

## Hesap Oluşturma

Hesap oluşturma işlemi için aşağıdaki endpoint'i kullanabilirsiniz:

- Endpoint: `http://localhost:8090/simplebanking/api/v1/account/create`
- HTTP Method: POST

![Hesap Oluşturma](https://github.com/muratcimen/simplebanking/assets/41141844/a3b589f7-4645-4f1e-82ab-405f6ac76b99)

## Para Yatırma

Para yatırma işlemi için aşağıdaki endpoint'i kullanabilirsiniz:

- Endpoint: `http://localhost:8090/simplebanking/api/v1/account/credit`
- HTTP Method: POST

![Para Yatırma](https://github.com/muratcimen/simplebanking/assets/41141844/581d9def-cc8e-43ec-a737-265b775fdb6d)

## Para Çekme

Para çekme işlemi için aşağıdaki endpoint'i kullanabilirsiniz:

- Endpoint: `http://localhost:8090/simplebanking/api/v1/account/debit`
- HTTP Method: POST

![Para Çekme](https://github.com/muratcimen/simplebanking/assets/41141844/05facd68-27bd-4f6d-9cb7-4dbd760e817f)

## Telefon Faturası Ödeme

Telefon faturası ödeme işlemi için aşağıdaki endpoint'i kullanabilirsiniz:

- Endpoint: `http://localhost:8090/simplebanking/api/v1/account/payment`
- HTTP Method: POST

![Telefon Faturası Ödeme](https://github.com/muratcimen/simplebanking/assets/41141844/0d44a434-b8b9-4157-a78c-242ac272de37)

## Hesap Detayları

Hesap detaylarını görüntülemek için aşağıdaki endpoint'i kullanabilirsiniz:

- Endpoint: `http://localhost:8090/simplebanking/api/v1/account/{accountNumber}`
- HTTP Method: GET

![Hesap Detayları](https://github.com/muratcimen/simplebanking/assets/41141844/9b65772e-d275-4cf6-a9b8-ff4835cace5e)

## Postman Collection

Proje için Postman koleksiyonunu [buradan](<link_to_postman_collection>) indirebilirsiniz.

## İletişim

- **Website:** [www.muratcimen.com](https://www.muratcimen.com/)
- **Mail:** cimnmurat@gmail.com

## Projede Kullanılan Teknolojiler

- Java 17
- Spring Boot 3.2.3
- Maven
- Lombok
- RESTful API
- Postman
- H2 Database
