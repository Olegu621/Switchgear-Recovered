            package p000;

            import android.view.LayoutInflater;
            import androidx.activity.ComponentActivity;
            import androidx.appcompat.app.AppCompatActivity;
            
            /* JADX INFO: renamed from: aa */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0012aa implements xp1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AppCompatActivity f135a;

                public C0012aa(AppCompatActivity appCompatActivity) {
/* 4 */             this.f135a = appCompatActivity;
                }

                @Override // p000.xp1
                /* JADX INFO: renamed from: a */
                public final void mo126a(ComponentActivity componentActivity) {
/* 1 */             AppCompatActivity appCompatActivity = this.f135a;
/* 3 */             AbstractC1021ia delegate = appCompatActivity.getDelegate();
/* 8 */             LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) delegate;
/* 12 */            LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C2324wa.f18510V);
/* 20 */            if (layoutInflaterFrom.getFactory() == null) {
/* 22 */                layoutInflaterFrom.setFactory2(layoutInflaterFactory2C2324wa);
                    } else {
/* 26 */                layoutInflaterFrom.getFactory2();
                    }
/* 35 */            appCompatActivity.getSavedStateRegistry().m9722a("androidx:appcompat");
/* 38 */            delegate.mo4502d();
                }
            }
