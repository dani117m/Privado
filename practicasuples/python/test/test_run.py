"""
"""
import sys
sys.path.append('../')

from paqueteinicio.run import * 

def test_obtener_primer_letra():
    """
    """
    valor = "Quito"
    assert "q" == obtener_primer_letra(valor)

def test_obtener_promedio_notas():
    """
    """
    nota1 = 10
    nota2 = 10
    nota3 = 10
    assert 10 == obtener_promedio_notas(nota1, nota2, nota3)

def test_obtener_tipo_notas():
    """
    se debe comparar los valores y retornar un parametro delos siguientes
        Insuficiente: 0 - <10
        Regular >=10 - <=12
        Bueno >12 <=16
        Muy Bueno >16 <=18
        Sobresaliente >18
    """
    nota1 = 10
    nota2 = 10
    nota3 = 10
    assert "Regular" == obtener_tipo_notas(nota1, nota2, nota3)


def test_suma_numeros():
    """
        Suma de los valores de un rango de nÃºmeros
        valor = 1
        valor2 = 7
        suma = 2 + 3 + 4 + 5 + 6
    """
    valor = 1
    valor2 = 7
    assert  20 == suma_numeros(valor, valor2)

def test_obtener_promedio_notas_dos():
    """
    """
    nota1 = 10
    nota2 = 10
    nota3 = 10
    lista = [nota1, nota2, nota3]
    assert 10 == obtener_promedio_notas_dos(lista)
    

def test_obtener_tabla():
    """
    """
    cadena_test = """Tabla del 2\n2 * 1 = 2\n2 * 2 = 4\n"""
    assert cadena_test == obtener_tabla(2, 2)

def test_reporte_persona():
    cadena = "\t\tRenÃ© Elizalde\nCiudad: Loja\nPais: Ecuador"
    assert cadena == reporte_persona("RenÃ© Elizalde", "Loja", "Ecuador")
