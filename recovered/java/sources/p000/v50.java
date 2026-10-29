            package p000;

            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v50 extends xt0 {
                @Override // p000.xt0
                /* JADX INFO: renamed from: b */
                public final Signature[] mo9224b(PackageManager packageManager, String str) {
/* 7 */             return packageManager.getPackageInfo(str, 64).signatures;
                }
            }
