            package p000;
            
            /* JADX INFO: renamed from: bn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0186bn implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2544a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0222cn f2545b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C2260um f2546c;

                public /* synthetic */ RunnableC0186bn(C0222cn c0222cn, C2260um c2260um, int i) {
/* 1 */             this.f2544a = i;
/* 3 */             this.f2545b = c0222cn;
/* 5 */             this.f2546c = c2260um;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f2544a;
/* 6 */             C2260um c2260um = this.f2546c;
/* 8 */             C0222cn c0222cn = this.f2545b;
                    switch (i) {
                        case 0:
/* 56 */                    c0222cn.f3005b = true;
/* 60 */                    C1898lp c1898lp = new C1898lp("Camera2CameraControl was updated with new options.", 0);
/* 63 */                    C2260um c2260um2 = c0222cn.f3010g;
/* 65 */                    if (c2260um2 != null) {
/* 67 */                        c2260um2.m9041b(c1898lp);
/* 70 */                        c0222cn.f3010g = null;
                            }
/* 72 */                    c0222cn.f3010g = c2260um;
/* 76 */                    if (c0222cn.f3004a) {
/* 91 */                        c0222cn.f3006c.m5860o().mo3676a(new RunnableC2166s2(c0222cn, 1), c0222cn.f3007d);
/* 94 */                        c0222cn.f3005b = false;
                            }
                            break;
                        default:
/* 15 */                    c0222cn.f3005b = true;
/* 19 */                    C1898lp c1898lp2 = new C1898lp("Camera2CameraControl was updated with new options.", 0);
/* 22 */                    C2260um c2260um3 = c0222cn.f3010g;
/* 24 */                    if (c2260um3 != null) {
/* 26 */                        c2260um3.m9041b(c1898lp2);
/* 29 */                        c0222cn.f3010g = null;
                            }
/* 31 */                    c0222cn.f3010g = c2260um;
/* 35 */                    if (c0222cn.f3004a) {
/* 50 */                        c0222cn.f3006c.m5860o().mo3676a(new RunnableC2166s2(c0222cn, 1), c0222cn.f3007d);
/* 53 */                        c0222cn.f3005b = false;
                            }
                            break;
                    }
                }
            }
