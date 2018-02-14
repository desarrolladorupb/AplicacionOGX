print "Digita la calificación: "

calificacion = gets.chomp.to_i

#if calificacion == 10 || calificacion == 9
#	puts "Muy bien"
#elsif calificacion == 8
#	puts "Bien pero aun puede mejorar"
#elsif calificacion == 7
#	puts "Sabemos que lo puede hacer mejor"
#elsif calificacion == 6
#	puts "Casi la pierde"
#else
#	puts "Perdiste"
#end

puts case calificacion
when 10,9
	"Muy bien"
when 8
	"Bien pero aun puede mejorar"
when 7
	"Sabemos que lo puede hacer mejor"
when 6
	"Casi la pierde"
else
	"Perdiste"
end