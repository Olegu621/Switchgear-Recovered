            package p000;

            import android.content.ActivityNotFoundException;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            import android.view.ViewConfiguration;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class jg1 implements Menu {

                /* JADX INFO: renamed from: z */
                public static final int[] f12255z = {1, 4, 5, 3, 2, 0};

                /* JADX INFO: renamed from: a */
                public final Context f12256a;

                /* JADX INFO: renamed from: b */
                public final Resources f12257b;

                /* JADX INFO: renamed from: c */
                public boolean f12258c;

                /* JADX INFO: renamed from: d */
                public final boolean f12259d;

                /* JADX INFO: renamed from: e */
                public hg1 f12260e;

                /* JADX INFO: renamed from: f */
                public final ArrayList f12261f;

                /* JADX INFO: renamed from: g */
                public final ArrayList f12262g;

                /* JADX INFO: renamed from: h */
                public boolean f12263h;

                /* JADX INFO: renamed from: i */
                public final ArrayList f12264i;

                /* JADX INFO: renamed from: j */
                public final ArrayList f12265j;

                /* JADX INFO: renamed from: k */
                public boolean f12266k;

                /* JADX INFO: renamed from: m */
                public CharSequence f12268m;

                /* JADX INFO: renamed from: n */
                public Drawable f12269n;

                /* JADX INFO: renamed from: o */
                public View f12270o;

                /* JADX INFO: renamed from: w */
                public sg1 f12278w;

                /* JADX INFO: renamed from: y */
                public boolean f12280y;

                /* JADX INFO: renamed from: l */
                public int f12267l = 0;

                /* JADX INFO: renamed from: p */
                public boolean f12271p = false;

                /* JADX INFO: renamed from: q */
                public boolean f12272q = false;

                /* JADX INFO: renamed from: r */
                public boolean f12273r = false;

                /* JADX INFO: renamed from: s */
                public boolean f12274s = false;

                /* JADX INFO: renamed from: t */
                public boolean f12275t = false;

                /* JADX INFO: renamed from: u */
                public final ArrayList f12276u = new ArrayList();

                /* JADX INFO: renamed from: v */
                public final CopyOnWriteArrayList f12277v = new CopyOnWriteArrayList();

                /* JADX INFO: renamed from: x */
                public boolean f12279x = false;

                public jg1(Context context) {
                    boolean zM3870b;
/* 4 */             boolean z = false;
/* 33 */            this.f12256a = context;
/* 35 */            Resources resources = context.getResources();
/* 39 */            this.f12257b = resources;
/* 46 */            this.f12261f = new ArrayList();
/* 53 */            this.f12262g = new ArrayList();
/* 56 */            this.f12263h = true;
/* 63 */            this.f12264i = new ArrayList();
/* 70 */            this.f12265j = new ArrayList();
/* 72 */            this.f12266k = true;
/* 80 */            if (resources.getConfiguration().keyboard != 1) {
/* 82 */                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
/* 86 */                Method method = i33.f9439a;
/* 92 */                if (Build.VERSION.SDK_INT >= 28) {
/* 94 */                    zM3870b = g33.m3870b(viewConfiguration);
                        } else {
/* 99 */                    Resources resources2 = context.getResources();
/* 109 */                   int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
/* 123 */                   zM3870b = identifier != 0 && resources2.getBoolean(identifier);
                        }
/* 124 */               if (zM3870b) {
/* 126 */                   z = true;
                        }
                    }
/* 127 */           this.f12259d = z;
                }

                /* JADX INFO: renamed from: a */
                public sg1 mo5801a(int i, int i2, int i3, CharSequence charSequence) {
                    int i4;
/* 4 */             int i5 = ((-65536) & i3) >> 16;
/* 6 */             if (i5 < 0 || i5 >= 6) {
/* 70 */                C1951n4.m6859j("order does not contain a valid category.");
/* 73 */                return null;
                    }
/* 21 */            int i6 = (f12255z[i5] << 16) | (65535 & i3);
/* 32 */            sg1 sg1Var = new sg1(this, i, i2, i3, i6, charSequence, this.f12267l);
/* 35 */            ArrayList arrayList = this.f12261f;
/* 43 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 53 */                if (((sg1) arrayList.get(size)).f16586d <= i6) {
/* 55 */                    i4 = size + 1;
/* 61 */                    arrayList.add(i4, sg1Var);
/* 64 */                    mo5808p(true);
/* 67 */                    return sg1Var;
                        }
                    }
/* 60 */            i4 = 0;
/* 61 */            arrayList.add(i4, sg1Var);
/* 64 */            mo5808p(true);
/* 67 */            return sg1Var;
                }

                @Override // android.view.Menu
                public final MenuItem add(int i) {
/* 8 */             return mo5801a(0, 0, 0, this.f12257b.getString(i));
                }

                @Override // android.view.Menu
                public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
                    int i5;
