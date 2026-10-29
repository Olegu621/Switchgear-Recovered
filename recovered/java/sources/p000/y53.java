            package p000;

            import androidx.constraintlayout.widget.C0075b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class y53 extends cu0 {

                /* JADX INFO: renamed from: w0 */
                public int f19497w0 = 0;

                /* JADX INFO: renamed from: x0 */
                public int f19498x0 = 0;

                /* JADX INFO: renamed from: y0 */
                public int f19499y0 = 0;

                /* JADX INFO: renamed from: z0 */
                public int f19500z0 = 0;

                /* JADX INFO: renamed from: A0 */
                public int f19490A0 = 0;

                /* JADX INFO: renamed from: B0 */
                public int f19491B0 = 0;

                /* JADX INFO: renamed from: C0 */
                public boolean f19492C0 = false;

                /* JADX INFO: renamed from: D0 */
                public int f19493D0 = 0;

                /* JADX INFO: renamed from: E0 */
                public int f19494E0 = 0;

                /* JADX INFO: renamed from: F0 */
                public final C2332wi f19495F0 = new C2332wi();

                /* JADX INFO: renamed from: G0 */
                public InterfaceC2462xi f19496G0 = null;

                @Override // p000.cu0
                /* JADX INFO: renamed from: U */
                public final void mo2890U() {
/* 4 */             for (int i = 0; i < this.f6907v0; i++) {
/* 8 */                 C2569zz c2569zz = this.f6906u0[i];
/* 10 */                if (c2569zz != null) {
/* 13 */                    c2569zz.f20401G = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: V */
                public abstract void mo1431V(int i, int i2, int i3, int i4);

                /* JADX INFO: renamed from: W */
                public final void m10106W(C2569zz c2569zz, EnumC2516yz enumC2516yz, int i, EnumC2516yz enumC2516yz2, int i2) {
                    InterfaceC2462xi interfaceC2462xi;
                    C2569zz c2569zz2;
                    while (true) {
/* 1 */                 interfaceC2462xi = this.f19496G0;
/* 3 */                 if (interfaceC2462xi != null || (c2569zz2 = this.f20416V) == null) {
                            break;
                        } else {
/* 13 */                    this.f19496G0 = ((a00) c2569zz2).f21y0;
                        }
                    }
/* 16 */            C2332wi c2332wi = this.f19495F0;
/* 18 */            c2332wi.f18637a = enumC2516yz;
/* 20 */            c2332wi.f18638b = enumC2516yz2;
/* 22 */            c2332wi.f18639c = i;
/* 24 */            c2332wi.f18640d = i2;
/* 28 */            ((C0075b) interfaceC2462xi).m524b(c2569zz, c2332wi);
/* 33 */            c2569zz.m10464P(c2332wi.f18641e);
/* 38 */            c2569zz.m10461M(c2332wi.f18642f);
/* 43 */            c2569zz.f20399E = c2332wi.f18644h;
/* 47 */            c2569zz.m10458J(c2332wi.f18643g);
                }
            }
