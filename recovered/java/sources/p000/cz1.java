            package p000;

            import io.sentry.C1697u2;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cz1 {

                /* JADX INFO: renamed from: c */
                public static final cz1 f6940c = new cz1();

                /* JADX INFO: renamed from: b */
                public final ConcurrentHashMap f6942b = new ConcurrentHashMap();

                /* JADX INFO: renamed from: a */
                public final d52 f6941a = new d52(2);

                /* JADX INFO: renamed from: a */
                public final i72 m2900a(Class cls) {
                    gg0 gg0Var;
                    i72 i72VarM8162v;
                    Class cls2;
/* 3 */             fz0.m3858a(cls, "messageType");
/* 6 */             ConcurrentHashMap concurrentHashMap = this.f6942b;
/* 12 */            i72 i72Var = (i72) concurrentHashMap.get(cls);
/* 14 */            if (i72Var != null) {
/* 207 */               return i72Var;
                    }
/* 16 */            d52 d52Var = this.f6941a;
/* 18 */            d52Var.getClass();
/* 21 */            Class cls3 = n72.f14156a;
/* 30 */            if (!tq0.class.isAssignableFrom(cls) && (cls2 = n72.f14156a) != null && !cls2.isAssignableFrom(cls)) {
/* 45 */                C1951n4.m6859j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
/* 29 */                return null;
                    }
/* 53 */            t02 t02VarMo6636a = ((mb1) d52Var.f7001a).mo6636a(cls);
/* 69 */            if ((t02VarMo6636a.f16891d & 2) == 2) {
/* 75 */                if (tq0.class.isAssignableFrom(cls)) {
/* 85 */                    i72VarM8162v = new th1(n72.f14158c, ig0.f9582a, t02VarMo6636a.f16888a);
                        } else {
/* 90 */                    ux2 ux2Var = n72.f14157b;
/* 92 */                    gg0 gg0Var2 = ig0.f9583b;
/* 94 */                    if (gg0Var2 == null) {
/* 104 */                       f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 29 */                        return null;
                            }
/* 100 */                   i72VarM8162v = new th1(ux2Var, gg0Var2, t02VarMo6636a.f16888a);
                        }
                    } else if (tq0.class.isAssignableFrom(cls)) {
/* 115 */               hn1 hn1Var = jn1.f12407b;
/* 117 */               d81 d81Var = e81.f7573b;
/* 119 */               ux2 ux2Var2 = n72.f14158c;
/* 135 */               gg0 gg0Var3 = AbstractC0886en.m3520y(t02VarMo6636a.m8671a()) != 1 ? ig0.f9582a : null;
/* 136 */               ic1 ic1Var = kc1.f12680b;
/* 140 */               if (!(t02VarMo6636a instanceof t02)) {
/* 147 */                   int[] iArr = rh1.f16060n;
/* 149 */                   C1697u2.m5431g();
/* 29 */                    return null;
                        }
/* 142 */               i72VarM8162v = rh1.m8162v(t02VarMo6636a, hn1Var, d81Var, ux2Var2, gg0Var3, ic1Var);
                    } else {
/* 154 */               hn1 hn1Var2 = jn1.f12406a;
/* 156 */               d81 d81Var2 = e81.f7572a;
/* 158 */               ux2 ux2Var3 = n72.f14157b;
/* 168 */               if (AbstractC0886en.m3520y(t02VarMo6636a.m8671a()) != 1) {
/* 170 */                   gg0 gg0Var4 = ig0.f9583b;
/* 172 */                   if (gg0Var4 == null) {
/* 176 */                       f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 29 */                        return null;
                            }
/* 174 */                   gg0Var = gg0Var4;
                        } else {
/* 180 */                   gg0Var = null;
                        }
/* 181 */               ic1 ic1Var2 = kc1.f12679a;
/* 185 */               if (!(t02VarMo6636a instanceof t02)) {
/* 201 */                   int[] iArr2 = rh1.f16060n;
/* 203 */                   C1697u2.m5431g();
/* 29 */                    return null;
                        }
/* 187 */               i72VarM8162v = rh1.m8162v(t02VarMo6636a, hn1Var2, d81Var2, ux2Var3, gg0Var, ic1Var2);
                    }
/* 195 */           i72 i72Var2 = (i72) concurrentHashMap.putIfAbsent(cls, i72VarM8162v);
                    return i72Var2 != null ? i72Var2 : i72VarM8162v;
                }
            }
