## Overview
The Chat Application using WebSocket with Spring Boot is a real-time messaging platform that enables users to communicate with each other in a chat room environment. This project leverages WebSocket, a communication protocol that provides full-duplex communication channels over a single TCP connection, allowing for interactive and responsive messaging.

## Features
- **Real-time Messaging:** Users can send and receive messages in real-time without the need to refresh the page.
- **Multiple Chat Rooms:** Support for multiple chat rooms, allowing users to join different conversations.
- **User Authentication:** Secure user authentication system to ensure that only authenticated users can access the chat application.
- **Message Persistence:** Store and retrieve chat messages to provide a seamless experience even when users join or leave the chat room.
- **User Presence Indicator:** Display the online/offline status of users to indicate their presence in the chat room.
- **Notification System:** Notify users about new messages, user activities, or system events to keep them informed.
- **Customization:** Ability to customize the chat interface, such as changing themes, emojis, or user avatars.

## Technologies Used
- **Spring Boot:** Framework for building web applications with Java.
- **WebSocket:** Protocol for real-time, bidirectional communication between clients and servers.
- **Spring Security:** Provides authentication, authorization, and protection against common security vulnerabilities.
- **Thymeleaf:** Server-side Java template engine for rendering HTML templates.
- **HTML/CSS/JavaScript:** Frontend technologies for building the user interface and handling client-side interactions.
- **Database (Optional):** Integration with a database system for storing user data, chat messages, and other persistent information.

## Project Structure
- **Backend (Spring Boot):**
  - **Controller:** Handles WebSocket connections, message broadcasting, and other backend logic.
  - **Service:** Implements business logic, including user authentication, message persistence, and chat room management.
  - **Repository (Optional):** Interfaces with the database to perform CRUD operations on entities.
  - **Configuration:** Configuration classes for WebSocket, security, database, etc.
- **Frontend (HTML/CSS/JavaScript):**
  - **HTML Templates:** Thymeleaf templates for rendering dynamic content and integrating with backend data.
  - **CSS Stylesheets:** Styling the user interface for a visually appealing chat experience.
  - **JavaScript:** Client-side scripting for handling WebSocket connections, user interactions, and updating the UI in real-time.

![WebSocket Image](https://www.callicoder.com/static/721fc7e34a79986af75647253af9ace1/spring-boot-websocket-sockjs-stomp-chat-example.png)

