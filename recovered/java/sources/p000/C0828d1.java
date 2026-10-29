            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.view.accessibility.AccessibilityNodeInfo;
            
            /* JADX INFO: renamed from: d1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 39 */    public final class C0828d1 implements sg0, z82, ka3 {

                /* JADX INFO: renamed from: b */
                public static C0828d1 f6953b;

                /* JADX INFO: renamed from: a */
                public final Object f6954a;

                public C0828d1(int i) {
                    switch (i) {
                        case 5:
/* 23 */                    this.f6954a = new Object();
/* 37 */                    new Handler(Looper.getMainLooper(), new kf2(this, 0));
                            break;
                        default:
/* 12 */                    this.f6954a = new Object();
                            break;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static C0828d1 m2904b(int i, int i2, int i3) {
/* 8 */             return new C0828d1(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
                }

                @Override // p000.ma3
                /* JADX INFO: renamed from: a */
                public Object mo2449a() {
/* 1 */             return this.f6954a;
                }

                @Override // javax.inject.Provider
                public Object get() {
/* 1 */             return this.f6954a;
                }

/* 40 */        public /* synthetic */ C0828d1(Object obj) {
/* 41 */            this.f6954a = obj;
                }
            }
