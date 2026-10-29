            package p000;

            import android.content.Context;
            import android.view.SubMenu;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sl1 extends jg1 {

                /* JADX INFO: renamed from: A */
                public final Class f16673A;

                /* JADX INFO: renamed from: B */
                public final int f16674B;

                public sl1(Context context, Class cls, int i) {
/* 1 */             super(context);
/* 4 */             this.f16673A = cls;
/* 6 */             this.f16674B = i;
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: a */
                public final sg1 mo5801a(int i, int i2, int i3, CharSequence charSequence) {
/* 8 */             int size = this.f12261f.size() + 1;
/* 9 */             int i4 = this.f16674B;
/* 11 */            if (size <= i4) {
/* 13 */                m5817y();
/* 16 */                sg1 sg1VarMo5801a = super.mo5801a(i, i2, i3, charSequence);
/* 20 */                sg1VarMo5801a.m8503f(true);
/* 23 */                m5816x();
/* 26 */                return sg1VarMo5801a;
                    }
/* 29 */            String simpleName = this.f16673A.getSimpleName();
/* 37 */            StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
/* 40 */            sb.append(simpleName);
/* 45 */            sb.append(" is ");
/* 48 */            sb.append(i4);
/* 53 */            sb.append(". Limit can be checked with ");
/* 62 */            C1951n4.m6859j(fm0.m3789o(sb, simpleName, "#getMaxItemCount()"));
/* 65 */            return null;
                }

                @Override // p000.jg1, android.view.Menu
                public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
/* 18 */            throw new UnsupportedOperationException(this.f16673A.getSimpleName().concat(" does not support submenus"));
                }
            }
