            package p000;

            import java.nio.ByteBuffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ed0 {

                /* JADX INFO: renamed from: a */
                public int f7629a = 1;

                /* JADX INFO: renamed from: b */
                public final oi1 f7630b;

                /* JADX INFO: renamed from: c */
                public oi1 f7631c;

                /* JADX INFO: renamed from: d */
                public oi1 f7632d;

                /* JADX INFO: renamed from: e */
                public int f7633e;

                /* JADX INFO: renamed from: f */
                public int f7634f;

                public ed0(oi1 oi1Var) {
/* 7 */             this.f7630b = oi1Var;
/* 9 */             this.f7631c = oi1Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m3409a() {
/* 2 */             this.f7629a = 1;
/* 6 */             this.f7631c = this.f7630b;
/* 9 */             this.f7634f = 0;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m3410b() {
/* 5 */             mi1 mi1VarM8010b = this.f7631c.f14771b.m8010b();
/* 10 */            int iM8126a = mi1VarM8010b.m8126a(6);
                    return !(iM8126a == 0 || ((ByteBuffer) mi1VarM8010b.f15965d).get(iM8126a + mi1VarM8010b.f15962a) == 0) || this.f7633e == 65039;
                }
            }
