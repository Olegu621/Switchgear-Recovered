            package p000;

            import android.content.DialogInterface;
            import android.graphics.drawable.Drawable;
            import android.widget.ListAdapter;
            import androidx.appcompat.app.AlertController$RecycleListView;
            import androidx.appcompat.widget.AppCompatSpinner;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: renamed from: hb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class DialogInterfaceOnClickListenerC0985hb implements InterfaceC1921mb, DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: a */
                public DialogInterfaceC1991o7 f8992a;

                /* JADX INFO: renamed from: b */
                public C1022ib f8993b;

                /* JADX INFO: renamed from: c */
                public CharSequence f8994c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AppCompatSpinner f8995d;

                public DialogInterfaceOnClickListenerC0985hb(AppCompatSpinner appCompatSpinner) {
/* 4 */             this.f8995d = appCompatSpinner;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: a */
                public final boolean mo4138a() {
/* 1 */             DialogInterfaceC1991o7 dialogInterfaceC1991o7 = this.f8992a;
/* 3 */             if (dialogInterfaceC1991o7 != null) {
/* 5 */                 return dialogInterfaceC1991o7.isShowing();
                    }
/* 10 */            return false;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: b */
                public final int mo4139b() {
/* 1 */             return 0;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: d */
                public final void mo4140d(int i) {
/* 5 */             AbstractC1245n0.m4876d("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
                }

                @Override // p000.InterfaceC1921mb
                public final void dismiss() {
/* 1 */             DialogInterfaceC1991o7 dialogInterfaceC1991o7 = this.f8992a;
/* 3 */             if (dialogInterfaceC1991o7 != null) {
/* 5 */                 dialogInterfaceC1991o7.dismiss();
/* 9 */                 this.f8992a = null;
                    }
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: e */
                public final CharSequence mo4141e() {
/* 1 */             return this.f8994c;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: f */
                public final Drawable mo4142f() {
/* 1 */             return null;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: g */
                public final void mo4143g(CharSequence charSequence) {
/* 1 */             this.f8994c = charSequence;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: h */
                public final void mo4144h(Drawable drawable) {
/* 5 */             AbstractC1245n0.m4876d("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: k */
                public final void mo4145k(int i) {
/* 5 */             AbstractC1245n0.m4876d("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: l */
                public final void mo4146l(int i) {
/* 5 */             AbstractC1245n0.m4876d("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: m */
                public final void mo4147m(int i, int i2) {
/* 3 */             if (this.f8993b == null) {
/* 5 */                 return;
                    }
/* 8 */             AppCompatSpinner appCompatSpinner = this.f8995d;
/* 14 */            C1954n7 c1954n7 = new C1954n7(appCompatSpinner.getPopupContext());
/* 19 */            C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 21 */            CharSequence charSequence = this.f8994c;
/* 23 */            if (charSequence != null) {
/* 25 */                c1783j7.f12108d = charSequence;
                    }
/* 27 */            C1022ib c1022ib = this.f8993b;
/* 29 */            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
/* 33 */            c1783j7.f12119o = c1022ib;
/* 35 */            c1783j7.f12120p = this;
/* 37 */            c1783j7.f12123s = selectedItemPosition;
/* 40 */            c1783j7.f12122r = true;
/* 42 */            DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
/* 46 */            this.f8992a = dialogInterfaceC1991o7M6897b;
/* 50 */            AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC1991o7M6897b.f14655f.f13618f;
/* 52 */            alertController$RecycleListView.setTextDirection(i);
/* 55 */            alertController$RecycleListView.setTextAlignment(i2);
/* 60 */            this.f8992a.show();
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: n */
                public final int mo4148n() {
/* 1 */             return 0;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: o */
                public final void mo373o(ListAdapter listAdapter) {
/* 3 */             this.f8993b = (C1022ib) listAdapter;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
/* 1 */             AppCompatSpinner appCompatSpinner = this.f8995d;
/* 3 */             appCompatSpinner.setSelection(i);
/* 10 */            if (appCompatSpinner.getOnItemClickListener() != null) {
/* 19 */                appCompatSpinner.performItemClick(null, i, this.f8993b.getItemId(i));
                    }
/* 22 */            dismiss();
                }
            }
