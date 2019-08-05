"""
"""

def obtener_primer_letra(ciudad):
	"""
	"""
	valor = "Q"
	return valor.lower()

def obtener_promedio_notas(x, y, z):
	"""
	"""
	notas = (x + y + z)/3 
	return notas

def obtener_tipo_notas(x, y, z):
	"""
	"""
	notas = (x + y + z)/3 

	if notas >= 0 and notas <= 9:
		return "Insuficiente"
	elif notas >= 10 and notas <= 11:
		return "Regular"
	elif notas >= 12 and notas <= 15:
		return "Bueno"
	elif notas >= 16 and notas <= 18:
		return "Muy bueno"
	elif notas >= 190:
		return "Sobresaliente"

def suma_numeros(x, y):
	"""
	"""
	suma = 0 
	c = x + 1 

	while c < y:
		suma = c + suma  
		c = c + 1
	
	return suma

def obtener_promedio_notas_dos(lista):
	"""
	"""
	suma = 0 

	for i in range (0, len(lista)):
		suma = (suma + lista[i])
		total = suma/3

	return total

def obtener_tabla(x,y):
	"""
	"""
	mensaje = "" 
	for i in range (1, 10):
		tabla = 2 * i

		##mensaje = 2 +"x"+int(i)+"="+int(tabla)

	return mensaje



	


