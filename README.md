# NetBeans (Maven)

- IDE: Apache NetBeans.
- Herramienta de construcción automática: Maven.


## Instalación de Apache NetBeans.

Para instalar NetBeans en tu sistema, sigue estos pasos generales. Ten en cuenta que los detalles específicos pueden variar según el sistema operativo que estés utilizando.

### 1. Requisitos del Sistema:
   - Antes de comenzar, asegúrate de que tu sistema cumple con los requisitos del sistema para NetBeans.

### 2. Descarga de NetBeans:
   - Ve al sitio web oficial de NetBeans en [https://netbeans.apache.org ](https://netbeans.apache.org ).
   - Haz clic en el enlace de descarga para la última versión de NetBeans.

### 3. Selecciona la Edición:
   - NetBeans ofrece diferentes ediciones, como la edición Java SE, Java EE, PHP, etc. Selecciona la edición que necesites para tu desarrollo.

### 4. Descarga del Instalador:
   - Descarga el instalador correspondiente a tu sistema operativo. Puede ser un archivo .exe para Windows, un archivo .dmg para macOS o un archivo .sh para Linux.

### 5. Instalación en Windows:
   - Ejecuta el archivo de instalación descargado y sigue las instrucciones del asistente de instalación.
   - Asegúrate de que las rutas de instalación sean las adecuadas y selecciona las características que desees instalar.

### 6. Instalación en macOS:
   - Abre el archivo .dmg descargado.
   - Arrastra el icono de NetBeans a la carpeta de Aplicaciones.
   - Puedes ejecutar NetBeans desde la carpeta de Aplicaciones.

### 7. Instalación en Linux:
   - Abre una terminal y navega al directorio donde se encuentra el archivo .sh descargado.
   - Otorga permisos de ejecución al archivo con el comando `chmod +x netbeans-archivo-instalador.sh`.
   - Ejecuta el instalador con `./netbeans-archivo-instalador.sh`.
   - Sigue las instrucciones en la terminal para completar la instalación.

### 8. Configuración Inicial:
   - Una vez instalado, inicia NetBeans.
   - Configura las rutas de JDK (Java Development Kit) si es necesario.
   - Personaliza la configuración según tus preferencias.

### 9. Comienza a Programar:
   - Con NetBeans instalado y configurado, puedes comenzar a desarrollar tus proyectos en el entorno de desarrollo integrado (IDE).

Nota: 
Al instalar Apache Netbeans por defecto se instala Maven.
Maven se incorporó a NetBeans en la versión 6.7 de NetBeans. 

## Crear un proyecto Maven en NetBeans:

- Abre NetBeans.
- Ve a "Archivo" (File) en la barra de menú y selecciona "Nuevo Proyecto" (New Project).
- En el asistente de nuevo proyecto, selecciona "Maven" en la categoría "Proyectos" (Projects) y elige "Proyecto Maven" (Maven Project). Haz clic en "Siguiente".
- Selecciona el tipo de proyecto Maven que desees crear (por ejemplo,"ProyectoJava" o "ProyectoWeb"). Haz clic en "Siguiente".
- Completa la configuración del proyecto, como el Grupo de artefactos (Group ID) y el ID de artefacto (Artifact ID). Luego, haz clic en "Finalizar".

[![Captura-de-pantalla-2023-09-27-001349.png](https://i.postimg.cc/HLXKyCKH/Captura-de-pantalla-2023-09-27-001349.png)](https://postimg.cc/676zkFt1)

[![Captura-de-pantalla-2023-09-27-001309.png](https://i.postimg.cc/NfVgcmrn/Captura-de-pantalla-2023-09-27-001309.png)](https://postimg.cc/TpV8jy0j)

[![Captura-de-pantalla-2023-09-27-001512.png](https://i.postimg.cc/262DXZD2/Captura-de-pantalla-2023-09-27-001512.png)](https://postimg.cc/1nn2844q)


## Añadir dependencias

Para agregar dependencias a un proyecto Maven en NetBeans, sigue estos pasos:

1. Abre tu proyecto en NetBeans o crea uno nuevo utilizando el asistente de proyectos Maven.

2. En el explorador de proyectos (ventana izquierda), busca y expande la carpeta "Dependencias" o "Libraries" (dependiendo de la versión de NetBeans que estés utilizando).

3. Haz clic derecho sobre la carpeta "Dependencias" y selecciona "Agregar dependencia" o "Add Dependency". Esto abrirá el asistente para agregar dependencias.

4. En el asistente para agregar dependencias, puedes buscar las dependencias que deseas agregar en el repositorio central de Maven o puedes proporcionar manualmente la información de la dependencia, incluyendo el Grupo (Group ID) y el Artefacto (Artifact ID).

   - Si buscas en el repositorio central, puedes escribir el nombre de la dependencia en el campo de búsqueda y seleccionarla de la lista de resultados.

   - Si proporcionas la información manualmente, asegúrate de especificar el Grupo y el Artefacto de la dependencia. Estos valores son únicos y se utilizan para identificar la dependencia en el repositorio Maven. También puedes especificar la versión de la dependencia si deseas una versión específica.

5. Haz clic en "OK" o "Finalizar" para agregar la dependencia a tu proyecto.

6. NetBeans descargará automáticamente la dependencia desde el repositorio central de Maven y la agregará a tu proyecto. Puedes ver las dependencias agregadas en la carpeta "Dependencias" en el explorador de proyectos.

7. Ahora puedes utilizar las clases y recursos proporcionados por la dependencia en tu proyecto.

Recuerda que NetBeans manejará automáticamente la gestión de dependencias y las descargas desde el repositorio central de Maven. Si deseas personalizar aún más la configuración de tu proyecto Maven, como la configuración de plugins o perfiles, puedes hacerlo a través del archivo `pom.xml` que se encuentra en la raíz de tu proyecto.


[![Captura-de-pantalla-2023-09-27-002411.png](https://i.postimg.cc/CxJPfTjn/Captura-de-pantalla-2023-09-27-002411.png)](https://postimg.cc/LJYBrWQm)

[![Captura-de-pantalla-2023-09-27-005233.png](https://i.postimg.cc/RZ01y3Hq/Captura-de-pantalla-2023-09-27-005233.png)](https://postimg.cc/7fpTTZXy)



