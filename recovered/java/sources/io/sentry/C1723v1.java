            package io.sentry;
            
            /* JADX INFO: renamed from: io.sentry.v1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final /* synthetic */ class C1723v1 implements InterfaceC1743x1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11756a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1446f2 f11757b;

                public /* synthetic */ C1723v1(C1425d2 c1425d2, C1446f2 c1446f2) {
/* 2 */             this.f11756a = 1;
/* 7 */             this.f11757b = c1446f2;
                }

                @Override // io.sentry.InterfaceC1743x1
                /* JADX INFO: renamed from: a */
                public final Object mo3666a() {
/* 1 */             int i = this.f11756a;
/* 3 */             C1446f2 c1446f2 = this.f11757b;
                    switch (i) {
                        case 0:
/* 44 */                    return c1446f2.nextString();
                        case 1:
                            try {
                                try {
/* 21 */                            return Integer.valueOf(c1446f2.nextInt());
                                } catch (Exception unused) {
/* 30 */                            return Double.valueOf(c1446f2.nextDouble());
                                }
                            } catch (Exception unused2) {
/* 39 */                        return Long.valueOf(c1446f2.nextLong());
                            }
                        default:
/* 12 */                    return Boolean.valueOf(c1446f2.m5237g());
                    }
                }

/* 9 */         public /* synthetic */ C1723v1(C1446f2 c1446f2, int i) {
/* 10 */            this.f11756a = i;
                    this.f11757b = c1446f2;
                }
            }
