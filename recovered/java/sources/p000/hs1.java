            package p000;

            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class hs1 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9224a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f9225b;

                public /* synthetic */ hs1(String str, int i) {
/* 1 */             this.f9224a = i;
/* 3 */             this.f9225b = str;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long j;
/* 1 */             int i = this.f9224a;
/* 3 */             String str = this.f9225b;
                    switch (i) {
                        case 0:
/* 32 */                    return str;
                        case 1:
/* 27 */                    j = Long.parseLong(str);
                            break;
                        case 2:
/* 22 */                    j = Long.parseLong(str);
                            break;
                        case 3:
/* 17 */                    j = Long.parseLong(str);
                            break;
                        default:
/* 8 */                     j = Long.parseLong(str);
                            break;
                    }
/* 12 */            return Long.valueOf(j);
                }
            }
