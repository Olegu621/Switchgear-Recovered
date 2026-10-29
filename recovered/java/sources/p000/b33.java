            package p000;

            import android.view.ContentInfo;
            import android.view.OnReceiveContentListener;
            import android.view.View;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b33 implements OnReceiveContentListener {

                /* JADX INFO: renamed from: a */
                public final cq1 f2197a;

                public b33(cq1 cq1Var) {
/* 4 */             this.f2197a = cq1Var;
                }

                public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
/* 8 */             l00 l00Var = new l00(new qc3(contentInfo));
/* 15 */            l00 l00VarM7507a = ((pn2) this.f2197a).m7507a(view, l00Var);
/* 19 */            if (l00VarM7507a == null) {
/* 21 */                return null;
                    }
/* 23 */            if (l00VarM7507a == l00Var) {
/* 25 */                return contentInfo;
                    }
/* 28 */            ContentInfo contentInfoMo5629b = l00VarM7507a.f13067a.mo5629b();
/* 32 */            Objects.requireNonNull(contentInfoMo5629b);
/* 35 */            return h00.m4063i(contentInfoMo5629b);
                }
            }
