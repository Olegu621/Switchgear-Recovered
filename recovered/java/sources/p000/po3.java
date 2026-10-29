            package p000;

            import android.app.AlarmManager;
            import android.app.PendingIntent;
            import android.app.job.JobScheduler;
            import android.content.Context;
            import android.content.Intent;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.internal.measurement.zzcg;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class po3 extends wo3 {

                /* JADX INFO: renamed from: d */
                public final AlarmManager f15223d;

                /* JADX INFO: renamed from: e */
                public do3 f15224e;

                /* JADX INFO: renamed from: f */
                public Integer f15225f;

                public po3(mp3 mp3Var) {
/* 1 */             super(mp3Var);
/* 18 */            this.f15223d = (AlarmManager) ((ij3) this.f16749a).f9645a.getSystemService(NotificationCompat.CATEGORY_ALARM);
                }

                @Override // p000.wo3
                /* JADX INFO: renamed from: C */
                public final void mo216C() {
/* 1 */             AlarmManager alarmManager = this.f15223d;
/* 3 */             if (alarmManager != null) {
/* 9 */                 Context context = ((ij3) this.f16749a).f9645a;
/* 35 */                alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcg.zza));
                    }
/* 38 */            m7533F();
                }

                /* JADX INFO: renamed from: D */
                public final void m7531D() {
/* 1 */             m9593A();
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             uh3 uh3Var = ij3Var.f9655f;
/* 10 */            ij3.m4555l(uh3Var);
/* 17 */            uh3Var.f17534Y.m8510a("Unscheduling upload");
/* 20 */            AlarmManager alarmManager = this.f15223d;
/* 22 */            if (alarmManager != null) {
/* 24 */                Context context = ij3Var.f9645a;
/* 50 */                alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcg.zza));
                    }
/* 57 */            m7532E().m1349c();
/* 60 */            m7533F();
                }

                /* JADX INFO: renamed from: E */
                public final be3 m7532E() {
/* 3 */             if (this.f15224e == null) {
/* 15 */                this.f15224e = new do3(this, this.f15676b.f13905W, 1);
                    }
/* 17 */            return this.f15224e;
                }

                /* JADX INFO: renamed from: F */
                public final void m7533F() {
/* 13 */            JobScheduler jobScheduler = (JobScheduler) ((ij3) this.f16749a).f9645a.getSystemService("jobscheduler");
/* 15 */            if (jobScheduler != null) {
/* 21 */                jobScheduler.cancel(m7534G());
                    }
                }

                /* JADX INFO: renamed from: G */
                public final int m7534G() {
/* 3 */             if (this.f15225f == null) {
/* 33 */                this.f15225f = Integer.valueOf("measurement".concat(String.valueOf(((ij3) this.f16749a).f9645a.getPackageName())).hashCode());
                    }
/* 37 */            return this.f15225f.intValue();
                }
            }
