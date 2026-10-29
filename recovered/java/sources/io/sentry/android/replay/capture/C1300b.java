            package io.sentry.android.replay.capture;

            import java.util.concurrent.atomic.AtomicReference;
            import p000.u21;
            import p000.w02;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 85 */    public final class C1300b implements w02 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10453a;

                /* JADX INFO: renamed from: b */
                public final AtomicReference f10454b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AbstractC1301c f10455c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AbstractC1301c f10456d;

                public C1300b(AbstractC1301c abstractC1301c, AbstractC1301c abstractC1301c2, int i) {
/* 1 */             this.f10453a = i;
                    switch (i) {
                        case 2:
/* 75 */                    this.f10455c = abstractC1301c;
/* 77 */                    this.f10456d = abstractC1301c2;
/* 84 */                    this.f10454b = new AtomicReference(null);
                            break;
                        case 3:
/* 60 */                    this.f10455c = abstractC1301c;
/* 62 */                    this.f10456d = abstractC1301c2;
/* 69 */                    this.f10454b = new AtomicReference(null);
                            break;
                        case 4:
/* 45 */                    this.f10455c = abstractC1301c;
/* 47 */                    this.f10456d = abstractC1301c2;
/* 54 */                    this.f10454b = new AtomicReference(null);
                            break;
                        case 5:
/* 30 */                    this.f10455c = abstractC1301c;
/* 32 */                    this.f10456d = abstractC1301c2;
/* 39 */                    this.f10454b = new AtomicReference(null);
                            break;
                        default:
/* 15 */                    this.f10455c = abstractC1301c;
/* 17 */                    this.f10456d = abstractC1301c2;
/* 24 */                    this.f10454b = new AtomicReference(-1);
                            break;
                    }
                }

                @Override // p000.w02
                /* JADX INFO: renamed from: a */
                public final Object mo4392a(Object obj, u21 u21Var) {
/* 1 */             int i = this.f10453a;
/* 3 */             AtomicReference atomicReference = this.f10454b;
/* 5 */             u21Var.getClass();
                    switch (i) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
/* 11 */            return atomicReference.get();
                }

/* 86 */        public C1300b(Object obj, AbstractC1301c abstractC1301c, AbstractC1301c abstractC1301c2) {
                    this.f10453a = 0;
/* 88 */            this.f10455c = abstractC1301c;
                    this.f10456d = abstractC1301c2;
/* 89 */            this.f10454b = new AtomicReference(obj);
                }
            }
