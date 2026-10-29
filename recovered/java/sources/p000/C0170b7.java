            package p000;

            import android.content.Context;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFFeature;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.File;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.json.AbstractC1858b;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: b7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0170b7 extends b51 implements Function1 {

                /* JADX INFO: renamed from: U */
                public static final C0170b7 f2249U;

                /* JADX INFO: renamed from: V */
                public static final C0170b7 f2250V;

                /* JADX INFO: renamed from: W */
                public static final C0170b7 f2251W;

                /* JADX INFO: renamed from: X */
                public static final C0170b7 f2252X;

                /* JADX INFO: renamed from: Y */
                public static final C0170b7 f2253Y;

                /* JADX INFO: renamed from: Z */
                public static final C0170b7 f2254Z;

                /* JADX INFO: renamed from: a0 */
                public static final C0170b7 f2255a0;

                /* JADX INFO: renamed from: b */
                public static final C0170b7 f2256b;

                /* JADX INFO: renamed from: b0 */
                public static final C0170b7 f2257b0;

                /* JADX INFO: renamed from: c */
                public static final C0170b7 f2258c;

                /* JADX INFO: renamed from: c0 */
                public static final C0170b7 f2259c0;

                /* JADX INFO: renamed from: d */
                public static final C0170b7 f2260d;

                /* JADX INFO: renamed from: d0 */
                public static final C0170b7 f2261d0;

                /* JADX INFO: renamed from: e */
                public static final C0170b7 f2262e;

                /* JADX INFO: renamed from: e0 */
                public static final C0170b7 f2263e0;

                /* JADX INFO: renamed from: f */
                public static final C0170b7 f2264f;

                /* JADX INFO: renamed from: f0 */
                public static final C0170b7 f2265f0;

                /* JADX INFO: renamed from: g0 */
                public static final C0170b7 f2266g0;

                /* JADX INFO: renamed from: h0 */
                public static final C0170b7 f2267h0;

                /* JADX INFO: renamed from: i */
                public static final C0170b7 f2268i;

                /* JADX INFO: renamed from: i0 */
                public static final C0170b7 f2269i0;

                /* JADX INFO: renamed from: j0 */
                public static final C0170b7 f2270j0;

                /* JADX INFO: renamed from: k0 */
                public static final C0170b7 f2271k0;

                /* JADX INFO: renamed from: l0 */
                public static final C0170b7 f2272l0;

                /* JADX INFO: renamed from: m0 */
                public static final C0170b7 f2273m0;

                /* JADX INFO: renamed from: n0 */
                public static final C0170b7 f2274n0;

                /* JADX INFO: renamed from: o0 */
                public static final C0170b7 f2275o0;

                /* JADX INFO: renamed from: p0 */
                public static final C0170b7 f2276p0;

                /* JADX INFO: renamed from: v */
                public static final C0170b7 f2277v;

                /* JADX INFO: renamed from: w */
                public static final C0170b7 f2278w;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2279a;

                static {
/* 3 */             int i = 1;
/* 8 */             f2256b = new C0170b7(i, 0);
/* 16 */            f2258c = new C0170b7(i, 1);
/* 24 */            f2260d = new C0170b7(i, 2);
/* 32 */            f2262e = new C0170b7(i, 3);
/* 40 */            f2264f = new C0170b7(i, 4);
/* 48 */            f2268i = new C0170b7(i, 5);
/* 56 */            f2277v = new C0170b7(i, 6);
/* 64 */            f2278w = new C0170b7(i, 7);
/* 73 */            f2249U = new C0170b7(i, 8);
/* 82 */            f2250V = new C0170b7(i, 9);
/* 91 */            f2251W = new C0170b7(i, 10);
/* 100 */           f2252X = new C0170b7(i, 11);
/* 109 */           f2253Y = new C0170b7(i, 12);
/* 118 */           f2254Z = new C0170b7(i, 13);
/* 127 */           f2255a0 = new C0170b7(i, 14);
/* 136 */           f2257b0 = new C0170b7(i, 15);
/* 145 */           f2259c0 = new C0170b7(i, 16);
/* 154 */           f2261d0 = new C0170b7(i, 17);
/* 163 */           f2263e0 = new C0170b7(i, 18);
/* 172 */           f2265f0 = new C0170b7(i, 19);
/* 181 */           f2266g0 = new C0170b7(i, 20);
/* 190 */           f2267h0 = new C0170b7(i, 21);
/* 199 */           f2269i0 = new C0170b7(i, 22);
/* 208 */           f2270j0 = new C0170b7(i, 23);
/* 217 */           f2271k0 = new C0170b7(i, 24);
/* 226 */           f2272l0 = new C0170b7(i, 25);
/* 235 */           f2273m0 = new C0170b7(i, 26);
/* 244 */           f2274n0 = new C0170b7(i, 27);
/* 253 */           f2275o0 = new C0170b7(i, 28);
/* 262 */           f2276p0 = new C0170b7(i, 29);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0170b7(int i, int i2) {
/* 3 */             super(i);
/* 1 */             this.f2279a = i2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
                    String strValueOf;
                    switch (this.f2279a) {
                        case 0:
/* 482 */                   C2295vi c2295vi = (C2295vi) obj;
/* 484 */                   c2295vi.getClass();
/* 493 */                   return AbstractC0886en.m3508l(c2295vi.f18188a, "@", c2295vi.f18189b);
                        case 1:
/* 476 */                   String str = (String) obj;
/* 478 */                   str.getClass();
/* 481 */                   return str;
                        case 2:
/* 454 */                   File file = (File) obj;
/* 456 */                   file.getClass();
/* 463 */                   String absolutePath = file.getCanonicalFile().getAbsolutePath();
/* 467 */                   absolutePath.getClass();
/* 472 */                   return new qe2(absolutePath);
                        case 3:
/* 386 */                   C0894ev c0894ev = (C0894ev) obj;
/* 388 */                   c0894ev.getClass();
/* 400 */                   C0894ev.m3601a(c0894ev, "JsonPrimitive", new o11(C2498yh.f19621e));
/* 412 */                   C0894ev.m3601a(c0894ev, "JsonNull", new o11(C2498yh.f19623f));
/* 424 */                   C0894ev.m3601a(c0894ev, "JsonLiteral", new o11(C2498yh.f19627i));
/* 436 */                   C0894ev.m3601a(c0894ev, "JsonObject", new o11(C2498yh.f19631v));
/* 448 */                   C0894ev.m3601a(c0894ev, "JsonArray", new o11(C2498yh.f19632w));
/* 451 */                   return Unit.f12910a;
                        case 4:
/* 348 */                   Map.Entry entry = (Map.Entry) obj;
/* 350 */                   entry.getClass();
/* 357 */                   String str2 = (String) entry.getKey();
/* 363 */                   AbstractC1858b abstractC1858b = (AbstractC1858b) entry.getValue();
/* 367 */                   StringBuilder sb = new StringBuilder();
/* 370 */                   sh2.m8507a(sb, str2);
/* 375 */                   sb.append(':');
/* 378 */                   sb.append(abstractC1858b);
/* 381 */                   return sb.toString();
                        case 5:
/* 340 */                   m61 m61Var = (m61) obj;
/* 342 */                   m61Var.getClass();
/* 345 */                   return m61Var.f13582h;
                        case 6:
/* 250 */                   Map.Entry entry2 = (Map.Entry) obj;
/* 252 */                   entry2.getClass();
/* 255 */                   Object value = entry2.getValue();
/* 261 */                   if (value instanceof byte[]) {
/* 267 */                       StringBuilder sb2 = new StringBuilder();
/* 272 */                       sb2.append((CharSequence) "[");
/* 276 */                       int i = 0;
/* 277 */                       for (byte b : (byte[]) value) {
/* 282 */                           i++;
/* 283 */                           if (i > 1) {
/* 287 */                               sb2.append((CharSequence) ", ");
                                    }
/* 294 */                           sb2.append((CharSequence) String.valueOf((int) b));
                                }
/* 302 */                       sb2.append((CharSequence) "]");
/* 305 */                       strValueOf = sb2.toString();
                            } else {
/* 314 */                       strValueOf = String.valueOf(entry2.getValue());
                            }
/* 335 */                   return fm0.m3790p(new StringBuilder("  "), ((iw1) entry2.getKey()).f11950a, " = ", strValueOf);
                        case 7:
/* 238 */                   String str3 = (String) obj;
/* 240 */                   str3.getClass();
/* 245 */                   return "• ".concat(str3);
                        case 8:
/* 232 */                   ((Boolean) obj).booleanValue();
/* 235 */                   return Unit.f12910a;
                        case 9:
/* 224 */                   ((Boolean) obj).booleanValue();
/* 227 */                   return Unit.f12910a;
                        case 10:
/* 216 */                   ((Boolean) obj).booleanValue();
/* 219 */                   return Unit.f12910a;
                        case 11:
/* 208 */                   ((Context) obj).getClass();
/* 211 */                   return nd0.f14189a;
                        case 12:
/* 184 */                   o21 o21Var = (o21) obj;
/* 186 */                   o21Var.getClass();
/* 191 */                   KSerializer kSerializerM4431h = i13.m4431h(o21Var, new KSerializer[0]);
                            return kSerializerM4431h == null ? (KSerializer) ox1.f14912a.get(o21Var) : kSerializerM4431h;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 154 */                   o21 o21Var2 = (o21) obj;
/* 156 */                   o21Var2.getClass();
/* 161 */                   KSerializer kSerializerM4431h2 = i13.m4431h(o21Var2, new KSerializer[0]);
/* 165 */                   if (kSerializerM4431h2 == null) {
/* 173 */                       kSerializerM4431h2 = (KSerializer) ox1.f14912a.get(o21Var2);
                            }
/* 175 */                   if (kSerializerM4431h2 != null) {
/* 177 */                       return j13.m5647i(kSerializerM4431h2);
                            }
/* 182 */                   return null;
                        case 14:
/* 146 */                   m61 m61Var2 = (m61) obj;
/* 148 */                   m61Var2.getClass();
/* 151 */                   return m61Var2.f13582h;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                   TCFPurpose tCFPurpose = (TCFPurpose) obj;
/* 136 */                   tCFPurpose.getClass();
/* 141 */                   return Integer.valueOf(tCFPurpose.f6176c);
                        case 16:
/* 122 */                   TCFPurpose tCFPurpose2 = (TCFPurpose) obj;
/* 124 */                   tCFPurpose2.getClass();
/* 129 */                   return Boolean.valueOf(tCFPurpose2.f6181h);
                        case 17:
/* 110 */                   TCFPurpose tCFPurpose3 = (TCFPurpose) obj;
/* 112 */                   tCFPurpose3.getClass();
/* 117 */                   return Boolean.valueOf(tCFPurpose3.f6182i);
                        case 18:
/* 102 */                   TCFPurpose tCFPurpose4 = (TCFPurpose) obj;
/* 104 */                   tCFPurpose4.getClass();
/* 107 */                   return tCFPurpose4.f6178e;
                        case 19:
/* 94 */                    TCFPurpose tCFPurpose5 = (TCFPurpose) obj;
/* 96 */                    tCFPurpose5.getClass();
/* 99 */                    return tCFPurpose5.f6180g;
                        case 20:
/* 82 */                    TCFVendor tCFVendor = (TCFVendor) obj;
/* 84 */                    tCFVendor.getClass();
/* 89 */                    return Integer.valueOf(tCFVendor.f6209d);
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 70 */                    TCFVendor tCFVendor2 = (TCFVendor) obj;
/* 72 */                    tCFVendor2.getClass();
/* 77 */                    return Boolean.valueOf(tCFVendor2.f6218m);
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 58 */                    TCFVendor tCFVendor3 = (TCFVendor) obj;
/* 60 */                    tCFVendor3.getClass();
/* 65 */                    return Boolean.valueOf(tCFVendor3.f6219n);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 50 */                    TCFVendor tCFVendor4 = (TCFVendor) obj;
/* 52 */                    tCFVendor4.getClass();
/* 55 */                    return tCFVendor4.f6206a;
                        case 24:
/* 42 */                    TCFVendor tCFVendor5 = (TCFVendor) obj;
/* 44 */                    tCFVendor5.getClass();
/* 47 */                    return tCFVendor5.f6210e;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 39 */                    return Boolean.FALSE;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 31 */                    TCFPurpose tCFPurpose6 = (TCFPurpose) obj;
/* 33 */                    tCFPurpose6.getClass();
/* 36 */                    return tCFPurpose6.f6177d;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 23 */                    TCFFeature tCFFeature = (TCFFeature) obj;
/* 25 */                    tCFFeature.getClass();
/* 28 */                    return tCFFeature.f6172d;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 15 */                    TCFSpecialFeature tCFSpecialFeature = (TCFSpecialFeature) obj;
/* 17 */                    tCFSpecialFeature.getClass();
/* 20 */                    return tCFSpecialFeature.f6189d;
                        default:
/* 7 */                     TCFSpecialPurpose tCFSpecialPurpose = (TCFSpecialPurpose) obj;
/* 9 */                     tCFSpecialPurpose.getClass();
/* 12 */                    return tCFSpecialPurpose.f6198d;
                    }
                }
            }
