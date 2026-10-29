            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.view.ActionProvider;
            import android.view.ContextMenu;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class sg1 implements zi2 {

                /* JADX INFO: renamed from: A */
                public AbstractC1815k2 f16580A;

                /* JADX INFO: renamed from: B */
                public MenuItem.OnActionExpandListener f16581B;

                /* JADX INFO: renamed from: a */
                public final int f16583a;

                /* JADX INFO: renamed from: b */
                public final int f16584b;

                /* JADX INFO: renamed from: c */
                public final int f16585c;

                /* JADX INFO: renamed from: d */
                public final int f16586d;

                /* JADX INFO: renamed from: e */
                public CharSequence f16587e;

                /* JADX INFO: renamed from: f */
                public CharSequence f16588f;

                /* JADX INFO: renamed from: g */
                public Intent f16589g;

                /* JADX INFO: renamed from: h */
                public char f16590h;

                /* JADX INFO: renamed from: j */
                public char f16592j;

                /* JADX INFO: renamed from: l */
                public Drawable f16594l;

                /* JADX INFO: renamed from: n */
                public final jg1 f16596n;

                /* JADX INFO: renamed from: o */
                public hi2 f16597o;

                /* JADX INFO: renamed from: p */
                public MenuItem.OnMenuItemClickListener f16598p;

                /* JADX INFO: renamed from: q */
                public CharSequence f16599q;

                /* JADX INFO: renamed from: r */
                public CharSequence f16600r;

                /* JADX INFO: renamed from: y */
                public int f16607y;

                /* JADX INFO: renamed from: z */
                public View f16608z;

                /* JADX INFO: renamed from: i */
                public int f16591i = 4096;

                /* JADX INFO: renamed from: k */
                public int f16593k = 4096;

                /* JADX INFO: renamed from: m */
                public int f16595m = 0;

                /* JADX INFO: renamed from: s */
                public ColorStateList f16601s = null;

                /* JADX INFO: renamed from: t */
                public PorterDuff.Mode f16602t = null;

                /* JADX INFO: renamed from: u */
                public boolean f16603u = false;

                /* JADX INFO: renamed from: v */
                public boolean f16604v = false;

                /* JADX INFO: renamed from: w */
                public boolean f16605w = false;

                /* JADX INFO: renamed from: x */
                public int f16606x = 16;

                /* JADX INFO: renamed from: C */
                public boolean f16582C = false;

                public sg1(jg1 jg1Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
/* 30 */            this.f16596n = jg1Var;
/* 32 */            this.f16583a = i2;
/* 34 */            this.f16584b = i;
/* 36 */            this.f16585c = i3;
/* 38 */            this.f16586d = i4;
/* 40 */            this.f16587e = charSequence;
/* 42 */            this.f16607y = i5;
                }

                /* JADX INFO: renamed from: c */
                public static void m8500c(int i, int i2, String str, StringBuilder sb) {
/* 2 */             if ((i & i2) == i2) {
/* 4 */                 sb.append(str);
                    }
                }

                @Override // p000.zi2
                /* JADX INFO: renamed from: a */
                public final zi2 mo37a(AbstractC1815k2 abstractC1815k2) {
/* 1 */             AbstractC1815k2 abstractC1815k3 = this.f16580A;
/* 4 */             if (abstractC1815k3 != null) {
/* 6 */                 abstractC1815k3.f12562a = null;
                    }
/* 8 */             this.f16608z = null;
/* 10 */            this.f16580A = abstractC1815k2;
/* 15 */            this.f16596n.mo5808p(true);
/* 18 */            AbstractC1815k2 abstractC1815k4 = this.f16580A;
/* 20 */            if (abstractC1815k4 != null) {
/* 28 */                tg1 tg1Var = (tg1) abstractC1815k4;
/* 30 */                tg1Var.f17087b = new er0(this, 6);
/* 34 */                tg1Var.f17088c.setVisibilityListener(tg1Var);
                    }
/* 37 */            return this;
                }

                @Override // p000.zi2
                /* JADX INFO: renamed from: b */
                public final AbstractC1815k2 mo38b() {
/* 1 */             return this.f16580A;
                }

                @Override // android.view.MenuItem
                public final boolean collapseActionView() {
/* 5 */             if ((this.f16607y & 8) == 0) {
/* 25 */                return false;
                    }
/* 10 */            if (this.f16608z == null) {
/* 12 */                return true;
                    }
/* 14 */            MenuItem.OnActionExpandListener onActionExpandListener = this.f16581B;
/* 16 */            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
/* 29 */                return this.f16596n.mo4230d(this);
                    }
/* 25 */            return false;
                }

                /* JADX INFO: renamed from: d */
                public final Drawable m8501d(Drawable drawable) {
/* 1 */             if (drawable != null && this.f16605w && (this.f16603u || this.f16604v)) {
/* 15 */                drawable = drawable.mutate();
/* 21 */                if (this.f16603u) {
/* 25 */                    s90.m8448h(drawable, this.f16601s);
                        }
/* 30 */                if (this.f16604v) {
/* 34 */                    s90.m8449i(drawable, this.f16602t);
                        }
/* 38 */                this.f16605w = false;
                    }
/* 40 */            return drawable;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m8502e() {
                    AbstractC1815k2 abstractC1815k2;
/* 6 */             if ((this.f16607y & 8) != 0) {
/* 10 */                if (this.f16608z == null && (abstractC1815k2 = this.f16580A) != null) {
/* 24 */                    this.f16608z = ((tg1) abstractC1815k2).f17088c.onCreateActionView(this);
                        }
/* 28 */                if (this.f16608z != null) {
/* 30 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override // android.view.MenuItem
                public final boolean expandActionView() {
/* 5 */             if (!m8502e()) {
/* 19 */                return false;
                    }
/* 8 */             MenuItem.OnActionExpandListener onActionExpandListener = this.f16581B;
/* 10 */            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
/* 23 */                return this.f16596n.mo4232f(this);
                    }
/* 19 */            return false;
                }

                /* JADX INFO: renamed from: f */
                public final void m8503f(boolean z) {
/* 11 */            this.f16606x = (z ? 4 : 0) | (this.f16606x & (-5));
                }

                /* JADX INFO: renamed from: g */
                public final void m8504g(boolean z) {
/* 1 */             int i = this.f16606x;
/* 3 */             if (z) {
/* 7 */                 this.f16606x = i | 32;
                    } else {
/* 12 */                this.f16606x = i & (-33);
                    }
                }

                @Override // android.view.MenuItem
                public final ActionProvider getActionProvider() {
/* 8 */             throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
                }

                @Override // android.view.MenuItem
                public final View getActionView() {
/* 1 */             View view = this.f16608z;
/* 3 */             if (view != null) {
/* 5 */                 return view;
                    }
/* 6 */             AbstractC1815k2 abstractC1815k2 = this.f16580A;
/* 8 */             if (abstractC1815k2 == null) {
/* 21 */                return null;
                    }
/* 14 */            View viewOnCreateActionView = ((tg1) abstractC1815k2).f17088c.onCreateActionView(this);
/* 18 */            this.f16608z = viewOnCreateActionView;
/* 20 */            return viewOnCreateActionView;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final int getAlphabeticModifiers() {
/* 1 */             return this.f16593k;
                }

                @Override // android.view.MenuItem
                public final char getAlphabeticShortcut() {
/* 1 */             return this.f16592j;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final CharSequence getContentDescription() {
/* 1 */             return this.f16599q;
                }

                @Override // android.view.MenuItem
                public final int getGroupId() {
/* 1 */             return this.f16584b;
                }

                @Override // android.view.MenuItem
                public final Drawable getIcon() {
/* 1 */             Drawable drawable = this.f16594l;
/* 3 */             if (drawable != null) {
/* 5 */                 return m8501d(drawable);
                    }
/* 10 */            int i = this.f16595m;
/* 12 */            if (i == 0) {
/* 32 */                return null;
                    }
/* 18 */            Drawable drawableM6700p = mn0.m6700p(this.f16596n.f12256a, i);
/* 23 */            this.f16595m = 0;
/* 25 */            this.f16594l = drawableM6700p;
/* 27 */            return m8501d(drawableM6700p);
                }

                @Override // p000.zi2, android.view.MenuItem
                public final ColorStateList getIconTintList() {
/* 1 */             return this.f16601s;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final PorterDuff.Mode getIconTintMode() {
/* 1 */             return this.f16602t;
                }

                @Override // android.view.MenuItem
                public final Intent getIntent() {
/* 1 */             return this.f16589g;
                }

                @Override // android.view.MenuItem
                public final int getItemId() {
/* 1 */             return this.f16583a;
                }

                @Override // android.view.MenuItem
                public final ContextMenu.ContextMenuInfo getMenuInfo() {
/* 1 */             return null;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final int getNumericModifiers() {
/* 1 */             return this.f16591i;
                }

                @Override // android.view.MenuItem
                public final char getNumericShortcut() {
/* 1 */             return this.f16590h;
                }

                @Override // android.view.MenuItem
                public final int getOrder() {
/* 1 */             return this.f16585c;
                }

                @Override // android.view.MenuItem
                public final SubMenu getSubMenu() {
/* 1 */             return this.f16597o;
                }

                @Override // android.view.MenuItem
                public final CharSequence getTitle() {
/* 1 */             return this.f16587e;
                }

                @Override // android.view.MenuItem
                public final CharSequence getTitleCondensed() {
/* 1 */             CharSequence charSequence = this.f16588f;
                    return charSequence != null ? charSequence : this.f16587e;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final CharSequence getTooltipText() {
/* 1 */             return this.f16600r;
                }

                @Override // android.view.MenuItem
                public final boolean hasSubMenu() {
                    return this.f16597o != null;
                }

                @Override // android.view.MenuItem
                public final boolean isActionViewExpanded() {
/* 1 */             return this.f16582C;
                }

                @Override // android.view.MenuItem
                public final boolean isCheckable() {
                    return (this.f16606x & 1) == 1;
                }

                @Override // android.view.MenuItem
                public final boolean isChecked() {
                    return (this.f16606x & 2) == 2;
                }

                @Override // android.view.MenuItem
                public final boolean isEnabled() {
                    return (this.f16606x & 16) != 0;
                }

                @Override // android.view.MenuItem
                public final boolean isVisible() {
/* 1 */             AbstractC1815k2 abstractC1815k2 = this.f16580A;
/* 5 */             if (abstractC1815k2 == null || !((tg1) abstractC1815k2).f17088c.overridesItemVisibility()) {
                        return (this.f16606x & 8) == 0;
                    }
                    return (this.f16606x & 8) == 0 && ((tg1) this.f16580A).f17088c.isVisible();
                }

                @Override // android.view.MenuItem
                public final MenuItem setActionProvider(ActionProvider actionProvider) {
/* 8 */             throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
                }

                @Override // android.view.MenuItem
                public final MenuItem setActionView(int i) {
                    int i2;
/* 1 */             jg1 jg1Var = this.f16596n;
/* 3 */             Context context = jg1Var.f12256a;
/* 15 */            View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
/* 19 */            this.f16608z = viewInflate;
/* 22 */            this.f16580A = null;
/* 24 */            if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f16583a) > 0) {
/* 37 */                viewInflate.setId(i2);
                    }
/* 41 */            jg1Var.f12266k = true;
/* 43 */            jg1Var.mo5808p(true);
/* 46 */            return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setAlphabeticShortcut(char c, int i) {
/* 3 */             if (this.f16592j == c && this.f16593k == i) {
/* 9 */                 return this;
                    }
/* 14 */            this.f16592j = Character.toLowerCase(c);
/* 20 */            this.f16593k = KeyEvent.normalizeMetaState(i);
/* 25 */            this.f16596n.mo5808p(false);
/* 28 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setCheckable(boolean z) {
/* 1 */             int i = this.f16606x;
/* 5 */             int i2 = (z ? 1 : 0) | (i & (-2));
/* 6 */             this.f16606x = i2;
/* 8 */             if (i != i2) {
/* 13 */                this.f16596n.mo5808p(false);
                    }
/* 16 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setChecked(boolean z) {
/* 1 */             int i = this.f16606x;
/* 3 */             int i2 = i & 4;
/* 6 */             jg1 jg1Var = this.f16596n;
/* 9 */             if (i2 == 0) {
/* 85 */                int i3 = (i & (-3)) | (z ? 2 : 0);
/* 87 */                this.f16606x = i3;
/* 89 */                if (i != i3) {
/* 91 */                    jg1Var.mo5808p(false);
                        }
/* 94 */                return this;
                    }
/* 11 */            ArrayList arrayList = jg1Var.f12261f;
/* 13 */            int size = arrayList.size();
/* 17 */            jg1Var.m5817y();
/* 21 */            for (int i4 = 0; i4 < size; i4++) {
/* 27 */                sg1 sg1Var = (sg1) arrayList.get(i4);
/* 33 */                if (sg1Var.f16584b == this.f16584b && (sg1Var.f16606x & 4) != 0 && sg1Var.isCheckable()) {
/* 52 */                    boolean z2 = sg1Var == this;
/* 53 */                    int i5 = sg1Var.f16606x;
/* 62 */                    int i6 = (z2 ? 2 : 0) | (i5 & (-3));
/* 63 */                    sg1Var.f16606x = i6;
/* 65 */                    if (i5 != i6) {
/* 69 */                        sg1Var.f16596n.mo5808p(false);
                            }
                        }
                    }
/* 75 */            jg1Var.m5816x();
/* 78 */            return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final zi2 setContentDescription(CharSequence charSequence) {
/* 1 */             this.f16599q = charSequence;
/* 6 */             this.f16596n.mo5808p(false);
/* 9 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setEnabled(boolean z) {
/* 1 */             int i = this.f16606x;
/* 3 */             if (z) {
/* 7 */                 this.f16606x = i | 16;
                    } else {
/* 12 */                this.f16606x = i & (-17);
                    }
/* 17 */            this.f16596n.mo5808p(false);
/* 20 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIcon(int i) {
/* 2 */             this.f16594l = null;
/* 4 */             this.f16595m = i;
/* 7 */             this.f16605w = true;
/* 12 */            this.f16596n.mo5808p(false);
/* 15 */            return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setIconTintList(ColorStateList colorStateList) {
/* 1 */             this.f16601s = colorStateList;
/* 4 */             this.f16603u = true;
/* 6 */             this.f16605w = true;
/* 11 */            this.f16596n.mo5808p(false);
/* 14 */            return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
/* 1 */             this.f16602t = mode;
/* 4 */             this.f16604v = true;
/* 6 */             this.f16605w = true;
/* 11 */            this.f16596n.mo5808p(false);
/* 14 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setIntent(Intent intent) {
/* 1 */             this.f16589g = intent;
/* 3 */             return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setNumericShortcut(char c, int i) {
/* 3 */             if (this.f16590h == c && this.f16591i == i) {
/* 9 */                 return this;
                    }
/* 10 */            this.f16590h = c;
/* 16 */            this.f16591i = KeyEvent.normalizeMetaState(i);
/* 21 */            this.f16596n.mo5808p(false);
/* 24 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
/* 1 */             this.f16581B = onActionExpandListener;
/* 3 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
/* 1 */             this.f16598p = onMenuItemClickListener;
/* 3 */             return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final MenuItem setShortcut(char c, char c2, int i, int i2) {
/* 1 */             this.f16590h = c;
/* 7 */             this.f16591i = KeyEvent.normalizeMetaState(i);
/* 13 */            this.f16592j = Character.toLowerCase(c2);
/* 19 */            this.f16593k = KeyEvent.normalizeMetaState(i2);
/* 24 */            this.f16596n.mo5808p(false);
/* 27 */            return this;
                }

                @Override // android.view.MenuItem
                public final void setShowAsAction(int i) {
/* 1 */             int i2 = i & 3;
/* 4 */             if (i2 != 0 && i2 != 1 && i2 != 2) {
/* 14 */                C1951n4.m6859j("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
/* 17 */                return;
                    }
/* 18 */            this.f16607y = i;
/* 20 */            jg1 jg1Var = this.f16596n;
/* 22 */            jg1Var.f12266k = true;
/* 24 */            jg1Var.mo5808p(true);
                }

                @Override // android.view.MenuItem
                public final MenuItem setShowAsActionFlags(int i) {
/* 1 */             setShowAsAction(i);
/* 4 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setTitle(CharSequence charSequence) {
/* 1 */             this.f16587e = charSequence;
/* 6 */             this.f16596n.mo5808p(false);
/* 9 */             hi2 hi2Var = this.f16597o;
/* 11 */            if (hi2Var != null) {
/* 13 */                hi2Var.setHeaderTitle(charSequence);
                    }
/* 16 */            return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setTitleCondensed(CharSequence charSequence) {
/* 1 */             this.f16588f = charSequence;
/* 6 */             this.f16596n.mo5808p(false);
/* 9 */             return this;
                }

                @Override // p000.zi2, android.view.MenuItem
                public final zi2 setTooltipText(CharSequence charSequence) {
/* 1 */             this.f16600r = charSequence;
/* 6 */             this.f16596n.mo5808p(false);
/* 9 */             return this;
                }

                @Override // android.view.MenuItem
                public final MenuItem setVisible(boolean z) {
/* 1 */             int i = this.f16606x;
/* 11 */            int i2 = (z ? 0 : 8) | (i & (-9));
/* 12 */            this.f16606x = i2;
/* 14 */            if (i != i2) {
/* 16 */                jg1 jg1Var = this.f16596n;
/* 19 */                jg1Var.f12263h = true;
/* 21 */                jg1Var.mo5808p(true);
                    }
/* 24 */            return this;
                }

                public final String toString() {
/* 1 */             CharSequence charSequence = this.f16587e;
/* 3 */             if (charSequence != null) {
/* 5 */                 return charSequence.toString();
                    }
/* 10 */            return null;
                }

                @Override // android.view.MenuItem
/* 9 */         public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
/* 10 */            setContentDescription(charSequence);
                    return this;
                }

                @Override // android.view.MenuItem
/* 9 */         public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
/* 10 */            setTooltipText(charSequence);
                    return this;
                }

                @Override // android.view.MenuItem
/* 15 */        public final MenuItem setIcon(Drawable drawable) {
/* 16 */            this.f16595m = 0;
/* 17 */            this.f16594l = drawable;
/* 18 */            this.f16605w = true;
/* 19 */            this.f16596n.mo5808p(false);
                    return this;
                }

                @Override // android.view.MenuItem
/* 16 */        public final MenuItem setTitle(int i) {
/* 19 */            setTitle(this.f16596n.f12256a.getString(i));
                    return this;
                }

                @Override // android.view.MenuItem
/* 24 */        public final MenuItem setNumericShortcut(char c) {
/* 25 */            if (this.f16590h == c) {
                        return this;
                    }
/* 26 */            this.f16590h = c;
/* 27 */            this.f16596n.mo5808p(false);
                    return this;
                }

                @Override // android.view.MenuItem
/* 27 */        public final MenuItem setShortcut(char c, char c2) {
/* 28 */            this.f16590h = c;
/* 29 */            this.f16592j = Character.toLowerCase(c2);
/* 30 */            this.f16596n.mo5808p(false);
                    return this;
                }

                @Override // android.view.MenuItem
/* 28 */        public final MenuItem setAlphabeticShortcut(char c) {
/* 29 */            if (this.f16592j == c) {
                        return this;
                    }
/* 30 */            this.f16592j = Character.toLowerCase(c);
/* 31 */            this.f16596n.mo5808p(false);
                    return this;
                }

                @Override // android.view.MenuItem
/* 46 */        public final MenuItem setActionView(View view) {
                    int i;
/* 47 */            this.f16608z = view;
/* 48 */            this.f16580A = null;
/* 49 */            if (view != null && view.getId() == -1 && (i = this.f16583a) > 0) {
/* 50 */                view.setId(i);
                    }
/* 51 */            jg1 jg1Var = this.f16596n;
                    jg1Var.f12266k = true;
/* 52 */            jg1Var.mo5808p(true);
                    return this;
                }
            }
