            package com.pichillilorenzo.flutter_inappwebview_android;

            import android.webkit.CookieManager;
            import android.webkit.ValueCallback;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.text.ParseException;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            import p000.AbstractC0886en;
            import p000.b73;
            import p000.c73;
            import p000.fm0;
            import p000.j13;
            import p000.pm2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MyCookieManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "MyCookieManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
                public static CookieManager cookieManager;
                public InAppWebViewFlutterPlugin plugin;

                public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 13 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                public static String getCookieExpirationDate(Long l) {
/* 7 */             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
/* 16 */            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
/* 28 */            return simpleDateFormat.format(new Date(l.longValue()));
                }

                private static CookieManager getCookieManager() throws Exception {
/* 3 */             if (cookieManager == null) {
                        try {
/* 10 */                    cookieManager = CookieManager.getInstance();
                        } catch (IllegalArgumentException unused) {
/* 5 */                     return null;
                        } catch (Exception e) {
/* 18 */                    if (e.getMessage() == null || !e.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
/* 37 */                        throw e;
                            }
/* 5 */                     return null;
                        }
                    }
/* 39 */            return cookieManager;
                }

                public static void init() {
/* 3 */             if (cookieManager == null) {
/* 9 */                 cookieManager = getCookieManager();
                    }
                }

                public void deleteAllCookies(final MethodChannel.Result result) throws Exception {
/* 1 */             CookieManager cookieManager2 = getCookieManager();
/* 5 */             cookieManager = cookieManager2;
/* 7 */             if (cookieManager2 == null) {
/* 11 */                result.success(Boolean.FALSE);
                    } else {
/* 20 */                cookieManager2.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.3
                            @Override // android.webkit.ValueCallback
/* 6 */                     public void onReceiveValue(Boolean bool) {
/* 7 */                         result.success(bool);
                            }
                        });
/* 25 */                cookieManager.flush();
                    }
                }

                public void deleteCookie(String str, String str2, String str3, String str4, final MethodChannel.Result result) throws Exception {
/* 1 */             CookieManager cookieManager2 = getCookieManager();
/* 5 */             cookieManager = cookieManager2;
/* 7 */             if (cookieManager2 == null) {
/* 11 */                result.success(Boolean.FALSE);
/* 14 */                return;
                    }
/* 19 */            String strM7489l = pm2.m7489l(str2, "=; Path=", str4, "; Max-Age=-1");
/* 23 */            if (str3 != null) {
/* 27 */                strM7489l = AbstractC0886en.m3508l(strM7489l, "; Domain=", str3);
                    }
/* 44 */            cookieManager.setCookie(str, strM7489l.concat(";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.2
                        @Override // android.webkit.ValueCallback
/* 6 */                 public void onReceiveValue(Boolean bool) {
/* 7 */                     result.success(bool);
                        }
                    });
/* 49 */            cookieManager.flush();
                }

                public void deleteCookies(String str, String str2, String str3, MethodChannel.Result result) throws Exception {
/* 1 */             CookieManager cookieManager2 = getCookieManager();
/* 5 */             cookieManager = cookieManager2;
/* 7 */             if (cookieManager2 == null) {
/* 11 */                result.success(Boolean.FALSE);
/* 14 */                return;
                    }
/* 15 */            String cookie = cookieManager2.getCookie(str);
/* 19 */            if (cookie != null) {
/* 30 */                for (String str4 : cookie.split(";")) {
/* 51 */                    String strM7489l = pm2.m7489l(str4.split("=", 2)[0].trim(), "=; Path=", str3, "; Max-Age=-1");
/* 55 */                    if (str2 != null) {
/* 59 */                        strM7489l = AbstractC0886en.m3508l(strM7489l, "; Domain=", str2);
                            }
/* 70 */                    cookieManager.setCookie(str, strM7489l.concat(";"), null);
                        }
/* 78 */                cookieManager.flush();
                    }
/* 83 */            result.success(Boolean.TRUE);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.plugin = null;
                }

                public List<Map<String, Object>> getCookies(String str) throws Exception {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 8 */             CookieManager cookieManager2 = getCookieManager();
/* 12 */            cookieManager = cookieManager2;
/* 14 */            if (cookieManager2 != null) {
/* 20 */                List<String> arrayList2 = new ArrayList<>();
/* 23 */                String str2 = "GET_COOKIE_INFO";
/* 31 */                if (xe2.m9786x("GET_COOKIE_INFO")) {
/* 33 */                    CookieManager cookieManager3 = cookieManager;
/* 41 */                    if (!b73.f2298N.mo97b()) {
/* 70 */                        throw b73.m1295a();
                            }
/* 61 */                    arrayList2 = ((WebViewCookieManagerBoundaryInterface) j13.m5642b(WebViewCookieManagerBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) c73.f2756a.f7853b).convertCookieManager(cookieManager3))).getCookieInfo(str);
                        } else {
/* 73 */                    String cookie = cookieManager.getCookie(str);
/* 77 */                    if (cookie != null) {
/* 83 */                        arrayList2 = Arrays.asList(cookie.split(";"));
                            }
                        }
