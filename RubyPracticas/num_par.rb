puts "Ingrese un número"
numero = gets.chomp
numero = numero.to_i

resultado = numero % 2

if resultado == 0
	puts "#{numero} es par"
elsif
	puts "#{numero} no es par"	
end