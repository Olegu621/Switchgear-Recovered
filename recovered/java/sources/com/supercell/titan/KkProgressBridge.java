            package com.supercell.titan;

            import android.app.Activity;
            import android.app.AlertDialog;
            import android.app.Dialog;
            import android.app.DialogFragment;
            import android.app.Fragment;
            import android.os.Process;
            import android.view.View;
            import android.widget.Button;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes4.dex */
/* 13 */    public final class KkProgressBridge {
                private static final Callback CALLBACK = new Callback();
                private static int action;
                private static int dialogId;
                private static String message;

                /* JADX INFO: renamed from: q */
                public static volatile int f5819q;
                private static boolean scheduled;
                private static String title;

/* 24 */        private KkProgressBridge() {
                }

                /* JADX INFO: renamed from: p */
/* 30 */        public static synchronized void m2733p(int i, String str, String str2, int i2) {
/* 31 */            if (scheduled && action == 2 && i2 != 2) {
                        return;
                    }
/* 33 */            f5819q = 0;
/* 34 */            dialogId = i;
/* 35 */            title = str;
/* 36 */            message = str2;
/* 37 */            action = i2;
/* 38 */            if (scheduled) {
                        return;
                    }
                    try {
/* 43 */                Object objInvoke = Class.forName("com.supercell.titan.GameApp").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
/* 44 */                if (objInvoke instanceof Activity) {
/* 45 */                    scheduled = true;
/* 46 */                    ((Activity) objInvoke).runOnUiThread(CALLBACK);
                        }
                    } catch (Throwable th) {
                    }
                }

/* 53 */        private static Object staticField(Class<?> cls, String str) throws Exception {
/* 54 */            Field declaredField = cls.getDeclaredField(str);
/* 55 */            declaredField.setAccessible(true);
/* 56 */            return declaredField.get(null);
                }

/* 59 */        private static int intField(Object obj, String str) throws Exception {
/* 60 */            Field declaredField = obj.getClass().getDeclaredField(str);
/* 61 */            declaredField.setAccessible(true);
/* 62 */            return declaredField.getInt(obj);
                }

/* 66 */        private static void dismissAll(Class<?> cls) {
                    try {
/* 67 */                Method declaredMethod = cls.getDeclaredMethod("nativeDialogDismissAll", new Class[0]);
/* 68 */                declaredMethod.setAccessible(true);
/* 69 */                declaredMethod.invoke(null, new Object[0]);
                    } catch (Throwable th) {
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 74 */        public static synchronized void refresh() {
/* 75 */            scheduled = false;
/* 76 */            int i = action;
                    try {
/* 78 */                Class<?> cls = Class.forName("com.supercell.titan.NativeDialogManager");
/* 81 */                Object objStaticField = staticField(cls, "d");
/* 82 */                if (i == 2) {
/* 83 */                    dismissAll(cls);
/* 84 */                    dismissRestoredFragment();
/* 85 */                    f5819q = 3;
                            return;
                        }
/* 88 */                if ((objStaticField instanceof DialogFragment) && intField(objStaticField, "a") == dialogId) {
/* 91 */                    Dialog dialog = ((DialogFragment) objStaticField).getDialog();
/* 92 */                    if (dialog instanceof AlertDialog) {
/* 94 */                        AlertDialog alertDialog = (AlertDialog) dialog;
/* 95 */                        alertDialog.setTitle(title);
/* 96 */                        alertDialog.setMessage(message);
/* 97 */                        Button button = alertDialog.getButton(-3);
/* 98 */                        if (button == null) {
                                    return;
                                }
                                if (i == 3 || i == 4) {
/* 101 */                           button.setOnClickListener(CALLBACK);
/* 102 */                           button.setText(i == 3 ? "Pause" : "Resume");
/* 103 */                           button.setVisibility(0);
                                } else if (i == 1) {
/* 105 */                           button.setOnClickListener(CALLBACK);
/* 106 */                           button.setText("Close the app");
/* 107 */                           button.setVisibility(0);
                                } else {
/* 109 */                           button.setText(HttpUrl.FRAGMENT_ENCODE_SET);
/* 110 */                           button.setVisibility(8);
                                }
/* 112 */                       f5819q = 1;
                            }
                        }
                    } catch (Throwable th) {
                    }
                }

/* 120 */       private static void dismissRestoredFragment() {
                    try {
/* 123 */               Object objInvoke = Class.forName("com.supercell.titan.GameApp").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
/* 124 */               if (!(objInvoke instanceof Activity)) {
/* 125 */                   return;
                        }
/* 127 */               Fragment fragmentFindFragmentByTag = ((Activity) objInvoke).getFragmentManager().findFragmentByTag("NativeDialog");
/* 128 */               if (fragmentFindFragmentByTag instanceof DialogFragment) {
/* 129 */                   ((DialogFragment) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                        }
                    } catch (Throwable th) {
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 134 */       public static synchronized void click() {
/* 135 */           if (action == 3) {
/* 136 */               f5819q = 4;
                    } else if (action == 4) {
/* 138 */               f5819q = 5;
                    } else {
/* 140 */               Process.killProcess(Process.myPid());
                    }
                }

/* 142 */       private static final class Callback implements Runnable, View.OnClickListener {
/* 143 */           private Callback() {
                    }

                    @Override // java.lang.Runnable
/* 145 */           public void run() {
/* 15 */                KkProgressBridge.refresh();
                    }

                    @Override // android.view.View.OnClickListener
/* 146 */           public void onClick(View view) {
/* 15 */                KkProgressBridge.click();
                    }
                }
            }
