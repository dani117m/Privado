"""
    Desarrollo Dirigido por Pruebas
    https://docs.pytest.org/en/latest/index.html
"""

from operacion import *
 
def test_adicion():
    """
        Adición de números
    """
    calc1 = adicion(2, 2)
    calc2 = adicion(12, 2, 1, 2, 3)
    calc3 = adicion(12, 2, 1)
    assert calc1 == obtener_adicion(calc1) 
    assert calc2 == obtener_adicion(calc2) 
    assert calc3 == obtener_adicion(calc3) 

def test_tipo_passporte():
    """
        Los documentos son válidos si:
        La provincia pertenece al Oriente del Ecuador
        La edad es mayor o igual a 19 y menor o igual a 30
        El destino es Europa (España, Italia, Francia)
    """
    datos = {"provincia": "Loja", "edad": 19, "destino": "España"}
    datos2 = {"provincia": "Zamora Chinchipe", "edad": 30, "destino": "España"}
    tipo = tipo_passporte(datos)
    tipo2 = tipo_passporte(datos2)
    assert tipo == "Documento no válido"
    assert tipo2 == "Documento válido"


def test_obtener_minimo():
    """
    """
    lista = [1, 2, 3, 4, 10, 1, 1, 0]
    assert obtener_minimo(lista) == 0

def test_obtener_factorial():
    """
    """
    cadena = "4! = 4 × 3 × 2 × 1 = 24"
    cadena1 = obtener_factorial(4)
    assert cadena1 == cadena
