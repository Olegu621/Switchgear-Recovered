            package io.flutter.embedding.engine.systemchannels;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.JSONMethodCodec;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlatformChannel {
                private static final String TAG = "PlatformChannel";
                public final MethodChannel channel;
                final MethodChannel.MethodCallHandler parsingMethodCallHandler;
                private PlatformMessageHandler platformMessageHandler;

                /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C10792 {

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation */
                    static final /* synthetic */ int[] f9758x92f09090;

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode */
                    static final /* synthetic */ int[] f9759xf03f4cb0;

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
                    static final /* synthetic */ int[] f9760x4c113a23;

                    static {
/* 6 */                 int[] iArr = new int[SystemUiMode.values().length];
/* 8 */                 f9759xf03f4cb0 = iArr;
                        try {
/* 17 */                    iArr[SystemUiMode.LEAN_BACK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f9759xf03f4cb0[SystemUiMode.IMMERSIVE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f9759xf03f4cb0[SystemUiMode.IMMERSIVE_STICKY.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 50 */                    f9759xf03f4cb0[SystemUiMode.EDGE_TO_EDGE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
/* 57 */                int[] iArr2 = new int[SystemUiOverlay.values().length];
/* 59 */                f9760x4c113a23 = iArr2;
                        try {
/* 67 */                    iArr2[SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
/* 77 */                    f9760x4c113a23[SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused6) {
                        }
/* 84 */                int[] iArr3 = new int[DeviceOrientation.values().length];
/* 86 */                f9758x92f09090 = iArr3;
                        try {
/* 94 */                    iArr3[DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
                        } catch (NoSuchFieldError unused7) {
                        }
                        try {
/* 104 */                   f9758x92f09090[DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
                        } catch (NoSuchFieldError unused8) {
                        }
                        try {
/* 114 */                   f9758x92f09090[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused9) {
                        }
                        try {
/* 124 */                   f9758x92f09090[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
                        } catch (NoSuchFieldError unused10) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class AppSwitcherDescription {
                    public final int color;
                    public final String label;

                    public AppSwitcherDescription(int i, String str) {
/* 4 */                 this.color = i;
/* 6 */                 this.label = str;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Brightness {
                    LIGHT("Brightness.light"),
                    DARK("Brightness.dark");

                    private String encodedName;

                    Brightness(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static Brightness fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (Brightness brightness : values()) {
/* 17 */                    if (brightness.encodedName.equals(str)) {
/* 19 */                        return brightness;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such Brightness: ", str));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ClipboardContentFormat {
                    PLAIN_TEXT("text/plain");

                    private String encodedName;

                    ClipboardContentFormat(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static ClipboardContentFormat fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (ClipboardContentFormat clipboardContentFormat : values()) {
/* 17 */                    if (clipboardContentFormat.encodedName.equals(str)) {
/* 19 */                        return clipboardContentFormat;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such ClipboardContentFormat: ", str));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum DeviceOrientation {
                    PORTRAIT_UP("DeviceOrientation.portraitUp"),
                    PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
                    LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
                    LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");

                    private String encodedName;

                    DeviceOrientation(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static DeviceOrientation fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (DeviceOrientation deviceOrientation : values()) {
/* 17 */                    if (deviceOrientation.encodedName.equals(str)) {
/* 19 */                        return deviceOrientation;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such DeviceOrientation: ", str));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum HapticFeedbackType {
                    STANDARD(null),
                    LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
                    MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
                    HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
                    SELECTION_CLICK("HapticFeedbackType.selectionClick");

                    private final String encodedName;

                    HapticFeedbackType(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static HapticFeedbackType fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (HapticFeedbackType hapticFeedbackType : values()) {
/* 11 */                    String str2 = hapticFeedbackType.encodedName;
/* 13 */                    if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
/* 25 */                        return hapticFeedbackType;
                            }
                        }
/* 40 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such HapticFeedbackType: ", str));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface PlatformMessageHandler {
                    boolean clipboardHasStrings();

                    CharSequence getClipboardData(ClipboardContentFormat clipboardContentFormat);

                    void playSystemSound(SoundType soundType);

                    void popSystemNavigator();

                    void restoreSystemUiOverlays();

                    void setApplicationSwitcherDescription(AppSwitcherDescription appSwitcherDescription);

                    void setClipboardData(String str);

                    default void setFrameworkHandlesBack(boolean z) {
                    }

                    void setPreferredOrientations(int i);

                    void setSystemUiChangeListener();

                    void setSystemUiOverlayStyle(SystemChromeStyle systemChromeStyle);

                    void share(String str);

                    void showSystemOverlays(List<SystemUiOverlay> list);

                    void showSystemUiMode(SystemUiMode systemUiMode);

                    void vibrateHapticFeedback(HapticFeedbackType hapticFeedbackType);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum SoundType {
                    CLICK("SystemSoundType.click"),
                    TICK("SystemSoundType.tick"),
                    ALERT("SystemSoundType.alert");

                    private final String encodedName;

                    SoundType(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static SoundType fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (SoundType soundType : values()) {
/* 17 */                    if (soundType.encodedName.equals(str)) {
/* 19 */                        return soundType;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such SoundType: ", str));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SystemChromeStyle {
                    public final Integer statusBarColor;
                    public final Brightness statusBarIconBrightness;
                    public final Integer systemNavigationBarColor;
                    public final Boolean systemNavigationBarContrastEnforced;
                    public final Integer systemNavigationBarDividerColor;
                    public final Brightness systemNavigationBarIconBrightness;
                    public final Boolean systemStatusBarContrastEnforced;

                    public SystemChromeStyle(Integer num, Brightness brightness, Boolean bool, Integer num2, Brightness brightness2, Integer num3, Boolean bool2) {
/* 4 */                 this.statusBarColor = num;
/* 6 */                 this.statusBarIconBrightness = brightness;
/* 8 */                 this.systemStatusBarContrastEnforced = bool;
/* 10 */                this.systemNavigationBarColor = num2;
/* 12 */                this.systemNavigationBarIconBrightness = brightness2;
/* 14 */                this.systemNavigationBarDividerColor = num3;
/* 16 */                this.systemNavigationBarContrastEnforced = bool2;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum SystemUiMode {
                    LEAN_BACK("SystemUiMode.leanBack"),
                    IMMERSIVE("SystemUiMode.immersive"),
                    IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
                    EDGE_TO_EDGE("SystemUiMode.edgeToEdge");

                    private String encodedName;

                    SystemUiMode(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static SystemUiMode fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (SystemUiMode systemUiMode : values()) {
/* 17 */                    if (systemUiMode.encodedName.equals(str)) {
/* 19 */                        return systemUiMode;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such SystemUiMode: ", str));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum SystemUiOverlay {
                    TOP_OVERLAYS("SystemUiOverlay.top"),
                    BOTTOM_OVERLAYS("SystemUiOverlay.bottom");

                    private String encodedName;

                    SystemUiOverlay(String str) {
/* 4 */                 this.encodedName = str;
                    }

                    public static SystemUiOverlay fromValue(String str) throws NoSuchFieldException {
/* 7 */                 for (SystemUiOverlay systemUiOverlay : values()) {
/* 17 */                    if (systemUiOverlay.encodedName.equals(str)) {
/* 19 */                        return systemUiOverlay;
                            }
                        }
/* 34 */                throw new NoSuchFieldException(AbstractC0886en.m3507k("No such SystemUiOverlay: ", str));
                    }
                }

                public PlatformChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformChannel.1
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                            ClipboardContentFormat clipboardContentFormatFromValue;
/* 11 */                    if (PlatformChannel.this.platformMessageHandler == null) {
/* 597 */                       return;
                            }
/* 15 */                    String str = methodCall.method;
/* 17 */                    Object obj = methodCall.arguments;
/* 40 */                    Log.m4589v(PlatformChannel.TAG, "Received '" + str + "' message.");
                            try {
                                switch (str.hashCode()) {
                                    case -1501580720:
/* 551 */                               if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
/* 565 */                                   PlatformChannel.this.platformMessageHandler.setFrameworkHandlesBack(((Boolean) obj).booleanValue());
/* 568 */                                   result.success(null);
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case -931781241:
/* 528 */                               if (str.equals("Share.invoke")) {
/* 538 */                                   PlatformChannel.this.platformMessageHandler.share((String) obj);
/* 541 */                                   result.success(null);
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case -766342101:
/* 507 */                               if (str.equals("SystemNavigator.pop")) {
/* 515 */                                   PlatformChannel.this.platformMessageHandler.popSystemNavigator();
/* 518 */                                   result.success(null);
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case -720677196:
/* 480 */                               if (str.equals("Clipboard.setData")) {
/* 494 */                                   PlatformChannel.this.platformMessageHandler.setClipboardData(((JSONObject) obj).getString("text"));
/* 497 */                                   result.success(null);
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case -577225884:
/* 458 */                               if (str.equals("SystemChrome.setSystemUIChangeListener")) {
/* 466 */                                   PlatformChannel.this.platformMessageHandler.setSystemUiChangeListener();
/* 469 */                                   result.success(null);
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case -548468504:
/* 418 */                               if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                            try {
/* 434 */                                       PlatformChannel.this.platformMessageHandler.setApplicationSwitcherDescription(PlatformChannel.this.decodeAppSwitcherDescription((JSONObject) obj));
/* 437 */                                       result.success(null);
                                            } catch (JSONException e) {
/* 447 */                                       result.error("error", e.getMessage(), null);
/* 597 */                                       return;
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case -247230243:
/* 380 */                               if (str.equals("HapticFeedback.vibrate")) {
                                            try {
/* 394 */                                       PlatformChannel.this.platformMessageHandler.vibrateHapticFeedback(HapticFeedbackType.fromValue((String) obj));
/* 397 */                                       result.success(null);
                                            } catch (NoSuchFieldException e2) {
/* 407 */                                       result.error("error", e2.getMessage(), null);
/* 597 */                                       return;
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case -215273374:
/* 342 */                               if (str.equals("SystemSound.play")) {
                                            try {
/* 356 */                                       PlatformChannel.this.platformMessageHandler.playSystemSound(SoundType.fromValue((String) obj));
/* 359 */                                       result.success(null);
                                            } catch (NoSuchFieldException e3) {
/* 369 */                                       result.error("error", e3.getMessage(), null);
/* 597 */                                       return;
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case 241845679:
/* 320 */                               if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
/* 328 */                                   PlatformChannel.this.platformMessageHandler.restoreSystemUiOverlays();
/* 331 */                                   result.success(null);
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case 875995648:
/* 287 */                               if (str.equals("Clipboard.hasStrings")) {
/* 295 */                                   boolean zClipboardHasStrings = PlatformChannel.this.platformMessageHandler.clipboardHasStrings();
/* 301 */                                   JSONObject jSONObject = new JSONObject();
/* 306 */                                   jSONObject.put(FirebaseAnalytics.Param.VALUE, zClipboardHasStrings);
/* 309 */                                   result.success(jSONObject);
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case 1128339786:
/* 245 */                               if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                                            try {
/* 261 */                                       PlatformChannel.this.platformMessageHandler.showSystemUiMode(PlatformChannel.this.decodeSystemUiMode((String) obj));
/* 264 */                                       result.success(null);
                                            } catch (NoSuchFieldException | JSONException e4) {
/* 276 */                                       result.error("error", e4.getMessage(), null);
/* 597 */                                       return;
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case 1390477857:
/* 203 */                               if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                            try {
/* 219 */                                       PlatformChannel.this.platformMessageHandler.setSystemUiOverlayStyle(PlatformChannel.this.decodeSystemChromeStyle((JSONObject) obj));
/* 222 */                                       result.success(null);
                                            } catch (NoSuchFieldException | JSONException e5) {
/* 234 */                                       result.error("error", e5.getMessage(), null);
/* 597 */                                       return;
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case 1514180520:
/* 148 */                               if (str.equals("Clipboard.getData")) {
/* 150 */                                   String str2 = (String) obj;
/* 152 */                                   if (str2 != null) {
                                                try {
/* 154 */                                           clipboardContentFormatFromValue = ClipboardContentFormat.fromValue(str2);
                                                } catch (NoSuchFieldException unused) {
/* 163 */                                           result.error("error", "No such clipboard content format: ".concat(str2), null);
/* 166 */                                           clipboardContentFormatFromValue = null;
                                                }
                                            } else {
/* 166 */                                       clipboardContentFormatFromValue = null;
                                            }
/* 173 */                                   CharSequence clipboardData = PlatformChannel.this.platformMessageHandler.getClipboardData(clipboardContentFormatFromValue);
/* 177 */                                   if (clipboardData == null) {
/* 192 */                                       result.success(null);
                                            } else {
/* 181 */                                       JSONObject jSONObject2 = new JSONObject();
/* 184 */                                       jSONObject2.put("text", clipboardData);
/* 187 */                                       result.success(jSONObject2);
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case 1674312266:
/* 106 */                               if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                            try {
/* 122 */                                       PlatformChannel.this.platformMessageHandler.showSystemOverlays(PlatformChannel.this.decodeSystemUiOverlays((JSONArray) obj));
/* 125 */                                       result.success(null);
                                            } catch (NoSuchFieldException | JSONException e6) {
/* 137 */                                       result.error("error", e6.getMessage(), null);
/* 597 */                                       return;
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    case 2119655719:
/* 61 */                                if (str.equals("SystemChrome.setPreferredOrientations")) {
                                            try {
/* 77 */                                        PlatformChannel.this.platformMessageHandler.setPreferredOrientations(PlatformChannel.this.decodeOrientations((JSONArray) obj));
/* 80 */                                        result.success(null);
                                            } catch (NoSuchFieldException | JSONException e7) {
/* 92 */                                        result.error("error", e7.getMessage(), null);
/* 597 */                                       return;
                                            }
                                        }
/* 572 */                               result.notImplemented();
                                        break;
                                    default:
/* 572 */                               result.notImplemented();
                                        break;
                                }
                            } catch (JSONException e8) {
/* 594 */                       result.error("error", "JSON error: " + e8.getMessage(), null);
                            }
                        }
                    };
/* 9 */             this.parsingMethodCallHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform", JSONMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public AppSwitcherDescription decodeAppSwitcherDescription(JSONObject jSONObject) throws JSONException {
/* 3 */             int i = jSONObject.getInt("primaryColor");
/* 7 */             if (i != 0) {
/* 11 */                i |= -16777216;
                    }
/* 20 */            return new AppSwitcherDescription(i, jSONObject.getString("label"));
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:35:0x0054 A[RETURN] */
                public int decodeOrientations(JSONArray jSONArray) throws JSONException, NoSuchFieldException {
/* 3 */             int i = 0;
/* 4 */             int i2 = 0;
/* 12 */            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
/* 28 */                int i4 = C10792.f9758x92f09090[DeviceOrientation.fromValue(jSONArray.getString(i3)).ordinal()];
/* 30 */                if (i4 == 1) {
/* 49 */                    i |= 1;
                        } else if (i4 == 2) {
/* 46 */                    i |= 4;
                        } else if (i4 == 3) {
/* 43 */                    i |= 2;
                        } else if (i4 == 4) {
/* 40 */                    i |= 8;
                        }
/* 51 */                if (i2 == 0) {
/* 53 */                    i2 = i;
                        }
                    }
/* 57 */            if (i == 0) {
/* 89 */                return -1;
                    }
                    switch (i) {
                        case 2:
/* 1 */                     return 0;
                        case 3:
                        case 6:
                        case 7:
                        case 9:
                        case 12:
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                        case 14:
/* 79 */                    if (i2 != 2) {
/* 81 */                        if (i2 == 4) {
/* 59 */                            return 9;
                                }
/* 83 */                        if (i2 != 8) {
/* 11 */                            return 1;
                                }
/* 61 */                        return 8;
                            }
/* 1 */                     return 0;
                        case 4:
/* 59 */                    return 9;
                        case 5:
/* 75 */                    return 12;
                        case 8:
/* 61 */                    return 8;
                        case 10:
/* 71 */                    return 11;
                        case 11:
/* 10 */                    return 2;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 67 */                    return 13;
                        default:
/* 11 */                    return 1;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public SystemChromeStyle decodeSystemChromeStyle(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
/* 135 */           return new SystemChromeStyle(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public SystemUiMode decodeSystemUiMode(String str) throws JSONException, NoSuchFieldException {
/* 11 */            int i = C10792.f9759xf03f4cb0[SystemUiMode.fromValue(str).ordinal()];
/* 14 */            if (i == 1) {
/* 37 */                return SystemUiMode.LEAN_BACK;
                    }
/* 17 */            if (i == 2) {
/* 34 */                return SystemUiMode.IMMERSIVE;
                    }
/* 20 */            if (i != 3) {
                        return i != 4 ? SystemUiMode.EDGE_TO_EDGE : SystemUiMode.EDGE_TO_EDGE;
                    }
/* 31 */            return SystemUiMode.IMMERSIVE_STICKY;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public List<SystemUiOverlay> decodeSystemUiOverlays(JSONArray jSONArray) throws JSONException, NoSuchFieldException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 11 */            for (int i = 0; i < jSONArray.length(); i++) {
/* 27 */                int i2 = C10792.f9760x4c113a23[SystemUiOverlay.fromValue(jSONArray.getString(i)).ordinal()];
/* 30 */                if (i2 == 1) {
/* 44 */                    arrayList.add(SystemUiOverlay.TOP_OVERLAYS);
                        } else if (i2 == 2) {
/* 38 */                    arrayList.add(SystemUiOverlay.BOTTOM_OVERLAYS);
                        }
                    }
/* 50 */            return arrayList;
                }

                public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler) {
/* 1 */             this.platformMessageHandler = platformMessageHandler;
                }

                public void systemChromeChanged(boolean z) {
/* 5 */             Log.m4589v(TAG, "Sending 'systemUIChange' message.");
/* 24 */            this.channel.invokeMethod("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z)));
                }
            }
