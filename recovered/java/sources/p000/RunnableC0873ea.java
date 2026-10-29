            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.widget.Toast;
            import androidx.profileinstaller.ProfileInstallerInitializer;
            import com.android.installreferrer.api.InstallReferrerClient;
            import java.lang.ref.WeakReference;
            import java.util.Iterator;
            import java.util.Random;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: ea */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final /* synthetic */ class RunnableC0873ea implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7590a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Context f7591b;

                public /* synthetic */ RunnableC0873ea(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
/* 2 */             this.f7590a = 3;
/* 7 */             this.f7591b = context;
                }

                /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
                @Override // java.lang.Runnable
                public final void run() {
                    h91 h91Var;
                    Context context;
/* 1 */             int i = this.f7590a;
/* 3 */             Object systemService = null;
/* 5 */             int i2 = 0;
/* 6 */             Context context2 = this.f7591b;
                    switch (i) {
                        case 0:
/* 154 */                   int i3 = Build.VERSION.SDK_INT;
/* 158 */                   if (i3 >= 33) {
/* 164 */                       ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
/* 175 */                       if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
/* 179 */                           if (i3 >= 33) {
/* 183 */                               Iterator it = AbstractC1021ia.f9508i.iterator();
                                        while (true) {
/* 188 */                                   wb1 wb1Var = (wb1) it;
/* 194 */                                   if (wb1Var.hasNext()) {
/* 206 */                                       AbstractC1021ia abstractC1021ia = (AbstractC1021ia) ((WeakReference) wb1Var.next()).get();
/* 208 */                                       if (abstractC1021ia != null && (context = ((LayoutInflaterFactory2C2324wa) abstractC1021ia).f18510V) != null) {
/* 216 */                                           systemService = context.getSystemService("locale");
                                                }
                                            }
                                        }
/* 220 */                               if (systemService != null) {
/* 233 */                                   h91Var = new h91(new i91(AbstractC0947ga.m3899a(systemService)));
                                        } else {
/* 242 */                                   h91Var = h91.f8972b;
                                        }
                                    } else {
/* 237 */                               h91Var = AbstractC1021ia.f9504c;
/* 239 */                               if (h91Var == null) {
/* 242 */                                   h91Var = h91.f8972b;
                                        }
                                    }
/* 252 */                           if (h91Var.f8973a.f9500a.isEmpty()) {
/* 254 */                               String strM9393C = w11.m9393C(context2);
/* 258 */                               Object systemService2 = context2.getSystemService("locale");
/* 262 */                               if (systemService2 != null) {
/* 268 */                                   AbstractC0947ga.m3900b(systemService2, AbstractC0910fa.m3683a(strM9393C));
                                        }
                                    }
/* 275 */                           context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                                }
                            }
/* 278 */                   AbstractC1021ia.f9507f = true;
                            break;
                        case 1:
/* 110 */                   context2.getClass();
/* 123 */                   if (i13.m4439r(context2).getString("installed_before", null) == null) {
/* 132 */                       C1996oc c1996oc = new C1996oc(i2, new C2065pc(i2), context2);
/* 139 */                       InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context2).build();
/* 150 */                       installReferrerClientBuild.startConnection(new wc0(15, installReferrerClientBuild, c1996oc));
                            }
                            break;
                        case 2:
/* 106 */                   Toast.makeText(context2, "Shield running in half-integration.", 0).show();
                            break;
                        case 3:
/* 96 */                    (Build.VERSION.SDK_INT >= 28 ? dy1.m3281a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0873ea(context2, 4), new Random().nextInt(Math.max(1000, 1)) + 5000);
                            break;
                        case 4:
/* 44 */                    new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0873ea(context2, 5));
                            break;
                        default:
/* 18 */                    he3.m4202y(context2, new qd1(), he3.f9036d, false);
                            break;
                    }
                }

/* 9 */         public /* synthetic */ RunnableC0873ea(Context context, int i) {
/* 10 */            this.f7590a = i;
                    this.f7591b = context;
                }
            }