/* 3 */             PackageManager packageManager = this.f12256a.getPackageManager();
/* 8 */             List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
/* 19 */            int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
/* 22 */            if ((i4 & 1) == 0) {
/* 24 */                removeGroup(i);
                    }
/* 27 */            for (int i6 = 0; i6 < size; i6++) {
/* 29 */                ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
/* 37 */                int i7 = resolveInfo.specificIndex;
/* 45 */                Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
/* 50 */                ActivityInfo activityInfo = resolveInfo.activityInfo;
/* 61 */                intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
/* 68 */                sg1 sg1VarMo5801a = mo5801a(i, i2, i3, resolveInfo.loadLabel(packageManager));
/* 76 */                sg1VarMo5801a.setIcon(resolveInfo.loadIcon(packageManager));
/* 79 */                sg1VarMo5801a.f16589g = intent2;
/* 81 */                if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
/* 87 */                    menuItemArr[i5] = sg1VarMo5801a;
                        }
                    }
/* 92 */            return size;
                }

                @Override // android.view.Menu
                public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
/* 1 */             sg1 sg1VarMo5801a = mo5801a(i, i2, i3, charSequence);
/* 9 */             hi2 hi2Var = new hi2(this.f12256a, this, sg1VarMo5801a);
/* 12 */            sg1VarMo5801a.f16597o = hi2Var;
/* 16 */            hi2Var.setHeaderTitle(sg1VarMo5801a.f16587e);
/* 19 */            return hi2Var;
                }

                /* JADX INFO: renamed from: b */
                public final void m5802b(eh1 eh1Var, Context context) {
/* 8 */             this.f12277v.add(new WeakReference(eh1Var));
/* 11 */            eh1Var.mo425k(context, this);
/* 15 */            this.f12266k = true;
                }

                /* JADX INFO: renamed from: c */
                public final void m5803c(boolean z) {
/* 3 */             if (this.f12275t) {
/* 5 */                 return;
                    }
/* 7 */             this.f12275t = true;
/* 9 */             CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 19 */            for (WeakReference weakReference : copyOnWriteArrayList) {
/* 31 */                eh1 eh1Var = (eh1) weakReference.get();
/* 33 */                if (eh1Var == null) {
/* 35 */                    copyOnWriteArrayList.remove(weakReference);
                        } else {
/* 39 */                    eh1Var.mo421d(this, z);
                        }
                    }
/* 44 */            this.f12275t = false;
                }

                @Override // android.view.Menu
                public final void clear() {
/* 1 */             sg1 sg1Var = this.f12278w;
/* 3 */             if (sg1Var != null) {
/* 5 */                 mo4230d(sg1Var);
                    }
/* 10 */            this.f12261f.clear();
/* 14 */            mo5808p(true);
                }

                public final void clearHeader() {
/* 2 */             this.f12269n = null;
/* 4 */             this.f12268m = null;
/* 6 */             this.f12270o = null;
/* 9 */             mo5808p(false);
                }

                @Override // android.view.Menu
                public final void close() {
/* 2 */             m5803c(true);
                }

                /* JADX INFO: renamed from: d */
                public boolean mo4230d(sg1 sg1Var) {
/* 1 */             CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 7 */             boolean zMo433f = false;
/* 8 */             if (!copyOnWriteArrayList.isEmpty() && this.f12278w == sg1Var) {
/* 15 */                m5817y();
/* 26 */                for (WeakReference weakReference : copyOnWriteArrayList) {
/* 38 */                    eh1 eh1Var = (eh1) weakReference.get();
/* 40 */                    if (eh1Var != null) {
/* 46 */                        zMo433f = eh1Var.mo433f(sg1Var);
/* 50 */                        if (zMo433f) {
                                    break;
                                }
                            } else {
/* 42 */                        copyOnWriteArrayList.remove(weakReference);
                            }
                        }
/* 52 */                m5816x();
/* 55 */                if (zMo433f) {
/* 58 */                    this.f12278w = null;
                        }
                    }
/* 60 */            return zMo433f;
                }

                /* JADX INFO: renamed from: e */
                public boolean mo4231e(jg1 jg1Var, MenuItem menuItem) {
/* 1 */             hg1 hg1Var = this.f12260e;
                    return hg1Var != null && hg1Var.mo3404c(jg1Var, menuItem);
                }

                /* JADX INFO: renamed from: f */
                public boolean mo4232f(sg1 sg1Var) {
/* 1 */             CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 7 */             boolean zMo434i = false;
/* 8 */             if (copyOnWriteArrayList.isEmpty()) {
/* 7 */                 return false;
                    }
/* 11 */            m5817y();
/* 22 */            for (WeakReference weakReference : copyOnWriteArrayList) {
/* 34 */                eh1 eh1Var = (eh1) weakReference.get();
/* 36 */                if (eh1Var != null) {
/* 42 */                    zMo434i = eh1Var.mo434i(sg1Var);
/* 46 */                    if (zMo434i) {
                                break;
                            }
                        } else {
/* 38 */                    copyOnWriteArrayList.remove(weakReference);
                        }
                    }
/* 48 */            m5816x();
/* 51 */            if (zMo434i) {
/* 53 */                this.f12278w = sg1Var;
                    }
/* 55 */            return zMo434i;
                }

                @Override // android.view.Menu
                public final MenuItem findItem(int i) {
                    MenuItem menuItemFindItem;
/* 1 */             ArrayList arrayList = this.f12261f;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i2 = 0; i2 < size; i2++) {
/* 14 */                sg1 sg1Var = (sg1) arrayList.get(i2);
/* 18 */                if (sg1Var.f16583a == i) {
/* 20 */                    return sg1Var;
                        }
/* 25 */                if (sg1Var.hasSubMenu() && (menuItemFindItem = sg1Var.f16597o.findItem(i)) != null) {
/* 35 */                    return menuItemFindItem;
                        }
                    }
