            package p000;

            import android.content.Context;
            import android.view.ActionMode;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class ui2 extends ActionMode {

                /* JADX INFO: renamed from: a */
                public final Context f17546a;

                /* JADX INFO: renamed from: b */
                public final AbstractC1778j2 f17547b;

                public ui2(Context context, AbstractC1778j2 abstractC1778j2) {
/* 4 */             this.f17546a = context;
/* 6 */             this.f17547b = abstractC1778j2;
                }

                @Override // android.view.ActionMode
                public final void finish() {
/* 3 */             this.f17547b.mo4210a();
                }

                @Override // android.view.ActionMode
                public final View getCustomView() {
/* 3 */             return this.f17547b.mo4211b();
                }

                @Override // android.view.ActionMode
                public final Menu getMenu() {
/* 11 */            return new ih1(this.f17546a, this.f17547b.mo4212d());
                }

                @Override // android.view.ActionMode
                public final MenuInflater getMenuInflater() {
/* 3 */             return this.f17547b.mo4213e();
                }

                @Override // android.view.ActionMode
                public final CharSequence getSubtitle() {
/* 3 */             return this.f17547b.mo4214f();
                }

                @Override // android.view.ActionMode
                public final Object getTag() {
/* 3 */             return this.f17547b.f12017a;
                }

                @Override // android.view.ActionMode
                public final CharSequence getTitle() {
/* 3 */             return this.f17547b.mo4215g();
                }

                @Override // android.view.ActionMode
                public final boolean getTitleOptionalHint() {
/* 3 */             return this.f17547b.f12018b;
                }

                @Override // android.view.ActionMode
                public final void invalidate() {
/* 3 */             this.f17547b.mo4216h();
                }

                @Override // android.view.ActionMode
                public final boolean isTitleOptional() {
/* 3 */             return this.f17547b.mo4217i();
                }

                @Override // android.view.ActionMode
                public final void setCustomView(View view) {
/* 3 */             this.f17547b.mo4218j(view);
                }

                @Override // android.view.ActionMode
                public final void setSubtitle(CharSequence charSequence) {
/* 3 */             this.f17547b.mo4220m(charSequence);
                }

                @Override // android.view.ActionMode
                public final void setTag(Object obj) {
/* 3 */             this.f17547b.f12017a = obj;
                }

                @Override // android.view.ActionMode
                public final void setTitle(CharSequence charSequence) {
/* 3 */             this.f17547b.mo4222o(charSequence);
                }

                @Override // android.view.ActionMode
                public final void setTitleOptionalHint(boolean z) {
/* 3 */             this.f17547b.mo4223p(z);
                }

                @Override // android.view.ActionMode
/* 6 */         public final void setSubtitle(int i) {
/* 7 */             this.f17547b.mo4219k(i);
                }

                @Override // android.view.ActionMode
/* 6 */         public final void setTitle(int i) {
/* 7 */             this.f17547b.mo4221n(i);
                }
            }
