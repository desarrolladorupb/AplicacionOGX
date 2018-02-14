class Humano

	def initialize
		privado
	end

	def publico
		puts "Soy publico"
	end

	private
	def privado
		puts "Soy Privado"
	end

	protected
	def protegido
		puts "Soy Protegido"
	end
end

class Tutor < Humano
	def initialize
		protegido
	end
end


Tutor.new
#Humano.new.publico