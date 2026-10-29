            package p000;

            import java.io.File;
            import java.io.IOException;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 49 */    public class uh0 extends IOException {
                public uh0(File file, File file2, String str) {
/* 1 */             file.getClass();
/* 10 */            StringBuilder sb = new StringBuilder(file.toString());
/* 13 */            if (file2 != null) {
/* 29 */                sb.append(" -> " + file2);
                    }
/* 32 */            if (str != null) {
/* 40 */                sb.append(": ".concat(str));
                    }
/* 47 */            super(sb.toString());
                }

/* 50 */        public /* synthetic */ uh0(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 51 */            this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
                }
            }
