"""
	Ejemplos de uso de metodos 
"""
# se puede dejar uan variable constante y solo ingresar una (a) const (b)
def obtenerSuma(a, b = 2): 
	suma = a + b
	return suma

def obtenerTabla(numero, limite):
	"""
	numero * 1 = ?

	numero * limite = ? 
	"""
	contador = 1
	cadena = ""
	# tambien se puede utilizar un for 
	while contador <= limite:
		multiplicacion = numero + contador
		cadena = "%s%d * %d = %d\n" % (cadena, numero, contador, multiplicacion) 
		contador = contador + 1 
		
	return cadena