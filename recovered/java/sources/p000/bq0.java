            package p000;

            import android.content.DialogInterface;
            import android.content.Intent;
            import android.net.Uri;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.NativeDialogManager;
            import com.supercell.titan.RunnableC0796c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bq0 implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2571a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f2572b;

                public /* synthetic */ bq0(Object obj, int i) {
/* 1 */             this.f2571a = i;
/* 3 */             this.f2572b = obj;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
/* 1 */             int i3 = this.f2571a;
/* 3 */             Object obj = this.f2572b;
                    switch (i3) {
                        case 0:
/* 29 */                    GameApp gameApp = ((RunnableC0796c) obj).f5993a;
/* 31 */                    if (i == -2) {
/* 36 */                        Intent intent = new Intent();
/* 41 */                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
/* 59 */                        intent.setData(Uri.fromParts("package", GameApp.getInstance().getPackageName(), null));
/* 62 */                        gameApp.startActivity(intent);
                            }
/* 65 */                    gameApp.finish();
                            break;
                        default:
/* 10 */                    if (i == -1) {
/* 12 */                        i2 = 1;
                            } else {
/* 18 */                        i2 = i == -2 ? 2 : 0;
                            }
/* 19 */                    NativeDialogManager nativeDialogManager = (NativeDialogManager) obj;
/* 23 */                    nativeDialogManager.m2735a(nativeDialogManager.f5830a, i2);
                            break;
                    }
                }
            }
