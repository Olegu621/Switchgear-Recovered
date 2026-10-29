            package p000;

            import android.content.Context;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import androidx.appcompat.widget.ActionBarContextView;
            import androidx.appcompat.widget.C0062b;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hg2 extends AbstractC1778j2 implements hg1 {

                /* JADX INFO: renamed from: c */
                public Context f9068c;

                /* JADX INFO: renamed from: d */
                public ActionBarContextView f9069d;

                /* JADX INFO: renamed from: e */
                public C0210cb f9070e;

                /* JADX INFO: renamed from: f */
                public WeakReference f9071f;

                /* JADX INFO: renamed from: i */
                public boolean f9072i;

                /* JADX INFO: renamed from: v */
                public jg1 f9073v;

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: a */
                public final void mo4210a() {
/* 3 */             if (this.f9072i) {
/* 5 */                 return;
                    }
/* 7 */             this.f9072i = true;
/* 11 */            this.f9070e.mo1583d(this);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: b */
                public final View mo4211b() {
/* 1 */             WeakReference weakReference = this.f9071f;
/* 3 */             if (weakReference != null) {
/* 9 */                 return (View) weakReference.get();
                    }
/* 12 */            return null;
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public final boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
/* 7 */             return ((InterfaceC1013i2) this.f9070e.f2804b).mo1582c(this, menuItem);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: d */
                public final jg1 mo4212d() {
/* 1 */             return this.f9073v;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: e */
                public final MenuInflater mo4213e() {
/* 9 */             return new yi2(this.f9069d.getContext());
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: f */
                public final CharSequence mo4214f() {
/* 3 */             return this.f9069d.getSubtitle();
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: g */
                public final CharSequence mo4215g() {
/* 3 */             return this.f9069d.getTitle();
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: h */
                public final void mo4216h() {
/* 5 */             this.f9070e.mo1587h(this, this.f9073v);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: i */
                public final boolean mo4217i() {
/* 3 */             return this.f9069d.f420g0;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: j */
                public final void mo4218j(View view) {
/* 3 */             this.f9069d.setCustomView(view);
/* 15 */            this.f9071f = view != null ? new WeakReference(view) : null;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: k */
                public final void mo4219k(int i) {
/* 7 */             mo4220m(this.f9068c.getString(i));
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                public final void mo3407l(jg1 jg1Var) {
/* 1 */             mo4216h();
/* 6 */             C0062b c0062b = this.f9069d.f414d;
/* 8 */             if (c0062b != null) {
/* 10 */                c0062b.m428n();
                    }
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: m */
                public final void mo4220m(CharSequence charSequence) {
/* 3 */             this.f9069d.setSubtitle(charSequence);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: n */
                public final void mo4221n(int i) {
/* 7 */             mo4222o(this.f9068c.getString(i));
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: o */
                public final void mo4222o(CharSequence charSequence) {
/* 3 */             this.f9069d.setTitle(charSequence);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: p */
                public final void mo4223p(boolean z) {
/* 1 */             this.f12018b = z;
/* 5 */             this.f9069d.setTitleOptional(z);
                }
            }
