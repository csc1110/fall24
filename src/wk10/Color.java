package wk10;

public enum Color {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m");

    private String ansi;

    Color(String ansi) {
        this.ansi = ansi;
    }

    public String toString() {
        return ansi;
    }
}
