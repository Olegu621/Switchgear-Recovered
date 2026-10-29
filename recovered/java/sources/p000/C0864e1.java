            package p000;

            import android.view.accessibility.AccessibilityNodeInfo;
            
            /* JADX INFO: renamed from: e1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0864e1 {

                /* JADX INFO: renamed from: a */
                public final Object f7471a;

                public C0864e1(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
/* 4 */             this.f7471a = collectionItemInfo;
                }

                /* JADX INFO: renamed from: a */
                public static C0864e1 m3291a(int i, int i2, int i3, int i4, boolean z) {
/* 13 */            return new C0864e1(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
                }
            }
