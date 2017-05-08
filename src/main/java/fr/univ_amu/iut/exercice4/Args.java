package fr.univ_amu.iut.exercice4;

import java.util.List;

import static fr.univ_amu.iut.exercice4.ArgsException.ErrorCode.INVALID_ARGUMENT_NAME;

public class Args {
    public Args(String schema, String[] strings) throws ArgsException {
        throw new RuntimeException("Not yet implemented !");
    }

    public int nextArgument() {
        throw new RuntimeException("Not yet implemented !");
    }

    public boolean getBoolean(char arg) {
        throw new RuntimeException("Not yet implemented !");
    }

    public String getString(char arg) {
        throw new RuntimeException("Not yet implemented !");
    }

    public boolean has(char arg) {
        throw new RuntimeException("Not yet implemented !");
    }

    public int getInt(char arg) {
        throw new RuntimeException("Not yet implemented !");
    }

    public double getDouble(char arg) {
        throw new RuntimeException("Not yet implemented !");
    }

    private void parseSchema(String schema) throws ArgsException {
        for (String element : schema.split(","))
            if (element.length() > 0)
                parseSchemaElement(element.trim());
    }

    private void validateSchemaElementId(char elementId) throws ArgsException {
        if (!Character.isLetter(elementId))
            throw new ArgsException(INVALID_ARGUMENT_NAME, elementId, null);
    }

    private void parseSchemaElement(String element) throws ArgsException {
        throw new RuntimeException("Not yet implemented !");
    }

    private void parseArgumentStrings(List<String> argsList) throws ArgsException {
        throw new RuntimeException("Not yet implemented !");
    }

    private void parseArgumentCharacters(String argChars) throws ArgsException {
        throw new RuntimeException("Not yet implemented !");
    }

    private void parseArgumentCharacter(char argChar) throws ArgsException {
        throw new RuntimeException("Not yet implemented !");
    }
}
