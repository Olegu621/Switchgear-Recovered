            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vi1 extends Exception {

                /* JADX INFO: renamed from: a */
                public final String f18201a;

                /* JADX INFO: renamed from: b */
                public final Throwable f18202b;

                public vi1(String str, Throwable th) {
/* 1 */             super(str, th);
/* 4 */             this.f18201a = str;
/* 6 */             this.f18202b = th;
                }

                @Override // java.lang.Throwable
                public final Throwable getCause() {
/* 1 */             return this.f18202b;
                }

                @Override // java.lang.Throwable
                public final String getMessage() {
/* 1 */             return this.f18201a;
                }
            }
