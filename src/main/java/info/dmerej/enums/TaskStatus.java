package info.dmerej.enums;

public enum TaskStatus {
    TODO, DONE;


    @Override
    public String toString() {
        return switch (this) {
            case TODO -> "[ ]";
            case DONE -> "[x]";
        };
    }
}
