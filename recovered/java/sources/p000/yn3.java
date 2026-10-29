            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yn3 implements qp3 {

                /* JADX INFO: renamed from: b */
                public static final yn3 f19725b = new yn3(0);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19726a;

                public /* synthetic */ yn3(int i) {
/* 1 */             this.f19726a = i;
                }

                @Override // p000.qp3
                public final boolean zzb(Class cls) {
                    switch (this.f19726a) {
                        case 0:
/* 10 */                    return eo3.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }

                @Override // p000.qp3
                public final aq3 zzc(Class cls) {
                    switch (this.f19726a) {
                        case 0:
/* 21 */                    if (!eo3.class.isAssignableFrom(cls)) {
/* 65 */                        C1951n4.m6859j("Unsupported message type: ".concat(cls.getName()));
/* 20 */                        return null;
                            }
                            try {
/* 36 */                        return (aq3) eo3.m3535e(cls.asSubclass(eo3.class)).mo317l(3, null);
                            } catch (Exception e) {
/* 51 */                        ds0.m3198o("Unable to get message info for ".concat(cls.getName()), e);
/* 20 */                        return null;
                            }
                        default:
/* 13 */                    throw new IllegalStateException("This should never be called.");
                    }
                }
            }
