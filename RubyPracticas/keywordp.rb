
nombre = gets.chomp
edad = gets.chomp.to_i


def saludos (nombre:"",edad:0, **options)
	if edad > 30
		puts "Hola señor #{nombre}"
	elsif edad < 30
		puts "Hola Joven #{nombre}"
	end
	puts "en animal favorito de #{nombre} es #{options[:animal_favorito]}"
end

saludos(nombre:nombre, edad:edad,animal_favorito:"Perro")