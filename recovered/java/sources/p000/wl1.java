            package p000;

            import android.view.SubMenu;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wl1 extends jg1 {
                @Override // p000.jg1, android.view.Menu
                public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
/* 1 */             sg1 sg1VarMo5801a = mo5801a(i, i2, i3, charSequence);
/* 9 */             jm1 jm1Var = new jm1(this.f12256a, this, sg1VarMo5801a);
/* 12 */            sg1VarMo5801a.f16597o = jm1Var;
/* 16 */            jm1Var.setHeaderTitle(sg1VarMo5801a.f16587e);
/* 19 */            return jm1Var;
                }
            }
