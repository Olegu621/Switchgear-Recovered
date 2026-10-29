            package io.sentry.android.replay;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1443f;
            import io.sentry.C1666s6;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1698u3;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.rrweb.AbstractC1647b;
            import io.sentry.rrweb.C1646a;
            import io.sentry.rrweb.C1657l;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.regex.Matcher;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import p000.di2;
            import p000.p51;
            import p000.r51;
            import p000.ra2;
            import p000.v51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1297c implements InterfaceC1698u3 {

                /* JADX INFO: renamed from: c */
                public static final p51 f10440c = r51.m8064a(v51.f17866b, C1293a.f10427b);

                /* JADX INFO: renamed from: d */
                public static final HashSet f10441d;

                /* JADX INFO: renamed from: a */
                public String f10442a;

                /* JADX INFO: renamed from: b */
                public final Map f10443b = Collections.synchronizedMap(new C1295b());

                static {
/* 13 */            HashSet hashSet = new HashSet();
/* 18 */            hashSet.add("status_code");
/* 23 */            hashSet.add(FirebaseAnalytics.Param.METHOD);
/* 28 */            hashSet.add("response_content_length");
/* 33 */            hashSet.add("request_content_length");
/* 38 */            hashSet.add("http.response_content_length");
/* 43 */            hashSet.add("http.request_content_length");
/* 46 */            f10441d = hashSet;
                }

                public C1297c(SentryAndroidOptions sentryAndroidOptions) {
/* 24 */            sentryAndroidOptions.setBeforeBreadcrumb(new C1666s6(this, sentryAndroidOptions.getBeforeBreadcrumb()));
                }

                /* JADX WARN: Code duplicated, block: B:150:0x03b6  */
                /* JADX WARN: Code duplicated, block: B:48:0x0193  */
                /* JADX WARN: Code duplicated, block: B:88:0x0261  */
                @Override // io.sentry.InterfaceC1698u3
                /* JADX INFO: renamed from: a */
                public final AbstractC1647b mo4983a(C1443f c1443f) {
                    String str;
                    EnumC1553m5 enumC1553m5;
                    Object obj;
                    String strSubstring;
                    double dLongValue;
                    double dLongValue2;
                    String string;
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 22 */            if (Intrinsics.m6216a(c1443f.f10932i, "http")) {
/* 30 */                Object obj2 = c1443f.m5207b().get("url");
/* 41 */                String str2 = obj2 instanceof String ? (String) obj2 : null;
/* 42 */                if (str2 != null && str2.length() != 0) {
/* 52 */                    Map mapM5207b = c1443f.m5207b();
/* 56 */                    mapM5207b.getClass();
/* 65 */                    if (mapM5207b.containsKey("http.start_timestamp")) {
/* 67 */                        Map mapM5207b2 = c1443f.m5207b();
/* 71 */                        mapM5207b2.getClass();
/* 80 */                        if (mapM5207b2.containsKey("http.end_timestamp")) {
/* 86 */                            Object obj3 = c1443f.m5207b().get("http.start_timestamp");
/* 94 */                            Object obj4 = c1443f.m5207b().get("http.end_timestamp");
/* 100 */                           C1657l c1657l = new C1657l();
/* 111 */                           c1657l.f11589b = c1443f.m5208c().getTime();
/* 115 */                           c1657l.f11617d = "resource.http";
/* 121 */                           Object obj5 = c1443f.m5207b().get("url");
/* 125 */                           obj5.getClass();
/* 130 */                           c1657l.f11618e = (String) obj5;
/* 134 */                           if (obj3 instanceof Double) {
/* 138 */                               dLongValue = ((Number) obj3).doubleValue();
                                    } else {
/* 144 */                               obj3.getClass();
/* 149 */                               dLongValue = ((Long) obj3).longValue();
                                    }
/* 155 */                           c1657l.f11619f = dLongValue / 1000.0d;
/* 159 */                           if (obj4 instanceof Double) {
/* 163 */                               dLongValue2 = ((Number) obj4).doubleValue();
                                    } else {
/* 169 */                               obj4.getClass();
/* 174 */                               dLongValue2 = ((Long) obj4).longValue();
                                    }
/* 180 */                           c1657l.f11620i = dLongValue2 / 1000.0d;
/* 184 */                           LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 193 */                           if (this.f10443b.remove(c1443f) != null) {
/* 438 */                               C1697u2.m5431g();
/* 21 */                                return null;
                                    }
/* 195 */                           Map mapM5207b3 = c1443f.m5207b();
/* 199 */                           mapM5207b3.getClass();
/* 214 */                           for (Map.Entry entry : mapM5207b3.entrySet()) {
/* 226 */                               String str3 = (String) entry.getKey();
/* 228 */                               Object value = entry.getValue();
/* 238 */                               if (f10441d.contains(str3)) {
/* 240 */                                   str3.getClass();
/* 247 */                                   String strM6261k = C1852e.m6261k(str3, "content_length", "body_size");
/* 253 */                                   String strM6237M = StringsKt.m6237M(strM6261k, ".", strM6261k);
/* 263 */                                   Regex regex = (Regex) f10440c.getValue();
/* 265 */                                   regex.getClass();
/* 270 */                                   Matcher matcher = regex.f12938a.matcher(strM6237M);
/* 274 */                                   matcher.getClass();
/* 287 */                                   ra2 ra2Var = !matcher.find(0) ? null : new ra2(matcher, strM6237M);
/* 290 */                                   if (ra2Var == null) {
/* 292 */                                       string = strM6237M.toString();
                                            } else {
/* 298 */                                       int length = strM6237M.length();
/* 304 */                                       StringBuilder sb = new StringBuilder(length);
/* 307 */                                       int i = 0;
/* 414 */                                       do {
/* 314 */                                           sb.append((CharSequence) strM6237M, i, ra2Var.m8109n().f12926a);
/* 321 */                                           String strGroup = ((Matcher) ra2Var.f15955a).group();
/* 325 */                                           strGroup.getClass();
/* 338 */                                           String upperCase = String.valueOf(di2.m3088x(strGroup)).toUpperCase(Locale.ROOT);
/* 342 */                                           upperCase.getClass();
/* 345 */                                           sb.append((CharSequence) upperCase);
/* 354 */                                           i = ra2Var.m8109n().f12927b + 1;
/* 357 */                                           CharSequence charSequence = (CharSequence) ra2Var.f15956b;
/* 361 */                                           Matcher matcher2 = (Matcher) ra2Var.f15955a;
/* 380 */                                           int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
/* 385 */                                           if (iEnd <= charSequence.length()) {
/* 391 */                                               Matcher matcher3 = matcher2.pattern().matcher(charSequence);
/* 395 */                                               matcher3.getClass();
/* 402 */                                               if (matcher3.find(iEnd)) {
/* 408 */                                                   ra2Var = new ra2(matcher3, charSequence);
                                                        } else {
/* 404 */                                                   ra2Var = null;
                                                        }
                                                    } else {
/* 404 */                                               ra2Var = null;
                                                    }
/* 412 */                                           if (i >= length) {
                                                        break;
                                                    }
/* 414 */                                       } while (ra2Var != null);
/* 416 */                                       if (i < length) {
/* 418 */                                           sb.append((CharSequence) strM6237M, i, length);
                                                }
/* 421 */                                       string = sb.toString();
                                            }
/* 425 */                                   linkedHashMap2.put(string, value);
                                        }
                                    }
/* 435 */                           c1657l.f11621v = new ConcurrentHashMap(linkedHashMap2);
/* 437 */                           return c1657l;
                                }
                            }
                        }
                    } else {
/* 442 */               String str4 = c1443f.f10930e;
/* 444 */               String str5 = NotificationCompat.CATEGORY_NAVIGATION;
/* 452 */               if (Intrinsics.m6216a(str4, NotificationCompat.CATEGORY_NAVIGATION) && Intrinsics.m6216a(c1443f.f10932i, "app.lifecycle")) {
/* 482 */                   str5 = "app." + c1443f.m5207b().get("state");
                        } else if (Intrinsics.m6216a(c1443f.f10930e, NotificationCompat.CATEGORY_NAVIGATION) && Intrinsics.m6216a(c1443f.f10932i, "device.orientation")) {
/* 508 */                   str5 = c1443f.f10932i;
/* 510 */                   str5.getClass();
/* 519 */                   Object obj6 = c1443f.m5207b().get("position");
/* 529 */                   if (Intrinsics.m6216a(obj6, "landscape") || Intrinsics.m6216a(obj6, "portrait")) {
/* 539 */                       linkedHashMap.put("position", obj6);
                            }
                        } else if (Intrinsics.m6216a(c1443f.f10930e, NotificationCompat.CATEGORY_NAVIGATION)) {
/* 567 */                   if (Intrinsics.m6216a(c1443f.m5207b().get("state"), "resumed")) {
/* 575 */                       Object obj7 = c1443f.m5207b().get("screen");
/* 586 */                       strSubstring = obj7 instanceof String ? (String) obj7 : null;
/* 587 */                       if (strSubstring != null) {
/* 592 */                           int iM6230F = StringsKt.m6230F(strSubstring, '.', 0, 6);
/* 597 */                           if (iM6230F != -1) {
/* 605 */                               strSubstring = strSubstring.substring(iM6230F + 1, strSubstring.length());
                                    }
                                } else {
/* 610 */                           strSubstring = null;
                                }
                            } else {
/* 612 */                       Map mapM5207b4 = c1443f.m5207b();
/* 616 */                       mapM5207b4.getClass();
/* 623 */                       if (mapM5207b4.containsKey("to")) {
/* 629 */                           Object obj8 = c1443f.m5207b().get("to");
/* 635 */                           if (obj8 instanceof String) {
/* 637 */                               strSubstring = (String) obj8;
                                    } else {
/* 610 */                               strSubstring = null;
                                    }
                                } else {
/* 610 */                           strSubstring = null;
                                }
                            }
/* 639 */                   if (strSubstring != null) {
/* 643 */                       linkedHashMap.put("to", strSubstring);
                            }
                        } else if (Intrinsics.m6216a(c1443f.f10932i, "ui.click")) {
/* 664 */                   Object obj9 = c1443f.m5207b().get("view.id");
/* 668 */                   if (obj9 == null && (obj9 = c1443f.m5207b().get("view.tag")) == null) {
/* 688 */                       obj9 = c1443f.m5207b().get("view.class");
                            }
/* 699 */                   str = obj9 instanceof String ? (String) obj9 : null;
/* 700 */                   if (str != null) {
/* 704 */                       Map mapM5207b5 = c1443f.m5207b();
/* 708 */                       mapM5207b5.getClass();
/* 711 */                       linkedHashMap.putAll(mapM5207b5);
/* 714 */                       str5 = "ui.tap";
/* 716 */                       enumC1553m5 = null;
/* 949 */                       if (str5 != null && str5.length() != 0) {
/* 960 */                           C1646a c1646a = new C1646a();
/* 971 */                           c1646a.f11589b = c1443f.m5208c().getTime();
/* 983 */                           c1646a.f11582d = c1443f.m5208c().getTime() / 1000.0d;
/* 987 */                           c1646a.f11583e = "default";
/* 989 */                           c1646a.f11584f = str5;
/* 991 */                           c1646a.f11585i = str;
/* 993 */                           c1646a.f11586v = enumC1553m5;
/* 1000 */                          c1646a.f11587w = new ConcurrentHashMap(linkedHashMap);
/* 1002 */                          return c1646a;
                                }
                            }
                        } else if (Intrinsics.m6216a(c1443f.f10930e, "system") && Intrinsics.m6216a(c1443f.f10932i, "network.event")) {
/* 755 */                   if (!Intrinsics.m6216a(c1443f.m5207b().get("action"), "NETWORK_LOST")) {
/* 760 */                       Map mapM5207b6 = c1443f.m5207b();
/* 764 */                       mapM5207b6.getClass();
/* 773 */                       if (mapM5207b6.containsKey("network_type")) {
/* 779 */                           Object obj10 = c1443f.m5207b().get("network_type");
/* 790 */                           String str6 = obj10 instanceof String ? (String) obj10 : null;
/* 805 */                           obj = (str6 == null || str6.length() == 0) ? "offline" : c1443f.m5207b().get("network_type");
                                }
                            }
/* 809 */                   linkedHashMap.put("state", obj);
/* 822 */                   if (!Intrinsics.m6216a(this.f10442a, linkedHashMap.get("state"))) {
/* 826 */                       Object obj11 = linkedHashMap.get("state");
/* 838 */                       this.f10442a = obj11 instanceof String ? (String) obj11 : null;
/* 840 */                       str5 = "device.connectivity";
                            }
                        } else {
/* 858 */                   if (Intrinsics.m6216a(c1443f.m5207b().get("action"), "BATTERY_CHANGED")) {
/* 860 */                       Map mapM5207b7 = c1443f.m5207b();
/* 864 */                       mapM5207b7.getClass();
/* 869 */                       LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 884 */                       for (Map.Entry entry2 : mapM5207b7.entrySet()) {
/* 896 */                           String str7 = (String) entry2.getKey();
/* 904 */                           if (Intrinsics.m6216a(str7, FirebaseAnalytics.Param.LEVEL) || Intrinsics.m6216a(str7, "charging")) {
/* 922 */                               linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                    }
                                }
/* 926 */                       linkedHashMap.putAll(linkedHashMap3);
/* 929 */                       str5 = "device.battery";
                            } else {
/* 933 */                       str5 = c1443f.f10932i;
/* 935 */                       str = c1443f.f10929d;
/* 937 */                       enumC1553m5 = c1443f.f10934w;
/* 939 */                       Map mapM5207b8 = c1443f.m5207b();
/* 943 */                       mapM5207b8.getClass();
/* 946 */                       linkedHashMap.putAll(mapM5207b8);
                            }
/* 949 */                   if (str5 != null) {
/* 960 */                       C1646a c1646a2 = new C1646a();
/* 971 */                       c1646a2.f11589b = c1443f.m5208c().getTime();
/* 983 */                       c1646a2.f11582d = c1443f.m5208c().getTime() / 1000.0d;
/* 987 */                       c1646a2.f11583e = "default";
/* 989 */                       c1646a2.f11584f = str5;
/* 991 */                       c1646a2.f11585i = str;
/* 993 */                       c1646a2.f11586v = enumC1553m5;
/* 1000 */                      c1646a2.f11587w = new ConcurrentHashMap(linkedHashMap);
/* 1002 */                      return c1646a2;
                            }
                        }
/* 486 */               str = null;
/* 487 */               enumC1553m5 = null;
/* 949 */               if (str5 != null) {
/* 960 */                   C1646a c1646a3 = new C1646a();
/* 971 */                   c1646a3.f11589b = c1443f.m5208c().getTime();
/* 983 */                   c1646a3.f11582d = c1443f.m5208c().getTime() / 1000.0d;
/* 987 */                   c1646a3.f11583e = "default";
/* 989 */                   c1646a3.f11584f = str5;
/* 991 */                   c1646a3.f11585i = str;
/* 993 */                   c1646a3.f11586v = enumC1553m5;
/* 1000 */                  c1646a3.f11587w = new ConcurrentHashMap(linkedHashMap);
/* 1002 */                  return c1646a3;
                        }
                    }
/* 21 */            return null;
                }
            }
