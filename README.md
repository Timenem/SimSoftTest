# SimSoftTest
тестовое задание
## ВЫПОЛНЕНО 
вход в почту 
проверка сообщений реалиована частично не удалось правильно подобрать локатор 
отправка сообщений тест (отправляет 0 ) количество сообщений не считывыется 

## НЕВЫПОЛНЕНО 
selenium grid не удалось правильно сконфигурировать 
репорты allure 
## ОПИСАНИЕ
для проверки работы теста  необходимо  в файл по пути `src/main/java/USERDATA/UserFile.java` 
передать логин и пароль отправителя а так же добавить адрес получателя 
тест проводился на браузере firefox 
для смены используемого драйвера на chrome необходимо расскоментировать соответсвуюзие строки в файле /src/main/java/constants/Constants.java 
вставить соответствующие названия переменных в файле `src/main/java/common/CommonActions.java` 
