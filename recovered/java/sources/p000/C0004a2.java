            package p000;

            import android.R;
            import android.content.Context;
            import android.content.Intent;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.view.ActionProvider;
            import android.view.ContextMenu;
            import android.view.KeyEvent;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            
            /* JADX INFO: renamed from: a2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public final class C0004a2 implements zi2 {

                /* JADX INFO: renamed from: a */
                public CharSequence f33a;

                /* JADX INFO: renamed from: b */
                public CharSequence f34b;

                /* JADX INFO: renamed from: c */
                public Intent f35c;

                /* JADX INFO: renamed from: d */
                public char f36d;

                /* JADX INFO: renamed from: e */
                public int f37e;

                /* JADX INFO: renamed from: f */
                public char f38f;

                /* JADX INFO: renamed from: g */
                public int f39g;

                /* JADX INFO: renamed from: h */
                public Drawable f40h;

                /* JADX INFO: renamed from: i */
                public Context f41i;

                /* JADX INFO: renamed from: j */
                public CharSequence f42j;

                /* JADX INFO: renamed from: k */
                public CharSequence f43k;

                /* JADX INFO: renamed from: l */
                public ColorStateList f44l;

                /* JADX INFO: renamed from: m */
                public PorterDuff.Mode f45m;

                /* JADX INFO: renamed from: n */
                public boolean f46n;

                /* JADX INFO: renamed from: o */
                public boolean f47o;

                /* JADX INFO: renamed from: p */
                public int f48p;

                @Override // p000.zi2
                /* JADX INFO: renamed from: a */
                public final zi2 mo37a(AbstractC1815k2 abstractC1815k2) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // p000.zi2
                /* JADX INFO: renamed from: b */
                public final AbstractC1815k2 mo38b() {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: c */
                public final void m39c() {
/* 1 */             Drawable drawable = this.f40h;
/* 3 */             if (drawable != null) {
/* 7 */                 if (this.f46n || this.f47o) {
/* 13 */                    this.f40h = drawable;
/* 15 */                    Drawable drawableMutate = drawable.mutate();
/* 19 */                    this.f40h = drawableMutate;
/* 23 */                    if (this.f46n) {
/* 27 */                        s90.m8448h(drawableMutate, this.f44l);
                            }
/* 32 */                    if (this.f47o) {
/* 38 */                        s90.m8449i(this.f40h, this.f45m);
                            }
                        }
                    }
                }

                @Override // android.view.MenuItem
                public final boolean collapseActionView() {
/* 1 */             return false;
                }

                @Override // android.view.MenuItem
                public final boolean expandActionView() {
/* 1 */             return false;
                }

                @Override // android.view.MenuItem
                public final ActionProvider getActionProvider() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // android.view.MenuItem
                public final View getActionView() {
/* 1 */             return null;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final int getAlphabeticModifiers() {
/* 1 */             return this.f39g;
                }

                @Override // android.view.MenuItem
                public final char getAlphabeticShortcut() {
/* 1 */             return this.f38f;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final CharSequence getContentDescription() {
/* 1 */             return this.f42j;
                }

                @Override // android.view.MenuItem
                public final int getGroupId() {
/* 1 */             return 0;
                }

                @Override // android.view.MenuItem
                public final Drawable getIcon() {
/* 1 */             return this.f40h;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final ColorStateList getIconTintList() {
/* 1 */             return this.f44l;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final PorterDuff.Mode getIconTintMode() {
/* 1 */             return this.f45m;
                }

                @Override // android.view.MenuItem
                public final Intent getIntent() {
/* 1 */             return this.f35c;
                }

                @Override // android.view.MenuItem
                public final int getItemId() {
/* 1 */             return R.id.home;
                }

                @Override // android.view.MenuItem
                public final ContextMenu.ContextMenuInfo getMenuInfo() {
/* 1 */             return null;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final int getNumericModifiers() {
/* 1 */             return this.f37e;
                }

                @Override // android.view.MenuItem
                public final char getNumericShortcut() {
/* 1 */             return this.f36d;
                }

                @Override // android.view.MenuItem
                public final int getOrder() {
/* 1 */             return 0;
                }

                @Override // android.view.MenuItem
                public final SubMenu getSubMenu() {
/* 1 */             return null;
                }

                @Override // android.view.MenuItem
                public final CharSequence getTitle() {
/* 1 */             return this.f33a;
                }

                @Override // android.view.MenuItem
                public final CharSequence getTitleCondensed() {
/* 1 */             CharSequence charSequence = this.f34b;
                    return charSequence != null ? charSequence : this.f33a;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final CharSequence getTooltipText() {
/* 1 */             return this.f43k;
                }

                @Override // android.view.MenuItem
                public final boolean hasSubMenu() {
/* 1 */             return false;
                }

                @Override // android.view.MenuItem
                public final boolean isActionViewExpanded() {
/* 1 */             return false;
                }

                @Override // android.view.MenuItem
                public final boolean isCheckable() {
                    return (this.f48p & 1) != 0;
                }

                @Override // android.view.MenuItem
                public final boolean isChecked() {
                    return (this.f48p & 2) != 0;
                }

                @Override // android.view.MenuItem
                public final boolean isEnabled() {
                    return (this.f48p & 16) != 0;
                }

                @Override // android.view.MenuItem
                public final boolean isVisible() {
                    return (this.f48p & 8) == 0;
                }

                @Override // android.view.MenuItem
                public final MenuItem setActionProvider(ActionProvider actionProvider) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // android.view.MenuItem
                public final MenuItem setActionView(View view) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setAlphabeticShortcut(char c, int i) {
/* 5 */             this.f38f = Character.toLowerCase(c);
/* 11 */            this.f39g = KeyEvent.normalizeMetaState(i);
/* 13 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setCheckable(boolean z) {
/* 6 */             this.f48p = (z ? 1 : 0) | (this.f48p & (-2));
/* 8 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setChecked(boolean z) {
/* 11 */            this.f48p = (z ? 2 : 0) | (this.f48p & (-3));
/* 13 */            return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final zi2 setContentDescription(CharSequence charSequence) {
/* 1 */             this.f42j = charSequence;
/* 3 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setEnabled(boolean z) {
/* 12 */            this.f48p = (z ? 16 : 0) | (this.f48p & (-17));
/* 14 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIcon(int i) {
/* 7 */             this.f40h = v00.getDrawable(this.f41i, i);
/* 9 */             m39c();
/* 12 */            return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setIconTintList(ColorStateList colorStateList) {
/* 1 */             this.f44l = colorStateList;
/* 4 */             this.f46n = true;
/* 6 */             m39c();
/* 9 */             return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
/* 1 */             this.f45m = mode;
/* 4 */             this.f47o = true;
/* 6 */             m39c();
/* 9 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIntent(Intent intent) {
/* 1 */             this.f35c = intent;
/* 3 */             return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setNumericShortcut(char c, int i) {
/* 1 */             this.f36d = c;
/* 7 */             this.f37e = KeyEvent.normalizeMetaState(i);
/* 9 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // android.view.MenuItem
                public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
/* 1 */             return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setShortcut(char c, char c2, int i, int i2) {
/* 1 */             this.f36d = c;
/* 7 */             this.f37e = KeyEvent.normalizeMetaState(i);
/* 13 */            this.f38f = Character.toLowerCase(c2);
/* 19 */            this.f39g = KeyEvent.normalizeMetaState(i2);
/* 21 */            return this;
                }

                @Override // android.view.MenuItem
                public final void setShowAsAction(int i) {
                }

                @Override // android.view.MenuItem
                public final MenuItem setShowAsActionFlags(int i) {
/* 1 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setTitle(int i) {
/* 11 */            this.f33a = this.f41i.getResources().getString(i);
/* 13 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setTitleCondensed(CharSequence charSequence) {
/* 1 */             this.f34b = charSequence;
/* 3 */             return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final zi2 setTooltipText(CharSequence charSequence) {
/* 1 */             this.f43k = charSequence;
/* 3 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setVisible(boolean z) {
/* 11 */            this.f48p = (this.f48p & 8) | (z ? 0 : 8);
/* 13 */            return this;
                }

                @Override // android.view.MenuItem
/* 3 */         public final MenuItem setContentDescription(CharSequence charSequence) {
/* 4 */             this.f42j = charSequence;
                    return this;
                }

                @Override // android.view.MenuItem
/* 3 */         public final MenuItem setTooltipText(CharSequence charSequence) {
/* 4 */             this.f43k = charSequence;
                    return this;
                }

                @Override // android.view.MenuItem
/* 6 */         public final MenuItem setActionView(int i) {
/* 7 */             throw new UnsupportedOperationException();
                }

                @Override // android.view.MenuItem
/* 9 */         public final MenuItem setNumericShortcut(char c) {
/* 10 */            this.f36d = c;
                    return this;
                }

                @Override // android.view.MenuItem
/* 12 */        public final MenuItem setIcon(Drawable drawable) {
/* 13 */            this.f40h = drawable;
/* 14 */            m39c();
                    return this;
                }

                @Override // android.view.MenuItem
/* 13 */        public final MenuItem setAlphabeticShortcut(char c) {
/* 14 */            this.f38f = Character.toLowerCase(c);
                    return this;
                }

                @Override // android.view.MenuItem
/* 13 */        public final MenuItem setTitle(CharSequence charSequence) {
/* 14 */            this.f33a = charSequence;
                    return this;
                }

                @Override // android.view.MenuItem
/* 21 */        public final MenuItem setShortcut(char c, char c2) {
/* 22 */            this.f36d = c;
/* 23 */            this.f38f = Character.toLowerCase(c2);
                    return this;
                }
            }
