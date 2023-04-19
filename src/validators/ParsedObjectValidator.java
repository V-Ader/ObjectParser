package validators;

import entities.parsed_entites.ParsedObject;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsedObjectValidator {
    private static ParsedObjectValidator instance;

    public static ParsedObjectValidator getInstance(){
        if(instance == null){
            instance = new ParsedObjectValidator();
        }
        return instance;
    }

    public boolean isValid(ParsedObject parsedObject){
        return Optional.of(parsedObject)
                .filter(object -> isSet(object.getId()))
                .filter(object -> isSet(object.getIpAddress()))
                .filter(this::hasCorrectMask)
                .isPresent();
    }

    private boolean isSet(String property) {
        return !property.isEmpty();
    }

    private boolean hasCorrectMask(ParsedObject parsedObject) {
        if (isIpv4(parsedObject.getIpAddress())) {
            return checkIpv4MaskConditions(parsedObject.getIpAddressMask());
        }
        return checkIpv6MaskConditions(parsedObject.getIpAddressMask());
    }
    private boolean checkIpv4MaskConditions(byte ipAddressMask) {
        return ipAddressMask < 1 || ipAddressMask > 32;
    }

    private boolean checkIpv6MaskConditions(byte ipAddressMask) {
        return ipAddressMask < 33 || ipAddressMask > 64;
    }

    private boolean isIpv4(String ipAddress) {
        Pattern pattern = Pattern.compile("^(?:\\d{1,3}\\.){3}\\d{1,3}$");
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
}
