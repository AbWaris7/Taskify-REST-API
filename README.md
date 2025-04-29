# 🧑‍💼 Employee /Admin Taskify REST API Application

A secure and professional real-time RESTful web application built with **Spring Boot 3**, **Spring Security**, **JWT**, **Spring Data JPA**, and **MySQL**. This project implements user registration, authentication, and role-based authorization (User/Admin), with a fully functional to-do management system for employees and privileged admin controls.

---

## 🚀 Project Overview

This project demonstrates the implementation of **real-world enterprise features** in a Spring Boot application:

- ✅ Secure user authentication and authorization (JWT + JDBC)
- ✅ Role-based access control (User/Admin)
- ✅ RESTful APIs for user profile and task management
- ✅ Admin-level user management (promotions, deletions)
- ✅ MySQL integration using Spring Data JPA
- ✅ Clean layered architecture (Controller → Service → DAO → DB)

---

## 🏗️ Architecture


All endpoints are protected with **Spring Security**, using **JWT** for authentication and role-based authorization.

---

## 🔐 Features & Functionalities

### 👤 Authentication & Authorization (JWT)

| Endpoint | Method | Description |
|---------|--------|-------------|
| `/api/auth/register` | `POST` | Register a new user (default role: USER) |
| `/api/auth/login`    | `POST` | Authenticate user and return JWT token |

### 👥 User APIs

- View own profile
- Change own password
- Delete own account

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/user/me`       | `GET`    | Get current user's profile |
| `/api/user/password` | `PUT`    | Update own password |
| `/api/user/delete`   | `DELETE` | Delete own account |

### 📝 To-Do APIs (for authenticated users)

- Create, Read, Update, Delete personal to-dos

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/todos`         | `GET`    | Get all to-dos of logged-in user |
| `/api/todos`         | `POST`   | Create new to-do |
| `/api/todos/{id}`    | `PUT`    | Update to-do by ID |
| `/api/todos/{id}`    | `DELETE` | Delete to-do by ID |

### 🛡️ Admin-Only APIs

- Manage users (view all, promote, delete)

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/admin/users`        | `GET`    | List all users |
| `/api/admin/users/{id}`   | `PUT`    | Promote user to Admin |
| `/api/admin/users/{id}`   | `DELETE` | Delete non-admin user |

> ⚠️ **Admins cannot delete other admins.**

---

## 🛠️ Tech Stack

- **Spring Boot 3**
- **Spring Security + JWT**
- **Spring MVC**
- **Spring Data JPA (Hibernate)**
- **MySQL**
- **Lombok**
- **Maven**

---

## 🧱 Project Structure

