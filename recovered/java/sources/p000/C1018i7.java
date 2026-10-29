            package p000;

            import android.content.DialogInterface;
            import android.view.View;
            import android.widget.AdapterView;
            
            /* JADX INFO: renamed from: i7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1018i7 implements AdapterView.OnItemClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1917m7 f9476a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1783j7 f9477b;

                public C1018i7(C1783j7 c1783j7, C1917m7 c1917m7) {
/* 4 */             this.f9477b = c1783j7;
/* 6 */             this.f9476a = c1917m7;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 1 */             C1783j7 c1783j7 = this.f9477b;
/* 3 */             DialogInterface.OnClickListener onClickListener = c1783j7.f12120p;
/* 5 */             C1917m7 c1917m7 = this.f9476a;
/* 9 */             onClickListener.onClick(c1917m7.f13614b, i);
/* 14 */            if (c1783j7.f12122r) {
/* 21 */                return;
                    }
/* 18 */            c1917m7.f13614b.dismiss();
                }
            }
