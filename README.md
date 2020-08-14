# Тест для Школы будущих СТО

Умный сервис прогноза погоды - средняя сложность.
О школе узнал в последний момент, поэтому задание написано с использованием моих предыдущих проектов по работе. 
Проект написан на Java с использованием Talend Studio для основных операций.

# Принцип работы
- Пользователь вводит свой город проживания и имейл
- На API OpenWeatherMap отправляется запрос с указанным пользователем городом
- В случае ответа с ошибкой, пользователю отправляется имейл с просьбой переехать в другой город
- В случае положительно ответа от API, данные о погоде считываются, формируются в текст имейла. Имейл содержит базовую информацию и предупреждения на случай сильного ветра или дождя, включая простую рекомендацию по одежде в зависмости от текущей температуры.
- Сформированный текст отправляется на указанный ранее имейл пользователя

# Формирование текста

Hello, beautiful
Our elaborate analytical algorithm classifies this weather as {weather.main} which means {weather.description} in human terms.

Currently the temperature is {main.temp} degrees Celcius, feels like {main.feels_like} degrees

Wind speed is {wind.speed} m/s, and the humidity is {main.humidity} percent.

You are an adult in a free country, you can wear whatever you like, { если {weather.main} > 18, "but maybe bring those shorts out", иначе "but you would look cooler in a jacket" }?

{Если солнце зашло} However it's already dark outside, and you should stay at home

{Если до заката есть время} You can go out, but you have {оставшееся время до заката} hours left to get home before dark

 Другие возможные фразы в имейле
 
 Если ветер сильнее 20 м/с "If your local authorities haven't told you what to do, they might be already blown away"
 
 Если идет дождь с ветром сильнее 14 м/с "Fight the urge to take an umbrella with you, the wind is too strong. Does not apply to Mary Poppins"
 
 Если идет дождь с несильным ветром "You should definitely take an umbrella"
