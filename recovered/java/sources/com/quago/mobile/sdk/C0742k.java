            package com.quago.mobile.sdk;

            import java.lang.reflect.Array;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0742k {

                /* JADX INFO: renamed from: b */
                public final String f5506b;

                /* JADX INFO: renamed from: d */
                public final Object[] f5508d;

                /* JADX INFO: renamed from: a */
                public final C0740j0 f5505a = AbstractC0743k0.m2619a("DataPointContainer");

                /* JADX INFO: renamed from: c */
                public int f5507c = -1;

                public C0742k(String str, Class cls, int i) {
/* 17 */            this.f5506b = str;
                    try {
/* 25 */                this.f5508d = (Object[]) Array.newInstance((Class<?>) cls, i);
/* 33 */                int i2 = 0;
/* 34 */                if (cls.equals(C0751o.class)) {
/* 36 */                    while (i2 < i) {
/* 45 */                        this.f5508d[i2] = new C0751o();
/* 47 */                        i2++;
                            }
/* 185 */                   return;
                        }
/* 59 */                if (cls.equals(C0753p.class)) {
/* 61 */                    while (i2 < i) {
/* 70 */                        this.f5508d[i2] = new C0753p();
/* 72 */                        i2++;
                            }
/* 185 */                   return;
                        }
/* 81 */                if (cls.equals(C0768x.class)) {
/* 83 */                    while (i2 < i) {
/* 92 */                        this.f5508d[i2] = new C0768x();
/* 94 */                        i2++;
                            }
/* 185 */                   return;
                        }
/* 103 */               if (cls.equals(C0764v.class)) {
/* 105 */                   while (i2 < i) {
/* 114 */                       this.f5508d[i2] = new C0764v();
/* 116 */                       i2++;
                            }
/* 185 */                   return;
                        }
/* 125 */               if (cls.equals(C0766w.class)) {
/* 127 */                   while (i2 < i) {
/* 136 */                       this.f5508d[i2] = new C0766w();
/* 138 */                       i2++;
                            }
                        } else if (cls.equals(C0732g1.class)) {
/* 149 */                   while (i2 < i) {
/* 158 */                       this.f5508d[i2] = new C0732g1();
/* 160 */                       i2++;
                            }
                        } else {
/* 169 */                   if (!cls.equals(C0744k1.class)) {
/* 199 */                       throw new ClassNotFoundException("Class isn't define in DataPointContainer: ".concat(cls.getName()));
                            }
/* 171 */                   while (i2 < i) {
/* 180 */                       this.f5508d[i2] = new C0744k1();
/* 182 */                       i2++;
                            }
                        }
                    } catch (Exception e) {
/* 204 */               this.f5505a.m2612a("construct", e);
                    }
                }
            }
