            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bs1 extends y53 {
                @Override // p000.y53
                /* JADX INFO: renamed from: V */
                public final void mo1431V(int i, int i2, int i3, int i4) {
/* 9 */             int iM10475r = this.f19490A0 + this.f19491B0;
/* 10 */            int iM10472l = this.f19497w0 + this.f19498x0;
/* 14 */            if (this.f6907v0 > 0) {
/* 24 */                iM10475r += this.f6906u0[0].m10475r();
/* 33 */                iM10472l += this.f6906u0[0].m10472l();
                    }
/* 36 */            int iMax = Math.max(this.f20428d0, iM10475r);
/* 42 */            int iMax2 = Math.max(this.f20430e0, iM10472l);
/* 50 */            if (i != 1073741824) {
/* 53 */                if (i == Integer.MIN_VALUE) {
/* 55 */                    i2 = Math.min(iMax, i2);
                        } else {
/* 64 */                    i2 = i == 0 ? iMax : 0;
                        }
                    }
/* 65 */            if (i3 != 1073741824) {
/* 68 */                if (i3 == Integer.MIN_VALUE) {
/* 70 */                    i4 = Math.min(iMax2, i4);
                        } else {
/* 79 */                    i4 = i3 == 0 ? iMax2 : 0;
                        }
                    }
/* 80 */            this.f19493D0 = i2;
/* 82 */            this.f19494E0 = i4;
/* 84 */            m10464P(i2);
/* 87 */            m10461M(i4);
/* 95 */            this.f19492C0 = this.f6907v0 > 0;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: b */
                public final void mo1427b(t71 t71Var, boolean z) {
/* 1 */             super.mo1427b(t71Var, z);
/* 6 */             if (this.f6907v0 > 0) {
/* 11 */                C2569zz c2569zz = this.f6906u0[0];
/* 13 */                c2569zz.m10456E();
/* 18 */                c2569zz.f20434g0 = 0.5f;
/* 20 */                c2569zz.f20432f0 = 0.5f;
/* 23 */                c2569zz.m10467e(2, this, 2, 0);
/* 27 */                c2569zz.m10467e(4, this, 4, 0);
/* 31 */                c2569zz.m10467e(3, this, 3, 0);
/* 35 */                c2569zz.m10467e(5, this, 5, 0);
                    }
                }
            }
