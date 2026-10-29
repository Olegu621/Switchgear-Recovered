            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class dg1 {

                /* JADX INFO: renamed from: a */
                public final String f7174a;

                /* JADX INFO: renamed from: b */
                public final i03 f7175b;

                public dg1(String str, i03 i03Var) {
/* 1 */             i03Var.getClass();
/* 7 */             this.f7174a = str;
/* 9 */             this.f7175b = i03Var;
                }

                /* JADX INFO: renamed from: a */
                public abstract boolean mo3058a(boolean z, g13 g13Var);

                /* JADX INFO: renamed from: b */
                public boolean mo3059b(cg1 cg1Var) {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: c */
                public i03 mo3060c() {
/* 1 */             return this.f7175b;
                }

                /* JADX INFO: renamed from: d */
                public String mo3061d() {
/* 1 */             return this.f7174a;
                }

                /* JADX INFO: renamed from: e */
                public Integer mo3062e() {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: f */
                public final void m3063f(Exception exc) {
/* 23 */            mo3060c().mo2906a("Failed to apply consent to " + mo3061d(), exc);
                }
            }
