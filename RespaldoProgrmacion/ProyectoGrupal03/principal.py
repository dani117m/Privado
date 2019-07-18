"""
	File: principal.py
	@authors BrandonVS, dani117m
"""

# Se importan las salidas por si se da una excepcion
from excepciones.Excepciones import excepcion_marca, excepcion_pais, \
	excepcion_negativo

# Se importan las excepciones personalizadas
from librerias.misexcepciones import MarcaDeCelularError, PaisError, \
	NumeroError

# Definicion de variables varibles
bandera = True # Bandera para saber si se desean seguir ingresando datos
reporte = "Lista de Celulares vendidos\n" # El reporte se utilizara para 
# alamacenar los datos
c = 1 # El contador para marcara el numero de celular y ayudara a calcular
# el total
total = 0
error = ""
# Inicio de while para ingresar los datos con una bandera
while bandera:

	# Se usa el try para las excepciones
	try:
		# Ingresar la marca del celular
		marca = input("Ingrese los siguintes datos\nIngrese la Marca: ")

		# Si se ingresa la marca Huawei se lanzara la excepcion
		if (marca == "Huawei" or marca == "huawei"):
			metodo_marca = "Huawei"
			error = excepcion_marca(metodo_marca)
			raise MarcaDeCelularError(error)

		# Ingresar el modelo del celular
		modelo = input("Ingrese modelo: ")

		# Se ingresa el costo del celular
		costo = input("Ingrese su costo: ")

		# Transormar la variable costo a float
		costo = float(costo)

		# Si se ingresa un numero negativo se lanzara la excepcion
		if (costo < 0):
			metodo_negativo = "Numero Negativo"
			error = excepcion_negativo(metodo_negativo)
			raise NumeroError(error)

		# Ingreso de la variable pais
		pais = input("Ingrese el Pais de Origen: ")

		# Si se ingresa Estados Unidos o China se lanzara la excepcion
		if (pais == "EEUU" or pais == "Estados Unidos" or pais == "China" or 
			pais == "china"):
			metodo_pais = "Pais Erroneo"
			error = excepcion_pais(metodo_pais)
			raise PaisError(error)

		# Suma de los costos para el total 
		total = total + costo 

		# Almacenamiento Reporte
		reporte = "%s\nCelular %d\nMarca: %s\nModelo: %s\nCosto:"\
			"%.0f\nPais de Origen: %s\n" % (reporte, c, marca, modelo, costo, 
				pais)

		# Salida de bucle(bandera)
		salida = input("Desea seguir ingresando datos\n" \
			"Digite(Si) para seguir y (No)para salir: ")
		salida = salida.lower()

		if (salida == "no" ):
			bandera = False
		else:
			# Contador imcrentado
			c = c + 1

	# Excepcion si en el costo se ingresa un valor no numerico
	except ValueError as ex:
		print("\nOcurrio un error durante el ingreso de datos (ValueError)\n")
		print(ex)
		print(type(ex))

	# Excepcion si se ingresa la marca Huawei
	except MarcaDeCelularError as ex:
		print("\nOcurrio un error durante el ingreso de datos (MarcaDeCelu" \
			"larError)\n")
		print(ex)
		print(type(ex))

	# Excepcion si se ingresa un Estados Unidos o China como pais
	except PaisError as ex:
		print("\nOcurrio un error durante el ingreso de datos (PaisError)\n")
		print(ex)
		print(type(ex))

	# Excepcion si se ingresa un numero negativo en el costo
	except NumeroError as ex:
		print("\nOcurrio un error durante el ingreso de datos (NumeroError)\n")
		print(ex)
		print(type(ex))

# Calculo del promedio total
total = total / c

# Salida de datos
reporte = ("%s\nTotal de celulares vendidos: %.2f $" % (reporte, total))
print(reporte)