            package com.pichillilorenzo.flutter_inappwebview_android;

            import android.os.Build;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            import java.util.TimeZone;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlatformUtil extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "PlatformUtil";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_platformutil";
                public InAppWebViewFlutterPlugin plugin;

                public PlatformUtil(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 13 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                public static String formatDate(long j, String str, Locale locale, TimeZone timeZone) {
/* 3 */             SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
/* 6 */             simpleDateFormat.setTimeZone(timeZone);
/* 14 */            return simpleDateFormat.format(new Date(j));
                }

                public static Locale getLocaleFromString(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return Locale.US;
                    }
/* 8 */             String[] strArrSplit = str.split("_");
/* 13 */            String str2 = strArrSplit[0];
/* 15 */            int length = strArrSplit.length;
/* 16 */            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 24 */            String str4 = length > 1 ? strArrSplit[1] : HttpUrl.FRAGMENT_ENCODE_SET;
/* 27 */            if (strArrSplit.length > 2) {
/* 29 */                str3 = strArrSplit[2];
                    }
/* 33 */            return new Locale(str2, str4, str3);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.plugin = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
/* 12 */            if (!str.equals("formatDate")) {
/* 20 */                if (str.equals("getSystemVersion")) {
/* 32 */                    result.success(String.valueOf(Build.VERSION.SDK_INT));
/* 35 */                    return;
                        } else {
/* 22 */                    result.notImplemented();
/* 25 */                    return;
                        }
                    }
/* 44 */            long jLongValue = ((Long) methodCall.argument("date")).longValue();
/* 54 */            String str2 = (String) methodCall.argument("format");
/* 64 */            Locale localeFromString = getLocaleFromString((String) methodCall.argument("locale"));
/* 74 */            String str3 = (String) methodCall.argument("timezone");
/* 76 */            if (str3 == null) {
/* 78 */                str3 = "UTC";
                    }
/* 88 */            result.success(formatDate(jLongValue, str2, localeFromString, TimeZone.getTimeZone(str3)));
                }
            }
