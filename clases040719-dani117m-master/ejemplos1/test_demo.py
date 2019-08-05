"""
"""
# ejemplo 1
def test_passing():
    assert  obtener_tupla_uno() == obtener_tupla_dos()


def test_listas():
    lista = []
    lista1 = []
    assert lista == lista1


### funciones adicionales

def obtener_tupla_uno():
    return (1, 10, 11)

def obtener_tupla_dos():
    return (1, 10, 11)
