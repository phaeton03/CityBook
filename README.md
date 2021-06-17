# CityBook
Адресная книжка

**МОДУЛЬ 1 – Загрузка данных справочника городов России **

**ПОГРУЖЕНИЕ В КОНТЕКСТ И ВВОДНЫЕ ДАННЫЕ **

Утром вы встретились с тим-лидером команды, Александром:

«Привет! При реализации новой функциональности появилась необходимость загрузки и обработки справочника городов России. Задача будет состоять из нескольких этапов, каждый последующий этап будет добавлять новую функциональность в разрабатываемый модуль автоматизированной системы.
Всю дополнительную информацию тебе предоставит наш аналитик Анна, так же расскажет каким образом можно получить доступ к данным справочника. Если возникнут какие-либо вопросы при реализации задачи – сразу обращайся ко мне.»
Далее с вами встретился аналитик команды Анна и предоставила информацию, откуда можно загрузить справочник. Обсудив с ней детали задачи, вы решили на первом этапе реализовать загрузку справочника. 

**ОПИСАНИЕ ЗАДАЧИ **

Справочник городов представлен в текстовом виде и состоит из следующих полей, разделенных символом «;»:

-	Порядковый номер записи справочника;
-	Наименование города;
-	Регион;
-	Федеральный округ;
-	Количество жителей;
-	Дата основания или первое упоминание;
-	
Необходимо реализовать класс Main, используя java.util.Scanner, прочесть информацию из текстового представления справочника и разложить данные в модель City с полями:

-	name – наименование города
-	region - регион
-	district – федеральный округ
-	population – количество жителей города
-	foundation – дата основания или первое упоминание
-	
Вывести полученный список объектов City в консоль.

Пример полученного результата:

City{name='Адыгейск', region='Адыгея', district='Южный', population=12248, foundation='1973'}

City{name='Майкоп', region='Адыгея', district='Южный', population=144246, foundation='1857'}

City{name='Горно-Алтайск', region='Алтай', district='Сибирский', population=56928, foundation='1830'} 
…
**МОДУЛЬ 2 – Сортировка списка городов**

ПОГРУЖЕНИЕ В КОНТЕКСТ И ВВОДНЫЕ ДАННЫЕ

Александр:
«Спасибо за реализацию загрузки данных справочника, отличная работа! 
На следующем этапе потребуется реализовать несколько вариантов сортировки данных справочника.»

**ОПИСАНИЕ ЗАДАЧИ**

Необходимо реализовать следующие варианты сортировки:

-	Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;
-	Сортировка списка городов по федеральному округу и наименованию города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра;

Вывести полученный список объектов City в консоль. При реализации сортировки обратить внимание на возможные варианты реализации: Comporator, lambda-выражения.

Пример полученного результата для сортировки по наименованию:

City{name='Абаза', region='Хакасия', district='Сибирский', population=17111, foundation='1867'}

City{name='Абакан', region='Хакасия', district='Сибирский', population=165183, foundation='1931'}

City{name='Абдулино', region='Оренбургская область', district='Приволжский', population=20663, foundation='1795'} 

…

Пример полученного результата для сортировки по двум полям справочника – федеральному округу и наименованию города:

City{name='Алдан', region='Якутия', district='Дальневосточный', population=21277, foundation='1924'}

City{name='Александровск-Сахалинский', region='Сахалинская область', district='Дальневосточный', population=10613, foundation='1869'}

City{name='Амурск', region='Хабаровский край', district='Дальневосточный', population=42977, foundation='1958'}

…

City{name='Абдулино', region='Оренбургская область', district='Приволжский', population=20663, foundation='1795'}

City{name='Агидель', region='Башкортостан', district='Приволжский', population=16365, foundation='1980'}

City{name='Агрыз', region='Татарстан', district='Приволжский', population=19299, foundation='1646'}

…

**МОДУЛЬ 3 – Поиск города с наибольшим количеством жителей**

ПОГРУЖЕНИЕ В КОНТЕКСТ И ВВОДНЫЕ ДАННЫЕ

Александр:
«Спасибо за реализацию сортировок списка справочника, отличная работа! 
На следующем этапе потребуется реализовать поиск города с наибольшим количеством жителей.»

**ОПИСАНИЕ ЗАДАЧИ **

Необходимо преобразовать список городов в массив и путем перебора массива найти индекс элемента и значение с наибольшим количеством жителей города.
Пример полученного результата:

[489] = 11 514 330

МОДУЛЬ 4 – Поиск количества городов в разрезе регионов

ПОГРУЖЕНИЕ В КОНТЕКСТ И ВВОДНЫЕ ДАННЫЕ

Александр:

«Спасибо за реализацию поиска города с наибольшим количество жителей, отличная работа! 
На следующем этапе потребуется реализовать поиск количества городов в разрезе регионов.»

**ОПИСАНИЕ ЗАДАЧИ** 

Необходимо определить количество городов в разрезе регионов.

Пример полученного результата:

Вологодская область - 15

Татарстан - 22

Хабаровский край – 7

…
