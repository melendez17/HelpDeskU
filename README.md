# HelpDesk – Capa Lógica

Esta parte del proyecto corresponde a la capa lógica del sistema HelpDesk, encargada de gestionar las reglas de negocio, entidades principales y procesos internos que permiten el funcionamiento del sistema.

## Funcionalidades

El sistema de HelpDesk permite:}
- Inicio de Sesión
- Gestion de Usuarios: con roles como Admin, Soporte y Usuario.
- Creación y listar tickets
- Creación de nuevos departamentos y listarlos

## Estructura Principal (carpetas más importantes)
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
│           └── Repomemory.java
```
