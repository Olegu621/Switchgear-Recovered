            package p000;

            import android.view.View;
            import android.widget.AdapterView;
            import android.widget.PopupWindow;
            import androidx.appcompat.widget.ActivityChooserView;
            import androidx.appcompat.widget.C0062b;
            
            /* JADX INFO: renamed from: r2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnClickListenerC2129r2 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ActivityChooserView f15830a;

                public ViewOnClickListenerC2129r2(ActivityChooserView activityChooserView) {
/* 4 */             this.f15830a = activityChooserView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
/* 1 */             ActivityChooserView activityChooserView = this.f15830a;
/* 3 */             C2092q2 c2092q2 = activityChooserView.f477a;
/* 7 */             if (view == activityChooserView.f482f) {
/* 30 */                activityChooserView.m353a();
/* 33 */                c2092q2.getClass();
/* 37 */                throw null;
                    }
/* 11 */            if (view != activityChooserView.f480d) {
/* 29 */                throw new IllegalArgumentException();
                    }
/* 13 */            c2092q2.getClass();
/* 23 */            throw new IllegalStateException("No data model. Did you call #setDataModel?");
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C0062b c0062b;
                    jg1 jg1Var;
/* 1 */             ActivityChooserView activityChooserView = this.f15830a;
/* 3 */             PopupWindow.OnDismissListener onDismissListener = activityChooserView.f475U;
/* 5 */             if (onDismissListener != null) {
/* 7 */                 onDismissListener.onDismiss();
                    }
/* 10 */            AbstractC1815k2 abstractC1815k2 = activityChooserView.f483i;
/* 12 */            if (abstractC1815k2 == null || (c0062b = abstractC1815k2.f12562a) == null || (jg1Var = c0062b.f9606c) == null) {
/* 26 */                return;
                    }
/* 23 */            jg1Var.m5803c(false);
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 7 */             ((C2092q2) adapterView.getAdapter()).getClass();
/* 10 */            ActivityChooserView activityChooserView = this.f15830a;
/* 12 */            activityChooserView.m353a();
/* 17 */            activityChooserView.f477a.getClass();
/* 21 */            throw null;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
/* 1 */             ActivityChooserView activityChooserView = this.f15830a;
/* 5 */             if (view != activityChooserView.f482f) {
/* 19 */                throw new IllegalArgumentException();
                    }
/* 9 */             activityChooserView.f477a.getClass();
/* 13 */            throw null;
                }
            }
