package ARCH.HW6.exception;

public class RecordNotFoundException extends Exception {
    public RecordNotFoundException(int id) {
        System.out.println("Record with ID: " + id + " not found");
    }
}
