            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.AsyncTask;
            import com.supercell.titan.TimeAlarm;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h20 extends AsyncTask {

                /* JADX INFO: renamed from: a */
                public Context f8868a;

                /* JADX INFO: renamed from: b */
                public Intent f8869b;

                /* JADX INFO: renamed from: c */
                public Class f8870c;

                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) {
/* 9 */             TimeAlarm.handleLocalNotification(this.f8868a, this.f8869b, this.f8870c);
/* 12 */            return null;
                }
            }
