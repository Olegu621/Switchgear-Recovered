            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nq0 implements mh1 {

                /* JADX INFO: renamed from: b */
                public static final nq0 f14407b = new nq0(0);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14408a;

                public /* synthetic */ nq0(int i) {
/* 1 */             this.f14408a = i;
                }

                @Override // p000.mh1
                /* JADX INFO: renamed from: a */
                public final t02 mo6636a(Class cls) {
                    switch (this.f14408a) {
                        case 0:
/* 21 */                    if (!tq0.class.isAssignableFrom(cls)) {
/* 65 */                        C1951n4.m6859j("Unsupported message type: ".concat(cls.getName()));
/* 20 */                        return null;
                            }
                            try {
/* 36 */                        return (t02) tq0.m8852d(cls.asSubclass(tq0.class)).mo7066c(3);
                            } catch (Exception e) {
/* 51 */                        ds0.m3198o("Unable to get message info for ".concat(cls.getName()), e);
/* 20 */                        return null;
                            }
                        default:
/* 13 */                    throw new IllegalStateException("This should never be called.");
                    }
                }

                @Override // p000.mh1
                /* JADX INFO: renamed from: b */
                public final boolean mo6637b(Class cls) {
                    switch (this.f14408a) {
                        case 0:
/* 10 */                    return tq0.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }
            }
