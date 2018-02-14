my_string = '''Este mensaje\nes mas largo de lo normal\nque los demas'''

nombre = "Leonardo"
apellido = "Romero"

msj_final = "El nombre es " + nombre + " y su apellido es " + apellido
msj_final2 = "El nombre es %s y su apellido es %s" %(nombre, apellido)
msj_final3 = "El nombre es {} y su apellido es {}".format(nombre,apellido)

print(msj_final)
print(msj_final2)
print(msj_final3)
print(my_string)