/* 39 */            return null;
                }

                /* JADX INFO: renamed from: g */
                public final sg1 m5804g(int i, KeyEvent keyEvent) {
/* 1 */             ArrayList arrayList = this.f12276u;
/* 3 */             arrayList.clear();
/* 6 */             m5805h(arrayList, i, keyEvent);
/* 14 */            if (arrayList.isEmpty()) {
/* 13 */                return null;
                    }
/* 17 */            int metaState = keyEvent.getMetaState();
/* 23 */            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
/* 26 */            keyEvent.getKeyData(keyData);
/* 29 */            int size = arrayList.size();
/* 35 */            if (size == 1) {
/* 41 */                return (sg1) arrayList.get(0);
                    }
/* 44 */            boolean zMo4236n = mo4236n();
/* 49 */            for (int i2 = 0; i2 < size; i2++) {
/* 55 */                sg1 sg1Var = (sg1) arrayList.get(i2);
/* 62 */                char c = zMo4236n ? sg1Var.f16592j : sg1Var.f16590h;
/* 64 */                char[] cArr = keyData.meta;
/* 68 */                if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo4236n && c == '\b' && i == 67))) {
/* 93 */                    return sg1Var;
                        }
                    }
/* 13 */            return null;
                }

                @Override // android.view.Menu
                public final MenuItem getItem(int i) {
/* 7 */             return (MenuItem) this.f12261f.get(i);
                }

                /* JADX INFO: renamed from: h */
                public final void m5805h(List list, int i, KeyEvent keyEvent) {
/* 1 */             boolean zMo4236n = mo4236n();
/* 5 */             int modifiers = keyEvent.getModifiers();
/* 11 */            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
/* 20 */            if (keyEvent.getKeyData(keyData) || i == 67) {
/* 25 */                ArrayList arrayList = this.f12261f;
/* 27 */                int size = arrayList.size();
/* 33 */                for (int i2 = 0; i2 < size; i2++) {
/* 39 */                    sg1 sg1Var = (sg1) arrayList.get(i2);
/* 45 */                    if (sg1Var.hasSubMenu()) {
/* 49 */                        sg1Var.f16597o.m5805h(list, i, keyEvent);
                            }
/* 57 */                    char c = zMo4236n ? sg1Var.f16592j : sg1Var.f16590h;
/* 72 */                    if ((modifiers & 69647) == ((zMo4236n ? sg1Var.f16593k : sg1Var.f16591i) & 69647) && c != 0) {
/* 76 */                        char[] cArr = keyData.meta;
/* 80 */                        if ((c == cArr[0] || c == cArr[2] || (zMo4236n && c == '\b' && i == 67)) && sg1Var.isEnabled()) {
/* 101 */                           list.add(sg1Var);
                                }
                            }
                        }
                    }
                }

                @Override // android.view.Menu
                public final boolean hasVisibleItems() {
/* 3 */             if (this.f12280y) {
/* 28 */                return true;
                    }
/* 6 */             ArrayList arrayList = this.f12261f;
/* 8 */             int size = arrayList.size();
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                if (((sg1) arrayList.get(i)).isVisible()) {
/* 28 */                    return true;
                        }
                    }
