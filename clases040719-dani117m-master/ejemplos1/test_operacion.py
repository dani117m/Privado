"""
    Desarrollo Dirigido por Pruebas
    https://docs.pytest.org/en/latest/index.html
"""
from operacion import *
 
def test_suma():
    calc = suma(2, 2)
    assert calc == 4

def test_tabla():
    cadena = tabla(2, 2)
    cadena_test = """Tabla del 2\n2 * 1 = 2\n2 * 2 = 4\n"""
    assert cadena == cadena_test


def test_obtener_suma():
    """
    """
    lista = [1, 2, 3, 4, 10]
    assert 20 == obtener_suma(lista)

def test_reporte_persona():
    cadena = "\t\tRené Elizalde\nCiudad: Loja\nPais: Ecuador"
    assert cadena == reporte_persona("René Elizalde", "Loja", "Ecuador")
