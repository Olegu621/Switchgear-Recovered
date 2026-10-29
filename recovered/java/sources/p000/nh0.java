            package p000;

            import android.net.Uri;
            import androidx.core.content.FileProvider;
            import java.io.File;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nh0 implements mh0 {

                /* JADX INFO: renamed from: a */
                public final String f14267a;

                /* JADX INFO: renamed from: b */
                public final HashMap f14268b = new HashMap();

                public nh0(String str) {
/* 11 */            this.f14267a = str;
                }

                /* JADX INFO: renamed from: a */
                public static boolean m6977a(String str, String str2) {
/* 1 */             String strRemoveTrailingSlash = FileProvider.removeTrailingSlash(str);
/* 1 */             String strRemoveTrailingSlash2 = FileProvider.removeTrailingSlash(str2);
/* 13 */            if (strRemoveTrailingSlash.equals(strRemoveTrailingSlash2)) {
/* 41 */                return true;
                    }
/* 17 */            StringBuilder sb = new StringBuilder();
/* 20 */            sb.append(strRemoveTrailingSlash2);
/* 25 */            sb.append('/');
                    return strRemoveTrailingSlash.startsWith(sb.toString());
                }

                /* JADX INFO: renamed from: b */
                public final File m6978b(Uri uri) {
/* 1 */             String encodedPath = uri.getEncodedPath();
/* 8 */             int iIndexOf = encodedPath.indexOf(47, 1);
/* 16 */            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
/* 25 */            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
/* 35 */            File file = (File) this.f14268b.get(strDecode);
/* 38 */            if (file == null) {
/* 80 */                s80.m8430k(uri, "Unable to find configured root for ");
/* 37 */                return null;
                    }
/* 42 */            File file2 = new File(file, strDecode2);
                    try {
/* 45 */                File canonicalFile = file2.getCanonicalFile();
/* 61 */                if (m6977a(canonicalFile.getPath(), file.getPath())) {
/* 63 */                    return canonicalFile;
                        }
/* 71 */                throw new SecurityException("Resolved path jumped beyond configured root");
                    } catch (IOException unused) {
/* 74 */                s80.m8430k(file2, "Failed to resolve canonical path for ");
/* 37 */                return null;
                    }
                }
            }
