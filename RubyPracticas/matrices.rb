require 'matrix'

arreglo = Matrix[[1,2,3],[4,5,6],[7,8,9]]

arreglo.each(:strict_lower) do |i|
puts i
end