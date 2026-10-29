            package com.supercell.titan;

            import android.app.AlertDialog;
            import p000.bq0;
            
            /* JADX INFO: renamed from: com.supercell.titan.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC0796c implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ GameApp f5993a;

                public RunnableC0796c(GameApp gameApp) {
/* 4 */             this.f5993a = gameApp;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 4 */             bq0 bq0Var = new bq0(this, 0);
/* 7 */             GameApp gameApp = this.f5993a;
/* 23 */            String strReplace = gameApp.getResources().getString(R.string.UnsatisfiedLinkErrorReinstallPromptGooglePlayStore).replace("{GAME}", gameApp.f5757b0);
/* 29 */            AlertDialog.Builder builder = new AlertDialog.Builder(gameApp);
/* 32 */            builder.setMessage(strReplace);
/* 37 */            builder.setPositiveButton("OK", bq0Var);
/* 42 */            builder.setNegativeButton("Uninstall", bq0Var);
/* 45 */            builder.setCancelable(false);
/* 52 */            builder.create().show();
                }
            }
