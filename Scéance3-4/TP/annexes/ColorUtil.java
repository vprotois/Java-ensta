public class ColorUtil {

    /* ***
     * Constructeur de la classe ColorUtil, utilisable uniquement par la classe elle-même
     */
    private ColorUtil() {};

    /* ***
     * enum Color interne à la classe ColorUtil
     */
    enum Color {
        RESET("\u001B[0m"),
        BLACK("\u001B[30m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"),
        WHITE("\u001B[37m");

        /* ***
         * Attribut de l'enum Color
         */
        private final String value;

        /* ***
         * Constructeur de l'enum Color
         */
        Color(String value) {
            this.value = value;
        }
    }

    /* ***
     * Méthodes de la classe ColorUtil
     */
    public static String colorize(String text, Color color) {
        return String.format("%s%s%s", color.value, text, Color.RESET.value);
    }

    public static String colorize(Character text, Color color) {
        return colorize("" + text, color);
    }
}
