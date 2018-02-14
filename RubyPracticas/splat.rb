personas = gets

def saludo_gente(*personas)
	personas.each {|personas| puts "Hola #{personas}"}
end

saludo_gente personas