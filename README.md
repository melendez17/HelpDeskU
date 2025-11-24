# HelpDesk – Capa Lógica

Esta parte del proyecto corresponde a la capa lógica del sistema HelpDesk, encargada de gestionar las reglas de negocio, entidades principales y procesos internos que permiten el funcionamiento del sistema de soporte técnico.

Incluye la administración de usuarios, departamentos y tickets, junto con el núcleo del sistema: el clasificador automático de tickets mediante Bag of Words (BoW).

## Funcionalidades

El sistema de HelpDesk permite:}
- Inicio de Sesión
- Gestion de Usuarios: con roles como Admin, Soporte y Usuario.
- Creación y listar tickets
- Creación de nuevos departamentos y listarlos

## Estructura
```HelpDeskU/
├── HelpDeskU/                       
│   └── src/cr/ac/ucenfotec/
│       ├── bl/                   
│       │   ├── entities/         
│       │   │   ├── Usuario.java
│       │   │   ├── Ticket.java
│       │   │   ├── DiccionarioTecnico.java
│       │   │   ├── DiccionarioGeneral.java
│       │   │   ├── DiccionarioEmocion.java
│       │   │   └── Departamento.java
│       │   └── logic/            
│       │       └── GestorHelpDesk.java
│       └── dl/                   
│           └── Repomemory.java```
