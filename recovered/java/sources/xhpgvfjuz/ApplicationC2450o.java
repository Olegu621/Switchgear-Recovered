            package xhpgvfjuz;

            import android.app.Application;
            import android.content.Context;
            import android.util.Log;
            
            /* JADX INFO: renamed from: xhpgvfjuz.o */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class ApplicationC2450o extends Application {
                /* JADX INFO: renamed from: a */
                public static void m9952a(Class cls) {
                    Log.d("ClassLoaderLogging", "class loaded: " + cls.getName() + " at: " + System.currentTimeMillis());
                }

                /* JADX INFO: renamed from: a */
                void m9953a() {
                }

                @Override // android.content.ContextWrapper
                protected void attachBaseContext(Context context) {
                    super.attachBaseContext(context);
                }

                @Override // android.app.Application
                public void onCreate() {
                    super.onCreate();
                    m9953a();
                }
            }
