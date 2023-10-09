import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testIsStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("ABC"));
        assertFalse(CryptoManager.isStringInBounds("ABCD" + (char)127));
    }

    @Test
    public void testCaesarEncryption() {
        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3));
        assertEquals("The selected string is not in bounds. Try again.", CryptoManager.caesarEncryption("Hello!", 3));
    }

    @Test
    public void testCaesarDecryption() {
        assertEquals("HELLO", CryptoManager.caesarDecryption("KHOOR", 3));
        assertEquals("The selected string is not in bounds. Try again.", CryptoManager.caesarDecryption("Khoor!", 3));
    }

    @Test
    public void testBellasoEncryption() {
        assertEquals("DOVGHSZ", CryptoManager.bellasoEncryption("ABCDEFG", "CMSC"));
    }

    @Test
    public void testBellasoDecryption() {
        assertEquals("ABCDEFG", CryptoManager.bellasoDecryption("DOVGHSZ", "CMSC"));
    }
}