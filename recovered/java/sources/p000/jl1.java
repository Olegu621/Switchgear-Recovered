            package p000;

            import android.R;
            import android.os.Bundle;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.NativeDialogManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jl1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f12346a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f12347b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f12348c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f12349d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f12350e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f12351f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ GameApp f12352i;

                public jl1(String str, String str2, String str3, String str4, String str5, int i, GameApp gameApp) {
/* 4 */             this.f12346a = str;
/* 6 */             this.f12347b = str2;
/* 8 */             this.f12348c = str3;
/* 10 */            this.f12349d = str4;
/* 12 */            this.f12350e = str5;
/* 14 */            this.f12351f = i;
/* 16 */            this.f12352i = gameApp;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             NativeDialogManager nativeDialogManager = new NativeDialogManager();
/* 10 */            nativeDialogManager.setStyle(0, R.style.Theme.DeviceDefault.Dialog);
/* 15 */            Bundle bundle = new Bundle();
/* 22 */            bundle.putString("title", this.f12346a);
/* 29 */            bundle.putString("message", this.f12347b);
/* 36 */            bundle.putString("button", this.f12348c);
/* 43 */            bundle.putString("button2", this.f12349d);
/* 50 */            bundle.putString("button3", this.f12350e);
/* 57 */            bundle.putInt("id", this.f12351f);
/* 60 */            nativeDialogManager.setArguments(bundle);
/* 63 */            nativeDialogManager.setCancelable(false);
                    try {
/* 74 */                nativeDialogManager.show(this.f12352i.getFragmentManager(), "NativeDialog");
/* 77 */                NativeDialogManager.f5828d = nativeDialogManager;
                    } catch (Exception e) {
/* 81 */                GameApp.debuggerException(e);
                    }
                }
            }
