            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class cu0 extends C2569zz {

                /* JADX INFO: renamed from: u0 */
                public C2569zz[] f6906u0 = new C2569zz[4];

                /* JADX INFO: renamed from: v0 */
                public int f6907v0 = 0;

                /* JADX INFO: renamed from: S */
                public final void m2888S(C2569zz c2569zz) {
/* 1 */             if (c2569zz == this || c2569zz == null) {
/* 36 */                return;
                    }
/* 8 */             int i = this.f6907v0 + 1;
/* 10 */            C2569zz[] c2569zzArr = this.f6906u0;
/* 13 */            if (i > c2569zzArr.length) {
/* 24 */                this.f6906u0 = (C2569zz[]) Arrays.copyOf(c2569zzArr, c2569zzArr.length * 2);
                    }
/* 26 */            C2569zz[] c2569zzArr2 = this.f6906u0;
/* 28 */            int i2 = this.f6907v0;
/* 30 */            c2569zzArr2[i2] = c2569zz;
/* 34 */            this.f6907v0 = i2 + 1;
                }

                /* JADX INFO: renamed from: T */
                public final void m2889T(int i, k73 k73Var, ArrayList arrayList) {
/* 5 */             for (int i2 = 0; i2 < this.f6907v0; i2++) {
/* 9 */                 C2569zz c2569zz = this.f6906u0[i2];
/* 11 */                ArrayList arrayList2 = k73Var.f12638a;
/* 17 */                if (!arrayList2.contains(c2569zz)) {
/* 20 */                    arrayList2.add(c2569zz);
                        }
                    }
/* 28 */            for (int i3 = 0; i3 < this.f6907v0; i3++) {
/* 34 */                kb1.m6031D(this.f6906u0[i3], i, arrayList, k73Var);
                    }
                }

                /* JADX INFO: renamed from: U */
                public void mo2890U() {
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: g */
                public void mo1429g(C2569zz c2569zz, HashMap map) {
/* 1 */             super.mo1429g(c2569zz, map);
/* 4 */             cu0 cu0Var = (cu0) c2569zz;
/* 7 */             this.f6907v0 = 0;
/* 9 */             int i = cu0Var.f6907v0;
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 23 */                m2888S((C2569zz) map.get(cu0Var.f6906u0[i2]));
                    }
                }
            }