/* 12 */            return false;
                }

                /* JADX INFO: renamed from: i */
                public final void m5806i() {
/* 1 */             ArrayList arrayListM5807l = m5807l();
/* 7 */             if (this.f12266k) {
/* 10 */                CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 17 */                boolean zMo422e = false;
/* 22 */                for (WeakReference weakReference : copyOnWriteArrayList) {
/* 34 */                    eh1 eh1Var = (eh1) weakReference.get();
/* 36 */                    if (eh1Var == null) {
/* 38 */                        copyOnWriteArrayList.remove(weakReference);
                            } else {
/* 46 */                        zMo422e |= eh1Var.mo422e();
                            }
                        }
/* 48 */                ArrayList arrayList = this.f12264i;
/* 50 */                ArrayList arrayList2 = this.f12265j;
/* 52 */                if (zMo422e) {
/* 54 */                    arrayList.clear();
/* 57 */                    arrayList2.clear();
/* 60 */                    int size = arrayListM5807l.size();
/* 65 */                    for (int i = 0; i < size; i++) {
/* 71 */                        sg1 sg1Var = (sg1) arrayListM5807l.get(i);
/* 78 */                        if ((sg1Var.f16606x & 32) == 32) {
/* 80 */                            arrayList.add(sg1Var);
                                } else {
/* 84 */                            arrayList2.add(sg1Var);
                                }
                            }
                        } else {
/* 90 */                    arrayList.clear();
/* 93 */                    arrayList2.clear();
/* 100 */                   arrayList2.addAll(m5807l());
                        }
/* 103 */               this.f12266k = false;
                    }
                }

                @Override // android.view.Menu
                public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
                    return m5804g(i, keyEvent) != null;
                }

                /* JADX INFO: renamed from: j */
                public String mo4233j() {
/* 1 */             return "android:menu:actionviewstates";
                }

                /* JADX INFO: renamed from: k */
                public jg1 mo4234k() {
/* 1 */             return this;
                }

                /* JADX INFO: renamed from: l */
                public final ArrayList m5807l() {
/* 1 */             boolean z = this.f12263h;
/* 3 */             ArrayList arrayList = this.f12262g;
/* 5 */             if (!z) {
/* 7 */                 return arrayList;
                    }
/* 8 */             arrayList.clear();
/* 11 */            ArrayList arrayList2 = this.f12261f;
/* 13 */            int size = arrayList2.size();
/* 19 */            for (int i = 0; i < size; i++) {
/* 25 */                sg1 sg1Var = (sg1) arrayList2.get(i);
/* 31 */                if (sg1Var.isVisible()) {
/* 33 */                    arrayList.add(sg1Var);
                        }
                    }
/* 39 */            this.f12263h = false;
/* 42 */            this.f12266k = true;
/* 44 */            return arrayList;
                }

                /* JADX INFO: renamed from: m */
                public boolean mo4235m() {
/* 1 */             return this.f12279x;
                }

                /* JADX INFO: renamed from: n */
                public boolean mo4236n() {
/* 1 */             return this.f12258c;
                }

                /* JADX INFO: renamed from: o */
                public boolean mo4237o() {
/* 1 */             return this.f12259d;
                }

                /* JADX INFO: renamed from: p */
                public void mo5808p(boolean z) {
/* 4 */             if (this.f12271p) {
/* 60 */                this.f12272q = true;
/* 62 */                if (z) {
/* 64 */                    this.f12273r = true;
/* 66 */                    return;
                        }
/* 66 */                return;
                    }
/* 6 */             if (z) {
/* 8 */                 this.f12263h = true;
/* 10 */                this.f12266k = true;
                    }
/* 12 */            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 18 */            if (copyOnWriteArrayList.isEmpty()) {
/* 66 */                return;
                    }
/* 21 */            m5817y();
/* 32 */            for (WeakReference weakReference : copyOnWriteArrayList) {
/* 44 */                eh1 eh1Var = (eh1) weakReference.get();
/* 46 */                if (eh1Var == null) {
/* 48 */                    copyOnWriteArrayList.remove(weakReference);
                        } else {
/* 52 */                    eh1Var.mo419b(z);
                        }
                    }
/* 56 */            m5816x();
                }

                @Override // android.view.Menu
                public final boolean performIdentifierAction(int i, int i2) {
/* 6 */             return m5809q(findItem(i), null, i2);
                }

                @Override // android.view.Menu
                public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
/* 1 */             sg1 sg1VarM5804g = m5804g(i, keyEvent);
/* 13 */            boolean zM5809q = sg1VarM5804g != null ? m5809q(sg1VarM5804g, null, i2) : false;
/* 16 */            if ((i2 & 2) != 0) {
/* 19 */                m5803c(true);
                    }
