            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.nio.file.Files;
            import java.nio.file.StandardCopyOption;
            
            /* JADX INFO: renamed from: f9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC0909f9 {
                /* JADX INFO: renamed from: a */
                public static boolean m3679a(File file, File file2) {
                    try {
/* 17 */                Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
/* 10 */                return true;
                    } catch (IOException unused) {
/* 1 */                 return false;
                    }
                }
            }
