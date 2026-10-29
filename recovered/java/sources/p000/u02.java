            package p000;

            import java.io.File;
            import java.io.FilenameFilter;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u02 implements FilenameFilter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f17326a;

                public u02(String str) {
/* 4 */             this.f17326a = str;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
/* 3 */             return str.startsWith(this.f17326a);
                }
            }
