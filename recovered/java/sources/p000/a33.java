            package p000;

            import android.view.ContentInfo;
            import android.view.View;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class a33 {
                /* JADX INFO: renamed from: a */
                public static String[] m48a(View view) {
/* 1 */             return view.getReceiveContentMimeTypes();
                }

                /* JADX INFO: renamed from: b */
                public static l00 m49b(View view, l00 l00Var) {
/* 3 */             ContentInfo contentInfoMo5629b = l00Var.f13067a.mo5629b();
/* 7 */             Objects.requireNonNull(contentInfoMo5629b);
/* 10 */            ContentInfo contentInfoM4063i = h00.m4063i(contentInfoMo5629b);
/* 14 */            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM4063i);
/* 18 */            if (contentInfoPerformReceiveContent == null) {
/* 20 */                return null;
                    }
                    return contentInfoPerformReceiveContent == contentInfoM4063i ? l00Var : new l00(new qc3(contentInfoPerformReceiveContent));
                }

                /* JADX INFO: renamed from: c */
                public static void m50c(View view, String[] strArr, cq1 cq1Var) {
/* 1 */             if (cq1Var == null) {
/* 4 */                 view.setOnReceiveContentListener(strArr, null);
                    } else {
/* 13 */                view.setOnReceiveContentListener(strArr, new b33(cq1Var));
                    }
                }
            }
