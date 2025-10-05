# Preguntas  

### ¿Cómo se pueden aprovechar las funcionalidades de otras aplicaciones para mejorar la experiencia del usuario en una aplicación propia, sin sacrificar la fluidez y la seguridad, y considerando diferentes tipos de aplicaciones y permisos?  
conviene implementar funcionalidades y conectividad con otras apps realacionadas a la tuya, porque así ya no tienes que hacer todo el desarrollo de la funcionalidad, o al redirigir a otra aplicación probablemente haya un beneficio para ambas apps. esto también ayuda a mejorar la responsibidad de tu aplicación, al utilizar módulos existentes y optimizados.  


### ¿Cómo se pueden utilizar Intents para abrir otras aplicaciones de forma segura y eficiente, considerando diferentes tipos de datos y acciones, y la experiencia del usuario?  
Un Intent es como un “mensaje” que tu aplicación puede enviar para pedirle al sistema o a otra app que haga algo. El sistema revisa qué aplicaciones pueden hacerlo y le muestra al usuario las opciones. Antes de intentar abrir otra aplicación, hay que verificar que realmente exista una app que pueda hacerlo.  
Usar Intents para abrir otras aplicaciones te permite: Aprovechar apps que ya existen, dar una experiencia fluida al usuari, evitar errores y mantener la seguridad.


### ¿Cómo se pueden utilizar Intents para compartir datos y acciones entre diferentes aplicaciones de forma segura y eficiente, considerando diferentes tipos de datos, permisos y la experiencia del usuario?  
los Intents también se usan para compartir información entre aplicaciones, por ejemplo, para compartir un video de youtube a whatsapp directamente sin que hayan tenido que desarrollar todo el sistema de compartido.  
Cuando se comparten archivos (como imágenes, documentos o videos), no se puede usar la ruta directa del archivo, porque eso no es seguro.
En su lugar, se usa algo llamado FileProvider, que permite compartir el archivo de forma protegida.  


### Reflexión personal del tema (mínimo 50 palabras):   
usar los Intents en android me hizo darme cuenta de lo importante que es la comunicación entre aplicaciones. no se trata solo de que una app funcione por sí sola, sino de que pueda conectarse con otras para ofrecer una mejor experiencia al usuario, sin complicarse ni poner en riesgo la seguridad. entendí que la seguridad y los permisos son fundamentales. No se puede compartir información sin cuidado, porque eso puede afectar los datos del usuario. y en general, diseñar aplicaciones no es solo programar, sino pensar en cómo hacerlas más útiles, seguras y fáciles de usar.

## 📸 Capturas de Pantalla  

### Vista Principal  

<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/b9303c95-ef7a-4b4d-b9f5-8ad5e689d7e4" />  

### Navegador Web  

<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/ffb0e24f-cedd-481e-99ae-601eca2a9644" />  

<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/0e85364a-e6ee-4d61-bafa-32f430e4faaa" />

