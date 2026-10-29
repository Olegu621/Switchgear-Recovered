            package p000;
            
            /* JADX INFO: renamed from: iq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1766iq implements y42 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f11893b;

                /* JADX INFO: renamed from: c */
                public final y42 f11894c;

                public C1766iq(int i, long j) {
/* 1 */             this.f11893b = i;
                    switch (i) {
                        case 1:
/* 31 */                    this.f11894c = new oo2(j, new C1000hq(j));
                            break;
                        default:
/* 15 */                    this.f11894c = new C1766iq(1, j);
                            break;
                    }
                }

                @Override // p000.y42
                /* JADX INFO: renamed from: a */
                public final long mo4260a() {
                    switch (this.f11893b) {
                        case 0:
/* 21 */                    return ((oo2) ((C1766iq) this.f11894c).f11894c).f14851b;
                        default:
/* 10 */                    return ((oo2) this.f11894c).f14851b;
                    }
                }

                @Override // p000.y42
                /* JADX INFO: renamed from: b */
                public final x42 mo4261b(C0176bd c0176bd) {
/* 1 */             int i = this.f11893b;
/* 3 */             y42 y42Var = this.f11894c;
                    switch (i) {
                        case 0:
/* 27 */                    if (((oo2) ((C1766iq) y42Var).f11894c).mo4261b(c0176bd).f18949b) {
/* 56 */                        return x42.f18946e;
                            }
/* 31 */                    Throwable th = (Throwable) c0176bd.f2372c;
/* 35 */                    if (th instanceof C2190sq) {
/* 41 */                        hu0.m4325T("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
/* 48 */                        if (((C2190sq) th).f16746a > 0) {
/* 50 */                            return x42.f18947f;
                                }
                            }
/* 53 */                    return x42.f18945d;
                        default:
/* 10 */                    return ((oo2) y42Var).mo4261b(c0176bd);
                    }
                }
            }
