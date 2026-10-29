            package p000;

            import dalvik.system.PathClassLoader;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sf3 extends PathClassLoader {
                @Override // java.lang.ClassLoader
                public final Class loadClass(String str, boolean z) {
/* 7 */             if (!str.startsWith("java.") && !str.startsWith("android.")) {
                        try {
/* 17 */                    return findClass(str);
                        } catch (ClassNotFoundException unused) {
                        }
                    }
/* 22 */            return super.loadClass(str, z);
                }
            }