/* 87 */                Iterator<String> it = arrayList2.iterator();
/* 95 */                while (it.hasNext()) {
/* 103 */                   String[] strArrSplit = it.next().split(";");
/* 108 */                   if (strArrSplit.length != 0) {
/* 117 */                       String[] strArrSplit2 = strArrSplit[0].split("=", 2);
/* 123 */                       String strTrim = strArrSplit2[0].trim();
/* 140 */                       String strTrim2 = strArrSplit2.length > 1 ? strArrSplit2[1].trim() : HttpUrl.FRAGMENT_ENCODE_SET;
/* 143 */                       HashMap map = new HashMap();
/* 148 */                       map.put("name", strTrim);
/* 153 */                       map.put(FirebaseAnalytics.Param.VALUE, strTrim2);
/* 159 */                       map.put("expiresDate", null);
/* 164 */                       map.put("isSessionOnly", null);
/* 169 */                       map.put("domain", null);
/* 174 */                       map.put("sameSite", null);
/* 179 */                       map.put("isSecure", null);
/* 186 */                       map.put("isHttpOnly", null);
/* 191 */                       map.put("path", null);
/* 198 */                       if (xe2.m9786x(str2)) {
/* 200 */                           Boolean bool = Boolean.FALSE;
/* 202 */                           map.put("isSecure", bool);
/* 205 */                           map.put("isHttpOnly", bool);
/* 208 */                           int i = 1;
/* 210 */                           while (i < strArrSplit.length) {
/* 214 */                               Iterator<String> it2 = it;
/* 217 */                               String[] strArrSplit3 = strArrSplit[i].split("=", 2);
/* 223 */                               String strTrim3 = strArrSplit3[0].trim();
/* 227 */                               String[] strArr = strArrSplit;
/* 230 */                               String str3 = str2;
/* 242 */                               String strTrim4 = strArrSplit3.length > 1 ? strArrSplit3[1].trim() : HttpUrl.FRAGMENT_ENCODE_SET;
/* 249 */                               if (strTrim3.equalsIgnoreCase("Expires")) {
                                            try {
/* 260 */                                       Date date = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(strTrim4);
/* 264 */                                       if (date != null) {
/* 274 */                                           map.put("expiresDate", Long.valueOf(date.getTime()));
                                                }
                                            } catch (NumberFormatException | ParseException unused) {
                                            }
                                        } else if (strTrim3.equalsIgnoreCase("Max-Age")) {
/* 300 */                                   map.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(strTrim4)));
                                        } else if (strTrim3.equalsIgnoreCase("Domain")) {
/* 312 */                                   map.put("domain", strTrim4);
                                        } else if (strTrim3.equalsIgnoreCase("SameSite")) {
/* 324 */                                   map.put("sameSite", strTrim4);
                                        } else if (strTrim3.equalsIgnoreCase("Secure")) {
/* 338 */                                   map.put("isSecure", Boolean.TRUE);
                                        } else if (strTrim3.equalsIgnoreCase("HttpOnly")) {
/* 352 */                                   map.put("isHttpOnly", Boolean.TRUE);
                                        } else if (strTrim3.equalsIgnoreCase("Path")) {
/* 364 */                                   map.put("path", strTrim4);
                                        }
/* 367 */                               i++;
/* 369 */                               strArrSplit = strArr;
/* 371 */                               it = it2;
/* 373 */                               str2 = str3;
                                    }
                                }
