package sk.fiit.nemecek.jolana.server.utils.exception;
/**
 * 
 * @author Tom� Neme�ek
 *
 */
public class CannotProcessExcetion extends Exception {

    public CannotProcessExcetion() { super(); }
    public CannotProcessExcetion(String message) { super(message); }
    public CannotProcessExcetion(String message, Throwable cause) { super(message, cause); }
    public CannotProcessExcetion(Throwable cause) { super(cause); }

}
