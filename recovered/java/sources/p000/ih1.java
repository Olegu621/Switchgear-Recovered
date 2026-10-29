            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.SubMenu;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class ih1 extends AbstractC2211ta implements Menu {

                /* JADX INFO: renamed from: c */
                public final jg1 f9587c;

                public ih1(Context context, jg1 jg1Var) {
/* 1 */             super(context);
/* 4 */             if (jg1Var != null) {
/* 6 */                 this.f9587c = jg1Var;
                    } else {
/* 11 */                C1951n4.m6859j("Wrapped Object can not be null.");
/* 15 */                throw null;
                    }
                }

                @Override // android.view.Menu
                public final MenuItem add(CharSequence charSequence) {
/* 8 */             return m8749i(this.f9587c.mo5801a(0, 0, 0, charSequence));
                }

                @Override // android.view.Menu
                public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
/* 10 */            MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
/* 24 */            int iAddIntentOptions = this.f9587c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
/* 28 */            if (menuItemArr2 != null) {
/* 30 */                int length = menuItemArr2.length;
/* 32 */                for (int i5 = 0; i5 < length; i5++) {
/* 40 */                    menuItemArr[i5] = m8749i(menuItemArr2[i5]);
                        }
                    }
/* 45 */            return iAddIntentOptions;
                }

                @Override // android.view.Menu
                public final SubMenu addSubMenu(CharSequence charSequence) {
/* 3 */             return this.f9587c.addSubMenu(charSequence);
                }

                @Override // android.view.Menu
                public final void clear() {
/* 3 */             le2 le2Var = (le2) this.f17001b;
/* 5 */             if (le2Var != null) {
/* 7 */                 le2Var.clear();
                    }
/* 12 */            this.f9587c.clear();
                }

                @Override // android.view.Menu
                public final void close() {
/* 3 */             this.f9587c.close();
                }

                @Override // android.view.Menu
                public final MenuItem findItem(int i) {
/* 7 */             return m8749i(this.f9587c.findItem(i));
                }

                @Override // android.view.Menu
                public final MenuItem getItem(int i) {
/* 7 */             return m8749i(this.f9587c.getItem(i));
                }

                @Override // android.view.Menu
                public final boolean hasVisibleItems() {
/* 3 */             return this.f9587c.hasVisibleItems();
                }

                @Override // android.view.Menu
                public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
/* 3 */             return this.f9587c.isShortcutKey(i, keyEvent);
                }

                @Override // android.view.Menu
                public final boolean performIdentifierAction(int i, int i2) {
/* 3 */             return this.f9587c.performIdentifierAction(i, i2);
                }

                @Override // android.view.Menu
                public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
/* 3 */             return this.f9587c.performShortcut(i, keyEvent, i2);
                }

                @Override // android.view.Menu
                public final void removeGroup(int i) {
/* 5 */             if (((le2) this.f17001b) != null) {
/* 8 */                 int i2 = 0;
                        while (true) {
/* 11 */                    le2 le2Var = (le2) this.f17001b;
/* 15 */                    if (i2 >= le2Var.f13213c) {
                                break;
                            }
/* 27 */                    if (((zi2) le2Var.m6428h(i2)).getGroupId() == i) {
/* 33 */                        ((le2) this.f17001b).m6429i(i2);
/* 36 */                        i2--;
                            }
/* 38 */                    i2++;
                        }
                    }
/* 43 */            this.f9587c.removeGroup(i);
                }

                @Override // android.view.Menu
                public final void removeItem(int i) {
/* 5 */             if (((le2) this.f17001b) != null) {
/* 8 */                 int i2 = 0;
                        while (true) {
/* 11 */                    le2 le2Var = (le2) this.f17001b;
/* 15 */                    if (i2 >= le2Var.f13213c) {
                                break;
                            }
/* 27 */                    if (((zi2) le2Var.m6428h(i2)).getItemId() == i) {
/* 33 */                        ((le2) this.f17001b).m6429i(i2);
                                break;
                            }
/* 37 */                    i2++;
                        }
                    }
/* 42 */            this.f9587c.removeItem(i);
                }

                @Override // android.view.Menu
                public final void setGroupCheckable(int i, boolean z, boolean z2) {
/* 3 */             this.f9587c.setGroupCheckable(i, z, z2);
                }

                @Override // android.view.Menu
                public final void setGroupEnabled(int i, boolean z) {
/* 3 */             this.f9587c.setGroupEnabled(i, z);
                }

                @Override // android.view.Menu
                public final void setGroupVisible(int i, boolean z) {
/* 3 */             this.f9587c.setGroupVisible(i, z);
                }

                @Override // android.view.Menu
                public final void setQwertyMode(boolean z) {
/* 3 */             this.f9587c.setQwertyMode(z);
                }

                @Override // android.view.Menu
                public final int size() {
/* 3 */             return this.f9587c.size();
                }

                @Override // android.view.Menu
/* 7 */         public final SubMenu addSubMenu(int i) {
/* 8 */             return this.f9587c.addSubMenu(i);
                }

                @Override // android.view.Menu
/* 8 */         public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
/* 9 */             return this.f9587c.addSubMenu(i, i2, i3, charSequence);
                }

                @Override // android.view.Menu
/* 9 */         public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
/* 11 */            return this.f9587c.addSubMenu(i, i2, i3, i4);
                }

                @Override // android.view.Menu
/* 12 */        public final MenuItem add(int i) {
/* 13 */            return m8749i(this.f9587c.add(i));
                }

                @Override // android.view.Menu
/* 13 */        public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
/* 16 */            return m8749i(this.f9587c.mo5801a(i, i2, i3, charSequence));
                }

                @Override // android.view.Menu
/* 16 */        public final MenuItem add(int i, int i2, int i3, int i4) {
/* 17 */            return m8749i(this.f9587c.add(i, i2, i3, i4));
                }
            }
