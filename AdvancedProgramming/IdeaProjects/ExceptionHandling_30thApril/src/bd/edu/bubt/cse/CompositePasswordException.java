package bd.edu.bubt.cse;

import java.util.List;

class CompositePasswordException extends Exception {
    private final List<String> messages;

    public CompositePasswordException(List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }
}
