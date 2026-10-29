            package p000;

            import androidx.window.extensions.layout.WindowLayoutComponent;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Locale;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: yh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class C2498yh extends b51 implements Function0 {

                /* JADX INFO: renamed from: U */
                public static final C2498yh f19608U;

                /* JADX INFO: renamed from: V */
                public static final C2498yh f19609V;

                /* JADX INFO: renamed from: W */
                public static final C2498yh f19610W;

                /* JADX INFO: renamed from: X */
                public static final C2498yh f19611X;

                /* JADX INFO: renamed from: Y */
                public static final C2498yh f19612Y;

                /* JADX INFO: renamed from: Z */
                public static final C2498yh f19613Z;

                /* JADX INFO: renamed from: a0 */
                public static final C2498yh f19614a0;

                /* JADX INFO: renamed from: b */
                public static final C2498yh f19615b;

                /* JADX INFO: renamed from: b0 */
                public static final C2498yh f19616b0;

                /* JADX INFO: renamed from: c */
                public static final C2498yh f19617c;

                /* JADX INFO: renamed from: c0 */
                public static final C2498yh f19618c0;

                /* JADX INFO: renamed from: d */
                public static final C2498yh f19619d;

                /* JADX INFO: renamed from: d0 */
                public static final C2498yh f19620d0;

                /* JADX INFO: renamed from: e */
                public static final C2498yh f19621e;

                /* JADX INFO: renamed from: e0 */
                public static final C2498yh f19622e0;

                /* JADX INFO: renamed from: f */
                public static final C2498yh f19623f;

                /* JADX INFO: renamed from: f0 */
                public static final C2498yh f19624f0;

                /* JADX INFO: renamed from: g0 */
                public static final C2498yh f19625g0;

                /* JADX INFO: renamed from: h0 */
                public static final C2498yh f19626h0;

                /* JADX INFO: renamed from: i */
                public static final C2498yh f19627i;

                /* JADX INFO: renamed from: i0 */
                public static final C2498yh f19628i0;

                /* JADX INFO: renamed from: j0 */
                public static final C2498yh f19629j0;

                /* JADX INFO: renamed from: k0 */
                public static final C2498yh f19630k0;

                /* JADX INFO: renamed from: v */
                public static final C2498yh f19631v;

                /* JADX INFO: renamed from: w */
                public static final C2498yh f19632w;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19633a;

                static {
/* 3 */             int i = 0;
/* 8 */             f19615b = new C2498yh(i, 0);
/* 16 */            f19617c = new C2498yh(i, 1);
/* 24 */            f19619d = new C2498yh(i, 2);
/* 32 */            f19621e = new C2498yh(i, 3);
/* 40 */            f19623f = new C2498yh(i, 4);
/* 48 */            f19627i = new C2498yh(i, 5);
/* 56 */            f19631v = new C2498yh(i, 6);
/* 64 */            f19632w = new C2498yh(i, 7);
/* 73 */            f19608U = new C2498yh(i, 8);
/* 82 */            f19609V = new C2498yh(i, 9);
/* 91 */            f19610W = new C2498yh(i, 10);
/* 100 */           f19611X = new C2498yh(i, 11);
/* 109 */           f19612Y = new C2498yh(i, 12);
/* 118 */           f19613Z = new C2498yh(i, 13);
/* 127 */           f19614a0 = new C2498yh(i, 14);
/* 136 */           f19616b0 = new C2498yh(i, 15);
/* 145 */           f19618c0 = new C2498yh(i, 16);
/* 154 */           f19620d0 = new C2498yh(i, 17);
/* 163 */           f19622e0 = new C2498yh(i, 18);
/* 172 */           f19624f0 = new C2498yh(i, 19);
/* 181 */           f19625g0 = new C2498yh(i, 20);
/* 190 */           f19626h0 = new C2498yh(i, 21);
/* 199 */           f19628i0 = new C2498yh(i, 22);
/* 208 */           f19629j0 = new C2498yh(i, 23);
/* 217 */           f19630k0 = new C2498yh(i, 24);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2498yh(Object obj, int i) {
/* 4 */             super(0);
/* 1 */             this.f19633a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    WindowLayoutComponent windowLayoutComponentM6349a;
                    Object lg0Var;
/* 3 */             int i = 0;
                    switch (this.f19633a) {
                        case 0:
/* 296 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 299 */                   int i2 = 0;
/* 302 */                   while (i < 64) {
/* 320 */                       linkedHashMap.put(String.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i)), Integer.valueOf(i2));
/* 323 */                       i++;
/* 310 */                       i2++;
                            }
/* 327 */                   return linkedHashMap;
                        case 1:
/* 290 */                   return new SimpleDateFormat("dd.MM.yyyy, HH:mm", Locale.getDefault());
                        case 2:
/* 273 */                   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
/* 278 */                   simpleDateFormat.setTimeZone(h50.f8896c);
/* 281 */                   return simpleDateFormat;
                        case 3:
/* 262 */                   return d21.f6964b;
                        case 4:
/* 259 */                   return x11.f18901b;
                        case 5:
/* 256 */                   return t11.f16895b;
                        case 6:
/* 253 */                   return z11.f19905b;
                        case 7:
/* 250 */                   return d11.f6956b;
                        case 8:
/* 247 */                   return x11.f18900a;
                        case 9:
/* 243 */                   return new C1032im();
                        case 10:
/* 237 */                   return new il1();
                        case 11:
/* 232 */                   return z80.f19975a;
                        case 12:
/* 228 */                   return new vq0();
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 222 */                   return new a21();
                        case 14:
/* 215 */                   m60 m60Var = z80.f19975a;
/* 217 */                   return gb1.f8531a;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 211 */                   return new fn1();
                        case 16:
/* 205 */                   return new Date();
                        case 17:
/* 199 */                   return new hv2();
                        case 18:
/* 193 */                   return new hv2();
                        case 19:
/* 186 */                   return qu1.m8016a();
                        case 20:
/* 181 */                   return qu1.m8016a();
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 171 */                   oz2 oz2Var = qu1.f15756b;
                            return oz2Var == null ? new mn1() : oz2Var;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 168 */                   return qu1.f15755a;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 165 */                   return (fv2) qu1.f15759e.getValue();
                        case 24:
                            try {
/* 93 */                        ClassLoader classLoader = w73.class.getClassLoader();
/* 110 */                       l62 l62Var = classLoader != null ? new l62(classLoader, new d52(classLoader)) : null;
/* 111 */                       if (l62Var == null || (windowLayoutComponentM6349a = l62Var.m6349a()) == null) {
/* 4 */                             return null;
                                }
/* 121 */                       classLoader.getClass();
/* 124 */                       d52 d52Var = new d52(classLoader);
/* 127 */                       int iM6975a = ng0.m6975a();
/* 132 */                       if (iM6975a >= 2) {
/* 136 */                           lg0Var = new mg0(windowLayoutComponentM6349a);
                                } else {
/* 152 */                           lg0Var = iM6975a == 1 ? new lg0(windowLayoutComponentM6349a, d52Var) : new jg0();
                                }
/* 139 */                       return lg0Var;
                            } catch (Throwable unused) {
/* 156 */                       v73 v73Var = v73.f17906a;
/* 4 */                         return null;
                            }
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 87 */                    return new zb0(i);
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 82 */                    return o61.f14645c;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 49 */                    ArrayList arrayList = (ArrayList) uz2.f17818b.f16749a;
/* 55 */                    if (!arrayList.isEmpty()) {
/* 58 */                        Iterator it = arrayList.iterator();
/* 66 */                        while (it.hasNext()) {
/* 72 */                            if (it.next() != null) {
/* 75 */                                C1697u2.m5431g();
/* 4 */                                 return null;
                                    }
                                }
                            }
/* 79 */                    return Unit.f12910a;
                        default:
/* 12 */                    ArrayList arrayList2 = (ArrayList) uz2.f17817a.f16749a;
/* 18 */                    if (!arrayList2.isEmpty()) {
/* 21 */                        Iterator it2 = arrayList2.iterator();
/* 29 */                        while (it2.hasNext()) {
/* 35 */                            if (it2.next() != null) {
/* 38 */                                C1697u2.m5431g();
/* 4 */                                 return null;
                                    }
                                }
                            }
/* 42 */                    return Unit.f12910a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 7 */         public /* synthetic */ C2498yh(int i, int i2) {
                    super(i);
/* 8 */             this.f19633a = i2;
                }
            }
