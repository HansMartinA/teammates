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
threadMonitoringController.enterService("_afViALvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_afWwILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018400008528186026387129 = s == null || s.isEmpty();
threadMonitoringController.exitInternalAction("_afWwILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018400008528186026387129;
}
finally {
threadMonitoringController.exitService("_afViALvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_bnJeoLvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bnNJALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130228420003963436454000335 = Pattern.compile(regex, Pattern.CANON_EQ).matcher(input).matches();
threadMonitoringController.exitInternalAction("_bnNJALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130228420003963436454000335;
}
finally {
threadMonitoringController.exitService("_bnJeoLvVEeyr6avTgCRLkQ");
}
}

public static  String getIndent(int length) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("length", length);
threadMonitoringController.enterService("_bYq9wLvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bYuoJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302216500994296875333598 = generateStringOfLength(length, ' ');
threadMonitoringController.exitInternalAction("_bYuoJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001302216500994296875333598;
}
finally {
threadMonitoringController.exitService("_bYq9wLvVEeyr6avTgCRLkQ");
}
}

public static  String truncateHead(String inputString, int maximumStringLength) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("inputString", inputString);
monitoringServiceParameters.addValue("maximumStringLength", maximumStringLength);
threadMonitoringController.enterService("_b4yoQLvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b41rkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int inputStringLength = inputString.length();
if (inputStringLength <= maximumStringLength)
{
return inputString;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023221009184273836870828 = inputString.substring(inputStringLength - maximumStringLength);
threadMonitoringController.exitInternalAction("_b41rkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023221009184273836870828;
}
finally {
threadMonitoringController.exitService("_b4yoQLvVEeyr6avTgCRLkQ");
}
}

public static  String generateSignature(String data) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("data", data);
threadMonitoringController.enterService("_ba2vELvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bbBHILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
SecretKeySpec signingKey = new  SecretKeySpec(hexStringToByteArray(Config.ENCRYPTION_KEY), "HmacSHA1");
Mac mac = Mac.getInstance("HmacSHA1");
mac.init(signingKey);
byte[]  value = mac.doFinal(data.getBytes(Const.ENCODING));
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223450004490443115622744 = byteArrayToHexString(value);
threadMonitoringController.exitInternalAction("_bbBHILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223450004490443115622744;
}
catch(Exception e){
assert false;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022345008781033467557257 = null;
threadMonitoringController.exitInternalAction("_bbBHILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022345008781033467557257;
}
}
finally {
threadMonitoringController.exitService("_ba2vELvVEeyr6avTgCRLkQ");
}
}

public static  boolean isCorrectSignature(String value, String signature) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("value", value);
monitoringServiceParameters.addValue("signature", signature);
threadMonitoringController.enterService("_bbsckLvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bbtqsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (value == null || signature == null)
{
return false;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022367008678581121351436 = Objects.equals(generateSignature(value), signature);
threadMonitoringController.exitInternalAction("_bbtqsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022367008678581121351436;
}
finally {
threadMonitoringController.exitService("_bbsckLvVEeyr6avTgCRLkQ");
}
}

public static  String encrypt(String value) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("value", value);
threadMonitoringController.enterService("_bUN7kLvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bUYToLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
SecretKeySpec sks = new  SecretKeySpec(hexStringToByteArray(Config.ENCRYPTION_KEY), "AES");
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.ENCRYPT_MODE, sks, cipher.getParameters());
byte[]  encrypted = cipher.doFinal(value.getBytes(Const.ENCODING));
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022122006083019320693744 = byteArrayToHexString(encrypted);
threadMonitoringController.exitInternalAction("_bUYToLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022122006083019320693744;
}
catch(Exception e){
assert false;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022122008430699337309439 = null;
threadMonitoringController.exitInternalAction("_bUYToLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022122008430699337309439;
}
}
finally {
threadMonitoringController.exitService("_bUN7kLvVEeyr6avTgCRLkQ");
}
}

public static  String decrypt(String message)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("message", message);
threadMonitoringController.enterService("_bbIb4LvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bbg2YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
SecretKeySpec sks = new  SecretKeySpec(hexStringToByteArray(Config.ENCRYPTION_KEY), "AES");
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.DECRYPT_MODE, sks);
byte[]  decrypted = cipher.doFinal(hexStringToByteArray(message));
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223560019447433176531792 = new  String(decrypted, Const.ENCODING);
threadMonitoringController.exitInternalAction("_bbg2YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223560019447433176531792;
}
catch(NumberFormatException | IllegalBlockSizeException | BadPaddingException e){
log.warning("Attempted to decrypt invalid ciphertext: " + message);
throw new  InvalidParametersException(e);
}
catch(Exception e){
assert false;
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223560012738639602664148 = null;
threadMonitoringController.exitInternalAction("_bbg2YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130223560012738639602664148;
}
}
finally {
threadMonitoringController.exitService("_bbIb4LvVEeyr6avTgCRLkQ");
}
}

public static <T>  String toString(List<T> list) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("list", list);
threadMonitoringController.enterService("_bcr7ELvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bcwzkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022389004598803875379949 = toString(list, System.lineSeparator());
threadMonitoringController.exitInternalAction("_bcwzkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022389004598803875379949;
}
finally {
threadMonitoringController.exitService("_bcr7ELvVEeyr6avTgCRLkQ");
}
}

public static <T>  String toString(List<T> list, String delimiter) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("list", list);
monitoringServiceParameters.addValue("delimiter", delimiter);
threadMonitoringController.enterService("_bFXnQLvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bFaqkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021061007398230643585327 = list.stream().map(s -> s.toString()).collect(Collectors.joining(delimiter));
threadMonitoringController.exitInternalAction("_bFaqkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021061007398230643585327;
}
finally {
threadMonitoringController.exitService("_bFXnQLvVEeyr6avTgCRLkQ");
}
}

public static  String toDecimalFormatString(double doubleVal) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("doubleVal", doubleVal);
threadMonitoringController.enterService("_bHg8ULvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bHiKcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
DecimalFormat df = new  DecimalFormat("0.###");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021224005182442458545532 = df.format(doubleVal);
threadMonitoringController.exitInternalAction("_bHiKcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013021224005182442458545532;
}
finally {
threadMonitoringController.exitService("_bHg8ULvVEeyr6avTgCRLkQ");
}
}

public static  String removeExtraSpace(String str) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("str", str);
threadMonitoringController.enterService("_b3_-ELvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b4BzQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (str == null)
{
return null;
}
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023210001619541820156286 = CharMatcher.whitespace().trimFrom(str).replaceAll("\\s+", " ");
threadMonitoringController.exitInternalAction("_b4BzQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023210001619541820156286;
}
finally {
threadMonitoringController.exitService("_b3_-ELvVEeyr6avTgCRLkQ");
}
}

public static  String replaceIllegalChars(String str, String regex, char replacement) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("str", str);
monitoringServiceParameters.addValue("regex", regex);
monitoringServiceParameters.addValue("replacement", replacement);
threadMonitoringController.enterService("_b44u4LvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b46kELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (str == null)
{
return null;
}
char[]  charArray = str.toCharArray();
IntStream.range(0, charArray.length).filter(i -> !isMatching(Character.toString(charArray[i]), regex)).forEach(i -> charArray[i] = replacement);
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130232320007427361728913306 = String.valueOf(charArray);
threadMonitoringController.exitInternalAction("_b46kELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130232320007427361728913306;
}
finally {
threadMonitoringController.exitService("_b44u4LvVEeyr6avTgCRLkQ");
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
threadMonitoringController.enterService("_b5E8ILvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b5HYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
byte[]  b = new byte [s.length() / 2] ;
IntStream.range(0, b.length).forEach(i -> b[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
byte[]  longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023244007801249423742158 = b;
threadMonitoringController.exitInternalAction("_b5HYYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023244007801249423742158;
}
finally {
threadMonitoringController.exitService("_b5E8ILvVEeyr6avTgCRLkQ");
}
}

public static  String trimIfNotNull(String string) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("string", string);
threadMonitoringController.enterService("_b320ILvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b353cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023199007572823388605581 = string == null ? null : string.trim();
threadMonitoringController.exitInternalAction("_b353cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023199007572823388605581;
}
finally {
threadMonitoringController.exitService("_b320ILvVEeyr6avTgCRLkQ");
}
}

public static  String convertToEmptyStringIfNull(String str) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("str", str);
threadMonitoringController.enterService("_b5MQ4LvVEeyr6avTgCRLkQ", StringHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b5OGELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130232600003517708057464741 = str == null ? "" : str;
threadMonitoringController.exitInternalAction("_b5OGELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130232600003517708057464741;
}
finally {
threadMonitoringController.exitService("_b5MQ4LvVEeyr6avTgCRLkQ");
}
}

}
