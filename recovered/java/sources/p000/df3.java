            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.os.Build;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class df3 {

                /* JADX INFO: renamed from: a */
                public final C0204c5 f7166a;

                /* JADX INFO: renamed from: b */
                public final IntentFilter f7167b;

                /* JADX INFO: renamed from: c */
                public final Context f7168c;

                /* JADX INFO: renamed from: d */
                public final HashSet f7169d;

                /* JADX INFO: renamed from: e */
                public C2174sa f7170e;

                public df3(Context context) {
/* 5 */             C0204c5 c0204c5 = new C0204c5("AppUpdateListenerRegistry");
/* 12 */            IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
/* 23 */            this.f7169d = new HashSet();
/* 26 */            this.f7170e = null;
/* 28 */            this.f7166a = c0204c5;
/* 30 */            this.f7167b = intentFilter;
/* 32 */            Context applicationContext = context.getApplicationContext();
/* 39 */            this.f7168c = applicationContext != null ? applicationContext : context;
                }

                /* JADX INFO: renamed from: a */
                public final void m3055a() {
                    C2174sa c2174sa;
/* 1 */             HashSet hashSet = this.f7169d;
/* 3 */             boolean zIsEmpty = hashSet.isEmpty();
/* 7 */             Context context = this.f7168c;
/* 9 */             if (!zIsEmpty && this.f7170e == null) {
/* 18 */                C2174sa c2174sa2 = new C2174sa(this, 1);
/* 21 */                this.f7170e = c2174sa2;
/* 23 */                int i = Build.VERSION.SDK_INT;
/* 27 */                IntentFilter intentFilter = this.f7167b;
/* 29 */                if (i >= 33) {
/* 2 */                     context.registerReceiver(c2174sa2, intentFilter, 2);
                        } else {
/* 35 */                    context.registerReceiver(c2174sa2, intentFilter);
                        }
                    }
/* 42 */            if (!hashSet.isEmpty() || (c2174sa = this.f7170e) == null) {
/* 54 */                return;
                    }
/* 48 */            context.unregisterReceiver(c2174sa);
/* 52 */            this.f7170e = null;
                }
            }
