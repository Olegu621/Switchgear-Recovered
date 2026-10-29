            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.view.ActionProvider;
            import android.view.CollapsibleActionView;
            import android.view.ContextMenu;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class wg1 extends AbstractC2211ta implements MenuItem {

                /* JADX INFO: renamed from: c */
                public final zi2 f18615c;

                /* JADX INFO: renamed from: d */
                public Method f18616d;

                public wg1(Context context, zi2 zi2Var) {
/* 1 */             super(context);
/* 4 */             if (zi2Var != null) {
/* 6 */                 this.f18615c = zi2Var;
                    } else {
/* 11 */                C1951n4.m6859j("Wrapped Object can not be null.");
/* 15 */                throw null;
                    }
                }

                @Override // android.view.MenuItem
                public final boolean collapseActionView() {
/* 3 */             return this.f18615c.collapseActionView();
                }

                @Override // android.view.MenuItem
                public final boolean expandActionView() {
/* 3 */             return this.f18615c.expandActionView();
                }

                @Override // android.view.MenuItem
                public final ActionProvider getActionProvider() {
/* 3 */             AbstractC1815k2 abstractC1815k2Mo38b = this.f18615c.mo38b();
/* 9 */             if (abstractC1815k2Mo38b instanceof tg1) {
/* 13 */                return ((tg1) abstractC1815k2Mo38b).f17088c;
                    }
/* 16 */            return null;
                }

                @Override // android.view.MenuItem
                public final View getActionView() {
/* 3 */             View actionView = this.f18615c.getActionView();
                    return actionView instanceof ug1 ? (View) ((ug1) actionView).f17519a : actionView;
                }

                @Override // android.view.MenuItem
                public final int getAlphabeticModifiers() {
/* 3 */             return this.f18615c.getAlphabeticModifiers();
                }

                @Override // android.view.MenuItem
                public final char getAlphabeticShortcut() {
/* 3 */             return this.f18615c.getAlphabeticShortcut();
                }

                @Override // android.view.MenuItem
                public final CharSequence getContentDescription() {
/* 3 */             return this.f18615c.getContentDescription();
                }

                @Override // android.view.MenuItem
                public final int getGroupId() {
/* 3 */             return this.f18615c.getGroupId();
                }

                @Override // android.view.MenuItem
                public final Drawable getIcon() {
/* 3 */             return this.f18615c.getIcon();
                }

                @Override // android.view.MenuItem
                public final ColorStateList getIconTintList() {
/* 3 */             return this.f18615c.getIconTintList();
                }

                @Override // android.view.MenuItem
                public final PorterDuff.Mode getIconTintMode() {
/* 3 */             return this.f18615c.getIconTintMode();
                }

                @Override // android.view.MenuItem
                public final Intent getIntent() {
/* 3 */             return this.f18615c.getIntent();
                }

                @Override // android.view.MenuItem
                public final int getItemId() {
/* 3 */             return this.f18615c.getItemId();
                }

                @Override // android.view.MenuItem
                public final ContextMenu.ContextMenuInfo getMenuInfo() {
/* 3 */             return this.f18615c.getMenuInfo();
                }

                @Override // android.view.MenuItem
                public final int getNumericModifiers() {
/* 3 */             return this.f18615c.getNumericModifiers();
                }

                @Override // android.view.MenuItem
                public final char getNumericShortcut() {
/* 3 */             return this.f18615c.getNumericShortcut();
                }

                @Override // android.view.MenuItem
                public final int getOrder() {
/* 3 */             return this.f18615c.getOrder();
                }

                @Override // android.view.MenuItem
                public final SubMenu getSubMenu() {
/* 3 */             return this.f18615c.getSubMenu();
                }

                @Override // android.view.MenuItem
                public final CharSequence getTitle() {
/* 3 */             return this.f18615c.getTitle();
                }

                @Override // android.view.MenuItem
                public final CharSequence getTitleCondensed() {
/* 3 */             return this.f18615c.getTitleCondensed();
                }

                @Override // android.view.MenuItem
                public final CharSequence getTooltipText() {
/* 3 */             return this.f18615c.getTooltipText();
                }

                @Override // android.view.MenuItem
                public final boolean hasSubMenu() {
/* 3 */             return this.f18615c.hasSubMenu();
                }

                @Override // android.view.MenuItem
                public final boolean isActionViewExpanded() {
/* 3 */             return this.f18615c.isActionViewExpanded();
                }

                @Override // android.view.MenuItem
                public final boolean isCheckable() {
/* 3 */             return this.f18615c.isCheckable();
                }

                @Override // android.view.MenuItem
                public final boolean isChecked() {
/* 3 */             return this.f18615c.isChecked();
                }

                @Override // android.view.MenuItem
                public final boolean isEnabled() {
/* 3 */             return this.f18615c.isEnabled();
                }

                @Override // android.view.MenuItem
                public final boolean isVisible() {
/* 3 */             return this.f18615c.isVisible();
                }

                @Override // android.view.MenuItem
                public final MenuItem setActionProvider(ActionProvider actionProvider) {
/* 3 */             tg1 tg1Var = new tg1(this, actionProvider);
/* 6 */             if (actionProvider == null) {
/* 9 */                 tg1Var = null;
                    }
/* 12 */            this.f18615c.mo37a(tg1Var);
/* 15 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setActionView(int i) {
/* 1 */             zi2 zi2Var = this.f18615c;
/* 3 */             zi2Var.setActionView(i);
/* 6 */             View actionView = zi2Var.getActionView();
/* 12 */            if (actionView instanceof CollapsibleActionView) {
/* 19 */                zi2Var.setActionView(new ug1(actionView));
                    }
/* 22 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setAlphabeticShortcut(char c) {
/* 3 */             this.f18615c.setAlphabeticShortcut(c);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setCheckable(boolean z) {
/* 3 */             this.f18615c.setCheckable(z);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setChecked(boolean z) {
/* 3 */             this.f18615c.setChecked(z);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setContentDescription(CharSequence charSequence) {
/* 3 */             this.f18615c.setContentDescription(charSequence);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setEnabled(boolean z) {
/* 3 */             this.f18615c.setEnabled(z);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIcon(Drawable drawable) {
/* 3 */             this.f18615c.setIcon(drawable);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIconTintList(ColorStateList colorStateList) {
/* 3 */             this.f18615c.setIconTintList(colorStateList);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
/* 3 */             this.f18615c.setIconTintMode(mode);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIntent(Intent intent) {
/* 3 */             this.f18615c.setIntent(intent);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setNumericShortcut(char c) {
/* 3 */             this.f18615c.setNumericShortcut(c);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
/* 12 */            this.f18615c.setOnActionExpandListener(onActionExpandListener != null ? new vg1(this, onActionExpandListener) : null);
/* 15 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
/* 12 */            this.f18615c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new wi2(this, onMenuItemClickListener) : null);
/* 15 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setShortcut(char c, char c2) {
/* 3 */             this.f18615c.setShortcut(c, c2);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final void setShowAsAction(int i) {
/* 3 */             this.f18615c.setShowAsAction(i);
                }

                @Override // android.view.MenuItem
                public final MenuItem setShowAsActionFlags(int i) {
/* 3 */             this.f18615c.setShowAsActionFlags(i);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setTitle(CharSequence charSequence) {
/* 3 */             this.f18615c.setTitle(charSequence);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setTitleCondensed(CharSequence charSequence) {
/* 3 */             this.f18615c.setTitleCondensed(charSequence);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setTooltipText(CharSequence charSequence) {
/* 3 */             this.f18615c.setTooltipText(charSequence);
/* 6 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setVisible(boolean z) {
/* 3 */             return this.f18615c.setVisible(z);
                }

                @Override // android.view.MenuItem
/* 6 */         public final MenuItem setAlphabeticShortcut(char c, int i) {
/* 7 */             this.f18615c.setAlphabeticShortcut(c, i);
                    return this;
                }

                @Override // android.view.MenuItem
/* 6 */         public final MenuItem setIcon(int i) {
/* 7 */             this.f18615c.setIcon(i);
                    return this;
                }

                @Override // android.view.MenuItem
/* 6 */         public final MenuItem setNumericShortcut(char c, int i) {
/* 7 */             this.f18615c.setNumericShortcut(c, i);
                    return this;
                }

                @Override // android.view.MenuItem
/* 6 */         public final MenuItem setShortcut(char c, char c2, int i, int i2) {
/* 7 */             this.f18615c.setShortcut(c, c2, i, i2);
                    return this;
                }

                @Override // android.view.MenuItem
/* 6 */         public final MenuItem setTitle(int i) {
/* 7 */             this.f18615c.setTitle(i);
                    return this;
                }

                @Override // android.view.MenuItem
/* 22 */        public final MenuItem setActionView(View view) {
/* 23 */            if (view instanceof CollapsibleActionView) {
/* 24 */                view = new ug1(view);
                    }
/* 25 */            this.f18615c.setActionView(view);
                    return this;
                }
            }
