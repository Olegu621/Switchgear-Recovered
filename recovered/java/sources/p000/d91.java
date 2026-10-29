            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class d91 extends q33 {

                /* JADX INFO: renamed from: f */
                public static final wm0 f7065f = new wm0(1);

                /* JADX INFO: renamed from: d */
                public final vf2 f7066d = new vf2();

                /* JADX INFO: renamed from: e */
                public boolean f7067e = false;

                @Override // p000.q33
                /* JADX INFO: renamed from: b */
                public final void mo729b() {
/* 1 */             vf2 vf2Var = this.f7066d;
/* 3 */             int i = vf2Var.f18042c;
/* 8 */             for (int i2 = 0; i2 < i; i2++) {
/* 14 */                c91 c91Var = (c91) vf2Var.f18041b[i2];
/* 16 */                lc3 lc3Var = c91Var.f2776l;
/* 18 */                lc3Var.m6417a();
/* 22 */                lc3Var.f13188c = true;
/* 24 */                zr3 zr3Var = c91Var.f2778n;
/* 26 */                if (zr3Var != null) {
/* 28 */                    c91Var.mo123i(zr3Var);
                        }
/* 31 */                c91 c91Var2 = lc3Var.f13186a;
/* 33 */                if (c91Var2 == null) {
/* 62 */                    f42.m3656l("No listener register");
/* 65 */                    return;
                        }
/* 35 */                if (c91Var2 != c91Var) {
/* 56 */                    C1951n4.m6859j("Attempting to unregister the wrong listener");
/* 59 */                    return;
                        }
/* 37 */                lc3Var.f13186a = null;
/* 39 */                if (zr3Var != null) {
/* 41 */                    boolean z = zr3Var.f20311b;
                        }
/* 43 */                lc3Var.f13189d = true;
/* 45 */                lc3Var.f13187b = false;
/* 47 */                lc3Var.f13188c = false;
/* 49 */                lc3Var.f13190e = false;
                    }
/* 66 */            int i3 = vf2Var.f18042c;
/* 68 */            Object[] objArr = vf2Var.f18041b;
/* 71 */            for (int i4 = 0; i4 < i3; i4++) {
/* 73 */                objArr[i4] = null;
                    }
/* 78 */            vf2Var.f18042c = 0;
                }
            }
