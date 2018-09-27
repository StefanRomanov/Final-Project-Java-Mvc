package app.project.gamestart.exceptions;

import app.project.gamestart.util.constants.ExceptionMessages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = ExceptionMessages.USER_NOT_FOUND)
public class UserNotFoundException extends RuntimeException{
}
