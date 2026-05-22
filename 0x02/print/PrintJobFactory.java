public class PrintJobFactory {

    public static PrintJob createPrintJob(PrintSize size,
                                          int totalPages,
                                          int colorPages,
                                          boolean isDoubleSided) {

        switch (size) {

            case A2:
                return new PrintJob(
                        totalPages,
                        colorPages,
                        isDoubleSided,
                        0.28,
                        0.18,
                        0.32,
                        0.22
                );

            case A3:
                return new PrintJob(
                        totalPages,
                        colorPages,
                        isDoubleSided,
                        0.25,
                        0.15,
                        0.30,
                        0.20
                );

            case A4:
                return new PrintJob(
                        totalPages,
                        colorPages,
                        isDoubleSided,
                        0.20,
                        0.10,
                        0.25,
                        0.15
                );

            default:
                return null;
        }
    }
}
