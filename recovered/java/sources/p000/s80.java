            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.OnFailureListener;
            import com.google.android.gms.tasks.OnSuccessListener;
            import com.google.android.gms.tasks.Task;
            import com.google.firebase.concurrent.ExecutorsRegistrar;
            import com.google.firebase.installations.FirebaseInstallationsRegistrar;
            import com.supercell.p007id.FlutterPanel;
            import com.supercell.p007id.FlutterPanelPlatformPlugin;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.GoogleServiceClient;
            import io.flutter.Build;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.concurrent.ScheduledExecutorService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final /* synthetic */ class s80 implements InterfaceC0934fy, Continuation, ye0, FlutterPanelPlatformPlugin.PlatformPluginDelegate, OnFailureListener, OnSuccessListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16471a;

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ void m8420a(int i, String str) {
/* 18 */            throw new IllegalStateException(str + i);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: b */
                public static /* synthetic */ void m8421b(int i, String str, Object obj, Object obj2, Object obj3) {
/* 27 */            throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ void m8422c(Object obj, Object obj2, Object obj3) {
/* 26 */            throw new AssertionError("Thread " + obj + obj2 + obj3);
                }

                /* JADX INFO: renamed from: d */
                public static /* synthetic */ void m8423d(Object obj, String str) {
/* 18 */            throw new RuntimeException(str + obj);
                }

                /* JADX INFO: renamed from: e */
                public static /* synthetic */ void m8424e(Object obj, String str, Object obj2) {
/* 21 */            throw new IllegalStateException(str + obj + obj2);
                }

                /* JADX INFO: renamed from: f */
                public static /* synthetic */ void m8425f(String str) {
/* 6 */             throw new IndexOutOfBoundsException(str);
                }

                /* JADX INFO: renamed from: g */
                public static /* synthetic */ void m8426g(String str, Object obj, Object obj2, Object obj3, Object obj4) {
/* 27 */            throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
                }

                /* JADX INFO: renamed from: h */
                public static /* synthetic */ void m8427h(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
/* 30 */            throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
                }

                /* JADX INFO: renamed from: i */
                public static /* synthetic */ void m8428i(String str, Object obj, Throwable th) {
/* 18 */            throw new SecurityException(str + obj, th);
                }

                /* JADX INFO: renamed from: j */
                public static /* synthetic */ void m8429j(int i, String str) {
/* 18 */            throw new IllegalArgumentException(str + i);
                }

                /* JADX INFO: renamed from: k */
                public static /* synthetic */ void m8430k(Object obj, String str) {
/* 18 */            throw new IllegalArgumentException(str + obj);
                }

                /* JADX INFO: renamed from: l */
                public static /* synthetic */ void m8431l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
/* 27 */            throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
                }

                @Override // p000.InterfaceC0934fy
                public Object create(InterfaceC0824cy interfaceC0824cy) {
                    switch (this.f16471a) {
                        case 3:
/* 42 */                    return (ScheduledExecutorService) ExecutorsRegistrar.f5284a.get();
                        case 4:
/* 33 */                    return (ScheduledExecutorService) ExecutorsRegistrar.f5286c.get();
                        case 5:
/* 24 */                    return (ScheduledExecutorService) ExecutorsRegistrar.f5285b.get();
                        case 6:
/* 13 */                    q51 q51Var = ExecutorsRegistrar.f5284a;
/* 15 */                    return fx2.f8393a;
                        default:
/* 1 */                     return FirebaseInstallationsRegistrar.lambda$getComponents$0((C0168b5) interfaceC0824cy);
                    }
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    switch (this.f16471a) {
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 10 */                    GoogleServiceClient.onSignInFailed();
                            break;
                        default:
/* 6 */                     GoogleServiceClient.onSignInFailed();
                            break;
                    }
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(Object obj) {
/* 10 */            GameApp.getInstance().startActivityForResult((Intent) obj, 1100043);
                }

                @Override // com.supercell.id.FlutterPanelPlatformPlugin.PlatformPluginDelegate
                public boolean popSystemNavigator() {
/* 1 */             return FlutterPanel.lambda$new$0();
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) throws IOException {
                    int i;
                    switch (this.f16471a) {
                        case 7:
/* 102 */                   i = 403;
                            break;
                        case 8:
/* 96 */                    i = -1;
                            break;
                        default:
/* 12 */                    Bundle bundle = (Bundle) task.getResult(IOException.class);
/* 17 */                    if (bundle == null) {
/* 92 */                        ds0.m3195l("SERVICE_NOT_AVAILABLE");
/* 14 */                        return null;
                            }
/* 21 */                    String string = bundle.getString("registration_id");
/* 25 */                    if (string != null || (string = bundle.getString("unregistered")) != null) {
/* 27 */                        return string;
                            }
/* 40 */                    String string2 = bundle.getString("error");
/* 50 */                    if ("RST".equals(string2)) {
/* 88 */                        ds0.m3195l("INSTANCE_ID_RESET");
/* 14 */                        return null;
                            }
/* 52 */                    if (string2 != null) {
/* 54 */                        ds0.m3195l(string2);
/* 14 */                        return null;
                            }
/* 79 */                    AbstractC1245n0.m4891s("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
/* 82 */                    ds0.m3195l("SERVICE_NOT_AVAILABLE");
/* 14 */                    return null;
                    }
/* 97 */            return Integer.valueOf(i);
                }

/* 8 */         public /* synthetic */ s80(int i) {
/* 9 */             this.f16471a = i;
                }
            }
