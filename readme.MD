## Assignment 3

Write and run a TCP client and a TCP server program using JAVA as per the following details:   
  
1. Establish a TCP connection between a TCP client and a TCP server.  
2. Client program will send some messages (echo client) to the server. 
3. Server will return the messages/acknowledgement (echo server) to the client.


## Assignment 4

Write and run a TCP client and a TCP server program using JAVA according to the following specifications:     

1. Establish a TCP connection between a TCP client and a TCP server.  
2. Client program will send a string of characters to the specific server.  
3. Server program will count the number of characters (Length) in the given string and return back to the respective client.


## Assignment 5
- **Write a Socket program to implement Day Time Server-client using TCP/UDP protocol.**

## Assignment 6
- **Write a Socket program : Client Request and server send its IP Address using TCP protocol**
<br><br><br>
# Theory


### How to Configure/Setup a Physical LAN – Detailed Steps

1. **Plan your LAN:**
   - Determine the network's purpose, such as file sharing, internet access, or printer sharing.
   - Identify the number of devices that will be part of the LAN.
   - Plan the physical layout of the network, considering the placement of devices and the length of cables needed.

2. **Obtain Necessary Equipment:**
   - Acquire Ethernet cables of appropriate lengths.
   - Obtain a network switch to connect multiple devices.
   - Ensure each device has a compatible network adapter.

3. **Connect Devices:**
   - Use Ethernet cables to physically connect computers, printers, and other devices to the network switch.
   - Ensure each device is securely plugged into an available port on the switch.
   - Consider cable management for a neat and organized setup.

4. **Assign IP Addresses:**
   - Configure each device with a unique **IP address within the same subnet.**
   - Use static IP addresses or set up a DHCP server to automatically assign IP addresses.
   - Ensure devices are in the same IP address range to facilitate communication.

5. **Set Up a Gateway:**
   - Define a router or switch as the **gateway** to provide internet access to the LAN.
   - Connect the gateway device to the LAN switch.
   - Configure the gateway with appropriate settings, such as IP address, subnet mask, and default gateway.

6. **Test Connectivity:**
   - Verify that devices within the LAN can communicate with each other.
   - Check internet connectivity by accessing external websites.
   - Troubleshoot any connectivity issues, ensuring cables are properly connected.

7. **Secure Your LAN:**
   - Enable security features on devices, such as firewalls, to protect against unauthorized access.
   - Implement password protection for devices and the network.
   - Consider network segmentation for added security, especially in larger LANs.
***
**Highlight Points:**
- **Plan:** Determine network purpose, device count, and layout.
- **Equipment:** Obtain Ethernet cables, a network switch, and compatible adapters.
- **Connect Devices:** Use cables to connect devices to the switch.
- **Assign IP Addresses:** Configure unique IPs within the same subnet.
- **Set Up Gateway:** Define a router or switch for internet access.
- **Test Connectivity:** Ensure devices can communicate; troubleshoot issues.
- **Secure LAN:** Enable firewalls, use passwords, and consider network segmentation.
***

### 2. Networking Commands

#### (a) `ping`

**Ping** is a network utility used to test the reachability of a host (usually via its IP address) and measure the round-trip time for data packets to travel to the host and back.

#### (b) `getmac`

**Getmac** is a Windows command used to retrieve the **Media Access Control (MAC) address** of a network adapter on a computer.

#### (c) `arp`

**ARP (Address Resolution Protocol)** is a protocol used to map an IP address to the corresponding MAC address on a local network.

#### (d) `nslookup`

**Nslookup** is a command-line tool used to query and retrieve information from the **Domain Name System (DNS)**. It helps resolve domain names to IP addresses and vice versa.

#### (e) `tracert`

**Tracert** (or traceroute in Unix/Linux) is a command used to trace the route that data packets take from one host to another. It displays a list of hops, showing the path data packets follow through various routers or devices.

### 3. Networking Commands Continued

#### (a) `netstat`

**Netstat** is a command-line utility used to display active network connections, listening ports, routing tables, interface statistics, and various network-related information on a computer.

#### (b) `route`

The **"route"** command is used to view and modify the routing table on a computer. It helps determine the path that network traffic takes to reach its destination.

#### (c) `ipconfig`

**Ipconfig** is a Windows command used to display the IP configuration information for all network interfaces on a computer. It provides details like IP address, subnet mask, default gateway, and more.

#### (d) `ifconfig`

**Ifconfig** is a Unix/Linux command used to configure and display information about network interfaces on a system. It provides details about the status, IP addresses, and other network-related settings for each interface.
***

### 1. Computer Network and Computer Internetworking

A **computer network** is a collection of interconnected computers and devices that can communicate and share resources with one another. These networks can range from simple connections between two computers to complex global networks like the internet. **Computer networking** involves the design, implementation, and management of these networks.

**Computer internetworking** refers to connecting multiple individual computer networks to create a larger, more extensive network, such as the internet. It involves using routers, switches, and other devices to facilitate data communication between different networks. Internetworking enables data to traverse multiple networks and reach its destination, even if the sender and receiver are on different local networks.

### 2. Networking Components

#### (a) RJ45

**RJ45** stands for "Registered Jack 45." It is a connector commonly used in networking for Ethernet connections. The RJ45 connector has eight pins and is associated with twisted-pair cabling. It is used to terminate Ethernet cables, allowing them to be connected to network devices.

#### (b) Networking Cables (CAT-5, CAT-6, UTP)

- **CAT-5:** Category 5 cables support data transfer speeds of up to 100 Mbps. They have four pairs of twisted copper wires and are suitable for basic Ethernet networking in homes and small businesses.

- **CAT-6:** Category 6 cables offer higher performance, supporting data transfer speeds of up to 10 Gbps over short distances. They have tighter twists and improved shielding, reducing crosstalk and interference.

- **UTP (Unshielded Twisted Pair):** UTP cables consist of pairs of twisted copper wires without additional shielding. They are widely used for various networking applications due to their affordability and ease of installation.

### 3. Functions of Hubs and Switches with Diagrams

#### Hub

![Hub Diagram](https://i.pinimg.com/474x/d4/83/44/d4834453ec9e9b4b8507a0bf14e1c7e6.jpg)

**Functions of a Hub:**
1. Broadcasts data to all connected devices.
2. Lacks intelligence to make forwarding decisions based on the destination.
3. Inefficient, leading to network congestion and collisions.
4. Not suitable for modern, high-speed networks.

#### Switch

![Switch Diagram](https://static.javatpoint.com/tutorial/computer-network/images/switch-vs-router2.png)

**Functions of a Switch:**
1. Learns the MAC addresses of devices connected to its ports.
2. Uses MAC address tables to forward data only to the appropriate port.
3. Provides faster and more efficient data transmission, reducing network congestion.
4. Supports full-duplex communication, allowing simultaneous data transfer.

Switches are a preferred choice in modern networking as they improve network performance and reduce unnecessary traffic, while hubs are largely outdated due to their limitations in terms of efficiency and functionality.