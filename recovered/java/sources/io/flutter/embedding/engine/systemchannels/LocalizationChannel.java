            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.JSONMethodCodec;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class LocalizationChannel {
                private static final String TAG = "LocalizationChannel";
                public final MethodChannel channel;
                public final MethodChannel.MethodCallHandler handler;
                private LocalizationMessageHandler localizationMessageHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface LocalizationMessageHandler {
                    String getStringResource(String str, String str2);
                }

                public LocalizationChannel(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 9 */                     if (LocalizationChannel.this.localizationMessageHandler == null) {
/* 11 */                        return;
                            }
/* 12 */                    String str = methodCall.method;
/* 14 */                    str.getClass();
/* 23 */                    if (!str.equals("Localization.getStringResource")) {
/* 25 */                        result.notImplemented();
/* 28 */                        return;
                            }
/* 33 */                    JSONObject jSONObject = (JSONObject) methodCall.arguments();
                            try {
/* 66 */                        result.success(LocalizationChannel.this.localizationMessageHandler.getStringResource(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                            } catch (JSONException e) {
/* 76 */                        result.error("error", e.getMessage(), null);
                            }
                        }
                    };
/* 9 */             this.handler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                public void sendLocales(List<Locale> list) {
/* 5 */             Log.m4589v(TAG, "Sending Locales to Flutter.");
/* 10 */            ArrayList arrayList = new ArrayList();
/* 21 */            for (Locale locale : list) {
/* 76 */                Log.m4589v(TAG, "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
/* 83 */                arrayList.add(locale.getLanguage());
/* 90 */                arrayList.add(locale.getCountry());
/* 97 */                arrayList.add(locale.getScript());
/* 104 */               arrayList.add(locale.getVariant());
                    }
/* 112 */           this.channel.invokeMethod("setLocale", arrayList);
                }

                public void setLocalizationMessageHandler(LocalizationMessageHandler localizationMessageHandler) {
/* 1 */             this.localizationMessageHandler = localizationMessageHandler;
                }
            }
