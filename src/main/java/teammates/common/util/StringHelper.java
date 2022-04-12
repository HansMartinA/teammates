package teammates.common.util;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import com.google.common.base.CharMatcher;
import teammates.common.exception.InvalidParametersException;
public final class StringHelper {
private static final Logger log = Logger.getLogger();

private  StringHelper(){
}
public static  boolean isEmpty(String s) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("s", s);
threadMonitoringController.enterService("_sCeWQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sCfkYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803840027968131336614277 = s == null || s.isEmpty();
threadMonitoringController.exitInternalAction("_sCfkYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803840027968131336614277;
}
finally {
threadMonitoringController.exitService("_sCeWQLngEeyIw-dB1KCaVA");
}
}

static  String generateStringOfLength(int length, char character) {
assert length >= 0;
return String.join("", Collections.nCopies(length, String.valueOf(character)));
}

public static  boolean isMatching(String input, String regex) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("input", input);
monitoringServiceParameters.addValue("regex", regex);
threadMonitoringController.enterService("_tFy0cLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tF1QsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681820008839277195351879 = Pattern.compile(regex, Pattern.CANON_EQ).matcher(input).matches();
threadMonitoringController.exitInternalAction("_tF1QsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681820008839277195351879;
}
finally {
threadMonitoringController.exitService("_tFy0cLngEeyIw-dB1KCaVA");
}
}

public static  String getIndent(int length) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("length", length);
threadMonitoringController.enterService("_s4VnQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s4YqlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681648009121129311797154 = generateStringOfLength(length, ' ');
threadMonitoringController.exitInternalAction("_s4YqlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681648009121129311797154;
}
finally {
threadMonitoringController.exitService("_s4VnQLngEeyIw-dB1KCaVA");
}
}

public static  String truncateHead(String inputString, int maximumStringLength) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("inputString", inputString);
monitoringServiceParameters.addValue("maximumStringLength", maximumStringLength);
threadMonitoringController.enterService("_tW9c8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tW_SILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int inputStringLength = inputString.length();
if (inputStringLength <= maximumStringLength)
{
return inputString;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681908005326354622195979 = inputString.substring(inputStringLength - maximumStringLength);
threadMonitoringController.exitInternalAction("_tW_SILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681908005326354622195979;
}
finally {
threadMonitoringController.exitService("_tW9c8LngEeyIw-dB1KCaVA");
}
}

public static  String generateSignature(String data) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("data", data);
threadMonitoringController.enterService("_s6UkQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s6dHILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
SecretKeySpec signingKey = new  SecretKeySpec(hexStringToByteArray(Config.ENCRYPTION_KEY), "HmacSHA1");
Mac mac = Mac.getInstance("HmacSHA1");
mac.init(signingKey);
byte[]  value = mac.doFinal(data.getBytes(Const.ENCODING));
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681694007167170427610553 = byteArrayToHexString(value);
threadMonitoringController.exitInternalAction("_s6dHILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681694007167170427610553;
}
catch(Exception e){
assert false;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681694006608252768655601 = null;
threadMonitoringController.exitInternalAction("_s6dHILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681694006608252768655601;
}
}
finally {
threadMonitoringController.exitService("_s6UkQLngEeyIw-dB1KCaVA");
}
}

public static  boolean isCorrectSignature(String value, String signature) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("value", value);
monitoringServiceParameters.addValue("signature", signature);
threadMonitoringController.enterService("_s7JqsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s7Lf4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (value == null || signature == null)
{
return false;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681699009560210088506306 = Objects.equals(generateSignature(value), signature);
threadMonitoringController.exitInternalAction("_s7Lf4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681699009560210088506306;
}
finally {
threadMonitoringController.exitService("_s7JqsLngEeyIw-dB1KCaVA");
}
}

public static  String encrypt(String value) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("value", value);
threadMonitoringController.enterService("_sz06sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sz-EoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
SecretKeySpec sks = new  SecretKeySpec(hexStringToByteArray(Config.ENCRYPTION_KEY), "AES");
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.ENCRYPT_MODE, sks, cipher.getParameters());
byte[]  encrypted = cipher.doFinal(value.getBytes(Const.ENCODING));
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368163600885608696613447 = byteArrayToHexString(encrypted);
threadMonitoringController.exitInternalAction("_sz-EoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368163600885608696613447;
}
catch(Exception e){
assert false;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681636004125964164271292 = null;
threadMonitoringController.exitInternalAction("_sz-EoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681636004125964164271292;
}
}
finally {
threadMonitoringController.exitService("_sz06sLngEeyIw-dB1KCaVA");
}
}

public static  String decrypt(String message)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_s6lC8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s67oQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
SecretKeySpec sks = new  SecretKeySpec(hexStringToByteArray(Config.ENCRYPTION_KEY), "AES");
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.DECRYPT_MODE, sks);
byte[]  decrypted = cipher.doFinal(hexStringToByteArray(message));
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681697009403348681578231 = new  String(decrypted, Const.ENCODING);
threadMonitoringController.exitInternalAction("_s67oQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681697009403348681578231;
}
catch(NumberFormatException | IllegalBlockSizeException | BadPaddingException e){
log.warning("Attempted to decrypt invalid ciphertext: " + message);
throw new  InvalidParametersException(e);
}
catch(Exception e){
assert false;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816970003682231545775616 = null;
threadMonitoringController.exitInternalAction("_s67oQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136816970003682231545775616;
}
}
finally {
threadMonitoringController.exitService("_s6lC8LngEeyIw-dB1KCaVA");
}
}

