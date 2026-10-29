            package com.supercell.titan;

            import android.app.Activity;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Process;
            import android.view.View;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import zap.C2540m;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes3.dex */
/* 13 */    public final class KkGateActivity extends Activity {
                private static final boolean DIAGNOSTICS = false;
                public static volatile boolean foregroundHandoffPending;
                private boolean gateStarted;
                private boolean terminalUi;

                @Override // android.app.Activity
/* 26 */        public void onBackPressed() {
                }

                @Override // android.app.Activity
/* 30 */        public void onCreate(Bundle bundle) {
/* 31 */            super.onCreate(bundle);
/* 33 */            View view = new View(this);
/* 34 */            view.setBackgroundColor(-16777216);
/* 35 */            setContentView(view);
/* 36 */            if (this.gateStarted) {
/* 37 */                return;
                    }
/* 38 */            this.gateStarted = true;
/* 43 */            new Thread(new Runnable() { // from class: com.supercell.titan.KkGateActivity.1
                        @Override // java.lang.Runnable
/* 40 */                public void run() {
/* 15 */                    KkGateActivity.this.runGate();
                        }
                    }, "fusion-start").start();
/* 44 */            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.supercell.titan.KkGateActivity.2
                        @Override // java.lang.Runnable
/* 45 */                public void run() {
/* 15 */                    if (!KkGateActivity.this.terminalUi) {
/* 47 */                        KkGateActivity.this.onGateFailure("-15");
                            }
                        }
                    }, 45000L);
                }

/* 52 */        private static boolean baseLibrariesLoaded() throws Exception {
/* 54 */            Field declaredField = Class.forName("com.supercell.titan.TitanApplication").getDeclaredField("nativeBaseLibrariesLoaded");
/* 55 */            declaredField.setAccessible(true);
/* 56 */            return declaredField.getBoolean(null);
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 59 */        public void runGate() {
                    String str;
/* 60 */            final String str2 = "-14";
                    try {
/* 64 */                if (!baseLibrariesLoaded()) {
/* 65 */                    publishFailure("-14");
/* 66 */                    return;
                        }
/* 71 */                if (!C2540m.start(this)) {
/* 72 */                    publishFailure("-14");
/* 73 */                    return;
                        }
                        while (true) {
/* 76 */                    str = System.getenv("R8v3N2q7");
/* 77 */                    if (str != null && !"-100".equals(str)) {
                                break;
                            } else {
/* 82 */                        Thread.sleep(50L);
                            }
                        }
/* 87 */                str2 = str;
/* 90 */                runOnUiThread(new Runnable() { // from class: com.supercell.titan.KkGateActivity.3
                            @Override // java.lang.Runnable
/* 91 */                    public void run() {
/* 92 */                        if ("0".equals(str2)) {
/* 93 */                            KkGateActivity.this.onGateSuccess();
                                } else {
/* 95 */                            KkGateActivity.this.onGateFailure(str2);
                                }
                            }
                        });
                    } catch (Throwable th) {
                    }
                }

/* 100 */       private void publishFailure(final String str) {
/* 101 */           runOnUiThread(new Runnable() { // from class: com.supercell.titan.KkGateActivity.4
                        @Override // java.lang.Runnable
/* 102 */               public void run() {
/* 103 */                   KkGateActivity.this.onGateFailure(str);
                        }
                    });
                }

/* 108 */       public void onGateFailure(String str) {
/* 109 */           if (this.terminalUi) {
/* 110 */               return;
                    }
                    try {
/* 113 */               int i = Integer.parseInt(str);
/* 116 */               if (i >= -13 && i <= -1) {
/* 117 */                   onGateSuccess();
/* 118 */                   return;
                        }
                    } catch (Throwable th) {
                    }
/* 122 */           this.terminalUi = true;
/* 123 */           finishAndRemoveTask();
/* 124 */           Process.killProcess(Process.myPid());
                }

/* 127 */       public void onGateSuccess() {
/* 128 */           if (this.terminalUi) {
/* 129 */               return;
                    }
                    try {
                        Class<?> cls = Class.forName("com.supercell.titan.TitanApplication");
/* 133 */               Field declaredField = cls.getDeclaredField("nativeLibrariesLoaded");
/* 134 */               declaredField.setAccessible(true);
/* 135 */               if (!declaredField.getBoolean(null)) {
/* 136 */                   declaredField.setBoolean(null, true);
/* 137 */                   Method declaredMethod = cls.getDeclaredMethod("nOnNativeLibrariesLoaded", new Class[0]);
/* 138 */                   Method declaredMethod2 = cls.getDeclaredMethod("nOnApplicationCreate", new Class[0]);
/* 139 */                   declaredMethod.setAccessible(true);
/* 140 */                   declaredMethod2.setAccessible(true);
/* 135 */                   declaredMethod.invoke(null, new Object[0]);
/* 135 */                   declaredMethod2.invoke(null, new Object[0]);
                        }
/* 145 */               this.terminalUi = true;
/* 146 */               foregroundHandoffPending = true;
/* 147 */               Intent intent = new Intent(getIntent());
/* 148 */               intent.setClassName(this, "com.supercell.brawlstars.GameApp");
/* 149 */               startActivity(intent);
/* 150 */               finish();
                    } catch (Throwable th) {
/* 153 */               this.terminalUi = true;
/* 154 */               finishAndRemoveTask();
/* 155 */               Process.killProcess(Process.myPid());
                    }
                }
            }
