class Video
	attr_accessor :minutes, :titulo

	def initialize(titulo)
		self.titulo = titulo
		puts "initialize"
	end

	def play
	end

	def pause
	end

	def stop
	end

end

video_30_curso = Video.new("objetos")
puts video_30_curso.titulo
#ideo_30_curso.titulo = "Ruby"

#video_31_curso = Video.new
#video_31_curso.titulo = "Ruby2.2"

##puts video_31_curso.titulo