            package androidx.media;

            import android.app.Service;
            import android.content.Intent;
            import android.os.Build;
            import android.os.IBinder;
            import java.io.FileDescriptor;
            import java.io.PrintWriter;
            import p000.j13;
            import p000.le1;
            import p000.me1;
            import p000.ne1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class MediaBrowserServiceCompat extends Service {

                /* JADX INFO: renamed from: a */
                public le1 f1552a;

                /* JADX INFO: renamed from: a */
                public abstract j13 m756a();

                /* JADX INFO: renamed from: b */
                public abstract void m757b();

                @Override // android.app.Service
                public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                }

                @Override // android.app.Service
                public final IBinder onBind(Intent intent) {
/* 5 */             return this.f1552a.f12713b.onBind(intent);
                }

                @Override // android.app.Service
                public final void onCreate() {
/* 1 */             super.onCreate();
/* 4 */             int i = Build.VERSION.SDK_INT;
/* 8 */             if (i >= 28) {
/* 15 */                this.f1552a = new ne1(this);
                    } else if (i >= 26) {
/* 27 */                this.f1552a = new me1(this);
                    } else {
/* 35 */                this.f1552a = new le1(this);
                    }
/* 39 */            this.f1552a.onCreate();
                }
            }
