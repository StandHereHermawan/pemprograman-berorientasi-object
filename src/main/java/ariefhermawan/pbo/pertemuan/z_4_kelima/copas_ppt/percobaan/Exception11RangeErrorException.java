package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

public class Exception11RangeErrorException extends Throwable {
    public Exception11RangeErrorException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int position = 1;
        try {
            if (position > 0) {
                throw new Exception11RangeErrorException("Position\t: " + position);
            }
        } catch (Exception11RangeErrorException exception) {
            System.out.println("Range error\t: " + exception.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