/* 22 */            return zM5809q;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x001a  */
                /* JADX WARN: Code duplicated, block: B:32:0x0056  */
                /* JADX WARN: Code duplicated, block: B:35:0x005d  */
                /* JADX WARN: Code duplicated, block: B:37:0x0064  */
                /* JADX WARN: Code duplicated, block: B:38:0x0069  */
                /* JADX WARN: Code duplicated, block: B:45:0x007a  */
                /* JADX WARN: Code duplicated, block: B:47:0x007e  */
                /* JADX WARN: Code duplicated, block: B:50:0x0087  */
                /* JADX WARN: Code duplicated, block: B:53:0x0099  */
                /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
                /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
                /* JADX WARN: Code duplicated, block: B:75:0x00cb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:76:0x00cd A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:77:0x00c7 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:79:0x00b3 A[SYNTHETIC] */
                /* JADX INFO: renamed from: q */
                public final boolean m5809q(MenuItem menuItem, eh1 eh1Var, int i) {
                    AbstractC1815k2 abstractC1815k2;
                    boolean zExpandActionView;
                    AbstractC1815k2 abstractC1815k3;
                    boolean z;
                    hi2 hi2Var;
                    CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
                    eh1 eh1Var2;
/* 1 */             sg1 sg1Var = (sg1) menuItem;
/* 3 */             boolean zMo420c = false;
/* 4 */             if (sg1Var == null || !sg1Var.isEnabled()) {
/* 3 */                 return false;
                    }
/* 14 */            jg1 jg1Var = sg1Var.f16596n;
/* 16 */            MenuItem.OnMenuItemClickListener onMenuItemClickListener = sg1Var.f16598p;
/* 19 */            if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(sg1Var)) && !jg1Var.mo4231e(jg1Var, sg1Var)) {
/* 36 */                Intent intent = sg1Var.f16589g;
/* 38 */                if (intent != null) {
                            try {
/* 42 */                        jg1Var.f12256a.startActivity(intent);
                            } catch (ActivityNotFoundException e) {
/* 51 */                        AbstractC1245n0.m4877e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
/* 54 */                        abstractC1815k2 = sg1Var.f16580A;
/* 56 */                        if (abstractC1815k2 == null) {
                                }
/* 69 */                        zExpandActionView = false;
/* 70 */                        abstractC1815k3 = sg1Var.f16580A;
/* 72 */                        if (abstractC1815k3 == null) {
/* 87 */                            z = false;
                                } else {
/* 87 */                            z = false;
                                }
/* 92 */                        if (sg1Var.m8502e()) {
/* 98 */                            zExpandActionView |= sg1Var.expandActionView();
/* 99 */                            if (zExpandActionView) {
/* 101 */                               m5803c(true);
                                    }
                                } else if (sg1Var.hasSubMenu()) {
/* 125 */                           if ((i & 4) == 0) {
/* 127 */                               m5803c(false);
                                    }
/* 134 */                           if (!sg1Var.hasSubMenu()) {
/* 140 */                               hi2 hi2Var2 = new hi2(this.f12256a, this, sg1Var);
/* 143 */                               sg1Var.f16597o = hi2Var2;
/* 147 */                               hi2Var2.setHeaderTitle(sg1Var.f16587e);
                                    }
/* 150 */                           hi2Var = sg1Var.f16597o;
/* 152 */                           if (z) {
/* 158 */                               ((tg1) abstractC1815k3).f17088c.onPrepareSubMenu(hi2Var);
                                    }
/* 161 */                           copyOnWriteArrayList = this.f12277v;
/* 167 */                           if (!copyOnWriteArrayList.isEmpty()) {
/* 172 */                               if (eh1Var != null) {
                                        }
/* 184 */                               for (WeakReference weakReference : copyOnWriteArrayList) {
/* 196 */                                   eh1Var2 = (eh1) weakReference.get();
/* 198 */                                   if (eh1Var2 == null) {
/* 200 */                                       copyOnWriteArrayList.remove(weakReference);
                                            } else if (!zMo420c) {
/* 206 */                                       zMo420c = eh1Var2.mo420c(hi2Var);
                                            }
                                        }
                                    }
/* 211 */                           zExpandActionView |= zMo420c;
/* 212 */                           if (!zExpandActionView) {
/* 214 */                               m5803c(true);
                                    }
                                } else {
/* 125 */                           if ((i & 4) == 0) {
/* 127 */                               m5803c(false);
                                    }
/* 134 */                           if (!sg1Var.hasSubMenu()) {
/* 140 */                               hi2 hi2Var3 = new hi2(this.f12256a, this, sg1Var);
/* 143 */                               sg1Var.f16597o = hi2Var3;
/* 147 */                               hi2Var3.setHeaderTitle(sg1Var.f16587e);
                                    }
/* 150 */                           hi2Var = sg1Var.f16597o;
/* 152 */                           if (z) {
/* 158 */                               ((tg1) abstractC1815k3).f17088c.onPrepareSubMenu(hi2Var);
                                    }
/* 161 */                           copyOnWriteArrayList = this.f12277v;
/* 167 */                           if (!copyOnWriteArrayList.isEmpty()) {
/* 172 */                               zMo420c = eh1Var != null ? eh1Var.mo420c(hi2Var) : false;
/* 184 */                               while (r8.hasNext()) {
/* 196 */                                   eh1Var2 = (eh1) weakReference.get();
/* 198 */                                   if (eh1Var2 == null) {
/* 200 */                                       copyOnWriteArrayList.remove(weakReference);
                                            } else if (!zMo420c) {
/* 206 */                                       zMo420c = eh1Var2.mo420c(hi2Var);
                                            }
                                        }
                                    }
/* 211 */                           zExpandActionView |= zMo420c;
/* 212 */                           if (!zExpandActionView) {
/* 214 */                               m5803c(true);
                                    }
                                }
/* 217 */                       return zExpandActionView;
                            }
/* 27 */                    zExpandActionView = true;
                        } else {
/* 54 */                    abstractC1815k2 = sg1Var.f16580A;
/* 56 */                    if (abstractC1815k2 == null && ((tg1) abstractC1815k2).f17088c.onPerformDefaultAction()) {
/* 27 */                        zExpandActionView = true;
                            } else {
/* 69 */                        zExpandActionView = false;
                            }
                        }
                    } else {
/* 27 */                zExpandActionView = true;
                    }
