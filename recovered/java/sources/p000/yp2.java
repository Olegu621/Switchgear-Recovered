            package p000;

            import android.content.Context;
            import android.view.View;
            import android.view.Window;
            import androidx.appcompat.widget.C0073m;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yp2 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final C0004a2 f19745a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0073m f19746b;

                public yp2(C0073m c0073m) {
/* 4 */             this.f19746b = c0073m;
/* 10 */            Context context = c0073m.f762a.getContext();
/* 14 */            CharSequence charSequence = c0073m.f769h;
/* 16 */            C0004a2 c0004a2 = new C0004a2();
/* 21 */            c0004a2.f37e = 4096;
/* 23 */            c0004a2.f39g = 4096;
/* 26 */            c0004a2.f44l = null;
/* 28 */            c0004a2.f45m = null;
/* 31 */            c0004a2.f46n = false;
/* 33 */            c0004a2.f47o = false;
/* 37 */            c0004a2.f48p = 16;
/* 39 */            c0004a2.f41i = context;
/* 41 */            c0004a2.f33a = charSequence;
/* 43 */            this.f19745a = c0004a2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             C0073m c0073m = this.f19746b;
/* 3 */             Window.Callback callback = c0073m.f772k;
/* 5 */             if (callback == null || !c0073m.f773l) {
/* 17 */                return;
                    }
/* 14 */            callback.onMenuItemSelected(0, this.f19745a);
                }
            }
