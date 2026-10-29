            package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

            import androidx.webkit.ProcessGlobalConfig;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProcessGlobalConfigManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "ProcessGlobalConfigM";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_processglobalconfig";
                public InAppWebViewFlutterPlugin plugin;

                public ProcessGlobalConfigManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 13 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.plugin = null;
                }

                /* JADX WARN: Type inference failed for: r3v3, types: [com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigSettings] */
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
/* 12 */            if (!str.equals("apply")) {
/* 14 */                result.notImplemented();
/* 17 */                return;
                    }
/* 18 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 20 */            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
/* 71 */                result.success(Boolean.FALSE);
/* 74 */                return;
                    }
                    try {
/* 51 */                ProcessGlobalConfig.m1145a(new ProcessGlobalConfigSettings().parse2((Map<String, Object>) methodCall.argument("settings")).toProcessGlobalConfig(this.plugin.activity));
/* 56 */                result.success(Boolean.TRUE);
                    } catch (Exception e) {
/* 65 */                result.error(LOG_TAG, HttpUrl.FRAGMENT_ENCODE_SET, e);
                    }
                }
            }