/* 70 */            abstractC1815k3 = sg1Var.f16580A;
/* 72 */            if (abstractC1815k3 == null && ((tg1) abstractC1815k3).f17088c.hasSubMenu()) {
/* 85 */                z = true;
                    } else {
/* 87 */                z = false;
                    }
/* 92 */            if (sg1Var.m8502e()) {
/* 98 */                zExpandActionView |= sg1Var.expandActionView();
/* 99 */                if (zExpandActionView) {
/* 101 */                   m5803c(true);
                        }
                    } else if (sg1Var.hasSubMenu() || z) {
/* 125 */               if ((i & 4) == 0) {
/* 127 */                   m5803c(false);
                        }
/* 134 */               if (!sg1Var.hasSubMenu()) {
/* 140 */                   hi2 hi2Var4 = new hi2(this.f12256a, this, sg1Var);
/* 143 */                   sg1Var.f16597o = hi2Var4;
/* 147 */                   hi2Var4.setHeaderTitle(sg1Var.f16587e);
                        }
/* 150 */               hi2Var = sg1Var.f16597o;
/* 152 */               if (z) {
/* 158 */                   ((tg1) abstractC1815k3).f17088c.onPrepareSubMenu(hi2Var);
                        }
/* 161 */               copyOnWriteArrayList = this.f12277v;
/* 167 */               if (!copyOnWriteArrayList.isEmpty()) {
/* 172 */                   if (eh1Var != null) {
                            }
/* 184 */                   while (r8.hasNext()) {
/* 196 */                       eh1Var2 = (eh1) weakReference.get();
/* 198 */                       if (eh1Var2 == null) {
/* 200 */                           copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo420c) {
/* 206 */                           zMo420c = eh1Var2.mo420c(hi2Var);
                                }
                            }
                        }
/* 211 */               zExpandActionView |= zMo420c;
/* 212 */               if (!zExpandActionView) {
/* 214 */                   m5803c(true);
                        }
                    } else if ((i & 1) == 0) {
/* 119 */               m5803c(true);
                    }