/* 381 */                       arrayList.add(map);
/* 384 */                       it = it;
/* 386 */                       str2 = str2;
                            }
                        }
                    }
/* 390 */           return arrayList;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) throws Exception {
/* 2 */             init();
/* 5 */             String str = methodCall.method;
/* 7 */             str.getClass();
                    switch (str) {
                        case "deleteCookie":
/* 269 */                   deleteCookie((String) methodCall.argument("url"), (String) methodCall.argument("name"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                            break;
                        case "removeSessionCookies":
/* 236 */                   removeSessionCookies(result);
                            break;
                        case "setCookie":
/* 143 */                   String str2 = (String) methodCall.argument("url");
/* 149 */                   String str3 = (String) methodCall.argument("name");
/* 157 */                   String str4 = (String) methodCall.argument(FirebaseAnalytics.Param.VALUE);
/* 163 */                   String str5 = (String) methodCall.argument("domain");
/* 169 */                   String str6 = (String) methodCall.argument("path");
/* 177 */                   String str7 = (String) methodCall.argument("expiresDate");
/* 232 */                   setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) methodCall.argument("maxAge"), (Boolean) methodCall.argument("isSecure"), (Boolean) methodCall.argument("isHttpOnly"), (String) methodCall.argument("sameSite"), result);
                            break;
                        case "deleteCookies":
/* 135 */                   deleteCookies((String) methodCall.argument("url"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                            break;
                        case "deleteAllCookies":
/* 113 */                   deleteAllCookies(result);
                            break;
                        case "getCookies":
/* 109 */                   result.success(getCookies((String) methodCall.argument("url")));
                            break;
                        default:
/* 95 */                    result.notImplemented();
                            break;
                    }
                }

                public void removeSessionCookies(final MethodChannel.Result result) throws Exception {
/* 1 */             CookieManager cookieManager2 = getCookieManager();
/* 5 */             cookieManager = cookieManager2;
/* 7 */             if (cookieManager2 == null) {
/* 11 */                result.success(Boolean.FALSE);
                    } else {
/* 20 */                cookieManager2.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.4
                            @Override // android.webkit.ValueCallback
/* 6 */                     public void onReceiveValue(Boolean bool) {
/* 7 */                         result.success(bool);
                            }
                        });
/* 25 */                cookieManager.flush();
                    }
                }

                public void setCookie(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Boolean bool, Boolean bool2, String str6, final MethodChannel.Result result) throws Exception {
/* 1 */             CookieManager cookieManager2 = getCookieManager();
/* 5 */             cookieManager = cookieManager2;
/* 7 */             if (cookieManager2 == null) {
/* 11 */                result.success(Boolean.FALSE);
/* 14 */                return;
                    }
/* 39 */            String strM3508l = str2 + "=" + str3 + "; Path=" + str5;
/* 43 */            if (str4 != null) {
/* 47 */                strM3508l = AbstractC0886en.m3508l(strM3508l, "; Domain=", str4);
                    }
/* 51 */            if (l != null) {
/* 55 */                StringBuilder sbM3794t = fm0.m3794t(strM3508l, "; Expires=");
/* 63 */                sbM3794t.append(getCookieExpirationDate(l));
/* 66 */                strM3508l = sbM3794t.toString();
                    }
/* 70 */            if (num != null) {
/* 74 */                StringBuilder sbM3794t2 = fm0.m3794t(strM3508l, "; Max-Age=");
/* 82 */                sbM3794t2.append(num.toString());
/* 85 */                strM3508l = sbM3794t2.toString();
                    }
/* 89 */            if (bool != null && bool.booleanValue()) {
/* 99 */                strM3508l = strM3508l.concat("; Secure");
                    }
/* 103 */           if (bool2 != null && bool2.booleanValue()) {
/* 113 */               strM3508l = strM3508l.concat("; HttpOnly");
                    }
/* 117 */           if (str6 != null) {
/* 121 */               strM3508l = AbstractC0886en.m3508l(strM3508l, "; SameSite=", str6);
                    }
/* 138 */           cookieManager.setCookie(str, strM3508l.concat(";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.1
                        @Override // android.webkit.ValueCallback
/* 6 */                 public void onReceiveValue(Boolean bool3) {
/* 7 */                     result.success(bool3);
                        }
                    });
/* 143 */           cookieManager.flush();
                }
            }
