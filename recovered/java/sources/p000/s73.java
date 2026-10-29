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
            public final class s73 extends AbstractC1778j2 implements hg1 {

                /* JADX INFO: renamed from: c */
                public final Context f16465c;

                /* JADX INFO: renamed from: d */
                public final jg1 f16466d;

                /* JADX INFO: renamed from: e */
                public C0210cb f16467e;

                /* JADX INFO: renamed from: f */
                public WeakReference f16468f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ t73 f16469i;

                public s73(t73 t73Var, Context context, C0210cb c0210cb) {
/* 4 */             this.f16469i = t73Var;
/* 6 */             this.f16465c = context;
/* 8 */             this.f16467e = c0210cb;
/* 12 */            jg1 jg1Var = new jg1(context);
/* 16 */            jg1Var.f12267l = 1;
/* 18 */            this.f16466d = jg1Var;
/* 20 */            jg1Var.f12260e = this;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: a */
                public final void mo4210a() {
/* 1 */             t73 t73Var = this.f16469i;
/* 5 */             if (t73Var.f16964i != this) {
/* 7 */                 return;
                    }
/* 8 */             boolean z = t73Var.f16971p;
/* 10 */            boolean z2 = t73Var.f16972q;
/* 12 */            if (z || z2) {
/* 23 */                t73Var.f16965j = this;
/* 27 */                t73Var.f16966k = this.f16467e;
                    } else {
/* 19 */                this.f16467e.mo1583d(this);
                    }
/* 30 */            this.f16467e = null;
/* 33 */            t73Var.m8725v(false);
/* 36 */            ActionBarContextView actionBarContextView = t73Var.f16961f;
/* 40 */            if (actionBarContextView.f406V == null) {
/* 42 */                actionBarContextView.m338e();
                    }
/* 49 */            t73Var.f16958c.setHideOnContentScrollEnabled(t73Var.f16977v);
/* 52 */            t73Var.f16964i = null;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: b */
                public final View mo4211b() {
/* 1 */             WeakReference weakReference = this.f16468f;
/* 3 */             if (weakReference != null) {
/* 9 */                 return (View) weakReference.get();
                    }
/* 12 */            return null;
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public final boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
/* 1 */             C0210cb c0210cb = this.f16467e;
/* 3 */             if (c0210cb != null) {
/* 9 */                 return ((InterfaceC1013i2) c0210cb.f2804b).mo1582c(this, menuItem);
                    }
/* 14 */            return false;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: d */
                public final jg1 mo4212d() {
/* 1 */             return this.f16466d;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: e */
                public final MenuInflater mo4213e() {
/* 5 */             return new yi2(this.f16465c);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: f */
                public final CharSequence mo4214f() {
/* 5 */             return this.f16469i.f16961f.getSubtitle();
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: g */
                public final CharSequence mo4215g() {
/* 5 */             return this.f16469i.f16961f.getTitle();
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: h */
                public final void mo4216h() {
/* 5 */             if (this.f16469i.f16964i != this) {
/* 7 */                 return;
                    }
/* 8 */             jg1 jg1Var = this.f16466d;
/* 10 */            jg1Var.m5817y();
                    try {
/* 15 */                this.f16467e.mo1587h(this, jg1Var);
                    } finally {
/* 23 */                jg1Var.m5816x();
                    }
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: i */
                public final boolean mo4217i() {
/* 5 */             return this.f16469i.f16961f.f420g0;
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: j */
                public final void mo4218j(View view) {
/* 5 */             this.f16469i.f16961f.setCustomView(view);
/* 13 */            this.f16468f = new WeakReference(view);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: k */
                public final void mo4219k(int i) {
/* 13 */            mo4220m(this.f16469i.f16956a.getResources().getString(i));
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                public final void mo3407l(jg1 jg1Var) {
/* 3 */             if (this.f16467e == null) {
/* 20 */                return;
                    }
/* 6 */             mo4216h();
/* 13 */            C0062b c0062b = this.f16469i.f16961f.f414d;
/* 15 */            if (c0062b != null) {
/* 17 */                c0062b.m428n();
                    }
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: m */
                public final void mo4220m(CharSequence charSequence) {
/* 5 */             this.f16469i.f16961f.setSubtitle(charSequence);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: n */
                public final void mo4221n(int i) {
/* 13 */            mo4222o(this.f16469i.f16956a.getResources().getString(i));
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: o */
                public final void mo4222o(CharSequence charSequence) {
/* 5 */             this.f16469i.f16961f.setTitle(charSequence);
                }

                @Override // p000.AbstractC1778j2
                /* JADX INFO: renamed from: p */
                public final void mo4223p(boolean z) {
/* 1 */             this.f12018b = z;
/* 7 */             this.f16469i.f16961f.setTitleOptional(z);
                }
            }
