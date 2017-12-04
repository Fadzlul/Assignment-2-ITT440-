require 'socket'

loadbalancer=TCPServer.open("912.168.35.129",3333)

while true
client=loadbalancer.accept

rhost=client.peeraddr.last
puts"#{rhost} connect to loadbalancer"

fromclient=client.gets
puts "Message From the client: *{fromclient}"

if fromclient=="Hello"
sockettoserver=TCPSocket.open("192.168.159.128",3030)
sockettoserver.write(fromclient)
sockettoserver.close

if fromclient=="Hai"
sockettoserver1=TCPSocket.open("192.168.159.130",4040)
sockettoserver1.write(fromclient)
sockettoserver1.close

elso
puts "ERROR"

end
end
end