public static <T>  String toString(List<T> list) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("list", list);
threadMonitoringController.enterService("_s7__QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s8EQsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681704008892055692958363 = toString(list, System.lineSeparator());
threadMonitoringController.exitInternalAction("_s8EQsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681704008892055692958363;
}
finally {
threadMonitoringController.exitService("_s7__QLngEeyIw-dB1KCaVA");
}
}

public static <T>  String toString(List<T> list, String delimiter) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("list", list);
monitoringServiceParameters.addValue("delimiter", delimiter);
threadMonitoringController.enterService("_sl2JELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sl4lULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681339008381404802468151 = list.stream().map(s -> s.toString()).collect(Collectors.joining(delimiter));
threadMonitoringController.exitInternalAction("_sl4lULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681339008381404802468151;
}
finally {
threadMonitoringController.exitService("_sl2JELngEeyIw-dB1KCaVA");
}
}

public static  String toDecimalFormatString(double doubleVal) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("doubleVal", doubleVal);
threadMonitoringController.enterService("_sn5-kLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sn7MsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
DecimalFormat df = new  DecimalFormat("0.###");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813810040478746954949985 = df.format(doubleVal);
threadMonitoringController.exitInternalAction("_sn7MsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136813810040478746954949985;
}
finally {
threadMonitoringController.exitService("_sn5-kLngEeyIw-dB1KCaVA");
}
}

public static  String removeExtraSpace(String str) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("str", str);
threadMonitoringController.enterService("_tV6UELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tV7iMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (str == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681904006795281098374162 = CharMatcher.whitespace().trimFrom(str).replaceAll("\\s+", " ");
threadMonitoringController.exitInternalAction("_tV7iMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681904006795281098374162;
}
finally {
threadMonitoringController.exitService("_tV6UELngEeyIw-dB1KCaVA");
}
}

public static  String replaceIllegalChars(String str, String regex, char replacement) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("str", str);
monitoringServiceParameters.addValue("regex", regex);
monitoringServiceParameters.addValue("replacement", replacement);
threadMonitoringController.enterService("_tXC8gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tXEKoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (str == null)
{
return null;
}
char[]  charArray = str.toCharArray();
IntStream.range(0, charArray.length).filter(i -> !isMatching(Character.toString(charArray[i]), regex)).forEach(i -> charArray[i] = replacement);
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819110049076368772043144 = String.valueOf(charArray);
threadMonitoringController.exitInternalAction("_tXEKoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819110049076368772043144;
}
finally {
threadMonitoringController.exitService("_tXC8gLngEeyIw-dB1KCaVA");
}
}

static  String byteArrayToHexString(byte[]  bytes) {
StringBuilder sb = new  StringBuilder(bytes.length * 2);
for (byte b : bytes)
{
int v = b & 0xff;
if (v < 16)
{
sb.append('0');
}
sb.append(Integer.toHexString(v));
}
return sb.toString().toUpperCase();
}

public static  byte[]  hexStringToByteArray(String s) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("s", s);
threadMonitoringController.enterService("_tXOisLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tXRmALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
byte[]  b = new byte [s.length() / 2] ;
IntStream.range(0, b.length).forEach(i -> b[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
byte[]  longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681914004169821135365377 = b;
threadMonitoringController.exitInternalAction("_tXRmALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681914004169821135365377;
}
finally {
threadMonitoringController.exitService("_tXOisLngEeyIw-dB1KCaVA");
}
}

public static  String trimIfNotNull(String string) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("string", string);
threadMonitoringController.enterService("_tVy_ULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tV00gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681902009308746513293144 = string == null ? null : string.trim();
threadMonitoringController.exitInternalAction("_tV00gLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681902009308746513293144;
}
finally {
threadMonitoringController.exitService("_tVy_ULngEeyIw-dB1KCaVA");
}
}

public static  String convertToEmptyStringIfNull(String str) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("str", str);
threadMonitoringController.enterService("_tXXFkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tXY6wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681917004817274870313788 = str == null ? "" : str;
threadMonitoringController.exitInternalAction("_tXY6wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681917004817274870313788;
}
finally {
threadMonitoringController.exitService("_tXXFkLngEeyIw-dB1KCaVA");
}
}

}
