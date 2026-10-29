            package p000;

            import com.google.android.gms.common.api.Status;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jc3 implements Runnable {

                /* JADX INFO: renamed from: c */
                public static final ha1 f12219c = new ha1("RevokeAccessOperation", new String[0]);

                /* JADX INFO: renamed from: a */
                public final String f12220a;

                /* JADX INFO: renamed from: b */
                public final zg2 f12221b;

                public jc3(String str) {
/* 4 */             kb1.m6058k(str);
/* 7 */             this.f12220a = str;
/* 15 */            this.f12221b = new zg2(null);
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             ha1 ha1Var = f12219c;
/* 7 */             Status status = Status.f3442i;
                    try {
/* 33 */                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f12220a).openConnection();
/* 39 */                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
/* 42 */                int responseCode = httpURLConnection.getResponseCode();
/* 48 */                if (responseCode == 200) {
/* 50 */                    status = Status.f3440e;
                        } else {
/* 63 */                    AbstractC1245n0.m4876d(ha1Var.f8983a, ha1Var.m4137a("Unable to revoke access!", new Object[0]));
                        }
/* 74 */                String str = "Response Code: " + responseCode;
/* 78 */                Object[] objArr = new Object[0];
/* 83 */                if (ha1Var.f8985c <= 3) {
/* 85 */                    ha1Var.m4137a(str, objArr);
                        }
                    } catch (IOException e) {
/* 141 */               AbstractC1245n0.m4876d(ha1Var.f8983a, ha1Var.m4137a("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]));
                    } catch (Exception e2) {
/* 115 */               AbstractC1245n0.m4876d(ha1Var.f8983a, ha1Var.m4137a("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]));
                    }
/* 146 */           this.f12221b.setResult(status);
                }
            }
