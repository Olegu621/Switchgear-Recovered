            package p000;

            import java.util.HashMap;
            
            /* JADX INFO: renamed from: kg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1830kg {

                /* JADX INFO: renamed from: a */
                public final InterfaceC2512yv f12742a;

                /* JADX INFO: renamed from: b */
                public final HashMap f12743b;

                public C1830kg(InterfaceC2512yv interfaceC2512yv, HashMap map) {
/* 4 */             this.f12742a = interfaceC2512yv;
/* 6 */             this.f12743b = map;
                }

                /* JADX INFO: renamed from: a */
                public final long m6097a(px1 px1Var, long j, int i) {
/* 7 */             long jMo7340a = j - this.f12742a.mo7340a();
/* 14 */            C1889lg c1889lg = (C1889lg) this.f12743b.get(px1Var);
/* 16 */            long j2 = c1889lg.f13259a;
/* 18 */            int i2 = i - 1;
/* 70 */            return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jMo7340a), c1889lg.f13260b);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1830kg)) {
/* 32 */                return false;
                    }
/* 8 */             C1830kg c1830kg = (C1830kg) obj;
                    return this.f12742a.equals(c1830kg.f12742a) && this.f12743b.equals(c1830kg.f12743b);
                }

                public final int hashCode() {
/* 18 */            return this.f12743b.hashCode() ^ ((this.f12742a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "SchedulerConfig{clock=" + this.f12742a + ", values=" + this.f12743b + "}";
                }
            }
