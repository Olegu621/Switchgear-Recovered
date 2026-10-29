            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.os.Handler;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.UUID;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Pair;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.Regex;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uq2 {

                /* JADX INFO: renamed from: A */
                public boolean f17638A;

                /* JADX INFO: renamed from: B */
                public ur3 f17639B;

                /* JADX INFO: renamed from: C */
                public final tq2 f17640C;

                /* JADX INFO: renamed from: D */
                public final tq2 f17641D;

                /* JADX INFO: renamed from: E */
                public final tq2 f17642E;

                /* JADX INFO: renamed from: F */
                public final tq2 f17643F;

                /* JADX INFO: renamed from: G */
                public final tq2 f17644G;

                /* JADX INFO: renamed from: H */
                public int f17645H;

                /* JADX INFO: renamed from: I */
                public int f17646I;

                /* JADX INFO: renamed from: a */
                public final String f17647a;

                /* JADX INFO: renamed from: b */
                public final String f17648b;

                /* JADX INFO: renamed from: c */
                public final boolean f17649c;

                /* JADX INFO: renamed from: d */
                public final Context f17650d;

                /* JADX INFO: renamed from: e */
                public final f31 f17651e;

                /* JADX INFO: renamed from: f */
                public final String f17652f;

                /* JADX INFO: renamed from: g */
                public final AtomicBoolean f17653g;

                /* JADX INFO: renamed from: h */
                public final gs1 f17654h;

                /* JADX INFO: renamed from: i */
                public final jc0 f17655i;

                /* JADX INFO: renamed from: j */
                public d31 f17656j;

                /* JADX INFO: renamed from: k */
                public za2 f17657k;

                /* JADX INFO: renamed from: l */
                public boolean f17658l;

                /* JADX INFO: renamed from: m */
                public long f17659m;

                /* JADX INFO: renamed from: n */
                public long f17660n;

                /* JADX INFO: renamed from: o */
                public final TimeUnit f17661o;

                /* JADX INFO: renamed from: p */
                public boolean f17662p;

                /* JADX INFO: renamed from: q */
                public boolean f17663q;

                /* JADX INFO: renamed from: r */
                public boolean f17664r;

                /* JADX INFO: renamed from: s */
                public boolean f17665s;

                /* JADX INFO: renamed from: t */
                public boolean f17666t;

                /* JADX INFO: renamed from: u */
                public boolean f17667u;

                /* JADX INFO: renamed from: v */
                public String f17668v;

                /* JADX INFO: renamed from: w */
                public final Runnable[] f17669w;

                /* JADX INFO: renamed from: x */
                public boolean f17670x;

                /* JADX INFO: renamed from: y */
                public boolean f17671y;

                /* JADX INFO: renamed from: z */
                public boolean f17672z;

                public uq2(jc0 jc0Var, String str, String str2, List list, ns1 ns1Var, Context context, C1996oc c1996oc) {
                    tq2 tq2Var;
                    int i;
/* 7 */             context.getClass();
/* 15 */            this.f17647a = str;
/* 19 */            this.f17648b = str2;
/* 23 */            f31 f31Var = new f31();
/* 31 */            f31Var.f7983a = new HashMap();
/* 38 */            f31Var.f7984b = new HashMap();
/* 45 */            f31Var.f7985c = new HashMap();
/* 52 */            f31Var.f7986d = new HashMap();
/* 59 */            f31Var.f7987e = new HashMap();
/* 66 */            f31Var.f7988f = new HashMap();
/* 73 */            f31Var.f7989g = new HashMap();
/* 80 */            f31Var.f7990h = new HashMap();
/* 89 */            f31Var.f7991i = new fs0(18);
/* 91 */            this.f17651e = f31Var;
/* 95 */            this.f17652f = "andr-6.0.6";
/* 99 */            int i2 = 1;
/* 103 */           this.f17653g = new AtomicBoolean(true);
/* 123 */           this.f17654h = new gs1(list, ns1Var == null ? new ns1() : ns1Var, context);
/* 125 */           this.f17655i = jc0Var;
/* 127 */           this.f17658l = true;
/* 130 */           this.f17645H = 2;
/* 132 */           this.f17646I = 1;
/* 136 */           this.f17659m = 1800L;
/* 138 */           this.f17660n = 1800L;
/* 140 */           TimeUnit timeUnit = TimeUnit.SECONDS;
/* 142 */           this.f17661o = timeUnit;
/* 144 */           this.f17662p = true;
/* 147 */           this.f17663q = false;
/* 149 */           this.f17664r = true;
/* 151 */           this.f17665s = true;
/* 153 */           this.f17666t = true;
/* 155 */           this.f17667u = false;
/* 158 */           Runnable[] runnableArr = {null, null, null, null};
/* 162 */           this.f17669w = runnableArr;
/* 164 */           this.f17670x = true;
/* 166 */           this.f17671y = false;
/* 168 */           this.f17672z = true;
/* 170 */           this.f17638A = true;
/* 175 */           tq2 tq2Var2 = new tq2(this, 3);
/* 178 */           this.f17640C = tq2Var2;
/* 183 */           tq2 tq2Var3 = new tq2(this, 4);
/* 186 */           this.f17641D = tq2Var3;
/* 190 */           tq2 tq2Var4 = new tq2(this, 2);
/* 193 */           this.f17642E = tq2Var4;
/* 197 */           tq2 tq2Var5 = new tq2(this, i2);
/* 200 */           this.f17643F = tq2Var5;
/* 204 */           tq2 tq2Var6 = new tq2(this, 0);
/* 207 */           this.f17644G = tq2Var6;
/* 209 */           this.f17650d = context;
/* 215 */           c1996oc.invoke(this);
/* 227 */           mf0.m6643a(jc0Var.f12183a, false, new RunnableC2166s2(jc0Var, 19));
/* 230 */           String str3 = this.f17668v;
/* 232 */           if (str3 != null) {
/* 243 */               String strReplace = new Regex("[^A-Za-z0-9.-]").replace(str3, HttpUrl.FRAGMENT_ENCODE_SET);
/* 251 */               if (strReplace.length() > 0) {
/* 271 */                   String str4 = this.f17652f + ' ' + strReplace;
/* 277 */                   if (!this.f17649c) {
/* 279 */                       this.f17652f = str4;
                            }
                        }
                    }
/* 283 */           if (this.f17663q && this.f17646I == 1 && !this.f17649c) {
/* 294 */               this.f17646I = 2;
                    }
/* 296 */           int i3 = this.f17646I;
/* 298 */           int i4 = k50.f12587b;
/* 300 */           if (i3 == 0) {
/* 523 */               throw null;
                    }
/* 306 */           k50.f12587b = AbstractC0886en.m3520y(i3);
/* 310 */           if (this.f17670x) {
/* 323 */               tq2Var = tq2Var6;
/* 329 */               this.f17657k = za2.f20037r.m7341e(context, this.f17659m, this.f17660n, timeUnit, str, runnableArr);
                    } else {
/* 335 */               tq2Var = tq2Var6;
                    }
/* 338 */           xn1.m10005a("SnowplowTrackerDiagnostic", tq2Var5);
/* 343 */           xn1.m10005a("SnowplowScreenView", tq2Var3);
/* 348 */           xn1.m10005a("SnowplowLifecycleTracking", tq2Var2);
/* 353 */           xn1.m10005a("SnowplowInstallTracking", tq2Var4);
/* 358 */           xn1.m10005a("SnowplowCrashReporting", tq2Var);
/* 363 */           if (this.f17662p && !(Thread.getDefaultUncaughtExceptionHandler() instanceof if0)) {
/* 378 */               Thread.setDefaultUncaughtExceptionHandler(new if0());
                    }
/* 383 */           if (this.f17665s) {
/* 393 */               mf0.m6643a("pc", false, new RunnableC0873ea(context, i2));
                    }
/* 398 */           if (this.f17666t) {
                        synchronized (C2483y2.f19451a) {
                            try {
/* 405 */                       if (C2483y2.f19452b == null) {
/* 409 */                           C2483y2 c2483y2 = new C2483y2();
/* 412 */                           Context applicationContext = context.getApplicationContext();
/* 424 */                           Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
/* 426 */                           if (application != null) {
/* 428 */                               application.registerActivityLifecycleCallbacks(c2483y2);
                                    }
/* 431 */                           C2483y2.f19452b = c2483y2;
                                }
/* 438 */                       C2483y2.f19452b.getClass();
                            } catch (Throwable th) {
/* 444 */                       throw th;
                            }
                        }
                    }
/* 447 */           if (this.f17664r) {
                        synchronized (vx1.f18384a) {
/* 454 */                   if (vx1.f18385b == 1) {
/* 457 */                       vx1.f18385b = 2;
/* 474 */                       new Handler(context.getMainLooper()).post(new RunnableC0981h7(3));
                            }
                        }
/* 486 */               m9119a(new q50(i2));
                    }
/* 492 */           za2 za2Var = this.f17657k;
/* 494 */           if (za2Var != null) {
/* 496 */               i = 0;
/* 497 */               za2Var.m10301c(false);
/* 506 */               k50.m5968e("uq2", "Session checking has been resumed.", new Object[0]);
                    } else {
/* 510 */               i = 0;
                    }
/* 511 */           this.f17649c = true;
/* 519 */           k50.m5958L("uq2", "Tracker created successfully.", new Object[i]);
                }

                /* JADX INFO: renamed from: a */
                public final void m9119a(q50 q50Var) {
/* 1 */             f31 f31Var = this.f17651e;
                    synchronized (f31Var) {
                        try {
/* 16 */                    q50 q50Var2 = (q50) ((HashMap) f31Var.f7983a).get(q50Var.m7716b());
/* 18 */                    if (q50Var2 != null) {
/* 32 */                        if (q50Var.getClass().equals(q50Var2.getClass())) {
/* 35 */                            return;
                                } else {
/* 40 */                            f31Var.m3643e(q50Var.m7716b());
                                }
                            }
/* 54 */                    ((HashMap) f31Var.f7983a).put(q50Var.m7716b(), q50Var);
/* 65 */                    ((HashMap) f31Var.f7984b).put(q50Var, q50Var.m7716b());
/* 76 */                    f31.m3639a((HashMap) f31Var.f7985c, q50Var.m7722h(), q50Var);
/* 87 */                    f31.m3639a((HashMap) f31Var.f7986d, q50Var.m7718d(), q50Var);
/* 98 */                    f31.m3639a((HashMap) f31Var.f7987e, q50Var.m7721g(), q50Var);
/* 109 */                   f31.m3639a((HashMap) f31Var.f7988f, q50Var.m7717c(), q50Var);
/* 120 */                   f31.m3639a((HashMap) f31Var.f7989g, q50Var.m7720f(), q50Var);
/* 131 */                   f31.m3639a((HashMap) f31Var.f7990h, q50Var.m7719e(), q50Var);
                        } catch (Throwable th) {
/* 137 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m9120b() {
/* 1 */             za2 za2Var = this.f17657k;
/* 3 */             if (za2Var != null) {
/* 6 */                 za2Var.m10301c(true);
/* 16 */                k50.m5968e("uq2", "Session checking has been paused.", new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final UUID m9121c(AbstractC1812k abstractC1812k) {
                    LinkedList linkedList;
                    List listM6210b;
/* 1 */             abstractC1812k.getClass();
/* 11 */            if (!this.f17653g.get()) {
/* 10 */                return null;
                    }
/* 14 */            f31 f31Var = this.f17651e;
                    synchronized (f31Var) {
                        try {
/* 19 */                    linkedList = new LinkedList();
/* 24 */                    if (abstractC1812k instanceof AbstractC1910m0) {
/* 28 */                        LinkedList<q50> linkedList2 = new LinkedList();
/* 46 */                        List list = (List) ((HashMap) f31Var.f7990h).get(((AbstractC1910m0) abstractC1812k).mo105d());
/* 48 */                        if (list != null) {
/* 50 */                            linkedList2.addAll(list);
                                }
/* 67 */                        List list2 = (List) ((HashMap) f31Var.f7990h).get("*");
/* 69 */                        if (list2 != null) {
/* 71 */                            linkedList2.addAll(list2);
                                }
/* 82 */                        for (q50 q50Var : linkedList2) {
/* 100 */                           if (((String) ((HashMap) f31Var.f7984b).get(q50Var)) != null) {
                                        switch (q50Var.f15399a) {
                                            case 0:
                                            case 1:
                                            case 2:
/* 122 */                                       abstractC1812k.getClass();
/* 120 */                                       listM6210b = null;
                                                break;
                                            default:
/* 107 */                                       abstractC1812k.getClass();
/* 115 */                                       listM6210b = C1839a.m6210b(new r72());
                                                break;
                                        }
/* 126 */                               if (listM6210b != null) {
/* 128 */                                   linkedList.addAll(listM6210b);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 258 */                   throw th;
                        }
                    }
/* 137 */           ArrayList<AbstractC1812k> arrayListM6183B = CollectionsKt.m6183B(linkedList, C1839a.m6210b(abstractC1812k));
/* 141 */           Iterator it = arrayListM6183B.iterator();
/* 149 */           while (it.hasNext()) {
/* 157 */               ((AbstractC1812k) it.next()).mo3282b(this);
                    }
/* 163 */           h22 h22Var = new h22();
                    synchronized (this) {
                        try {
/* 175 */                   ArrayList arrayList = new ArrayList(C2122qw.m8020h(arrayListM6183B, 10));
/* 186 */                   for (AbstractC1812k abstractC1812k2 : arrayListM6183B) {
/* 202 */                       yq2 yq2Var = new yq2(abstractC1812k2, this.f17651e.m3644f(abstractC1812k2));
/* 205 */                       m9122d(yq2Var);
/* 213 */                       arrayList.add(new Pair(abstractC1812k2, yq2Var));
                            }
/* 219 */                   h22Var.f8873a = arrayList;
                        } catch (Throwable th2) {
/* 256 */                   throw th2;
                        }
                    }
/* 235 */           mf0.m6643a("uq2", !(abstractC1812k instanceof xq2), new ji1(15, h22Var, this));
/* 252 */           return ((yq2) ((Pair) CollectionsKt.m6204y((List) h22Var.f8873a)).f12909b).f19761f;
                }

                /* JADX INFO: renamed from: d */
                public final void m9122d(yq2 yq2Var) {
                    C2269uv c2269uv;
/* 3 */             if (yq2Var.f19764i || !this.f17670x) {
/* 207 */               return;
                    }
/* 11 */            String string = yq2Var.f19761f.toString();
/* 15 */            string.getClass();
/* 18 */            long j = yq2Var.f19762g;
/* 20 */            za2 za2Var = this.f17657k;
/* 22 */            if (za2Var == null) {
/* 32 */                k50.m5957K("uq2", "Session not ready or method getHasLoadedFromFile returned false with eventId: %s", string);
/* 35 */                return;
                    }
/* 36 */            boolean z = this.f17667u;
                    synchronized (za2Var) {
                        try {
/* 46 */                    k50.m5958L("za2", "Getting session context...", new Object[0]);
/* 51 */                    if (za2Var.f20046i) {
/* 59 */                        if (!za2Var.f20045h.get()) {
/* 62 */                            long jCurrentTimeMillis = System.currentTimeMillis();
/* 77 */                            long j2 = za2Var.f20043f.get() ? za2Var.f20048k : za2Var.f20047j;
/* 79 */                            long j3 = za2Var.f20044g;
/* 83 */                            if (jCurrentTimeMillis < j3 || jCurrentTimeMillis - j3 > j2) {
                                    }
/* 127 */                           za2Var.f20044g = System.currentTimeMillis();
                                }
/* 96 */                        k50.m5968e("za2", "Update session information.", new Object[0]);
/* 99 */                        za2Var.m10302d(string, j);
/* 108 */                       if (za2Var.f20043f.get()) {
/* 112 */                           za2.m10299a(za2Var.f20052o);
                                } else {
/* 120 */                           za2.m10299a(za2Var.f20051n);
                                }
/* 127 */                       za2Var.f20044g = System.currentTimeMillis();
                            }
/* 133 */                   za2Var.f20039b++;
/* 135 */                   C1837kn c1837kn = za2Var.f20042e;
/* 137 */                   c2269uv = null;
/* 138 */                   if (c1837kn == null) {
/* 146 */                       k50.m5958L("za2", "Session state not present", new Object[0]);
                            } else {
/* 157 */                       HashMap map = new HashMap((HashMap) c1837kn.f12883c);
/* 168 */                       map.put("eventIndex", Integer.valueOf(za2Var.f20039b));
/* 171 */                       if (z) {
/* 177 */                           map.put("userId", "00000000-0000-0000-0000-000000000000");
/* 182 */                           map.put("previousSessionId", null);
                                }
/* 189 */                       c2269uv = new C2269uv("iglu:com.snowplowanalytics.snowplow/client_session/jsonschema/1-0-2", map);
                            }
                        } catch (Throwable th) {
/* 206 */                   throw th;
                        }
                    }
/* 193 */           if (c2269uv != null) {
/* 201 */               ((ArrayList) yq2Var.m10169a()).add(c2269uv);
                    }
                }
            }
