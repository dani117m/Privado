
#método que compara la primera letra del parametro
def obtener_primer_letra(pais):
	pais = "quito"
	letra = (pais[0])
	return letra
#método que calcula el valor del promedio
def obtener_promedio_notas(a, b, c):
	promedio = (a + b + c)/3
	#retorno del valor para realizar el test
	return promedio

#metodo para obtener el tipo de nota cualitativa
def obtener_tipo_notas(a, b, c):
	nota = (a + b + c ) /3
#condicionlaes que comparan la nota y asignan un valor en cadena 
	if nota < 10 : 
	    not_cualitativa = "Insuficiente"
	else:
		if nota >=10 or nota <=12:
			not_cualitativa = "Regular"
		else:
			if nota > 12 or nota <=16:
				not_cualitativa = "Bueno"
			else:
				if nota > 16 or nota <=18:
					not_cualitativa = "Muy bueno"
				else:
					if nota > 18:
						not_cualitativa = "Sobresaliente"
	#retorno del valor para realizar el test
	return not_cualitativa 

#metodo que realiza la suma de ciertos numeros en rangos especificos
def suma_numeros(min, max):
	c = min + 1 
	suma = 0
	while (c < max):
		suma = suma + c
		c = c+ 1
    #retorno del valor para realizar el test
	return suma


def obtener_promedio_notas_dos(a):
	
	suma = 0
	''' el len se usa para obtener el tamaño de la lista
	se usa el for c in range(0, (len(a))) inicializando la variable c en 0 hasta 
	el tamaño de la lista
	'''
	for c in range(0, (len(a))):
		#se suma accediendo a la posicion de la lista con la variable c
		suma = suma + a[c]
		c = c + 1
	suma = suma / len(a)
	#retorno del valor para realizar el test
	return suma



def obtener_tabla(x, y):
	cadena = ""
	cadena = "%sTabla del %d\n"%(cadena, x)
	c = 1
	while (c <= y) :
		multiplicacion = (x * c)
		cadena = "%s%d * %d = %d\n" % (cadena, x, c, multiplicacion)
		c = c + 1
	#retorno del valor para realizar el test
	return cadena


def reporte_persona(nom, ciudad, pais):
	#creacion de una cadena concatenando con losparametros ingresados
	cadena =  "\t\t%s\nCiudad: %s\nPais: %s" %(nom, ciudad, pais)

	#retorno del valor para realizar el test
	return cadena