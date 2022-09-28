#Definición de clases

class Persona:
    #Definición de variable de clase 
    Piernas = 2
    Brazos = 2
    # Definición del constructor
    def __init__(self,nombre,apellido,dni):
        #Definición de variable de instancia
        self.nombre = nombre
        self.apellido = apellido
        self.dni = dni

    # Definición del destructor
    def __del__(self):
        print('Objeto Eliminado de memoria')  
 

    def getNombre(self):
        return self.nombre 

    def setNombre(self,nuevo_valor):
        self.nombre = nuevo_valor
    
    def getApellido(self):
        return self.apellido 

    def setApellido(self,nuevo_valor):
        self.apellido = nuevo_valor

    def getDNI(self):
        return self.dni 

    def setDNI(self,nuevo_valor):
        self.dni = nuevo_valor
    
    #Definimos los métodos de clase para las variables de clase
    @classmethod
    def setPiernas(cls, nuevo_valor):
        cls.Piernas = nuevo_valor
    
    @classmethod
    def setBrazos(cls,nuevo_valor):
        cls.Brazos = nuevo_valor

    @classmethod
    def getPiernas(cls):
        return cls.Piernas

    @classmethod
    def getBrazos(cls):
        return cls.Brazos

#Creación del objeto
persona_1 = Persona('Arturo','Perez',38458714)
persona_2 = Persona('María','Ortíz',39787452)
#Mostramos la identidad del objeto
print('Identidad del objeto persona_1: ',persona_1)
#Imprimimos el valor de la variable de clase Brazos
print('La cantidad de brazos de persona_1 es: ',persona_1.Brazos)
print('La cantidad de brazos de persona_2 es: ',persona_2.Brazos)
#Imprimimos los valores de la variable de instancia Apellido
print('El apellido de persona_1 es: ',persona_1.getApellido())
print('El apellido de persona_2 es: ',persona_2.getApellido())
#Cambiamos el valor de brazos enviando el mensaje setBrazos que es un método de clase y vamos a cambiar el valor para todos los objetos que se instanciaron de la clase
persona_1.setBrazos(1)
#Cambiamos el valor de la variable de instancia apellido
persona_1.setApellido('Alvarez')

#Vemos cómo impacta el cambio de valor de la variable de clase brazos
print('La cantidad de brazos de persona_1 es ahora: ',persona_1.Brazos)
print('La cantidad de brazos de persona_2 es ahora: ',persona_2.Brazos)

#Vemos cómo impacta el cambio de valor de la variable de instancia apellido
print('El apellido de persona_1 ahora es: ',persona_1.getApellido())
print('El apellido de persona_2 ahora es: ',persona_2.getApellido())

#hacemos uso del destructor
del persona_1
del persona_2