"""
	File: excepciones.py
	@authors BrandonVS, dani117m
"""

def excepcion_marca (dato):
	"""
	"""
	if(dato == "Huawei"):
		excepcion = "No es posible ingresar datos de celulares de esa marca."

	return excepcion

def excepcion_pais (dato):
	if(dato == "Pais Erroneo"):
		excepcion = "No es posible ingresar datos de este pais."

	return excepcion

def excepcion_negativo (dato):
	if(dato == "Numero Negativo"):
		excepcion = "No se pueden ingresar numeros negativos."
	return excepcion