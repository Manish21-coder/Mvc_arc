# API Documentation

This repository contains controllers for managing user authentication and CRUD operations for user registration in a web application.

## Controllers

### LogoutController.java

- **Description:** Handles the logout functionality for users.
- **Endpoint:** `/logout`
- **Method:** `POST`

### DeleteRegController.java

- **Description:** Handles the deletion of user accounts.
- **Endpoint:** `/delete/{userId}`
- **Method:** `DELETE`
- **Parameters:** `userId` (String) - The ID of the user to be deleted.

### LoginController.java

- **Description:** Handles user login functionality.
- **Endpoint:** `/login`
- **Method:** `POST`
- **Request Body:** JSON object containing user credentials (e.g., username, password).

### NewRegController.java

- **Description:** Handles user registration.
- **Endpoint:** `/register`
- **Method:** `POST`
- **Request Body:** JSON object containing user details (e.g., username, email, password).

### ReadController.java

- **Description:** Handles reading user information.
- **Endpoint:** `/user/{userId}`
- **Method:** `GET`
- **Parameters:** `userId` (String) - The ID of the user to retrieve information for.

### UpdateRegController.java

- **Description:** Handles updating user information.
- **Endpoint:** `/update/{userId}`
- **Method:** `PUT`
- **Parameters:** `userId` (String) - The ID of the user to update.
- **Request Body:** JSON object containing updated user details.

## Usage

To use these controllers, make HTTP requests to the specified endpoints with the appropriate method and request body (if required).

## Contributing

Feel free to contribute to this project by opening issues or submitting pull requests.

## License

This project is licensed under the Manish Kumar License - see the [LICENSE.md](LICENSE.md) file for details.
