/*
 * package com.shopping.handler;
 * 
 * import java.util.NoSuchElementException;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.server.MethodNotAllowedException; import
 * org.springframework.web.servlet.mvc.method.annotation.
 * ResponseEntityExceptionHandler;
 * 
 * @ControllerAdvice public class CartErrorHandler extends
 * ResponseEntityExceptionHandler{
 * 
 * 
 * 
 * @ExceptionHandler(.class) //public ResponseEntity<String> public
 * handleShoppingErrors(ShoppingErrors shoppingErrors){ return new
 * ResponseEntity<String>(" Code 400 :  Please Enter All fields !!",
 * HttpStatus.BAD_REQUEST); }
 * 
 * 
 * @ExceptionHandler(NoSuchMethodError.class) public ResponseEntity<String>
 * handleNoSuchMethodError(NoSuchMethodError noSuchMethodError){ return new
 * ResponseEntity<String>("Please send Valid request", HttpStatus.BAD_REQUEST);
 * }
 * 
 * @ExceptionHandler(NoSuchElementException.class) public ResponseEntity<?>
 * handleNoSuchElementException(NoSuchElementException ex){ return new
 * ResponseEntity<String>("No Id Found in Db , Contact Developer**",
 * HttpStatus.BAD_REQUEST); }
 * 
 * @ExceptionHandler(MethodNotAllowedException.class) public ResponseEntity<?>
 * handleMethodNotAllowedException(MethodNotAllowedException mt){ return new
 * ResponseEntity<String>("unsupported Request , Please Check",
 * HttpStatus.BAD_REQUEST); }
 * 
 * 
 * }
 */