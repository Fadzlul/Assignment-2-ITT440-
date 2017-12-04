require 'socket'

while true

server=TCPServer.open("912.168.159.129",3030)
loadbalancer=server.accept
puts loadbalancer.gets
loadbalancer.close
server.close
end
