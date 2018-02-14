class Tutor
	attr_accessor :nombre
	def initialize(name)
		@nombre = name
	end

	#def nombre
	#	@nombre
	#end

	#def nombre=(nombre)
	#	@nombre = nombre
	#end
end

camilo = Tutor.new("Andrea")
andrea = Tutor.new("Andrea")

puts camilo.nombre
camilo.nombre = "Juana"
puts camilo.nombre