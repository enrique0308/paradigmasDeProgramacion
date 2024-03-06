import random
import time

def generar_arreglo():
    n_elementos = random.randint(1000, 1500)
    return [random.randint(-100, 100) for _ in range(n_elementos)]

def imprimir_arreglo(arreglo):
    print(arreglo)

# Función de búsqueda secuencial
def busqueda_secuencial(arreglo, elemento):
    for i in range(len(arreglo)):
        if arreglo[i] == elemento:
            return i
    return -1  # Si no se encuentra el elemento

# Función para ordenar el arreglo
def ordenar_arreglo(arreglo):
    return sorted(arreglo)

arreglo = generar_arreglo()
print("Arreglo generado aleatoriamente:")
imprimir_arreglo(arreglo)

# Búsqueda secuencial en el arreglo generado
elemento_buscado = random.choice(arreglo)
inicio_busqueda_secuencial = time.time()
indice = busqueda_secuencial(arreglo, elemento_buscado)
fin_busqueda_secuencial = time.time()
print(f"\nBúsqueda secuencial para el elemento {elemento_buscado}:")
if indice != -1:
    print(f"El elemento {elemento_buscado} se encuentra en el índice {indice}.")
else:
    print(f"El elemento {elemento_buscado} no se encuentra en el arreglo.")
print(f"Tiempo de búsqueda secuencial: {(fin_busqueda_secuencial - inicio_busqueda_secuencial) * 1000} milisegundos")

# Ordenar el arreglo generado
inicio_ordenamiento = time.time()
arreglo_ordenado = ordenar_arreglo(arreglo)
fin_ordenamiento = time.time()
print("\nArreglo ordenado:")
imprimir_arreglo(arreglo_ordenado)
print(f"Tiempo de ordenación: {(fin_ordenamiento - inicio_ordenamiento) * 1000} milisegundos")

# Búsqueda secuencial en el arreglo ordenado
elemento_buscado = random.choice(arreglo_ordenado)
inicio_busqueda_secuencial_ordenado = time.time()
indice = busqueda_secuencial(arreglo_ordenado, elemento_buscado)
fin_busqueda_secuencial_ordenado = time.time()
print(f"\nBúsqueda secuencial en el arreglo ordenado para el elemento {elemento_buscado}:")
if indice != -1:
    print(f"El elemento {elemento_buscado} se encuentra en el índice {indice}.")
else:
    print(f"El elemento {elemento_buscado} no se encuentra en el arreglo.")
print(f"Tiempo de búsqueda secuencial en el arreglo ordenado: {(fin_busqueda_secuencial_ordenado - inicio_busqueda_secuencial_ordenado) * 1000} milisegundos")
