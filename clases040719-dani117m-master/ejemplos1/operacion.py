"""
"""

def suma(a, b):
    valor = a+b
    return valor


def tabla(a, b):
    valor = "Tabla del %s\n" % (a)
    for i in range(1, b+1):
        op = a * i
        valor = "%s%d * %d = %d\n" % (
                valor, a, i, op)
    return valor

def obtener_suma(valores):
    suma = 0
    for l in valores:
        suma = suma + l
    return suma

def reporte_persona(nombre, ciudad, pais):
    """
    """
    mi_cadena = "\t\t{0}\nCiudad: {1}\nPais: {2}".format(nombre, ciudad, pais)
    return mi_cadena
