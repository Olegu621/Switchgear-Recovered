            package p000;

            import android.content.res.Resources;
            import com.supercell.titan.GameApp;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dq0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7363a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f7364b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f7365c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f7366d;

                public /* synthetic */ dq0(String str, int i, int i2, String str2) {
/* 1 */             this.f7363a = i2;
/* 3 */             this.f7364b = i;
/* 5 */             this.f7365c = str;
/* 7 */             this.f7366d = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7363a;
/* 3 */             String str = this.f7366d;
/* 5 */             String str2 = this.f7365c;
/* 7 */             int i2 = this.f7364b;
                    switch (i) {
                        case 0:
/* 151 */                   if (GameApp.getInstance() != null && GameApp.isNativeLibraryLoaded() && !GameApp.getInstance().isStopped()) {
/* 169 */                       GameApp.setPushNotificationValues(i2, str2, str);
                                break;
                            }
                            break;
                        default:
                            try {
/* 14 */                        HashMap map = new HashMap();
                                try {
/* 37 */                            int identifier = GameApp.getInstance().getResources().getIdentifier("ic_notification", "drawable", GameApp.getInstance().getPackageName());
/* 41 */                            if (identifier != 0) {
/* 49 */                                map.put("notificationIcon", Integer.valueOf(identifier));
                                    }
                                    break;
                                } catch (Resources.NotFoundException unused) {
                                }
/* 54 */                        Boolean bool = Boolean.TRUE;
/* 56 */                        map.put("enableInAppNotification", bool);
/* 61 */                        map.put("enableLogging", bool);
/* 67 */                        if (i2 == 1) {
/* 86 */                            map.put("screenOrientation", 1);
                                } else if (i2 == 2) {
/* 78 */                            map.put("screenOrientation", 0);
                                }
/* 97 */                        hu0.m4342m0(GameApp.getInstance().getApplication(), str2, str, map);
/* 102 */                       int i3 = 13;
/* 104 */                       ec0 ec0Var = new ec0(13);
/* 111 */                       if (rs0.m8239b()) {
/* 119 */                           xe2.m9775m("Helpshift", "setHelpshiftEventsListener() is called.", null);
/* 131 */                           rs0.f16254y.f16271p.m8116u(new RunnableC2495ye(ec0Var, i3));
                                }
                            } catch (Exception e) {
/* 140 */                       AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.start", e);
/* 143 */                       GameApp.debuggerException(e);
/* 146 */                       return;
                            }
                            break;
                    }
                }
            }
