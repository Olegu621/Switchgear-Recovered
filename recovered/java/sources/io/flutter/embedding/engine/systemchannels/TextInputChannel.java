            package io.flutter.embedding.engine.systemchannels;

            import android.os.Build;
            import android.os.Bundle;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.JSONMethodCodec;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.editing.TextEditingDelta;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.Map;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TextInputChannel {
                private static final String TAG = "TextInputChannel";
                public final MethodChannel channel;
                final MethodChannel.MethodCallHandler parsingMethodHandler;
                private TextInputMethodHandler textInputMethodHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Configuration {
                    public final String actionLabel;
                    public final boolean autocorrect;
                    public final Autofill autofill;
                    public final String[] contentCommitMimeTypes;
                    public final boolean enableDeltaModel;
                    public final boolean enableIMEPersonalizedLearning;
                    public final boolean enableSuggestions;
                    public final Configuration[] fields;
                    public final Locale[] hintLocales;
                    public final Integer inputAction;
                    public final InputType inputType;
                    public final boolean obscureText;
                    public final TextCapitalization textCapitalization;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Autofill {
                        public final TextEditState editState;
                        public final String hintText;
                        public final String[] hints;
                        public final String uniqueIdentifier;

                        public Autofill(String str, String[] strArr, String str2, TextEditState textEditState) {
/* 4 */                     this.uniqueIdentifier = str;
/* 6 */                     this.hints = strArr;
/* 8 */                     this.hintText = str2;
/* 10 */                    this.editState = textEditState;
                        }

                        public static Autofill fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
/* 3 */                     String string = jSONObject.getString("uniqueIdentifier");
/* 9 */                     JSONArray jSONArray = jSONObject.getJSONArray("hints");
/* 23 */                    String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
/* 29 */                    JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
/* 37 */                    String[] strArr = new String[jSONArray.length()];
/* 44 */                    for (int i = 0; i < jSONArray.length(); i++) {
/* 54 */                        strArr[i] = translateAutofillHint(jSONArray.getString(i));
                            }
/* 65 */                    return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
                        }

                        private static String translateAutofillHint(String str) {
/* 7 */                     if (Build.VERSION.SDK_INT < 26) {
/* 1 */                         return str;
                            }
/* 10 */                    str.getClass();
                            switch (str) {
                                case "birthdayYear":
/* 581 */                           return "birthDateYear";
                                case "oneTimeCode":
/* 578 */                           return "smsOTPCode";
                                case "creditCardExpirationMonth":
/* 41 */                            return "creditCardExpirationMonth";
                                case "telephoneNumberNational":
/* 574 */                           return "phoneNational";
                                case "newPassword":
/* 39 */                            return "newPassword";
                                case "creditCardSecurityCode":
/* 37 */                            return "creditCardSecurityCode";
                                case "creditCardExpirationDay":
/* 35 */                            return "creditCardExpirationDay";
                                case "fullStreetAddress":
/* 568 */                           return "streetAddress";
                                case "telephoneNumberDevice":
/* 565 */                           return "phoneNumberDevice";
                                case "countryName":
/* 562 */                           return "addressCountry";
                                case "middleInitial":
/* 559 */                           return "personMiddleInitial";
                                case "addressCity":
/* 556 */                           return "addressLocality";
                                case "gender":
/* 33 */                            return "gender";
                                case "postalAddressExtendedPostalCode":
/* 552 */                           return "extendedPostalCode";
                                case "creditCardNumber":
/* 31 */                            return "creditCardNumber";
                                case "namePrefix":
/* 548 */                           return "personNamePrefix";
                                case "middleName":
/* 545 */                           return "personMiddleName";
                                case "nameSuffix":
/* 542 */                           return "personNameSuffix";
                                case "creditCardExpirationDate":
/* 29 */                            return "creditCardExpirationDate";
                                case "creditCardExpirationYear":
/* 27 */                            return "creditCardExpirationYear";
                                case "telephoneNumberCountryCode":
/* 537 */                           return "phoneCountryCode";
                                case "username":
/* 25 */                            return URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME;
                                case "name":
/* 533 */                           return "personName";
                                case "email":
/* 530 */                           return "emailAddress";
                                case "addressState":
/* 527 */                           return "addressRegion";
                                case "birthdayMonth":
/* 524 */                           return "birthDateMonth";
                                case "familyName":
/* 521 */                           return "personFamilyName";
                                case "telephoneNumber":
/* 518 */                           return "phoneNumber";
                                case "newUsername":
/* 23 */                            return "newUsername";
                                case "birthday":
/* 514 */                           return "birthDateFull";
                                case "password":
/* 21 */                            return URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD;
                                case "givenName":
/* 510 */                           return "personGivenName";
                                case "postalAddress":
/* 19 */                            return "postalAddress";
                                case "postalAddressExtended":
/* 506 */                           return "extendedAddress";
                                case "postalCode":
/* 17 */                            return "postalCode";
                                case "birthdayDay":
/* 502 */                           return "birthDateDay";
                                default:
/* 1 */                             return str;
                            }
                        }
                    }

                    public Configuration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TextCapitalization textCapitalization, InputType inputType, Integer num, String str, Autofill autofill, String[] strArr, Configuration[] configurationArr, Locale[] localeArr) {
/* 4 */                 this.obscureText = z;
/* 6 */                 this.autocorrect = z2;
/* 8 */                 this.enableSuggestions = z3;
/* 10 */                this.enableIMEPersonalizedLearning = z4;
/* 12 */                this.enableDeltaModel = z5;
/* 14 */                this.textCapitalization = textCapitalization;
/* 16 */                this.inputType = inputType;
/* 18 */                this.inputAction = num;
/* 20 */                this.actionLabel = str;
/* 22 */                this.autofill = autofill;
/* 24 */                this.contentCommitMimeTypes = strArr;
/* 26 */                this.fields = configurationArr;
/* 28 */                this.hintLocales = localeArr;
                    }

                    public static Configuration fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                        Configuration[] configurationArr;
                        Locale[] localeArr;
