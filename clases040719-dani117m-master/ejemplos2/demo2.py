"""
    ejemplos de uso de métodos
"""

def metodoUno():
    """
    """
    print("Método Uno")


def metodoDos(a, b):
    """ """
    print(a + b)


def metodoDos(a, b = 2):
    """ """
    print(a + b)


def metodoTres(a, b = 2, *info): # un * tupla
    """ """
    print(a + b)
    print(info)


def metodoCuatro(a, b = 2, **info): # dos ** diccionario
    """ """
    print(a + b)
    print(info)

def metodoCinco(a, b = 2, *info):
    """ """
    suma = a + b
    for i in info:
        suma = suma + i

    return suma

def metodoSeis(a, b = 2, **info):
    """ """
    suma = a + b
    for i in info.keys():
        suma = suma + info[i]

    return suma

