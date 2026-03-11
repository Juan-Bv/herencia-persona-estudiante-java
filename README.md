# Herencia Persona - Estudiante (Clase 5 de marzo)

Este proyecto demuestra el concepto de **herencia** y **sobreescritura de métodos** en Java, aplicado a una relación entre una persona y un estudiante universitario.

## Descripción

La superclase `Persona` define los atributos básicos `id` y `nombre`, junto con el método `obtenerDatos()`. La subclase `Estudiante` hereda de `Persona` y agrega el atributo `carrera`, redefiniendo `obtenerDatos()` para mostrar la información completa del estudiante.

## Clases

| Clase | Atributos |
|-------|-----------|
| `Persona` | id, nombre |
| `Estudiante` | id, nombre, carrera |

## Estructura del proyecto

```
Dominio
├── Persona
└── Estudiante

Main
└── prueba (main)
```

## Ejemplo de salida

```
01 Juan Barros Ingeniería de Sistemas
```

## Tecnologías
- Java
