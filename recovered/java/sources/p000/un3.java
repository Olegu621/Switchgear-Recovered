            package p000;

            import io.sentry.C1697u2;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class un3 {

                /* JADX INFO: renamed from: c */
                public static final un3 f17606c = new un3(0);

                /* JADX INFO: renamed from: a */
                public final hq3 f17607a = new hq3(16);

                /* JADX INFO: renamed from: b */
                public boolean f17608b;

                public un3(int i) {
/* 12 */            m9044a();
/* 15 */            m9044a();
                }

                /* JADX INFO: renamed from: a */
                public final void m9044a() {
                    hq3 hq3Var;
/* 3 */             if (this.f17608b) {
/* 163 */               return;
                    }
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 hq3Var = this.f17607a;
/* 15 */                if (i >= hq3Var.f9203b.size()) {
                            break;
                        }
/* 17 */                Map.Entry entryM4265a = hq3Var.m4265a(i);
/* 27 */                if (entryM4265a.getValue() instanceof eo3) {
/* 33 */                    eo3 eo3Var = (eo3) entryM4265a.getValue();
/* 35 */                    eo3Var.getClass();
/* 48 */                    yp3.f19747c.m10168a(eo3Var.getClass()).zzj(eo3Var);
/* 51 */                    eo3Var.m3546n();
                        }
/* 54 */                i++;
                    }
/* 59 */            if (!hq3Var.f9205d) {
/* 67 */                if (hq3Var.f9203b.size() > 0) {
/* 109 */                   hq3Var.m4265a(0).getKey().getClass();
/* 112 */                   C1697u2.m5431g();
/* 115 */                   return;
                        } else {
/* 73 */                    Iterator it = hq3Var.m4266b().iterator();
/* 81 */                    if (it.hasNext()) {
/* 94 */                        ((Map.Entry) it.next()).getKey().getClass();
/* 97 */                        C1697u2.m5431g();
/* 100 */                       return;
                            }
                        }
                    }
/* 119 */           if (!hq3Var.f9205d) {
/* 138 */               hq3Var.f9204c = hq3Var.f9204c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hq3Var.f9204c);
/* 157 */               hq3Var.f9207f = hq3Var.f9207f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(hq3Var.f9207f);
/* 159 */               hq3Var.f9205d = true;
                    }
/* 161 */           this.f17608b = true;
                }

                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final un3 clone() {
/* 3 */             un3 un3Var = new un3();
/* 6 */             hq3 hq3Var = this.f17607a;
/* 15 */            if (hq3Var.f9203b.size() > 0) {
/* 53 */                Map.Entry entryM4265a = hq3Var.m4265a(0);
/* 61 */                if (entryM4265a.getKey() != null) {
/* 63 */                    C1697u2.m5431g();
/* 14 */                    return null;
                        }
/* 67 */                entryM4265a.getValue();
/* 70 */                throw null;
                    }
/* 21 */            Iterator it = hq3Var.m4266b().iterator();
/* 29 */            if (!it.hasNext()) {
/* 31 */                return un3Var;
                    }
/* 36 */            Map.Entry entry = (Map.Entry) it.next();
/* 42 */            if (entry.getKey() != null) {
/* 44 */                C1697u2.m5431g();
/* 14 */                return null;
                    }
/* 48 */            entry.getValue();
/* 51 */            throw null;
                }

                /* JADX INFO: renamed from: c */
                public final Iterator m9046c() {
/* 9 */             return ((gf2) this.f17607a.entrySet()).iterator();
                }

                /* JADX INFO: renamed from: d */
                public final void m9047d() {
/* 1 */             hq3 hq3Var = this.f17607a;
/* 9 */             if (hq3Var.f9203b.size() > 0) {
/* 52 */                hq3Var.m4265a(0).getKey().getClass();
/* 55 */                C1697u2.m5431g();
/* 58 */                return;
                    }
/* 15 */            Iterator it = hq3Var.m4266b().iterator();
/* 23 */            if (it.hasNext()) {
/* 36 */                ((Map.Entry) it.next()).getKey().getClass();
/* 39 */                C1697u2.m5431g();
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof un3) {
/* 17 */                return this.f17607a.equals(((un3) obj).f17607a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f17607a.hashCode();
                }

/* 18 */        public un3() {
                }
            }
