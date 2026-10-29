            package p000;

            import androidx.appcompat.widget.C0073m;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class zp2 extends jb1 {

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f20286f;

                /* JADX INFO: renamed from: g */
                public boolean f20287g;

                /* JADX INFO: renamed from: h */
                public int f20288h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Object f20289i;

                public zp2(q43 q43Var) {
/* 2 */             this.f20286f = 1;
/* 7 */             this.f20289i = q43Var;
/* 10 */            this.f20287g = false;
/* 12 */            this.f20288h = 0;
                }

                @Override // p000.jb1, p000.r43
                /* JADX INFO: renamed from: a */
                public void mo1184a() {
                    switch (this.f20286f) {
                        case 0:
/* 8 */                     this.f20287g = true;
                            break;
                    }
                }

                @Override // p000.jb1, p000.r43
                /* JADX INFO: renamed from: b */
                public final void mo1185b() {
/* 1 */             int i = this.f20286f;
/* 3 */             Object obj = this.f20289i;
                    switch (i) {
                        case 0:
/* 31 */                    ((C0073m) obj).f762a.setVisibility(0);
                            break;
                        default:
/* 10 */                    if (!this.f20287g) {
/* 14 */                        this.f20287g = true;
/* 18 */                        r43 r43Var = ((q43) obj).f15396d;
/* 20 */                        if (r43Var != null) {
/* 22 */                            r43Var.mo1185b();
                                }
                                break;
                            }
                            break;
                    }
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: c */
                public final void mo1186c() {
/* 1 */             int i = this.f20286f;
/* 3 */             Object obj = this.f20289i;
                    switch (i) {
                        case 0:
/* 41 */                    if (!this.f20287g) {
/* 49 */                        ((C0073m) obj).f762a.setVisibility(this.f20288h);
                            }
                            break;
                        default:
/* 10 */                    int i2 = this.f20288h + 1;
/* 12 */                    this.f20288h = i2;
/* 14 */                    q43 q43Var = (q43) obj;
/* 22 */                    if (i2 == q43Var.f15393a.size()) {
/* 24 */                        r43 r43Var = q43Var.f15396d;
/* 26 */                        if (r43Var != null) {
/* 28 */                            r43Var.mo1186c();
                                }
/* 32 */                        this.f20288h = 0;
/* 34 */                        this.f20287g = false;
/* 36 */                        q43Var.f15397e = false;
                            }
                            break;
                    }
                }

/* 14 */        public zp2(C0073m c0073m, int i) {
                    this.f20286f = 0;
/* 16 */            this.f20289i = c0073m;
                    this.f20288h = i;
/* 17 */            this.f20287g = false;
                }
            }
