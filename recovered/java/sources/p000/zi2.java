            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.view.MenuItem;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface zi2 extends MenuItem {
                /* JADX INFO: renamed from: a */
                zi2 mo37a(AbstractC1815k2 abstractC1815k2);

                /* JADX INFO: renamed from: b */
                AbstractC1815k2 mo38b();

                @Override // android.view.MenuItem
                int getAlphabeticModifiers();

                @Override // android.view.MenuItem
                CharSequence getContentDescription();

                @Override // android.view.MenuItem
                ColorStateList getIconTintList();

                @Override // android.view.MenuItem
                PorterDuff.Mode getIconTintMode();

                @Override // android.view.MenuItem
                int getNumericModifiers();

                @Override // android.view.MenuItem
                CharSequence getTooltipText();

                @Override // android.view.MenuItem
                MenuItem setAlphabeticShortcut(char c, int i);

                @Override // android.view.MenuItem
                zi2 setContentDescription(CharSequence charSequence);

                @Override // android.view.MenuItem
                MenuItem setIconTintList(ColorStateList colorStateList);

                @Override // android.view.MenuItem
                MenuItem setIconTintMode(PorterDuff.Mode mode);

                @Override // android.view.MenuItem
                MenuItem setNumericShortcut(char c, int i);

                @Override // android.view.MenuItem
                MenuItem setShortcut(char c, char c2, int i, int i2);

                @Override // android.view.MenuItem
                zi2 setTooltipText(CharSequence charSequence);
            }