/* 5 */                 String string = jSONObject.getString("inputAction");
/* 9 */                 if (string == null) {
/* 251 */                   throw new JSONException("Configuration JSON missing 'inputAction' property.");
                        }
/* 19 */                if (jSONObject.isNull("fields")) {
/* 50 */                    configurationArr = null;
                        } else {
/* 21 */                    JSONArray jSONArray = jSONObject.getJSONArray("fields");
/* 25 */                    int length = jSONArray.length();
/* 29 */                    Configuration[] configurationArr2 = new Configuration[length];
/* 32 */                    for (int i = 0; i < length; i++) {
/* 42 */                        configurationArr2[i] = fromJson(jSONArray.getJSONObject(i));
                            }
/* 47 */                    configurationArr = configurationArr2;
                        }
/* 52 */                Integer numInputActionFromTextInputAction = inputActionFromTextInputAction(string);
/* 58 */                ArrayList arrayList = new ArrayList();
/* 71 */                JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
/* 75 */                if (jSONArray2 != null) {
/* 82 */                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
/* 88 */                        arrayList.add(jSONArray2.optString(i2));
                            }
                        }
/* 100 */               if (jSONObject.isNull("hintLocales")) {
/* 134 */                   localeArr = null;
                        } else {
/* 102 */                   JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
/* 110 */                   Locale[] localeArr2 = new Locale[jSONArray3.length()];
/* 116 */                   for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
/* 126 */                       localeArr2[i3] = Locale.forLanguageTag(jSONArray3.optString(i3));
                            }
/* 131 */                   localeArr = localeArr2;
                        }
