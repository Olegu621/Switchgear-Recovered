            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.collections.C1839a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q50 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15399a;

                public /* synthetic */ q50(int i) {
/* 1 */             this.f15399a = i;
                }

                /* JADX INFO: renamed from: a */
                public final List m7715a(yq2 yq2Var, ng2 ng2Var) {
                    b92 b92Var;
/* 1 */             int i = this.f15399a;
/* 4 */             yq2Var.getClass();
                    switch (i) {
                        case 0:
/* 3 */                     return null;
                        case 1:
/* 299 */                   if (ng2Var == null) {
/* 307 */                       return C1839a.m6210b(new c71(true));
                            }
/* 319 */                   j71 j71Var = ng2Var instanceof j71 ? (j71) ng2Var : null;
/* 320 */                   if (j71Var == null) {
/* 3 */                         return null;
                            }
/* 326 */                   c71 c71Var = new c71(j71Var.f12130a);
/* 329 */                   Integer num = j71Var.f12131b;
/* 331 */                   HashMap map = c71Var.f2754b;
/* 333 */                   if (num != null) {
/* 345 */                       map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(num.intValue()));
                            }
/* 348 */                   c71Var.m1299a(map);
/* 351 */                   return C1839a.m6210b(c71Var);
                        case 2:
/* 207 */                   if (ng2Var == null) {
/* 211 */                       return new ArrayList();
                            }
/* 222 */                   t72 t72Var = ng2Var instanceof t72 ? (t72) ng2Var : null;
/* 223 */                   if (t72Var != null) {
/* 227 */                       zq2 zq2Var = new zq2();
/* 234 */                       zq2Var.m10420a("id", t72Var.f16950c);
/* 241 */                       zq2Var.m10420a("name", t72Var.f16948a);
/* 248 */                       zq2Var.m10420a("type", t72Var.f16949b);
/* 253 */                       zq2Var.m10420a("fragment", null);
/* 256 */                       String str = t72Var.f16951d;
/* 258 */                       String str2 = t72Var.f16952e;
/* 260 */                       if (str == null || str.length() <= 0) {
/* 279 */                           str = (str2 == null || str2.length() <= 0) ? null : str2;
                                }
/* 282 */                       zq2Var.m10420a("activity", str);
/* 287 */                       b92Var = new b92(zq2Var);
                            } else {
/* 291 */                       b92Var = null;
                            }
/* 292 */                   if (b92Var != null) {
/* 294 */                       return C1839a.m6210b(b92Var);
                            }
/* 3 */                     return null;
                        default:
/* 10 */                    u72 u72Var = (u72) ng2Var;
/* 12 */                    if (u72Var == null) {
/* 3 */                         return null;
                            }
/* 57 */                    LinkedHashMap linkedHashMapM7132f = oc1.m7132f(new Pair("foreground_sec", Double.valueOf(u72Var.f17399b / 1000.0d)), new Pair("background_sec", Double.valueOf(u72Var.f17400c / 1000.0d)));
/* 61 */                    Integer num2 = u72Var.f17401d;
/* 63 */                    if (num2 != null) {
/* 75 */                        linkedHashMapM7132f.put("last_item_index", Integer.valueOf(num2.intValue()));
                            }
/* 78 */                    Integer num3 = u72Var.f17402e;
/* 80 */                    if (num3 != null) {
/* 92 */                        linkedHashMapM7132f.put("items_count", Integer.valueOf(num3.intValue()));
                            }
/* 95 */                    Integer num4 = u72Var.f17403f;
/* 97 */                    if (num4 != null) {
/* 109 */                       linkedHashMapM7132f.put("min_y_offset", Integer.valueOf(num4.intValue()));
                            }
/* 112 */                   Integer num5 = u72Var.f17404g;
/* 114 */                   if (num5 != null) {
/* 126 */                       linkedHashMapM7132f.put("min_x_offset", Integer.valueOf(num5.intValue()));
                            }
/* 129 */                   Integer num6 = u72Var.f17405h;
/* 131 */                   if (num6 != null) {
/* 143 */                       linkedHashMapM7132f.put("max_y_offset", Integer.valueOf(num6.intValue()));
                            }
/* 146 */                   Integer num7 = u72Var.f17406i;
/* 148 */                   if (num7 != null) {
/* 160 */                       linkedHashMapM7132f.put("max_x_offset", Integer.valueOf(num7.intValue()));
                            }
/* 163 */                   Integer num8 = u72Var.f17407j;
/* 165 */                   if (num8 != null) {
/* 177 */                       linkedHashMapM7132f.put("content_height", Integer.valueOf(num8.intValue()));
                            }
/* 180 */                   Integer num9 = u72Var.f17408k;
/* 182 */                   if (num9 != null) {
/* 194 */                       linkedHashMapM7132f.put("content_width", Integer.valueOf(num9.intValue()));
                            }
/* 202 */                   return C1839a.m6210b(new b92("iglu:com.snowplowanalytics.mobile/screen_summary/jsonschema/1-0-0", linkedHashMapM7132f));
                    }
                }

                /* JADX INFO: renamed from: b */
                public final String m7716b() {
                    switch (this.f15399a) {
                        case 0:
/* 15 */                    return "DeepLinkContext";
                        case 1:
/* 12 */                    return "Lifecycle";
                        case 2:
/* 9 */                     return "ScreenContext";
                        default:
/* 6 */                     return "ScreenSummaryContext";
                    }
                }

                /* JADX INFO: renamed from: c */
                public final nd0 m7717c() {
                    switch (this.f15399a) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                    }
