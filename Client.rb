require 'socket'

c = TCPSocket.new '912.168.11.132', 2000
c.puts "Hello"
puts c.recv(100)
c.close
