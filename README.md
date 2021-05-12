# Project-cheffy-demo

#Descripcion:
Un startup en proceso llamada Cheffy, decidimos elegir esta empresa porque es una aplicación dé comida, 
en la cual una persona puede seleccionar un menú tipo catering y hacer una reservación para su evento o fiesta, 
nos pareció una excelente idea, y consideramos que la empresa se verá beneficiada porque hoy en dia no tienen un panel 
en el cual puedan administrar algunas cosas como los chefs, los usuarios, categorías, menús, etc. Y consideramos que una 
implementación de un panel de administración les servirá mucho para la organización y estadísticas.

#Problematica:
En nuestro caso, identificamos como problemática en la empresa, Cheffy, que no se tenía un panel que permitiera administrar 
todas las áreas de manera homologada. Aquí, los usuarios podrán manejar la compañía según su cargo. Decidimos hacer un diagrama de bloques 
que muestra la estructura de este panel y las principales áreas que integrarán la primera versión.

#Manual de usuario
clonar un repositorio

 - git clone rutadessh -b nombredelbranch nombredelacarpetaacrear
    Ejemplo: git clone https://github.com/leonelmtz9914/Project-cheffy-demo/ -b master definirsucarpeta

 - checar el estatus de mi repositorio git status

 - Traer todos los cambios del repo git pull

 - Primer push git push --set-upstream origin nombredelbranch ejemplo: git push --set-upstream origin develpment

 - Subir cambios git commit -m "elmensaje"

  Ahora puede ver y editar el código. Si desea ver la aplicación, necesita un dispositivo Android. Una vez que lo haya 
  conectado mediante un cable USB y habilitado la depuración, use el comando Shift + F10 para ejecutar el programa y 
  luego seleccione el dispositivo de destino.
  
  Si no ve el dispositivo conectado, intente verificar las opciones de desarrollador en su teléfono. 
  Si no los ve, vaya a Configuración -> Acerca de (teléfono) -> Información del software (si existe) -> 
  Toque 10 veces en el número de compilación (para estar seguro) -> Regrese a Configuración -> 
  Opciones de desarrollador -> Hacer seguro que está encendido -> depuración USB

# Usando la aplicación
  La primera pantalla es una lista, para completarla (necesita estar conectado a una red), deslice hacia abajo y si 
  el servidor está encendido, verá todas las recetas del servidor. Puede hacer clic en uno para ver una imagen detallada, 
  cuánto se puede necesitar para prepararlo, una lista de todos los ingredientes y cantidades y los pasos con una 
  descripción detallada. Al presionar prolongadamente un ingrediente, se mostrarán todas las recetas que se pueden 
  hacer con ese ingrediente.

# ¿Qué tiene de especial este proyecto?
  Utilizando mis conocimientos previos, utilicé SQL para la gestión de bases de datos y elementos de listas personalizados. 
  Este proyecto trajo trabajo en equipo y el uso de nuevas tecnologías. Para completar la base de datos local con nueva 
  información del servidor. Para la lista de recetas se utiliza un RecyclerView para un mejor rendimiento y una biblioteca para 
  la animación desplegable y otra para las imágenes circulares.
