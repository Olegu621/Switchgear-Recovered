            package p000;

            import java.io.File;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.text.C1848a;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class fi0 {
                /* JADX INFO: renamed from: a */
                public static final kh0 m3768a(File file) {
                    int length;
                    List list;
                    int iM6226B;
/* 1 */             String path = file.getPath();
/* 5 */             path.getClass();
/* 8 */             char c = File.separatorChar;
/* 12 */            int iM6226B2 = StringsKt.m6226B(path, c, 0, 4);
/* 17 */            if (iM6226B2 == 0) {
/* 23 */                if (path.length() <= 1 || path.charAt(1) != c || (iM6226B = StringsKt.m6226B(path, c, 2, 4)) < 0) {
/* 52 */                    length = 1;
                        } else {
/* 39 */                    int iM6226B3 = StringsKt.m6226B(path, c, iM6226B + 1, 4);
/* 47 */                    length = iM6226B3 >= 0 ? iM6226B3 + 1 : path.length();
                        }
                    } else if (iM6226B2 <= 0 || path.charAt(iM6226B2 - 1) != ':') {
/* 98 */                length = (iM6226B2 == -1 && path.length() > 0 && C1848a.m6251b(path.charAt(path.length() - 1), ':', false)) ? path.length() : 0;
                    } else {
/* 66 */                length = iM6226B2 + 1;
                    }
/* 99 */            String strSubstring = path.substring(0, length);
/* 103 */           String strSubstring2 = path.substring(length);
/* 111 */           if (strSubstring2.length() == 0) {
/* 113 */               list = nd0.f14189a;
                    } else {
/* 120 */               List listM6235K = StringsKt.m6235K(strSubstring2, new char[]{c});
/* 132 */               ArrayList arrayList = new ArrayList(C2122qw.m8020h(listM6235K, 10));
/* 135 */               Iterator it = listM6235K.iterator();
/* 143 */               while (it.hasNext()) {
/* 156 */                   arrayList.add(new File((String) it.next()));
                        }
/* 160 */               list = arrayList;
                    }
/* 168 */           return new kh0(new File(strSubstring), list);
                }
            }
