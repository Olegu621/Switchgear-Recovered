            package androidx.recyclerview.widget;

            import android.view.View;
            import p000.pc0;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0123a {

                /* JADX INFO: renamed from: a */
                public pc0 f1723a;

                /* JADX INFO: renamed from: b */
                public int f1724b;

                /* JADX INFO: renamed from: c */
                public int f1725c;

                /* JADX INFO: renamed from: d */
                public boolean f1726d;

                /* JADX INFO: renamed from: e */
                public boolean f1727e;

                public C0123a() {
/* 4 */             m934c();
                }

                /* JADX INFO: renamed from: a */
                public final void m932a() {
/* 1 */             boolean z = this.f1726d;
/* 3 */             pc0 pc0Var = this.f1723a;
/* 16 */            this.f1725c = z ? pc0Var.mo946g() : pc0Var.mo950k();
                }

                /* JADX INFO: renamed from: b */
                public final void m933b(int i, View view) {
/* 3 */             int iM7384m = this.f1723a.m7384m();
/* 7 */             if (iM7384m >= 0) {
/* 9 */                 boolean z = this.f1726d;
/* 11 */                pc0 pc0Var = this.f1723a;
/* 13 */                if (z) {
/* 26 */                    this.f1725c = this.f1723a.m7384m() + pc0Var.mo941b(view);
                        } else {
/* 33 */                    this.f1725c = pc0Var.mo944e(view);
                        }
/* 35 */                this.f1724b = i;
/* 37 */                return;
                    }
/* 38 */            this.f1724b = i;
/* 40 */            boolean z2 = this.f1726d;
/* 42 */            pc0 pc0Var2 = this.f1723a;
/* 45 */            if (!z2) {
/* 111 */               int iMo944e = pc0Var2.mo944e(view);
/* 121 */               int iMo950k = iMo944e - this.f1723a.mo950k();
/* 123 */               this.f1725c = iMo944e;
/* 125 */               if (iMo950k > 0) {
/* 159 */                   int iMo946g = (this.f1723a.mo946g() - Math.min(0, (this.f1723a.mo946g() - iM7384m) - this.f1723a.mo941b(view))) - (this.f1723a.mo942c(view) + iMo944e);
/* 160 */                   if (iMo946g < 0) {
/* 170 */                       this.f1725c -= Math.min(iMo950k, -iMo946g);
/* 172 */                       return;
                            }
/* 172 */                   return;
                        }
/* 172 */               return;
                    }
/* 58 */            int iMo946g2 = (pc0Var2.mo946g() - iM7384m) - this.f1723a.mo941b(view);
/* 66 */            this.f1725c = this.f1723a.mo946g() - iMo946g2;
/* 68 */            if (iMo946g2 > 0) {
/* 78 */                int iMo942c = this.f1725c - this.f1723a.mo942c(view);
/* 81 */                int iMo950k2 = this.f1723a.mo950k();
/* 97 */                int iMin = iMo942c - (Math.min(this.f1723a.mo944e(view) - iMo950k2, 0) + iMo950k2);
/* 98 */                if (iMin < 0) {
/* 108 */                   this.f1725c = Math.min(iMo946g2, -iMin) + this.f1725c;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m934c() {
/* 2 */             this.f1724b = -1;
/* 6 */             this.f1725c = Integer.MIN_VALUE;
/* 9 */             this.f1726d = false;
/* 11 */            this.f1727e = false;
                }

                public final String toString() {
/* 48 */            return "AnchorInfo{mPosition=" + this.f1724b + ", mCoordinate=" + this.f1725c + ", mLayoutFromEnd=" + this.f1726d + ", mValid=" + this.f1727e + '}';
                }
            }
