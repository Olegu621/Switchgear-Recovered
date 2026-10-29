            package p000;

            import androidx.appcompat.app.AppCompatActivity;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xm2 implements Iterable {

                /* JADX INFO: renamed from: a */
                public final ArrayList f19249a = new ArrayList();

                /* JADX INFO: renamed from: b */
                public final AppCompatActivity f19250b;

                public xm2(AppCompatActivity appCompatActivity) {
/* 11 */            this.f19250b = appCompatActivity;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return this.f19249a.iterator();
                }
            }