/* 217 */           return zExpandActionView;
                }

                /* JADX INFO: renamed from: r */
                public final void m5810r(eh1 eh1Var) {
/* 1 */             CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 11 */            for (WeakReference weakReference : copyOnWriteArrayList) {
/* 23 */                eh1 eh1Var2 = (eh1) weakReference.get();
/* 25 */                if (eh1Var2 == null || eh1Var2 == eh1Var) {
/* 29 */                    copyOnWriteArrayList.remove(weakReference);
                        }
                    }
                }

                @Override // android.view.Menu
                public final void removeGroup(int i) {
/* 1 */             ArrayList arrayList = this.f12261f;
/* 3 */             int size = arrayList.size();
/* 7 */             int i2 = 0;
/* 8 */             int i3 = 0;
                    while (true) {
/* 9 */                 if (i3 >= size) {
/* 25 */                    i3 = -1;
                            break;
                        } else if (((sg1) arrayList.get(i3)).f16584b == i) {
                            break;
                        } else {
/* 22 */                    i3++;
                        }
                    }
/* 26 */            if (i3 >= 0) {
/* 32 */                int size2 = arrayList.size() - i3;
                        while (true) {
/* 33 */                    int i4 = i2 + 1;
/* 35 */                    if (i2 >= size2 || ((sg1) arrayList.get(i3)).f16584b != i) {
                                break;
                            }
/* 47 */                    if (i3 >= 0 && i3 < arrayList.size()) {
/* 56 */                        arrayList.remove(i3);
                            }
/* 59 */                    i2 = i4;
                        }
/* 62 */                mo5808p(true);
                    }
                }

                @Override // android.view.Menu
                public final void removeItem(int i) {
/* 1 */             ArrayList arrayList = this.f12261f;
/* 3 */             int size = arrayList.size();
/* 7 */             int i2 = 0;
                    while (true) {
/* 8 */                 if (i2 >= size) {
/* 24 */                    i2 = -1;
                            break;
                        } else if (((sg1) arrayList.get(i2)).f16583a == i) {
                            break;
                        } else {
/* 21 */                    i2++;
                        }
                    }
/* 25 */            if (i2 < 0 || i2 >= arrayList.size()) {
/* 41 */                return;
                    }
/* 34 */            arrayList.remove(i2);
/* 38 */            mo5808p(true);
                }

                /* JADX INFO: renamed from: s */
                public final void m5811s(Bundle bundle) {
                    MenuItem menuItemFindItem;
/* 1 */             if (bundle == null) {
/* 76 */                return;
                    }
/* 8 */             SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo4233j());
/* 14 */            int size = this.f12261f.size();
/* 19 */            for (int i = 0; i < size; i++) {
/* 21 */                MenuItem item = getItem(i);
/* 25 */                View actionView = item.getActionView();
/* 29 */                if (actionView != null && actionView.getId() != -1) {
/* 38 */                    actionView.restoreHierarchyState(sparseParcelableArray);
                        }
/* 45 */                if (item.hasSubMenu()) {
/* 53 */                    ((hi2) item.getSubMenu()).m5811s(bundle);
                        }
                    }
/* 61 */            int i2 = bundle.getInt("android:menu:expandedactionview");
/* 65 */            if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
/* 76 */                return;
                    }
