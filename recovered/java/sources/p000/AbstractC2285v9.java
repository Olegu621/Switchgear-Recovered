            package p000;

            import android.content.ComponentName;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            
            /* JADX INFO: renamed from: v9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2285v9 {
                /* JADX INFO: renamed from: a */
                public static ServiceInfo m9230a(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) throws PackageManager.NameNotFoundException {
/* 1 */             return packageManager.getServiceInfo(componentName, componentInfoFlags);
                }

                /* JADX INFO: renamed from: b */
                public static PackageManager.ComponentInfoFlags m9231b(long j) {
/* 1 */             return PackageManager.ComponentInfoFlags.of(j);
                }
            }