/* 6 */             return nd0.f14189a;
                }

                /* JADX INFO: renamed from: d */
                public final List m7718d() {
                    switch (this.f15399a) {
                        case 0:
/* 37 */                    return C1839a.m6210b("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
                        case 1:
/* 30 */                    return C1839a.m6210b("*");
                        case 2:
/* 23 */                    return C1839a.m6210b("*");
                        default:
/* 16 */                    return C2085pw.m7566e("iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0");
                    }
                }

                /* JADX INFO: renamed from: e */
                public final List m7719e() {
                    switch (this.f15399a) {
                        case 0:
/* 19 */                    return nd0.f14189a;
                        case 1:
/* 16 */                    return nd0.f14189a;
                        case 2:
/* 13 */                    return nd0.f14189a;
                        default:
/* 8 */                     return C1839a.m6210b("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
                    }
                }

                /* JADX INFO: renamed from: f */
                public final List m7720f() {
                    switch (this.f15399a) {
                        case 0:
/* 27 */                    return nd0.f14189a;
                        case 1:
/* 24 */                    return nd0.f14189a;
                        case 2:
/* 21 */                    return nd0.f14189a;
                        default:
/* 16 */                    return C2085pw.m7566e("iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
                    }
                }

                /* JADX INFO: renamed from: g */
                public final List m7721g() {
                    switch (this.f15399a) {
                        case 0:
/* 21 */                    return new ArrayList();
                        case 1:
/* 16 */                    return nd0.f14189a;
                        case 2:
/* 11 */                    return C1839a.m6210b("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
                        default:
/* 6 */                     return nd0.f14189a;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final List m7722h() {
                    switch (this.f15399a) {
                        case 0:
/* 55 */                    return C2085pw.m7566e("iglu:com.snowplowanalytics.mobile/deep_link_received/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
                        case 1:
/* 42 */                    return C2085pw.m7566e("iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0");
                        case 2:
/* 29 */                    return C1839a.m6210b("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
                        default:
/* 22 */                    return C2085pw.m7566e("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
                    }
                }

                /* JADX INFO: renamed from: i */
                public final Map m7723i(yq2 yq2Var, ng2 ng2Var) {
/* 1 */             int i = this.f15399a;
/* 4 */             yq2Var.getClass();
                    switch (i) {
                        case 0:
                        case 1:
/* 3 */                     return null;
                        case 2:
/* 13 */                    if (!(ng2Var instanceof t72)) {
/* 3 */                         return null;
                            }
/* 17 */                    HashMap map = new HashMap();
/* 22 */                    t72 t72Var = ((t72) ng2Var).f16953f;
/* 29 */                    String str = t72Var != null ? t72Var.f16948a : null;
/* 30 */                    if (str != null && str.length() > 0) {
/* 40 */                        map.put("previousName", str);
                            }
/* 48 */                    String str2 = t72Var != null ? t72Var.f16950c : null;
/* 49 */                    if (str2 != null && str2.length() > 0) {
/* 59 */                        map.put("previousId", str2);
                            }
/* 64 */                    String str3 = t72Var != null ? t72Var.f16949b : null;
/* 66 */                    if (str3 != null && str3.length() > 0) {
/* 76 */                        map.put("previousType", str3);
                            }
/* 79 */                    return map;
                        default:
/* 3 */                     return null;
                    }
                }

                /* JADX INFO: renamed from: j */
                public final ng2 m7724j(AbstractC1812k abstractC1812k, ng2 ng2Var) {
/* 1 */             int i = this.f15399a;
/* 5 */             abstractC1812k.getClass();
                    switch (i) {
                        case 0:
/* 4 */                     return null;
                        case 1:
/* 371 */                   if (abstractC1812k instanceof xl0) {
/* 380 */                       return new j71(true, ((xl0) abstractC1812k).f19244b);
                            }
/* 386 */                   if (abstractC1812k instanceof C0991hh) {
/* 394 */                       return new j71(false, ((C0991hh) abstractC1812k).f9076b);
                            }
/* 4 */                     return null;
                        case 2:
/* 341 */                   v72 v72Var = abstractC1812k instanceof v72 ? (v72) abstractC1812k : null;
/* 342 */                   if (v72Var != null) {
/* 364 */                       return new t72(v72Var.f17897b, v72Var.f17899d, v72Var.f17898c, v72Var.f17904i, v72Var.f17905j, ng2Var instanceof t72 ? (t72) ng2Var : null);
                            }
/* 4 */                     return null;
                        default:
/* 13 */                    if (abstractC1812k instanceof v72) {
/* 17 */                        u72 u72Var = new u72();
/* 24 */                        u72Var.f17398a = System.currentTimeMillis();
/* 333 */                       return u72Var;
                            }
/* 29 */                    u72 u72Var2 = (u72) ng2Var;
/* 31 */                    if (u72Var2 == null) {
/* 4 */                         return null;
                            }
/* 38 */                    if (abstractC1812k instanceof xl0) {
/* 40 */                        long jCurrentTimeMillis = System.currentTimeMillis();
/* 51 */                        u72Var2.f17400c = (jCurrentTimeMillis - u72Var2.f17398a) + u72Var2.f17400c;
/* 53 */                        u72Var2.f17398a = jCurrentTimeMillis;
/* 333 */                       return ng2Var;
                            }
/* 59 */                    if (abstractC1812k instanceof C0991hh) {
/* 61 */                        long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 72 */                        u72Var2.f17399b = (jCurrentTimeMillis2 - u72Var2.f17398a) + u72Var2.f17399b;
/* 74 */                        u72Var2.f17398a = jCurrentTimeMillis2;
/* 333 */                       return ng2Var;
                            }
/* 80 */                    if (abstractC1812k instanceof r72) {
/* 82 */                        long jCurrentTimeMillis3 = System.currentTimeMillis();
/* 93 */                        u72Var2.f17399b = (jCurrentTimeMillis3 - u72Var2.f17398a) + u72Var2.f17399b;
/* 95 */                        u72Var2.f17398a = jCurrentTimeMillis3;
/* 333 */                       return ng2Var;
                            }
/* 101 */                   if (abstractC1812k instanceof g81) {
/* 103 */                       g81 g81Var = (g81) abstractC1812k;
/* 105 */                       int i2 = g81Var.f8514b;
/* 107 */                       Integer num = u72Var2.f17401d;
/* 125 */                       u72Var2.f17401d = Integer.valueOf(Integer.max(i2, num != null ? num.intValue() : 0));
/* 127 */                       Integer num2 = g81Var.f8515c;
/* 129 */                       if (num2 == null) {
/* 333 */                           return ng2Var;
                                }
/* 131 */                       int iIntValue = num2.intValue();
/* 135 */                       Integer num3 = u72Var2.f17402e;
/* 151 */                       u72Var2.f17402e = Integer.valueOf(Integer.max(iIntValue, num3 != null ? num3.intValue() : 0));
/* 333 */                       return ng2Var;
                            }
/* 157 */                   if (!(abstractC1812k instanceof a82)) {
/* 333 */                       return ng2Var;
                            }
/* 159 */                   a82 a82Var = (a82) abstractC1812k;
/* 161 */                   Integer num4 = a82Var.f114b;
/* 163 */                   if (num4 != null) {
/* 165 */                       int iIntValue2 = num4.intValue();
/* 169 */                       Integer num5 = a82Var.f117e;
/* 179 */                       int iIntValue3 = num5 != null ? num5.intValue() + iIntValue2 : iIntValue2;
/* 180 */                       Integer num6 = u72Var2.f17403f;
/* 198 */                       u72Var2.f17403f = Integer.valueOf(Integer.min(iIntValue2, num6 != null ? num6.intValue() : iIntValue2));
/* 200 */                       Integer num7 = u72Var2.f17405h;
/* 218 */                       u72Var2.f17405h = Integer.valueOf(Integer.max(iIntValue3, num7 != null ? num7.intValue() : iIntValue3));
                            }
/* 220 */                   Integer num8 = a82Var.f115c;
/* 222 */                   if (num8 != null) {
/* 224 */                       int iIntValue4 = num8.intValue();
/* 228 */                       Integer num9 = a82Var.f116d;
/* 238 */                       int iIntValue5 = num9 != null ? num9.intValue() + iIntValue4 : iIntValue4;
/* 239 */                       Integer num10 = u72Var2.f17404g;
/* 257 */                       u72Var2.f17404g = Integer.valueOf(Integer.min(iIntValue4, num10 != null ? num10.intValue() : iIntValue4));
/* 259 */                       Integer num11 = u72Var2.f17406i;
/* 277 */                       u72Var2.f17406i = Integer.valueOf(Integer.max(iIntValue5, num11 != null ? num11.intValue() : iIntValue5));
                            }
/* 279 */                   Integer num12 = a82Var.f118f;
/* 281 */                   if (num12 != null) {
/* 283 */                       int iIntValue6 = num12.intValue();
/* 287 */                       Integer num13 = u72Var2.f17408k;
/* 305 */                       u72Var2.f17408k = Integer.valueOf(Integer.max(iIntValue6, num13 != null ? num13.intValue() : 0));
                            }
/* 307 */                   Integer num14 = a82Var.f119g;
/* 309 */                   if (num14 == null) {
/* 333 */                       return ng2Var;
                            }
/* 311 */                   int iIntValue7 = num14.intValue();
/* 315 */                   Integer num15 = u72Var2.f17407j;
/* 331 */                   u72Var2.f17407j = Integer.valueOf(Integer.max(iIntValue7, num15 != null ? num15.intValue() : 0));
/* 333 */                   return ng2Var;
                    }
                }
            }
