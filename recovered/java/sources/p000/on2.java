            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.text.Editable;
            import android.view.ActionMode;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.widget.TextView;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class on2 implements ActionMode.Callback {

                /* JADX INFO: renamed from: a */
                public final ActionMode.Callback f14842a;

                /* JADX INFO: renamed from: b */
                public final TextView f14843b;

                /* JADX INFO: renamed from: c */
                public Class f14844c;

                /* JADX INFO: renamed from: d */
                public Method f14845d;

                /* JADX INFO: renamed from: e */
                public boolean f14846e;

                /* JADX INFO: renamed from: f */
                public boolean f14847f = false;

                public on2(ActionMode.Callback callback, TextView textView) {
/* 4 */             this.f14842a = callback;
/* 6 */             this.f14843b = textView;
                }

                @Override // android.view.ActionMode.Callback
                public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
/* 3 */             return this.f14842a.onActionItemClicked(actionMode, menuItem);
                }

                @Override // android.view.ActionMode.Callback
                public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
/* 3 */             return this.f14842a.onCreateActionMode(actionMode, menu);
                }

                @Override // android.view.ActionMode.Callback
                public final void onDestroyActionMode(ActionMode actionMode) {
/* 3 */             this.f14842a.onDestroyActionMode(actionMode);
                }

                @Override // android.view.ActionMode.Callback
                public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    String str;
/* 1 */             TextView textView = this.f14843b;
/* 3 */             Context context = textView.getContext();
/* 7 */             PackageManager packageManager = context.getPackageManager();
/* 11 */            boolean z = this.f14847f;
/* 13 */            Class cls = Integer.TYPE;
/* 19 */            if (!z) {
/* 21 */                this.f14847f = true;
                        try {
/* 25 */                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
/* 29 */                    this.f14844c = cls2;
/* 39 */                    this.f14845d = cls2.getDeclaredMethod("removeItemAt", cls);
/* 41 */                    this.f14846e = true;
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
/* 45 */                    this.f14844c = null;
/* 47 */                    this.f14845d = null;
/* 49 */                    this.f14846e = false;
                        }
                    }
                    try {
/* 74 */                Method declaredMethod = (this.f14846e && this.f14844c.isInstance(menu)) ? this.f14845d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
/* 85 */                for (int size = menu.size() - 1; size >= 0; size--) {
/* 87 */                    MenuItem item = menu.getItem(size);
/* 95 */                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
/* 119 */                       declaredMethod.invoke(menu, Integer.valueOf(size));
                            }
                        }
/* 127 */               ArrayList arrayList = new ArrayList();
/* 134 */               if (context instanceof Activity) {
/* 162 */                   for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
/* 182 */                       if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
/* 185 */                           ActivityInfo activityInfo = resolveInfo.activityInfo;
/* 189 */                           if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                                    }
                                }
/* 202 */                       arrayList.add(resolveInfo);
                            }
                        }
/* 211 */               for (int i = 0; i < arrayList.size(); i++) {
/* 217 */                   ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
/* 225 */                   MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
/* 264 */                   Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
/* 268 */                   ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
/* 282 */                   menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    }
/* 290 */           return this.f14842a.onPrepareActionMode(actionMode, menu);
                }
            }