/* 73 */            menuItemFindItem.expandActionView();
                }

                @Override // android.view.Menu
                public final void setGroupCheckable(int i, boolean z, boolean z2) {
/* 1 */             ArrayList arrayList = this.f12261f;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i2 = 0; i2 < size; i2++) {
/* 14 */                sg1 sg1Var = (sg1) arrayList.get(i2);
/* 18 */                if (sg1Var.f16584b == i) {
/* 20 */                    sg1Var.m8503f(z2);
/* 23 */                    sg1Var.setCheckable(z);
                        }
                    }
                }

                @Override // android.view.Menu
                public void setGroupDividerEnabled(boolean z) {
/* 1 */             this.f12279x = z;
                }

                @Override // android.view.Menu
                public final void setGroupEnabled(int i, boolean z) {
/* 1 */             ArrayList arrayList = this.f12261f;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i2 = 0; i2 < size; i2++) {
/* 14 */                sg1 sg1Var = (sg1) arrayList.get(i2);
/* 18 */                if (sg1Var.f16584b == i) {
/* 20 */                    sg1Var.setEnabled(z);
                        }
                    }
                }

                @Override // android.view.Menu
                public final void setGroupVisible(int i, boolean z) {
/* 1 */             ArrayList arrayList = this.f12261f;
/* 3 */             int size = arrayList.size();
/* 9 */             boolean z2 = false;
/* 11 */            for (int i2 = 0; i2 < size; i2++) {
/* 17 */                sg1 sg1Var = (sg1) arrayList.get(i2);
/* 21 */                if (sg1Var.f16584b == i) {
/* 23 */                    int i3 = sg1Var.f16606x;
/* 33 */                    int i4 = (i3 & (-9)) | (z ? 0 : 8);
/* 34 */                    sg1Var.f16606x = i4;
/* 36 */                    if (i3 != i4) {
/* 38 */                        z2 = true;
                            }
                        }
                    }
/* 42 */            if (z2) {
/* 44 */                mo5808p(true);
                    }
                }

                @Override // android.view.Menu
                public void setQwertyMode(boolean z) {
/* 1 */             this.f12258c = z;
/* 4 */             mo5808p(false);
                }

                @Override // android.view.Menu
                public final int size() {
/* 3 */             return this.f12261f.size();
                }

                /* JADX INFO: renamed from: t */
                public final void m5812t(Bundle bundle) {
                    Parcelable parcelable;
/* 3 */             SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
/* 7 */             if (sparseParcelableArray != null) {
/* 9 */                 CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 15 */                if (copyOnWriteArrayList.isEmpty()) {
/* 64 */                    return;
                        }
/* 26 */                for (WeakReference weakReference : copyOnWriteArrayList) {
/* 38 */                    eh1 eh1Var = (eh1) weakReference.get();
/* 40 */                    if (eh1Var == null) {
/* 42 */                        copyOnWriteArrayList.remove(weakReference);
                            } else {
/* 46 */                        int id = eh1Var.getId();
/* 50 */                        if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
/* 60 */                            eh1Var.mo423g(parcelable);
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: u */
                public final void m5813u(Bundle bundle) {
/* 3 */             int size = this.f12261f.size();
/* 7 */             SparseArray<? extends Parcelable> sparseArray = null;
/* 9 */             for (int i = 0; i < size; i++) {
/* 11 */                MenuItem item = getItem(i);
/* 15 */                View actionView = item.getActionView();
/* 19 */                if (actionView != null && actionView.getId() != -1) {
/* 28 */                    if (sparseArray == null) {
/* 32 */                        sparseArray = new SparseArray<>();
                            }
/* 35 */                    actionView.saveHierarchyState(sparseArray);
/* 42 */                    if (item.isActionViewExpanded()) {
/* 50 */                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                            }
                        }
/* 57 */                if (item.hasSubMenu()) {
/* 65 */                    ((hi2) item.getSubMenu()).m5813u(bundle);
                        }
                    }
/* 71 */            if (sparseArray != null) {
/* 77 */                bundle.putSparseParcelableArray(mo4233j(), sparseArray);
                    }
                }

                /* JADX INFO: renamed from: v */
                public final void m5814v(Bundle bundle) {
                    Parcelable parcelableMo426l;
/* 1 */             CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f12277v;
/* 7 */             if (copyOnWriteArrayList.isEmpty()) {
/* 9 */                 return;
                    }
/* 12 */            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
/* 23 */            for (WeakReference weakReference : copyOnWriteArrayList) {
/* 35 */                eh1 eh1Var = (eh1) weakReference.get();
/* 37 */                if (eh1Var == null) {
/* 39 */                    copyOnWriteArrayList.remove(weakReference);
                        } else {
/* 43 */                    int id = eh1Var.getId();
/* 47 */                    if (id > 0 && (parcelableMo426l = eh1Var.mo426l()) != null) {
/* 55 */                        sparseArray.put(id, parcelableMo426l);
                            }
                        }
                    }
/* 61 */            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
                }

                /* JADX INFO: renamed from: w */
                public final void m5815w(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
/* 2 */             if (view != null) {
/* 4 */                 this.f12270o = view;
/* 6 */                 this.f12268m = null;
/* 8 */                 this.f12269n = null;
                    } else {
/* 11 */                if (i > 0) {
/* 19 */                    this.f12268m = this.f12257b.getText(i);
                        } else if (charSequence != null) {
/* 24 */                    this.f12268m = charSequence;
                        }
/* 26 */                if (i2 > 0) {
/* 34 */                    this.f12269n = v00.getDrawable(this.f12256a, i2);
                        } else if (drawable != null) {
/* 39 */                    this.f12269n = drawable;
                        }
/* 41 */                this.f12270o = null;
                    }
/* 44 */            mo5808p(false);
                }

                /* JADX INFO: renamed from: x */
                public final void m5816x() {
/* 2 */             this.f12271p = false;
/* 6 */             if (this.f12272q) {
/* 8 */                 this.f12272q = false;
/* 12 */                mo5808p(this.f12273r);
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m5817y() {
/* 3 */             if (this.f12271p) {
/* 13 */                return;
                    }
/* 6 */             this.f12271p = true;
/* 9 */             this.f12272q = false;
/* 11 */            this.f12273r = false;
                }

                @Override // android.view.Menu
/* 12 */        public final MenuItem add(CharSequence charSequence) {
/* 13 */            return mo5801a(0, 0, 0, charSequence);
                }

                @Override // android.view.Menu
/* 13 */        public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
/* 14 */            return mo5801a(i, i2, i3, charSequence);
                }

                @Override // android.view.Menu
/* 14 */        public final MenuItem add(int i, int i2, int i3, int i4) {
/* 15 */            return mo5801a(i, i2, i3, this.f12257b.getString(i4));
                }

                @Override // android.view.Menu
/* 19 */        public final SubMenu addSubMenu(int i) {
/* 20 */            return addSubMenu(0, 0, 0, this.f12257b.getString(i));
                }

                @Override // android.view.Menu
/* 20 */        public final SubMenu addSubMenu(CharSequence charSequence) {
/* 21 */            return addSubMenu(0, 0, 0, charSequence);
                }

                @Override // android.view.Menu
/* 21 */        public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
/* 22 */            return addSubMenu(i, i2, i3, this.f12257b.getString(i4));
                }
            }
