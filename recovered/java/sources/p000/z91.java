            package p000;

            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.net.UnknownHostException;
            import java.util.Date;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z91 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ long f19994a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f19995b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f19996c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f19997d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Throwable f19998e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ aa1 f19999f;

                public z91(aa1 aa1Var, long j, long j2, int i, String str, Throwable th) {
/* 4 */             this.f19999f = aa1Var;
/* 6 */             this.f19994a = j;
/* 8 */             this.f19995b = j2;
/* 10 */            this.f19996c = i;
/* 12 */            this.f19997d = str;
/* 14 */            this.f19998e = th;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
/* 5 */             aa1 aa1Var = this.f19999f;
                    try {
/* 16 */                String str2 = aa1Var.f139b.format(new Date(this.f19994a));
/* 22 */                StringBuilder sb = new StringBuilder();
/* 25 */                sb.append(str2);
/* 28 */                sb.append(" ");
/* 33 */                sb.append(aa1Var.f142e);
/* 38 */                sb.append("-");
/* 43 */                sb.append(this.f19995b);
/* 46 */                sb.append(" ");
/* 49 */                int i = this.f19996c;
/* 52 */                if (i == 1) {
/* 68 */                    str = "DEBUG";
                        } else if (i == 2) {
/* 65 */                    str = "WARN";
                        } else {
/* 58 */                    if (i != 3) {
/* 64 */                        throw null;
                            }
/* 60 */                    str = "ERROR";
                        }
/* 70 */                sb.append(str);
/* 73 */                sb.append("/Helpshift ");
/* 78 */                sb.append(this.f19997d);
/* 81 */                Throwable th = this.f19998e;
/* 92 */                String message = th instanceof UnknownHostException ? th.getMessage() : Log.getStackTraceString(th);
/* 102 */               if (!b40.m1232p(message)) {
/* 104 */                   sb.append("\n");
/* 107 */                   sb.append(message);
                        }
/* 110 */               sb.append("\n");
/* 123 */               aa1Var.f140c.write(sb.toString().getBytes());
                    } catch (Exception e) {
/* 132 */               AbstractC1245n0.m4877e("Heplshift_LogCollector", "Error writing to debug log file", e);
                    }
                }
            }
