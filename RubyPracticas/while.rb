#i = 0

#while i < 10
#	puts i
#	i += 1
#end

playlist = ["cancion uno", "cancion dos", "cancion tres"]

playing = true

play = 0

while (play < playlist.length) && playing
	puts "Se reproduce #{playlist[play]}"

	play += 1

	respuesta = gets().chomp.to_i

		playing = respuesta != 0
end

