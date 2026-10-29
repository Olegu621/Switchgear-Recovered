            package p000;

            import java.util.Set;
            import java.util.logging.Level;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xj3 extends sq3 {

                /* JADX INFO: renamed from: b */
                public final Level f19229b;

                /* JADX INFO: renamed from: c */
                public final Set f19230c;

                /* JADX INFO: renamed from: d */
                public final ti3 f19231d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public xj3(String str) {
/* 5 */             super(str);
/* 1 */             Level level = Level.ALL;
/* 3 */             Set set = yj3.f19661f;
/* 8 */             this.f19229b = level;
/* 12 */            this.f19230c = yj3.f19661f;
/* 16 */            this.f19231d = yj3.f19662i;
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: r */
                public final boolean mo8628r(Level level) {
/* 1 */             return true;
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: t */
                public final void mo8629t(sg3 sg3Var) {
/* 11 */            String strMo3764a = (String) sg3Var.m8505c().mo3441a0(bi3.f2440a);
/* 13 */            if (strMo3764a == null) {
/* 17 */                strMo3764a = (String) this.f16749a;
                    }
/* 19 */            if (strMo3764a == null) {
/* 21 */                hh3 hh3Var = sg3Var.f16613d;
/* 23 */                if (hh3Var == null) {
/* 51 */                    f42.m3656l("cannot request log site information prior to postProcess()");
/* 54 */                    return;
                        }
/* 25 */                strMo3764a = hh3Var.mo3764a();
/* 37 */                int iIndexOf = strMo3764a.indexOf(36, strMo3764a.lastIndexOf(46));
/* 41 */                if (iIndexOf >= 0) {
/* 44 */                    strMo3764a = strMo3764a.substring(0, iIndexOf);
                        }
                    }
/* 65 */            yj3.m10154A(sg3Var, de3.m3020H(strMo3764a), this.f19229b, this.f19230c, this.f19231d);
                }
            }
