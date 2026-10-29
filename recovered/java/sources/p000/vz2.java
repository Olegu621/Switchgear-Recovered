            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class vz2 extends Exception {

                /* JADX INFO: renamed from: a */
                public final String f18403a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public vz2(String str, Throwable th) {
/* 4 */             super(str, th);
/* 1 */             str.getClass();
/* 7 */             this.f18403a = str;
                }

                @Override // java.lang.Throwable
                public final String getMessage() {
/* 1 */             return this.f18403a;
                }

/* 9 */         public vz2(String str) {
/* 10 */            super(str, null);
                    this.f18403a = str;
                }
            }
