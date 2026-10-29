            package p000;

            import android.view.View;
            import android.view.WindowInsets;
            import androidx.drawerlayout.widget.DrawerLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z90 implements View.OnApplyWindowInsetsListener {
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
/* 1 */             DrawerLayout drawerLayout = (DrawerLayout) view;
/* 7 */             boolean z = false;
/* 13 */            boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
/* 14 */            drawerLayout.f1315j0 = windowInsets;
/* 16 */            drawerLayout.f1316k0 = z2;
/* 18 */            if (!z2 && drawerLayout.getBackground() == null) {
/* 26 */                z = true;
                    }
/* 27 */            drawerLayout.setWillNotDraw(z);
/* 30 */            drawerLayout.requestLayout();
/* 33 */            return windowInsets.consumeSystemWindowInsets();
                }
            }
