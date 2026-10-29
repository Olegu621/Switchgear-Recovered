            package p000;

            import android.view.MenuItem;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class wi2 implements MenuItem.OnMenuItemClickListener {

                /* JADX INFO: renamed from: d */
                public static final Class[] f18653d = {MenuItem.class};

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18654a = 0;

                /* JADX INFO: renamed from: b */
                public Object f18655b;

                /* JADX INFO: renamed from: c */
                public Object f18656c;

                public wi2(wg1 wg1Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
/* 7 */             this.f18656c = wg1Var;
/* 9 */             this.f18655b = onMenuItemClickListener;
                }

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean zBooleanValue;
                    switch (this.f18654a) {
                        case 0:
/* 23 */                    Object obj = this.f18655b;
/* 27 */                    Method method = (Method) this.f18656c;
                            try {
/* 35 */                        if (method.getReturnType() == Boolean.TYPE) {
/* 47 */                            zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                                } else {
/* 56 */                            method.invoke(obj, menuItem);
/* 59 */                            zBooleanValue = true;
                                }
/* 66 */                        return zBooleanValue;
                            } catch (Exception e) {
/* 62 */                        ds0.m3199p(e);
/* 65 */                        return false;
                            }
                        default:
/* 18 */                    return ((MenuItem.OnMenuItemClickListener) this.f18655b).onMenuItemClick(((wg1) this.f18656c).m8749i(menuItem));
                    }
                }

/* 11 */        public /* synthetic */ wi2() {
                }
            }
