import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import testIdentifier.Identifier;

public class IdentifierTest {

    private final Identifier identifier = new Identifier();

    @Test
    public void testIdentificadorCom1Caractere() {
        assertTrue(identifier.validateIdentifier("A"), "Esperado: Válido");
    }

    @Test
    public void testIdentificadorCom3Caracteres() {
        assertTrue(identifier.validateIdentifier("abc"), "Esperado: Válido");
    }

    @Test
    public void testIdentificadorCom6Caracteres() {
        assertTrue(identifier.validateIdentifier("abc123"), "Esperado: Válido");
    }

    @Test
    public void testIdentificadorComMaisDe6Caracteres() {
        assertFalse(identifier.validateIdentifier("abc12345"), "Esperado: Inválido");
    }

    @Test
    public void testIdentificadorVazio() {
        assertFalse(identifier.validateIdentifier(""), "Esperado: Inválido");
    }

    @Test
    public void testComecaComNumero() {
        assertFalse(identifier.validateIdentifier("1abc"), "Esperado: Inválido");
    }

    @Test
    public void testComecaComCaractereEspecial() {
        assertFalse(identifier.validateIdentifier("!abc"), "Esperado: Inválido");
    }

    @Test
    public void testContemCaractereEspecial() {
        assertFalse(identifier.validateIdentifier("abc@123"), "Esperado: Inválido");
    }

    @Test
    public void testContemCaractereDeSublinhado() {
        assertFalse(identifier.validateIdentifier("ab_c123"), "Esperado: Inválido");
    }

    @Test
    public void testExatamente6Letras() {
        assertTrue(identifier.validateIdentifier("abcdef"), "Esperado: Válido");
    }

    @Test
    public void testExatamente6CaracteresMistoLetraDigito() {
        assertTrue(identifier.validateIdentifier("abc1d2"), "Esperado: Válido");
    }

    @Test
    public void testComecaComNumero5Caracteres() {
        assertFalse(identifier.validateIdentifier("1abcd"), "Esperado: Inválido");
    }
}