/* 240 */               return new Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), InputType.fromJson(jSONObject.getJSONObject("inputType")), numInputActionFromTextInputAction, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : Autofill.fromJson(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr, localeArr);
                    }

                    private static Integer inputActionFromTextInputAction(String str) {
/* 1 */                 byte b = 1;
/* 11 */                str.getClass();
                        switch (str.hashCode()) {
                            case -810971940:
/* 128 */                       b = !str.equals("TextInputAction.unspecified") ? (byte) -1 : (byte) 0;
                                break;
                            case -737377923:
/* 116 */                       if (!str.equals("TextInputAction.done")) {
/* 28 */                            b = -1;
                                }
                                break;
                            case -737089298:
/* 108 */                       b = !str.equals("TextInputAction.next") ? (byte) -1 : (byte) 2;
                                break;
                            case -737080013:
/* 97 */                        b = !str.equals("TextInputAction.none") ? (byte) -1 : (byte) 3;
                                break;
                            case -736940669:
/* 86 */                        b = !str.equals("TextInputAction.send") ? (byte) -1 : (byte) 4;
                                break;
                            case 469250275:
/* 75 */                        b = !str.equals("TextInputAction.search") ? (byte) -1 : (byte) 5;
                                break;
                            case 1241689507:
/* 64 */                        b = !str.equals("TextInputAction.go") ? (byte) -1 : (byte) 6;
                                break;
                            case 1539450297:
/* 53 */                        b = !str.equals("TextInputAction.newline") ? (byte) -1 : (byte) 7;
                                break;
                            case 2110497650:
/* 40 */                        b = !str.equals("TextInputAction.previous") ? (byte) -1 : (byte) 8;
                                break;
                            default:
/* 28 */                        b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
/* 7 */                         return 0;
                            case 1:
/* 160 */                       return 6;
                            case 2:
/* 155 */                       return 5;
                            case 3:
/* 2 */                         return 1;
                            case 4:
/* 149 */                       return 4;
                            case 5:
/* 144 */                       return 3;
                            case 6:
/* 139 */                       return 2;
                            case 7:
/* 2 */                         return 1;
                            case 8:
/* 133 */                       return 7;
                            default:
/* 7 */                         return 0;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class InputType {
                    public final boolean isDecimal;
                    public final boolean isSigned;
                    public final TextInputType type;

                    public InputType(TextInputType textInputType, boolean z, boolean z2) {
/* 4 */                 this.type = textInputType;
/* 6 */                 this.isSigned = z;
/* 8 */                 this.isDecimal = z2;
                    }

                    public static InputType fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
/* 26 */                return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum TextCapitalization {
                    CHARACTERS("TextCapitalization.characters"),
                    WORDS("TextCapitalization.words"),
                    SENTENCES("TextCapitalization.sentences"),
                    NONE("TextCapitalization.none");

                    private final String encodedName;

                    TextCapitalization(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static TextCapitalization fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (TextCapitalization textCapitalization : values()) {
/* 17 */                    if (textCapitalization.encodedName.equals(str)) {
/* 19 */                        return textCapitalization;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such TextCapitalization: ", str));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TextEditState {
                    public final int composingEnd;
                    public final int composingStart;
                    public final int selectionEnd;
                    public final int selectionStart;
                    public final String text;

                    public TextEditState(String str, int i, int i2, int i3, int i4) throws IndexOutOfBoundsException {
/* 9 */                 if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
/* 199 */                   throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
                        }
/* 17 */                if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
/* 162 */                   throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
                        }
/* 29 */                if (i4 > str.length()) {
/* 125 */                   throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
                        }
/* 35 */                if (i > str.length()) {
/* 101 */                   throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
                        }
/* 41 */                if (i2 > str.length()) {
/* 77 */                    throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
                        }
/* 43 */                this.text = str;
/* 45 */                this.selectionStart = i;
/* 47 */                this.selectionEnd = i2;
/* 49 */                this.composingStart = i3;
/* 51 */                this.composingEnd = i4;
                    }

                    public static TextEditState fromJson(JSONObject jSONObject) throws JSONException {
/* 33 */                return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
                    }

                    public boolean hasComposing() {
/* 1 */                 int i = this.composingStart;
                        return i >= 0 && this.composingEnd > i;
                    }

                    public boolean hasSelection() {
                        return this.selectionStart >= 0;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface TextInputMethodHandler {
                    void clearClient();

                    void finishAutofillContext(boolean z);

                    void hide();

                    void requestAutofill();

                    void sendAppPrivateCommand(String str, Bundle bundle);

                    void setClient(int i, Configuration configuration);

                    void setEditableSizeAndTransform(double d, double d2, double[] dArr);

                    void setEditingState(TextEditState textEditState);

                    void setPlatformViewClient(int i, boolean z);

                    void show();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum TextInputType {
                    TEXT("TextInputType.text"),
                    DATETIME("TextInputType.datetime"),
                    NAME("TextInputType.name"),
                    POSTAL_ADDRESS("TextInputType.address"),
                    NUMBER("TextInputType.number"),
                    PHONE("TextInputType.phone"),
                    MULTILINE("TextInputType.multiline"),
                    EMAIL_ADDRESS("TextInputType.emailAddress"),
                    URL("TextInputType.url"),
                    VISIBLE_PASSWORD("TextInputType.visiblePassword"),
                    NONE("TextInputType.none"),
                    WEB_SEARCH("TextInputType.webSearch"),
                    TWITTER("TextInputType.twitter");

                    private final String encodedName;

                    TextInputType(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static TextInputType fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (TextInputType textInputType : values()) {
/* 17 */                    if (textInputType.encodedName.equals(str)) {
/* 19 */                        return textInputType;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such TextInputType: ", str));
                    }
                }

                public TextInputChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                            Bundle bundle;
/* 9 */                     if (TextInputChannel.this.textInputMethodHandler == null) {
/* 472 */                       return;
                            }
/* 13 */                    String str = methodCall.method;
/* 15 */                    Object obj = methodCall.arguments;
/* 38 */                    Log.m4589v(TextInputChannel.TAG, "Received '" + str + "' message.");
/* 41 */                    str.getClass();
                            switch (str) {
                                case "TextInput.setPlatformViewClient":
                                    try {
/* 436 */                               JSONObject jSONObject = (JSONObject) obj;
/* 456 */                               TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
/* 459 */                               result.success(null);
                                        break;
                                    } catch (JSONException e) {
/* 469 */                               result.error("error", e.getMessage(), null);
/* 472 */                               return;
                                    }
                                    break;
                                case "TextInput.setEditingState":
                                    try {
/* 419 */                               TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
/* 422 */                               result.success(null);
                                        break;
                                    } catch (JSONException e2) {
/* 432 */                               result.error("error", e2.getMessage(), null);
/* 472 */                               return;
                                    }
                                    break;
                                case "TextInput.setClient":
                                    try {
/* 367 */                               JSONArray jSONArray = (JSONArray) obj;
/* 387 */                               TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
/* 390 */                               result.success(null);
                                        break;
                                    } catch (NoSuchFieldException | JSONException e3) {
/* 403 */                               result.error("error", e3.getMessage(), null);
/* 472 */                               return;
                                    }
                                    break;
                                case "TextInput.hide":
/* 360 */                           TextInputChannel.this.textInputMethodHandler.hide();
/* 363 */                           result.success(null);
                                    break;
                                case "TextInput.show":
/* 347 */                           TextInputChannel.this.textInputMethodHandler.show();
/* 350 */                           result.success(null);
                                    break;
                                case "TextInput.sendAppPrivateCommand":
                                    try {
/* 286 */                               JSONObject jSONObject2 = (JSONObject) obj;
/* 290 */                               String string = jSONObject2.getString("action");
/* 294 */                               String string2 = jSONObject2.getString(SharedDataContentProvider.BASE_PATH);
/* 298 */                               if (string2 == null || string2.isEmpty()) {
/* 318 */                                   bundle = null;
                                        } else {
/* 308 */                                   bundle = new Bundle();
/* 311 */                                   bundle.putString(SharedDataContentProvider.BASE_PATH, string2);
                                        }
/* 325 */                               TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
/* 328 */                               result.success(null);
                                        break;
                                    } catch (JSONException e4) {
/* 336 */                               result.error("error", e4.getMessage(), null);
/* 472 */                               return;
                                    }
                                    break;
                                case "TextInput.setEditableSizeAndTransform":
                                    try {
/* 226 */                               JSONObject jSONObject3 = (JSONObject) obj;
/* 230 */                               double d = jSONObject3.getDouble("width");
/* 236 */                               double d2 = jSONObject3.getDouble("height");
/* 242 */                               JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
/* 248 */                               double[] dArr = new double[16];
/* 250 */                               for (int i = 0; i < 16; i++) {
/* 256 */                                   dArr[i] = jSONArray2.getDouble(i);
                                        }
/* 270 */                               TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d, d2, dArr);
/* 273 */                               result.success(null);
                                        break;
                                    } catch (JSONException e5) {
/* 281 */                               result.error("error", e5.getMessage(), null);
/* 472 */                               return;
                                    }
                                    break;
                                case "TextInput.finishAutofillContext":
/* 219 */                           TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
/* 222 */                           result.success(null);
                                    break;
                                case "TextInput.clearClient":
/* 200 */                           TextInputChannel.this.textInputMethodHandler.clearClient();
/* 203 */                           result.success(null);
                                    break;
                                case "TextInput.requestAutofill":
/* 187 */                           TextInputChannel.this.textInputMethodHandler.requestAutofill();
/* 190 */                           result.success(null);
                                    break;
                                default:
/* 177 */                           result.notImplemented();
                                    break;
                            }
                        }
                    };
/* 9 */             this.parsingMethodHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
/* 3 */             HashMap<Object, Object> map = new HashMap<>();
/* 8 */             JSONArray jSONArray = new JSONArray();
/* 11 */            Iterator<TextEditingDelta> it = arrayList.iterator();
/* 19 */            while (it.hasNext()) {
/* 31 */                jSONArray.put(it.next().toJSON());
                    }
/* 37 */            map.put("deltas", jSONArray);
/* 40 */            return map;
                }

                private static HashMap<Object, Object> createEditingStateJSON(String str, int i, int i2, int i3, int i4) {
/* 3 */             HashMap<Object, Object> map = new HashMap<>();
/* 8 */             map.put("text", str);
/* 17 */            map.put("selectionBase", Integer.valueOf(i));
/* 26 */            map.put("selectionExtent", Integer.valueOf(i2));
/* 35 */            map.put("composingBase", Integer.valueOf(i3));
/* 44 */            map.put("composingExtent", Integer.valueOf(i4));
/* 47 */            return map;
                }

                public void commitContent(int i, Map<String, Object> map) {
/* 5 */             Log.m4589v(TAG, "Sending 'commitContent' message.");
/* 26 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.commitContent", map));
                }

                public void done(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'done' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.done"));
                }

                /* JADX INFO: renamed from: go */
                public void m4612go(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'go' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.go"));
                }

                public void newline(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'newline' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.newline"));
                }

                public void next(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'next' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.next"));
                }

                public void performPrivateCommand(int i, String str, Bundle bundle) {
/* 3 */             HashMap map = new HashMap();
/* 8 */             map.put("action", str);
/* 11 */            if (bundle != null) {
/* 15 */                HashMap map2 = new HashMap();
/* 30 */                for (String str2 : bundle.keySet()) {
/* 38 */                    Object obj = bundle.get(str2);
/* 44 */                    if (obj instanceof byte[]) {
/* 50 */                        map2.put(str2, bundle.getByteArray(str2));
                            } else if (obj instanceof Byte) {
/* 66 */                        map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                            } else if (obj instanceof char[]) {
/* 78 */                        map2.put(str2, bundle.getCharArray(str2));
                            } else if (obj instanceof Character) {
/* 94 */                        map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                            } else if (obj instanceof CharSequence[]) {
/* 106 */                       map2.put(str2, bundle.getCharSequenceArray(str2));
                            } else if (obj instanceof CharSequence) {
/* 118 */                       map2.put(str2, bundle.getCharSequence(str2));
                            } else if (obj instanceof float[]) {
/* 130 */                       map2.put(str2, bundle.getFloatArray(str2));
                            } else if (obj instanceof Float) {
/* 146 */                       map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                            }
                        }
/* 152 */               map.put(SharedDataContentProvider.BASE_PATH, map2);
                    }
/* 176 */           this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i), map));
                }

                public void previous(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'previous' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.previous"));
                }

                public void requestExistingInputState() {
/* 6 */             this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
                }

                public void search(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'search' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.search"));
                }

                public void send(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'send' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.send"));
                }

                public void setTextInputMethodHandler(TextInputMethodHandler textInputMethodHandler) {
/* 1 */             this.textInputMethodHandler = textInputMethodHandler;
                }

                public void unspecifiedAction(int i) {
/* 5 */             Log.m4589v(TAG, "Sending 'unspecified' message.");
/* 31 */            this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.unspecified"));
                }

                public void updateEditingState(int i, String str, int i2, int i3, int i4, int i5) {
/* 49 */            Log.m4589v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
/* 77 */            this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i), createEditingStateJSON(str, i2, i3, i4, i5)));
                }

                public void updateEditingStateWithDeltas(int i, ArrayList<TextEditingDelta> arrayList) {
/* 21 */            Log.m4589v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
/* 49 */            this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i), createEditingDeltaJSON(arrayList)));
                }

                public void updateEditingStateWithTag(int i, HashMap<String, TextEditState> map) {
/* 30 */            Log.m4589v(TAG, "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
/* 35 */            HashMap map2 = new HashMap();
/* 50 */            for (Map.Entry<String, TextEditState> entry : map.entrySet()) {
/* 58 */                TextEditState value = entry.getValue();
/* 81 */                map2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
                    }
/* 106 */           this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i), map2));
                }
            }
