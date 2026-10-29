            package p000;

            import android.os.Build;
            
            /* JADX INFO: renamed from: k9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C1823k9 extends AbstractC1882l9 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f12655d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1823k9(int i, String str, String str2) {
/* 3 */             super(str, str2);
/* 1 */             this.f12655d = i;
                }

                @Override // p000.AbstractC1882l9
                /* JADX INFO: renamed from: a */
                public final boolean mo6026a() {
                    switch (this.f12655d) {
                        case 0:
/* 50 */                    return true;
                        case 1:
/* 48 */                    return true;
                        case 2:
/* 46 */                    return false;
                        case 3:
                            return Build.VERSION.SDK_INT >= 26;
                        case 4:
                            return Build.VERSION.SDK_INT >= 27;
                        case 5:
                            return Build.VERSION.SDK_INT >= 28;
                        default:
                            return Build.VERSION.SDK_INT >= 29;
                    }
                }
            }
