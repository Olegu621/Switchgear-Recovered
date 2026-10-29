            package com.supercell.titan;

            import android.app.Activity;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Process;
            import android.view.View;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes3.dex */
/* 13 */    public final class KkRestartActivity extends Activity {
                @Override // android.app.Activity
/* 14 */        public void onCreate(Bundle bundle) {
/* 15 */            super.onCreate(bundle);
/* 16 */            View view = new View(this);
/* 17 */            view.setBackgroundColor(-16777216);
/* 18 */            setContentView(view);
/* 20 */            int intExtra = getIntent().getIntExtra("fusion.old_pid", -1);
/* 21 */            if (intExtra > 0 && intExtra != Process.myPid()) {
/* 22 */                Process.killProcess(intExtra);
                    }
/* 24 */            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.supercell.titan.KkRestartActivity.1
                        @Override // java.lang.Runnable
/* 25 */                public void run() {
/* 26 */                    Intent intent = new Intent("android.intent.action.MAIN");
/* 27 */                    intent.addCategory("android.intent.category.LAUNCHER");
/* 28 */                    intent.setClass(KkRestartActivity.this, KkGateActivity.class);
/* 29 */                    intent.addFlags(268468224);
/* 31 */                    KkRestartActivity.this.startActivity(intent);
/* 32 */                    KkRestartActivity.this.finishAndRemoveTask();
/* 33 */                    Process.killProcess(Process.myPid());
                        }
                    }, 650L);
                }
            }
