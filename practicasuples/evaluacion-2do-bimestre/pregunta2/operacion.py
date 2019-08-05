"""
"""

def obtener_adicion(a, b , *numeros):

	"""
		adiccion de numeros
	"""
	suma = a

	for i in info:
			suma = suma + i
	return suma  
def obtener_pasaporte(p1, p2):
	"""
	"""

	

def obtener_minimo(lista):
    """
    """
    minimo = lista[0]
    for i in range(len(lista)):
    	if (lista[i] <= minimo):
    		minimo = lista[i]
    return minimo

def obtener_factorial(num):
    """
    """
    factorial = num
    cadena = ("%s! = %d" % (num,num))
    for i in range(num-1):
        factorial = factorial * (i+1)
        num = num - 1
        cadena = "%s × %d"% (cadena,num)
    cadena = "%s = %d"%(cadena,factorial)
    return cadena
