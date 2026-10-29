            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: f0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class C0900f0 extends Throwable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7945a;

                public C0900f0(String str, Object obj) {
/* 2 */             this.f7945a = 4;
/* 4 */             obj.getClass();
/* 11 */            StringBuilder sb = new StringBuilder("invalid value ");
/* 14 */            sb.append(obj);
/* 19 */            sb.append(" passed for ");
/* 22 */            sb.append(str);
/* 33 */            super(fm0.m3789o(sb, " ", HttpUrl.FRAGMENT_ENCODE_SET));
                }

                @Override // java.lang.Throwable
                public synchronized Throwable fillInStackTrace() {
                    switch (this.f7945a) {
                        case 0:
                            synchronized (this) {
                            }
/* 16 */                    return this;
                        case 1:
                            synchronized (this) {
                            }
/* 13 */                    return this;
                        default:
/* 6 */                     return super.fillInStackTrace();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 36 */        public /* synthetic */ C0900f0(String str, int i) {
                    super(str);
/* 37 */            this.f7945a = i;
                }
            }
