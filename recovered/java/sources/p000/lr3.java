            package p000;

            import android.content.Context;
            import java.io.File;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lr3 {

                /* JADX INFO: renamed from: a */
                public final Context f13465a;

                public lr3(Context context) {
/* 4 */             this.f13465a = context;
                }

                /* JADX INFO: renamed from: a */
                public static long m6527a(File file) {
/* 5 */             if (!file.isDirectory()) {
/* 7 */                 return file.length();
                    }
/* 12 */            File[] fileArrListFiles = file.listFiles();
/* 16 */            long jM6527a = 0;
/* 18 */            if (fileArrListFiles != null) {
/* 22 */                for (File file2 : fileArrListFiles) {
/* 30 */                    jM6527a += m6527a(file2);
                        }
                    }
/* 34 */            return jM6527a;
                }
            }
