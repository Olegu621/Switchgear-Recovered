            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kp3 {

                /* JADX INFO: renamed from: a */
                public final mp3 f12970a;

                /* JADX INFO: renamed from: b */
                public int f12971b = 1;

                /* JADX INFO: renamed from: c */
                public long f12972c = m6272a();

                public kp3(mp3 mp3Var) {
/* 4 */             this.f12970a = mp3Var;
                }

                /* JADX INFO: renamed from: a */
                public final long m6272a() {
/* 1 */             mp3 mp3Var = this.f12970a;
/* 3 */             kb1.m6061n(mp3Var);
/* 15 */            long jLongValue = ((Long) vg3.f18167v.m9011a(null)).longValue();
/* 27 */            long jLongValue2 = ((Long) vg3.f18169w.m9011a(null)).longValue();
/* 34 */            for (int i = 1; i < this.f12971b; i++) {
/* 36 */                jLongValue += jLongValue;
/* 39 */                if (jLongValue >= jLongValue2) {
                            break;
                        }
                    }
/* 51 */            ((xt0) mp3Var.mo4562f()).getClass();
/* 62 */            return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
                }
            }
